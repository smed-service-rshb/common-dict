package ru.softlab.efr.common.dict.services.currency;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import ru.softlab.efr.common.dict.exchange.model.rate.ValuteData;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class WsCurrencyRateService {

    private static final Logger LOGGER = Logger.getLogger(WsCurrencyRateService.class);
    private static final DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * Получить список курсов валют ЦБ РФ
     *
     * @param date дата на которую нужно получить курсы
     * @return данные по курсам
     */
    public ValuteData getDailyInfoRate(LocalDate date) {
        int count = 5;
        ValuteData valuteData = null;
        try {
            HttpURLConnection httpConn = connectToCB(date.format(formatters), count);
            if (httpConn != null) {
                InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
                BufferedReader in = new BufferedReader(isr);

                StringBuilder res = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    res.append(line);
                }
                String result = res.toString();
                result = result.substring(result.indexOf("<ValuteData"), result.indexOf("</diffgr:diffgram>"))
                        .replaceAll("diffgr:id=\"ValuteCursOnDate\\d{1,2}\" msdata:rowOrder=\"\\d{1,2}\"", "");
                valuteData = marshaller(result);
            }
        } catch (Exception ex) {
            LOGGER.error(String.format("При получении курса валюты с ЦБ РФ за %s произошла ошибка", date.format(formatters)), ex);
        }
        return valuteData;
    }

    private HttpURLConnection connectToCB(String date, int attempt) {

        while (attempt-- > 0) {
            try {
                URL url = new URL("http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx");
                URLConnection connection = url.openConnection();
                HttpURLConnection httpConn = (HttpURLConnection) connection;
                String req = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                        "               xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"\n" +
                        "               xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                        "    <soap:Body>\n" +
                        "        <GetCursOnDate xmlns=\"http://web.cbr.ru/\">\n" +
                        "            <On_date>" + date + "</On_date>\n" +
                        "        </GetCursOnDate>\n" +
                        "    </soap:Body>\n" +
                        "</soap:Envelope>";
                httpConn.setRequestProperty("Host", "www.cbr.ru");
                httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
                httpConn.setRequestProperty("SOAPAction", "http://web.cbr.ru/GetCursOnDate");
                httpConn.setRequestMethod("POST");
                httpConn.setDoOutput(true);

                OutputStream out = httpConn.getOutputStream();
                out.write(req.getBytes(StandardCharsets.UTF_8));
                out.close();

                httpConn.connect();
                if (httpConn.getResponseCode() == 200) {
                    return httpConn;
                } else {
                    LOGGER.info(String.format("При получении курса валют с ЦБ РФ за %s произошла ошибка, код ответа: %s", date, httpConn.getResponseCode()));
                }
            } catch (Exception ex) {
                LOGGER.info(String.format("При получении курса валют с ЦБ РФ за %s произошла ошибка: ", date), ex);
            }
            sleep();
        }
        return null;
    }

    private ValuteData marshaller(String xml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ValuteData.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(xml);
        return (ValuteData) unmarshaller.unmarshal(reader);
    }

    private void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}