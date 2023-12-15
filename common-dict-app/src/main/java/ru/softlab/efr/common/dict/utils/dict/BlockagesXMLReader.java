package ru.softlab.efr.common.dict.utils.dict;


import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.SAXException;
import ru.softlab.efr.common.dict.exchange.model.blockages.DecisionsXml;
import ru.softlab.efr.common.dict.exchange.model.blockages.Document;
import ru.softlab.efr.common.dict.exchange.model.blockages.Person;
import ru.softlab.efr.common.dict.model.BlockageEntity;
import ru.softlab.efr.common.dict.utils.AppUtils;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Загрузчик-парсер XML файла с информацией о блокировках/заморозках
 *
 * @author olshansky
 * @since 10.01.2019.
 */
public class BlockagesXMLReader {

    public List<BlockageEntity> getBlockageListFromFile(long version, DecisionsXml decisionsXml) throws Exception {
        List<BlockageEntity> result = new ArrayList<>();
        if (decisionsXml != null && decisionsXml.getActualDecisionList() != null) {
            decisionsXml.getActualDecisionList().getDecisionList().forEach(xmlBlockage -> {
                xmlBlockage.getPersonListContainer().getPersonList().forEach(xmlPerson -> {
                            if (xmlPerson.getIndividual() != null) {
                                if (xmlPerson.getIndividual().getDocumentListContainer() != null
                                        && !CollectionUtils.isEmpty(xmlPerson.getIndividual().getDocumentListContainer().getDocumentList())) {

                                    xmlPerson.getIndividual().getDocumentListContainer().getDocumentList().forEach(xmlDocument -> {
                                        result.add(getBlockageEntityByXmlPersonAndDocument(version, xmlPerson, xmlDocument)
                                        );
                                    });
                                } else {
                                    result.add(getBlockageEntityByXmlPersonAndDocument(version, xmlPerson, null));
                                }
                            }
                        }

                );
            });
        }
        return result;
    }

    private String[] splitByWhiteSpace(String fullName) {
        return fullName.split("\\s");
    }

    private boolean isExistsWhiteSpace(String fullName) {
        return fullName.matches(".*\\s.*");
    }

    private boolean isSplittableFullName(String fullName) {
        return AppUtils.isNotNullOrWhitespace(fullName) && isExistsWhiteSpace(fullName);
    }

    private String getLastNameByFullName(String fullName) {
        return isSplittableFullName(fullName) ? splitByWhiteSpace(fullName)[0] : fullName;
    }

    private String getFirstNameByFullName(String fullName) {
        return isSplittableFullName(fullName) && splitByWhiteSpace(fullName).length > 0 ? splitByWhiteSpace(fullName)[1] : fullName;
    }

    private String getMiddleNameByFullName(String fullName) {
        return isSplittableFullName(fullName) && splitByWhiteSpace(fullName).length > 1 ?
                fullName.replaceFirst(splitByWhiteSpace(fullName)[0], "")
                        .replaceFirst(splitByWhiteSpace(fullName)[1], "") : fullName;
    }

    private BlockageEntity getBlockageEntityByXmlPersonAndDocument(long version, Person xmlPerson, Document xmlDocument) {

        String lastName = xmlPerson.getIndividual().getLastName();
        String firstName = xmlPerson.getIndividual().getFirstName();
        String middleName = xmlPerson.getIndividual().getMiddleName();

        if (AppUtils.isNullOrWhitespace(xmlPerson.getIndividual().getLastName())
                || AppUtils.isNullOrWhitespace(xmlPerson.getIndividual().getFirstName())) {
            lastName = getLastNameByFullName(xmlPerson.getIndividual().getFullName());
            firstName = getFirstNameByFullName(xmlPerson.getIndividual().getFullName());
            middleName = getMiddleNameByFullName(xmlPerson.getIndividual().getFullName());
        }

        return new BlockageEntity(
                version,
                lastName,
                firstName,
                middleName,
                xmlPerson.getIndividual().getBirthDate() != null ? xmlPerson.getIndividual().getBirthDate().toGregorianCalendar().toZonedDateTime().toLocalDate() : null,
                xmlDocument != null ? xmlDocument.getSeries() : null,
                xmlDocument != null ? xmlDocument.getNumber() : null,
                xmlPerson.getPersonId() != null ? Long.valueOf(xmlPerson.getPersonId()) : -1L);
    }


    public DecisionsXml parseBlockageFromXml(String filePath, MultipartFile frontFile) throws IOException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DecisionsXml.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema employeeSchema = sf.newSchema(new StreamSource(this.getClass().getResourceAsStream("/blockages.xsd")));
            jaxbUnmarshaller.setSchema(employeeSchema);
            if (frontFile == null) {
                return (DecisionsXml) jaxbUnmarshaller.unmarshal(new File(filePath));
            } else {
                return (DecisionsXml) jaxbUnmarshaller.unmarshal(frontFile.getInputStream());
            }
        } catch (JAXBException | SAXException e) {
            e.printStackTrace();
        }
        return null;
    }
}
