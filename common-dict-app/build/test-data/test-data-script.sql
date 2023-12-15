insert into common_dict.PRINT_TEMPLATES(TYPE, COPIES_NUMBER, FILE_NAME, CONTENT)
values ('4f2434ae-5eb1-4b10-8f83-2cbcddfdbf94', 1, 'Договор страхования', convert_to('<?xml version="1.0" encoding="UTF-8"?>
<!-- Created with Jaspersoft Studio version 6.4.3.final using JasperReports Library version 6.4.3  -->
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="RshbInsuranceChooseHealth" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" isFloatColumnFooter="true" uuid="4eedbb89-b4f6-4469-9ab6-f642a1688cf7">
	<property name="com.jaspersoft.studio.data.defaultdataadapter" value="One Empty Record"/>
	<subDataset name="tableDataset" uuid="f13e6d36-5148-4ecc-bbe3-3035def80980">
		<queryString>
			<![CDATA[]]>
		</queryString>
	</subDataset>
	<parameter name="contractNumber" class="java.lang.String"/>
	<parameter name="surname" class="java.lang.String"/>
	<parameter name="name" class="java.lang.String"/>
	<parameter name="patronymic" class="java.lang.String"/>
	<parameter name="birthDate" class="java.lang.String"/>
	<parameter name="contractStartDate" class="java.lang.String"/>
	<parameter name="phoneNumber" class="java.lang.String"/>
	<parameter name="email" class="java.lang.String">
		<defaultValueExpression><![CDATA[""]]></defaultValueExpression>
	</parameter>
	<queryString>
		<![CDATA[]]>
	</queryString>
	<detail>
		<band height="631">
			<staticText>
				<reportElement x="80" y="0" width="400" height="15" uuid="13533ce6-dbe7-4b4d-9667-044ed58e5a09">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Center">
					<font fontName="Open Sans" size="11" isBold="true"/>
				</textElement>
				<text><![CDATA[ДОГОВОР СТРАХОВАНИЯ (Страховой полис) «Выбери здоровье плюс» ]]></text>
			</staticText>
			<textField>
				<reportElement x="180" y="15" width="200" height="15" uuid="b1030e44-bdf5-48a4-aaaf-f2be11f5788f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Center">
					<font fontName="Open Sans" size="11" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["№ " + $P{contractNumber}]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement x="0" y="40" width="550" height="130" uuid="1d4eea10-38c3-4880-879f-4d32eb4ca9c2">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified">
					<font fontName="Open Sans" size="9" isBold="false"/>
				</textElement>
				<text><![CDATA[По настоящему Договору страхования (Страховому полису) «Выбери здоровье», являющемуся офертой (далее – Страховой полис, договор страхования) Страховщик предлагает Страхователю, в соответствии со статьей 435 Гражданского кодекса Российской Федерации, заключить договор добровольного страхования на нижеследующих условиях.
Договор страхования заключается путем принятия и акцепта Страхователем настоящего Страхового полиса (оферты), подписанного Страховщиком. На основании ст. 435, 438 и п. 2 ст. 940 ГК РФ акцептом настоящего Страхового полиса (оферты) считается уплата страховой премии в соответствии с условиями, содержащимися в Страховом полисе. Договор страхования заключается на основании Условий страхования «Выбери здоровье», утвержденных приказом генерального директора Страховщика от «_______»________2018г. №__________ (Далее – Условия страхования). Положения, содержащиеся в Условиях страхования и не включенные в текст настоящего Страхового полиса, применяются к Договору страхования и обязательны для Страхователя (Выгодоприобретателя).]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="0" y="171" width="130" height="112" backcolor="#C0C0C0" uuid="2ca31443-b24e-4580-b580-eaddad0fb35a">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЩИК]]></text>
			</staticText>
			<staticText>
				<reportElement x="139" y="171" width="416" height="112" uuid="00ed8b66-a12b-4377-899f-809f0801f972">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[ООО «РСХБ-Страхование жизни», www.rshbins-life.ru, адрес: г. Москва, Гагаринский пер., д. 3; тел. 8(495)7459955;
<style isBold="true">Режим работы</style>: понедельник-четверг: с 9.00 до 18.00, пятница: с 9.00 до 16.45.
<style isBold="true">Банковские реквизиты</style>: Расчетный счет: 40701810400000000158; ИНН 7704447253; Банк получателя: АО «РОССЕЛЬХОЗБАНК», г. Москва, БИК Банка получателя: 044525111, Корр. счет: 30101810200000000111,
<style isBold="true">Лицензия</style> СЛ № 4358 (вид деятельности: добровольное личное страхование, за исключением добровольного страхования жизни), выдана Банком России без ограничения срока действия.]]></text>
			</staticText>
			<staticText>
				<reportElement stretchType="ElementGroupBottom" mode="Opaque" x="0" y="291" width="130" height="229" backcolor="#C0C0C0" uuid="27a489d8-c21a-4cbf-b91d-32469f102b83">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВАТЕЛЬ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" stretchType="ElementGroupBottom" x="139" y="291" width="416" height="229" uuid="70843296-76f4-49bb-ad86-4cb04cdc058f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Bottom" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="-1" y="530" width="130" height="21" backcolor="#C0C0C0" uuid="b5a9672c-ebe1-4c61-8319-6891027516bc">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ЗАСТРАХОВАННОЕ ЛИЦО]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="138" y="530" width="416" height="21" uuid="41d5d2e8-d3e5-4ee8-a2c2-6cf1e947c55f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страхователь, при соблюдении условий, предусмотренных п.1.4.4. Условий страхования.]]></text>
			</staticText>
			<textField isStretchWithOverflow="true">
				<reportElement stretchType="ContainerBottom" x="145" y="299" width="405" height="41" uuid="c7223a32-04c4-467d-8595-015f96872745">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
				</textElement>
				<textFieldExpression><![CDATA["Фамилия <style isItalic=\"true\" isUnderline=\"true\">  " +$P{surname} + "  </style>, имя <style isItalic=\"true\" isUnderline=\"true\">  " + $P{name} + "  </style>, отчество <style isItalic=\"true\" isUnderline=\"true\">  " + $P{patronymic} + "  </style> \nДата рождения <style isItalic=\"true\" isUnderline=\"true\">  " + $P{birthDate} + "  </style> Телефон <style isItalic=\"true\" isUnderline=\"true\">  " + $P{phoneNumber} + "  </style> \nАдрес электронной почты <style isItalic=\"true\" isUnderline=\"true\">  " + $P{email} + "  </style>"]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="-1" y="561" width="130" height="21" backcolor="#C0C0C0" uuid="8e41abb0-55cb-4a91-9075-1b9e745f2886">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ВЫГОДОПРИОБРЕТАТЕЛЬ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="138" y="561" width="416" height="21" uuid="18a8b6e4-3197-4947-9340-e030c4034957">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Застрахованное лицо]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="592" width="130" height="29" backcolor="#C0C0C0" uuid="7ccb4ce6-b6a9-48d6-9587-20bd06e1fff5">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СЕРВИСНАЯ КОМПАНИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="139" y="592" width="414" height="29" uuid="5b036380-182f-427c-acd0-5be6776fe87b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[__________
Круглосуточная служба поддержки: ________ Адрес: ___________ Эл. адрес: __________]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="139" y="340" width="415" height="180" uuid="e806d396-b92b-49ec-8077-12f47876b5c5">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страхователем по настоящему Договору страхования является дееспособное физическое лицо, отвечающее требованиям, предусмотренным в п.1.4.4. Условий страхования, заключившее со Страховщиком Договор страхования и указанное в Платежном поручении в качестве плательщика страховой премии. В Платежном поручении указываются по меньшей мере следующие данные о Страхователе: фамилия, имя, отчество, дата рождения. Страховщик не заключает на условиях, указанных в настоящем Страховом полисе, Договоры страхования в отношении лиц, не соответствующих условиям, указанным в п.1.4.4. Условий страхования. Данное условие является существенным условием Договора страхования. Если лицо, оплатившее Договор страхования, не соответствует условиям, указанным в 1.4.4. Условий страхования, Договор страхования является незаключенным ввиду несогласования Сторонами существенных условий договора (условия о Застрахованном лице). В таком случае Страховщик производит возврат поступивших денежных средств лицу, совершившему платеж, в порядке и сроки, предусмотренные Условиями страхования.]]></text>
			</staticText>
		</band>
		<band height="772">
			<staticText>
				<reportElement mode="Opaque" x="1" y="305" width="130" height="28" backcolor="#C0C0C0" uuid="bb32c71a-82bb-4c59-b048-66fb4687a866">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ТЕРРИТОРИЯ ОКАЗАНИЯ УСЛУГ]]></text>
			</staticText>
			<staticText>
				<reportElement x="140" y="305" width="414" height="29" uuid="e0a8b74d-2697-40b8-bf2a-5f752d4f1dd3">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Top" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Услуги, предусмотренные Страховым полисом оказываются на территории Российской Федерации.]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="0" y="10" width="130" height="285" backcolor="#C0C0C0" uuid="8ae4b8bd-24b8-4545-b147-5a91368e72a6">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЫЕ РИСКИ.
СТРАХОВЫЕ СЛУЧАИ.]]></text>
			</staticText>
			<staticText>
				<reportElement x="140" y="10" width="414" height="285" uuid="53678cb7-f610-4702-873c-828126d6b7bd">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Top" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страховым риском, согласно Договору страхования и Условиям страхования, является риск возникновения в период страхования обстоятельств, требующих оказания медицинских и иных услуг Застрахованному лицу в связи со Злокачественным новообразованием, а именно: злокачественным новообразованием, характеризующимся неконтролируемым ростом и распространением злокачественных клеток, проникающих в ткань различного гистологического типа, и относящимся к классам C00-C43, C45-C97 по МКБ-10, за исключением: С44 – эпителиальных опухолей кожи (включая базалиому, плоскоклеточный рак), C91.1 – хронического лимфоцитарного В – клеточного лейкоза, а также возникновением новообразования при наличии у Застрахованного лица ВИЧ-инфекции или СПИДа.
Страховым случаем, с учетом всех положений, определений и исключений из страхования, предусмотренных Договором страхования и Условиями страхования, является обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим пунктом, при одновременном наличии следующих условий: диагноз злокачественного новообразования подтвержден гистологическими или - в случае системных онкологических заболеваний - цитологическими исследованиями и заключением врача - онколога; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу впервые; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу в течение Периода страхования, по истечении периода ожидания; Застрахованное лицо обратилось в Сервисную компанию в течение Периода страхования. ]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="0" y="342" width="130" height="112" backcolor="#C0C0C0" uuid="19a2f52d-94de-4247-bb9e-42495d55a280">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5" rightIndent="5"/>
				</textElement>
				<text><![CDATA[СРОК ДЕЙСТВИЯ ДОГОВОРА СТРАХОВАНИЯ






ПЕРИОД СТРАХОВАНИЯ]]></text>
			</staticText>
			<textField>
				<reportElement x="140" y="342" width="414" height="112" uuid="6fe544bc-abf2-4240-8802-c1ca87735d86">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<textFieldExpression><![CDATA["<style isBold=\"true\">Срок действия договора страхования</style> составляет 1 (один) год с даты вступления Страхового полиса в силу.\n<style isBold=\"true\">Дата вступления договора страхования в силу</style> <style isItalic=\"true\" isUnderline=\"true\">  " + $P{contractStartDate} + "  </style>\n<style isBold=\"true\">Период страхования</style> начинается с 00 часов 00 минут 121 (Сто двадцать первого) дня с даты вступления Страхового полиса в силу и действует до окончания срока действия договора страхования.\nПри повторном заключении аналогичного Страхового полиса, Стороны при определении срока действия договора стрхования и периода страхования руководствуются положениями раздела 6 и 7 Условий страхования."]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement mode="Opaque" x="0" y="463" width="130" height="106" backcolor="#C0C0C0" uuid="9442a5ec-6c62-4f1d-bb6e-a4e53c21c244">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5" rightIndent="5"/>
				</textElement>
				<text><![CDATA[ПЕРИОД ОЖИДАНИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement x="140" y="463" width="414" height="106" uuid="c78ed74a-8234-4d85-80ad-2a68b505f21f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[<style isBold="true">120 (Сто двадцать) календарных дней</style> с даты вступления Страхового полиса в силу.
В течение данного периода времени Страховщик не несет обязательств по организации оказания медицинских и иных услуг (из числа событий, предусмотренных договором страхования). Обращения Застрахованного лица в этот период не являются страховым случаем, организация услуг не производится, страховая выплата по данным событиям не осуществляется.
При повторном заключении аналогичного Страхового полиса, Стороны при определении периода ожидания руководствуются положениями раздела 6 Условий страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="0" y="577" width="130" height="28" backcolor="#C0C0C0" uuid="c13d13c8-31da-4d4d-ba89-baeaa383eab7">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВАЯ СУММА]]></text>
			</staticText>
			<staticText>
				<reportElement x="139" y="577" width="191" height="28" uuid="85b18db8-1733-4774-b95a-7d2532c8cf41">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Open Sans" size="9" isBold="true"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[9 000 000 (Девять миллионов) рублей]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="345" y="577" width="109" height="28" backcolor="#C0C0C0" uuid="845a0b1a-067b-4229-9a26-5bba9e75e9a6">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВОЙ ТАРИФ]]></text>
			</staticText>
			<staticText>
				<reportElement x="469" y="577" width="86" height="28" uuid="7bc04488-593f-4e00-9666-760d6cfb2a35">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Open Sans" size="9" isBold="true"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[0,061%]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="-1" y="613" width="130" height="112" backcolor="#C0C0C0" uuid="63954f67-f72f-4f2b-81f7-940313f725f8">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="5" rightIndent="5"/>
				</textElement>
				<text><![CDATA[ПЕРИОД ОЖИДАНИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement x="139" y="613" width="416" height="112" uuid="274df8cc-ae41-4263-b095-877891f261b8">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0"/>
				</textElement>
				<text><![CDATA[Страховая премия составляет <style isBold="true">5 990 (Пять тысяч девятьсот девяносто) рублей 00 копеек</style>.
Страховая премия подлежит оплате единовременно в день заключения договора страхования. Сумма и дата оплаты указываются на документе, подтверждающем оплату страховой премии.
Если страховая премия не будет уплачена в срок, указанный в настоящем пункте, или будет уплачена в ином размере, чем указан в Страховом полисе, Договор страхования считается незаключенным ввиду несогласования его существенных условий, при этом денежные средства считаются ошибочно уплаченными и подлежат возврату лицу, совершившему платеж, в порядке и сроки, предусмотренные Условиями страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement x="1" y="730" width="553" height="40" uuid="8e484c61-0a18-4cf8-bec1-a7b9868d9871">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0"/>
				</textElement>
				<text><![CDATA[<style isBold="true">Дата заключения</style> Страхового полиса соответствует дате вступления договора страхования в силу.
<style isBold="true">Максимальный лимит ответственности Страховщика по оплате организации медицинских и иных услуг по Договору страхования в совокупности равен страховой сумме.</style>]]></text>
			</staticText>
		</band>
		<band height="771">
			<staticText>
				<reportElement x="-1" y="8" width="556" height="763" uuid="981f76a7-cde3-49c5-bfc5-00c7e1bfddd6">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.tabStopWidth" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0" tabStopWidth="25"/>
				</textElement>
				<text><![CDATA[1.	<style isBold="true">ОСНОВНЫЕ ПОЛОЖЕНИЯ ДОГОВОРА СТРАХОВАНИЯ</style>
1.1.	В соответствии со Страховым полисом и Условиями, <style isBold="true">Сервисная компания организовывает и оплачивает следующие услуги при наступлении страхового случая</style>:
		1.1.1. <style isBold="true">Медицинская транспортировка</style> (медицинская эвакуация) Застрахованного лица и одного сопровождающего к поставщику медицинских услуг и/или между медицинскими организациями и возвращение обратно (за исключением санавиации), включая трансфер автомобилем скорой медицинской помощи или на такси от места жительства до аэропорта (транспортного узла ), из аэропорта (транспортного узла) до отеля (апартаментов) и/или до медицинской организации, в которой будет проводиться лечение и обратно.
		1.1.2. <style isBold="true">Оплата билета</style> эконом класса для Застрахованного и одного сопровождающего лица, а также при наличии медицинских показаний – оплата медицинского сопровождения и дополнительных мест и оборудования в самолете (ином средстве транспорта) при регулярном рейсе.
		1.1.3. <style isBold="true">Проживание Застрахованного лица и одного сопровождающего</style>: подлежит оплате проживание в отеле (3 или 4 звезды) или эквивалентного стандартного номера в апартаментах с оплатой услуг, включенных в стоимость номера для Застрахованного лица и его сопровождающего.
		1.1.4. <style isBold="true">Услуги по репатриации в случае смерти Застрахованного лица или сопровождающего во время поездки</style>: транспортировка останков Застрахованного лица или сопровождающего до места постоянного проживания Застрахованного лица или сопровождающего.
		1.1.5. <style isBold="true">Лечение на территории Российской Федерации</style>, проводимое по поводу страхового случая:
	1.1.5.1. <style isItalic="true">Медицинская помощь</style> в амбулаторных условиях, в условиях дневного стационара, в стационарных условиях, в том числе:
		а) осмотры врачами, в том числе врачами-специалистами;
		б) диагностические медицинские вмешательства, выполняемые медицинскими организациями по выбору Сервисной компании на территории Российской Федерации, в том числе лабораторные исследования, визуализирующие исследования, эндоскопические исследования, функциональная диагностика;
		в) лечебные медицинские вмешательства в пределах страховой суммы (кроме имплантаций и трансплантации, которые производятся только в случаях, прямо указанных в Условиях и в объеме, указанном в Условиях), включающие хирургическое лечение, химиотерапию, лучевую терапию, иные методы лечения, научно обоснованные, разрешенные к применению на территории Российской Федерации и применяемые в рамках оказания медицинской помощи медицинскими организациями по выбору Сервисной компании, на территории Российской Федерации;
		г) имплантация, необходимая в целях реконструктивного лечения груди после проведения мастэктомии, включая стоимость имплантатов на сумму <style isBold="true">(лимит ответственности) не более 900 000 (Девятисот тысяч) рублей</style> в период действия Договора на один страховой случай;
		д) лекарственные средства, применяемые при лечении в стационарных условиях и в условиях дневного стационара.
	1.1.5.2. В случае истечения срока действия договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 30 (Тридцати) календарных дней после окончания срока действия договора страхования.
1.2.	Страховщик осуществляет оплату организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица (в том числе, но не ограничиваясь этим, при экстренной медицинской транспортировке Застрахованного лица), только в случае наличия медицинских показаний к сопровождению Застрахованного лица, определенных Врачом. Оплата организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица осуществляется в пределах лимитов, установленных договором страхования.
<style isBold="true">2.	ИСКЛЮЧЕНИЯ.</style>
<style isBold="true">Не являются страховыми случаями (не покрывается страхованием), и страховая выплата не производится по следующим событиям/заболеваниям и состояниям/расходам/услугам:</style>
2.1.	Услуги и расходы в связи с первичным диагностированием у Застрахованного лица заболевания.
2.2.	Услуги и расходы, связанные с событиями / случаями, прямо не указанными в договоре страхования как страховой случай.
2.3.	Услуги и расходы, прямо не указанные в договоре страхования как услуги и расходы, подлежащие организации и оплате.
2.4.	Услуги и расходы по заболеваниям/состояниям, указанным в договоре страхования, но возникшим до окончания периода ожидания или после истечения срока действия страхования.
2.5.	Услуги и расходы, оказанные / понесенные до окончания периода ожидания или после истечения срока действия страхования, за исключением указанных в п. 4.1.5.2 Условий.
2.6.	Услуги и расходы, необходимость которых возникла в связи с нарушением Застрахованным лицом рекомендаций лечащего врача и/или правил и распорядка медицинского учреждения, в котором Застрахованное лицо проходит лечение.
2.7.	Психохирургия.
2.8.	Хирургические операции по трансплантации органов (частей органов) или любого вида трансплантации костного мозга в следующих случаях:
		2.8.1. если трансплантация таких органов и (или) их долей не предусмотрена договором страхования;]]></text>
			</staticText>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="-1" y="8" width="556" height="763" uuid="dc735043-d69a-40b7-adbc-fadebf31cf07">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.tabStopWidth" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0" tabStopWidth="25"/>
				</textElement>
				<text><![CDATA[	2.8.2. если потребность в трансплантации органов возникла вследствии алкогольной болезни печени;
	2.8.3. если трансплантация органов является аутологичной (реципиент трансплантата является донором для самого себя), за исключением трансплантации костного мозга;
	2.8.4. если при трансплантации органов Застрахованное лицо является донором по отношению к третьему лицу;
	2.8.5. если трансплантация органов включает в себя лечение стволовыми клетками (кроме трансплантации костного мозга).
2.9.	Медицинские и иные услуги, выполняемые в эстетических и/или косметических целях, включая, но не ограничиваясь: операции по коррекции зрения (миопии, астигматизма, близорукости); бариатрические операции, включая, но не ограничиваясь операциями, направленными на уменьшение объема желудка или кишечника, кроме операций по реконструкции груди после резекции / удаления молочной железы, проведенной в рамках договора страхования и в соответствии с его условиями.
2.10.	Услуги и расходы в связи с родовыми травмами и/или врождёнными пороками развития.
2.11.	Услуги, не назначенные Застрахованному лицу лечащим врачом, либо не являющиеся необходимыми с медицинской точки зрения по поводу страхового случая.
2.12.	Услуги и расходы в связи с заболеваниями и состояниями, которые являются прямым или косвенным следствием синдрома приобретенного иммунодефицита (СПИД) или носительства вируса иммунодефицита человека (ВИЧ), включая мутацию и любое побочное действие.
2.13.	Услуги и расходы в связи с расстройством здоровья, наступившим в местах лишения свободы, изоляторах временного содержания и других учреждениях, предназначенных для содержания лиц, подозреваемых, обвиняемых в совершении преступления или осужденных за совершенные преступления.
2.14.	Услуги и расходы в связи с расстройством здоровья, наступившим в результате профессиональной деятельности Застрахованного лица, непосредственно связанной с химическими веществами и газами (включая асбест, растворители, бензол, хлористый винил, бериллий, никель, соединения хрома, радон, пестициды, пыль с оксидом кремния, диоксины), со взрывчатыми веществами, с ионизирующими излучениями, ультрафиолетовым излучением, с микроволновым излучением, с высоковольтными электрическими сетями.
2.15.	Услуги и расходы в связи с применением экспериментальных методов лечения, не допущенных к использованию в Российской Федерации.
2.16.	Услуги и расходы в связи со злокачественным новообразованием, протекающим на фоне ВИЧ–инфекции или СПИД.
2.17.	Услуги и расходы в связи с существовавшими до даты заключения договора страхования заболеваниями и состояниями, а также несчастными случаями, диагностированными / произошедшими Застрахованному лицу / с Застрахованным лицом или о которых было известно Застрахованному лицу до даты заключения договора страхования.
2.18.	Услуги и расходы в связи с получением Застрахованным лицом медицинских и иных услуг в медицинских и иных организациях, выбор которых не был согласован с Сервисной компанией.
2.19.	Услуги и расходы в связи с раком кожи, за исключением меланомы.
2.20.	Услуги и расходы в связи с Эпителиальными опухолями кожи (включая базалиому, плоскоклеточный рак) (класс С44 по МКБ-10),  Хроническим лимфоцитарным В-клеточным лейкозом (класс C91.1 по МКБ-10).
3.	<style isBold="true">Права и обязанности Страховщика и Страхователя (Выгодоприобретателя) указаны в Условиях (раздел 12).</style>
4.	<style isBold="true">Страховщик не заключает на условиях, содержащихся в Условиях страхования и Страховом полисе, более одного Договора страхования с одним и тем же лицом. Данное условие является существенным; оплата Страхователем Договора(-ов) страхования при наличии заключенного и не прекратившего своего действия Договора страхования не признается акцептом и такие Договоры страхования являются незаключенными ввиду несогласования Сторонами существенных условий договора. В таком случае Страховщик производит возврат поступивших денежных средств лицу, совершившему платеж в течение 20 (Двадцати) рабочих дней с момента получения письменного заявления плательщика.
При этом Страховщик имеет право предложить заключение Договоров страхования на особых условиях.</style>
5.	<style isBold="true">Порядок взаимодействия сторон при наступлении события, имеющего признаки страхового случая:</style>
5.1.	<style isBold="true">Уведомление о событии, имеющего признаки страхового случая.</style>
	5.1.1. После получения подтвержденного диагноза заболевания, указанного в п. 3.1 Условий, Страхователь должен в Период страхования, в кратчайшие сроки обратиться в Сервисную компанию с уведомлением о наступлении события, имеющего признаки страхового случая, с последующим предоставлением документов, которые запросит Сервисная компания.
	5.1.2. Для признания события страховым случаем Сервисная компания вправе запросить оригиналы и (или) заверенные надлежащим образом копии документов:
		5.1.2.1. Уведомление о событии, имеющим признаки страхового случая.
		5.1.2.2. Документ, удостоверяющий личность Страхователя (для гражданина Российской Федерации – паспорт гражданина Российской Федерации; для иностранного гражданина или лица без гражданства - документ, подтверждающий право на пребывание (проживание) в Российской Федерации; для временно проживающих – разрешение на временное проживание на территории Российской Федерации; для постоянного проживающих – вид на жительство; для беженцев – удостоверение беженца; для вынужденных переселенцев - удостоверение вынужденного переселенца).
		5.1.2.3. Договор страхования и платежный документ, подтверждающий его оплату.
		5.1.2.4. В случае, если Страхователем производилось заключение договоров страхования в соответствии с п.6.2 Условий, - все ранее заключенные договоры страхования с платежными документами, подтверждающими их оплату.]]></text>
			</staticText>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="-1" y="8" width="556" height="763" uuid="91db4de9-5d96-4121-a3a4-2387f1997de8">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.tabStopWidth" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0" tabStopWidth="25"/>
				</textElement>
				<text><![CDATA[		5.1.2.5. Согласие Застрахованного лица на обработку его персональных данных (включая, все действия, перечисленные в ст. 3 Федерального закона от 27.07.2006 №152-ФЗ «О персональных данных» (далее - Закон)), в целях надлежащего исполнения договора страхования, организации оказания услуг в отношении Страховщика, Сервисной компании, их уполномоченных представителей, а также третьих лиц, оказывающих услуги в связи с диагностированным заболеванием Застрахованного лица.
		5.1.2.6. Согласие Застрахованного лица в соответствии с п. 3 ст. 13 Федерального закона от 21.11.2011 № 323-ФЗ «Об основах охраны здоровья граждан Российской Федерации» любому лечебному учреждению и/или врачу предоставлять ООО «РСХБ-Страхование жизни», осуществляющему страхование по договору страхования, а также Сервисной компании по договору страхования любые сведения, связанные с ним и составляющие врачебную тайну (любые медицинские документы и/или их заверенные копии, результаты лабораторных и инструментальных исследований, результаты лечения, прогноз по заболеванию и т.д.), как в связи с оценкой степени страхового риска, так и в связи с событиями, имеющими признаки страхового случая.
		5.1.2.7. Медицинский документ (выписка из медицинской карты амбулаторного / стационарного больного, выписной эпикриз), заверенный печатью выдавшего учреждения и подписью ответственного лица, с указанием диагноза, послужившего причиной обращения за медицинской помощью в рамках настоящих Условий страхования, сроков лечения, результатов обследования и другой сопутствующей информации.
		5.1.2.8. Результаты и заключения инструментальных, лабораторных методов диагностики / исследований, в т.ч.: гистологических или цитологических (в случае системных онкологических заболеваний); радиологических визуализирующих исследований; данные магнитно-резонансной томографии.
		5.1.2.9. Выписка из медицинской карты амбулаторного больного, содержащая информацию об имеющихся у Застрахованного лица заболеваниях за последние 5 лет.
		5.1.2.10. Медицинский документ из онкологического диспансера по месту жительства о наличии и дате (датах) обращений либо об отсутствии обращений.
Указанный перечень документов и сведений является исчерпывающим. Страховщик (Сервисная компания) вправе сократить перечень документов, указанный в настоящем пункте.
5.2.	<style isBold="true">В случае признания события страховым случаем</style> - в течение 15 (Пятнадцати) рабочих дней с момента получения Сервисной организацией полного комплекта документов по заявленному событию, Сервисная компания организует необходимые Застрахованному лицу услуги, предусмотренные страхованием, и информирует Застрахованное лицо о:
	v	специализированных медицинских учреждениях, центрах;
	v	рекомендованном лечащем враче – специалисте;
	v	дальнейших действиях Застрахованного лица, необходимых для оказания услуг, предусмотренных договором страхования.
5.3.	<style isBold="true">Если наступившее событие не признано страховым случаем</style>, Страховщик в течение 10 (десяти) рабочих дней с момента принятия решение о непризнании события страховым случаем письменно информирует об этом Застрахованное лицо.
6.	<style isBold="true">Порядок определения и осуществления страховой выплаты, оказания медицинских услуг определен в разделе 11 Условий страхования.</style>
7.	<style isBold="true">Порядок принятия решения по заявленному событию, имеющему признаки страхового случая:</style>
7.1.	После представления Выгодоприобретателем (Застрахованным лицом, Страхователем), всех необходимых документов, позволяющих судить о причинах и обстоятельствах, повлекших наступление события, обладающего признаками страхового случая, и о размере страховой выплаты, Страховщик в течение 15 (пятнадцати) рабочих дней со дня представления Выгодоприобретателем (Застрахованным лицом, Страхователем) всех необходимых документов обязан принять одно из следующих решений:
	7.1.1. <style isBold="true">О признании заявленного события страховым случаем.</style>
В этом случае в указанный в п. 7.1. Договора страхования срок Страховщик утверждает Страховой акт и осуществляет организацию оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг.
	7.1.2. <style isBold="true">Об отказе в страховой выплате.</style>
В этом случае в течение 10 (десяти) рабочих дней с момента принятия решения об отказе в страховой выплате (в срок, предусмотренный п. 7.1. Договора страхования) Страхователю (Застрахованному лицу, Выгодоприобретателю) направляется письменное уведомление с мотивированным обоснованием причин отказа.
	7.1.3. <style isBold="true">О проведении страхового расследования.</style>
Страховщик имеет право, письменно уведомив Страхователя (Застрахованное лицо, Выгодоприобретателя), вынести мотивированное решение об отсрочке принятия решения о признании или непризнании события страховым случаем или об отказе в страховой выплате, в случаях если:
	v	по фактам, послужившим причиной наступления страхового случая, возбуждено уголовное дело или начат судебный процесс - до окончания производства по уголовному делу или судебному процессу (до события, которое наступит ранее);
	v	возникла необходимость в экспертизе представленных документов. Отсрочка возможна, в случае, если у Страховщика имеются мотивированные сомнения в подлинности документов, подтверждающих страховой случай;]]></text>
			</staticText>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="-1" y="8" width="556" height="763" uuid="1b4ea882-dca6-41e5-ac2a-3fa25b894001">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.tabStopWidth" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0" tabStopWidth="25"/>
				</textElement>
				<text><![CDATA[	v	полученные Страховщиком и предусмотренные договором страхования документы не подтверждают наличие страхового события, в связи с чем возникла необходимость в запросе дополнительных документов. В этом случае, Страховщик вправе запросить дополнительно документы у Страхователя (Застрахованного лица, Выгодоприобретателя) и/или компетентных органов. При этом Страховщик обязан обосновать в своем запросе необходимость предоставления ему таковых документов.
Страховое расследование проводится в течение 30 (тридцати) рабочих дней после получения всей необходимой информации в соответствии с настоящим пунктом Условий страхования. Решение о признании или непризнании события страховым случаем или об отказе в страховой выплате принимается в течение 15 (пятнадцати) рабочих дней после завершения страхового расследования.
8.	<style isBold="true">ОСНОВАНИЯ ОТКАЗА В СТРАХОВОЙ ВЫПЛАТЕ</style>
8.1.	<style isBold="true">Страховщик освобождается от страховой выплаты в следующих случаях:</style>
	8.1.1. Если страховой случай по любому страховому риску наступил вследствие умысла Страхователя, Выгодоприобретателя или Застрахованного лица.
	8.1.2. Если страховой случай по любому страховому риску наступил вследствие:
		8.1.2.1. Воздействия ядерного взрыва, радиации или радиоактивного заражения.
		8.1.2.2. Военных действий, а также маневров или иных военных мероприятий.
		8.1.2.3. Гражданской войны, народных волнений всякого рода или забастовок.
8.2.	<style isBold="true">Страховщик отказывает в страховой выплате по следующим основаниям:</style>
	8.2.1. Произошедшее событие не является страховым случаем, т.е. не относится к событиям, на случай наступления которых был заключен договор страхования (например, отнесено к исключениям (раздел 5 Условий страхования, раздел 2 Договора страхования) или не может быть квалифицировано в качестве страхового случая, исходя из терминов и определений, определенных Условиями страхования и Договором страхования).
	8.2.2. Событие произошло до начала или после окончания (в т. ч. досрочного) срока дейтствия договора страхования (например, после прекращения срока действия договора страхования).
	8.2.3. Событие произошло в период ожидания.
	8.2.4. Сумма страховой выплаты превышает лимит ответственности (лимит страхового обязательства). При этом возможен частичный отказ в страховой выплате пропорционально превышению лимита.
	8.2.5. Событие произошло с лицом, которое не является Застрахованным лицом по договору страхования, или событие произошло по страховому риску, который не предусмотрен в отношении Застрахованного лица.
	8.2.6. По основаниям, предусмотренным действующим законодательством Российской Федерации (в т. ч. если Страховщик освобожден от страховой выплаты).
9.	<style isBold="true">ДЕКЛАРАЦИЯ И СОГЛАСИЯ СТРАХОВАТЕЛЯ:</style>
9.1.	Заключая договор страхования и оплачивая страховую премию, Страхователь подтверждает:
	v	свое ознакомление и согласие с условиями страхования, изложенными в настоящем Страховом полисе и Условиях страхования, в частности, Страхователь подтверждает, что ознакомлен и согласен с исключениями, порядком определения размера страховой выплаты и установленными лимитами ответственности, перечнем оснований для отказа в страховой выплате, условиями досрочного прекращения договора страхования и условиями, при которых договор страхования считается незаключенным ввиду несогласования сторонами его существенных условий, и иными условиями страхования;
	v	<style isBold="true">что до заключения</style> Страхового полиса ему была предоставлена полная информация о страховой услуге согласно Закону Российской Федерации от 07.02.1992 № 2300-1 «О защите прав потребителей», в том числе о размере страховой премии, порядке ее оплаты и последствиях ее неоплаты; о порядке установления страховой суммы; о перечне страховых случаев; об исключениях из страхования; о требованиях к Застрахованному лицу, декларируемых Страховым полисом; о порядке действий Страхователя при наступлении события, имеющего признаки страхового случая; о порядке и определении размера страховой выплаты; о фирменном наименовании и о месте нахождения Страховщика, Сервисной компании, о номерах телефонов, о режиме работы Страховщика, Сервисной компании, которая позволила ему сделать правильный выбор страховой услуги, а также о том, что он был вправе обратиться к Страховщику для согласования иного содержания отдельных условий договора страхования;
	v	свое ознакомление, понимает и соглашается с тем, что при наступлении событий по страховым рискам, перечисленным в Страховом полисе, у Страховщика возникает обязанность осуществить организацию оказания медицинских и иных услуг в общей сложности не более страховой суммы, установленной Договором страхования.
	v	что ознакомлен с последствиями, предусмотренными ст. 431.2 Гражданского кодекса Российской Федерации, наступающими в случае, если при заключении Страхового полиса либо до или после его заключения Страхователь дал Страховщику недостоверные заверения об обстоятельствах, имеющих значение для заключения Страхового полиса, его исполнения или прекращения (в том числе определения вероятности наступления страхового случая и размера возможных убытков от его наступления);
	v	что обстоятельства, оговоренные в Страховом полисе, имеют существенное значение для заключения Страхового полиса, его исполнения и прекращения (в том числе определения вероятности наступления страхового случая и размера возможных убытков от его наступления);
	v	что является гражданином Российской Федерации;]]></text>
			</staticText>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="-1" y="8" width="556" height="763" uuid="70ed7ae6-cc76-41e6-afb6-f87b40fc015b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.tabStopWidth" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0" tabStopWidth="25"/>
				</textElement>
				<text><![CDATA[	v	что не является публичным должностным лицом (в том числе иностранным публичным должностным лицом, должностным лицом публичных международных организаций, а также лицом, замещающим (занимающим) государственную должность РФ, должность члена совета директоров ЦБ РФ, должность федеральной государственной службы, назначение и освобождение от которой осуществляется Президентом РФ или Правительством РФ, должность в ЦБ РФ, государственной корпорации и иных организациях, созданных РФ на основании федеральных законов, включенную в перечни должностей, определяемые Президентом РФ), а также супругом(-ой) и /или родственником такого публичного должностного лица. В ином случае Страхователь обязуется представить подтверждающие вышеназванные данные документы и /или сведения (в т. ч. об адресе работодателя, степени родства либо статусе по отношению к публичному должностному лицу (с учетом того, что применимо);
	v	не имеет регистрации, места жительства /нахождения, счета в банке, зарегистрированном в государстве (на территории), которое(-ая) не выполняет рекомендации ФАТФ. Страхователь не является субъектом санкций Управления по контролю за иностранными активами Министерства финансов США и Европейского Союза;
	v	бенефициарным владельцем (физическим лицом, которое имеет возможность контроли¬ровать действия клиента) является Страхователь; целью установления Страхователем деловых отношений со Страховщиком является получение страховой услуги;
	v	вся информация (в т. ч. указанная в настоящем разделе Договора страхования) является полной, достоверной и действительной на дату предъявления предоставленных им сведений, а также подтверждает обязанность в случае изменений идентификционных сведений сообщить об этих изменениях Страховщику в течении 5 рабочих дней с момента их изменения ;
	v	подтверждает, что Условия ему вручены, разъяснены и понятны, с условиями страхования он согласен;
	v	подтверждает, что не имеет Страхового полиса «Выбери здоровье» и / или «Выбери здоровье Плюс» ООО «РСХБ-Страхование жизни», срок действия которого (которых) полностью или частично совпадает (совпадают) со сроком действия настоящего Страхового полиса;
	v	подтверждает, что источниками происхождения средств, вносимых в качестве страховой премии, являются личные накопления и/или кредитные средства.
9.2.	Заключая договор страхования и оплачивая страховую премию, Страхователь дает согласие:
	v	Страховщику, а также Madanes Advanced Healthcare Services Ltd и/или их уполномоченным представителям на обработку персональных данных, в соответствии с положениями настоящего Страхового полиса и Условий страхования, Федеральным законом от 27.07.2006 №152-ФЗ «О персональных данных» (далее – Закон) в целях надлежащего исполнения договора страхования, организации оказания услуг, включения персональных данных в информационную систему персональных данных для информирования о новинках страховых продуктов, участия в маркетинговых, рекламных акциях и исследованиях, а также для осуществления информационного сопровождения исполнения договора страхования, в том числе посредством направления уведомлений с применением СМС-сообщений, посредством электронной почты и иными доступными способами. Страхователь дает согласие поручить обработку его персональных данных третьим лицам на основании заключенных Стра¬ховщиком с этими лицами договоров /соглашений (агентских, возмездного оказания услуг, о взаимном сотрудничестве, хранении, обеспечении конфиденциальности и безопасности и др.) в целях предоставления страховой услуги (далее — Обработчики). Страхователь дает согласие на передачу (предоставление) персональных данных Обработчикам, а также иным третьим лицам, круг которых ограничен и определен опосредованно как лица, с которыми Страховщик вправе взаимодействовать в связи с исполнением Договора страхования (в т. ч. при рассмо¬трении страхового события);
	v	на предоставление Страховщику и Madanes Advanced Healthcare Services Ltd любой информации /сведений /документов (в т. ч. данных о состоянии здоровья, составляющие врачебную тайну), связанных с оказанием страховой услуги, государственными органами, федеральными государственными учреждениями МСЭ и Фондом ОМС, медицинскими и иными учреждениями (организациями, государственными органами), в том числе: любые медицинские документы и/или их заверенные копии (результаты лабораторных и инструментальных исследований, результаты лечения, прогноз по заболеванию и т.д.), как в связи с оценкой степени страхового риска, так и в связи с событиями, имеющими признаки страхового случая. Данное согласие имеет силу и действует с даты заключения Страхового полиса до истечения 6 (шести) лет после прекращения обязательств по Страховому полису;
	v	на использование его персональных данных в целях продвижения Страховщиком своих услуг на рынке путем осуществления прямых контактов с помощью средств связи, а также для осуществления информационного сопровождения в связи с оказанием страховой услуги (в т. ч. для СМС-рассылок).
	v	дает свое согласие на использование Страховщиком факсимильного воспроизведения подписи и печати Страховщика на Страховом полисе с помощью средств механического или иного копирования, электронно-цифровой подписи либо иного аналога собственноручной подписи.
<style isUnderline="true">Перечень действий с персональными данными и общее описание способов их обработки</style>: сбор, запись, систематизация, накопление, хранение, уточнение (обновление, изменение), извлечение, использование, передача (предоставление, доступ), обезличивание, блокирование, удаление, уничтожение персональных данных; пер¬сональные данные будут обрабатываться с использованием различных сочетаний средств автоматизации и неавтоматизированных средств обработки (смешанная обработка). Перечень обрабатываемых персональных данных: фамилия, имя, отчество, дата и место рождения, гражданство, реквизиты документа, удостоверяющего личность (серия, номер, кем и когда выдан, код подразделения и др.), ИНН (при наличии), контактная информация (адрес места жительства, фактический адрес и др.), платежные реквизиты, иные персональные данные, содержащиеся в документах, которые были оформлены при]]></text>
			</staticText>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="-1" y="8" width="556" height="763" uuid="41a139b1-2a14-4faa-b031-01bceef5198e">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.tabStopWidth" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0" tabStopWidth="25"/>
				</textElement>
				<text><![CDATA[заключении Договора страхования или переданы /будут переданы Страховщику в связи с оказанием страховой услуги, будут получены в ходе рассмотрения страхового события и /или сообщены Страховщику устно. Согласие действует в течение срока действия Договора стра-хования и еще шесть лет после его прекращения. Согласие может быть отозвано посредством направления письменного уведомления Страховщику.
9.3.	Страхователь обязуется предоставить Страховщику и Madanes Advanced Healthcare Services Ltd любую медицинскую информацию: об обращениях за медицинской помощью, состоянии его здоровья и диагнозе, иные сведения, полученные при медицинском обследовании и лечении. Страхователь дает свое согласие на предоставление Страховщику любыми лечебно-профилактическими или особого типа учрежде¬ниями здравоохранения и /или частными врачами, у которых Страхователь проходил лечение, находится или находился под наблюдением, сведений о факте обращения Страхователя за оказанием медицинской помощи, состоянии его здоровья и диагнозе, иные сведения, получен¬ные при медицинском обследовании и лечении. Страхователь уполномочивает Страховщика и Madanes Advanced Healthcare Services Ltd на получение сведений, составляющих врачебную тайну, в любом виде и в любой форме (в т. ч. на получение справок, актов, заключений, результатов обследования). Страхователь дает свое согласие на предоставление Страховщику любыми лечебно-профилактическими или особого типа учреждениями здравоохранения и /или частными врачами, у которых Страхователь проходил лечение, находится или находился под наблюдением, сведений о факте обращения Страхователя за оказанием медицинской помощи, состоянии его здоровья и диагнозе, иные сведения, полученные при медицинском обследовании и лечении. Страхователь уполномо¬чивает Страховщика и Madanes Advanced Healthcare Services Ltd на получение сведений, составляющих врачебную тайну, в любом виде и в любой форме (в т. ч. на получение справок, актов, заключений, результатов обследования).
9.4.	<style isBold="true">Заключая договор страхования и оплачивая страховую премию Страхователь подтверждает, что:</style>
	v	возраст Страхователя на дату акцепта настоящего Страхового полиса не менее 18 (восемнадцати) и не более 64 (шестидесяти четырех) лет;
	v	Страхователь является дееспособным физическим лицом;
	v	Страхователь не является инвалидом I или II группы, ребенком-инвалидом, не имеет направление на медико-социальную экспертизу для установления инвалидности;
	v	Страхователь, не нуждается в постоянном уходе в соответствии с медицинским заключением;
	v	Страхователь не имеет заболевания и(или) функциональные нарушения из нижеуказанных (по которым в течение жизни устанавливался диагноз, проводилось и(или) проводится лечение, либо в отношении которых лицо находилось (находится) под наблюдением врача-специалиста): СПИД или ВИЧ-инфекция; злокачественные новообразования, в том числе рак «in situ»; лейкоз; болезнь Ходжкина; доброкачественная или злокачественная опухоль головного мозга; пищевод Барретта; дисплазия шейки матки; язва желудка; болезнь Крона; неспецифический язвенный колит; сахарный диабет; туберкулез; цирроз печени, алкогольная болезнь печени; гепатит B, C, D; аутоиммунные заболевания (ревматизм, системная красная волчанка, болезнь Вагнера, склеродермия); хроническая дыхательная недостаточность II- III степени; хроническая обструктивная болезнь легких (ХОБЛ); первичный иммунодефицит; доброкачественная гиперплазия предстательной железы; полицитемия; крипторхизм; синдром Дауна; хронический панкреатит;	амилоидоз; дилатационная кардиомиопатия; перенесенный в прошлом инфаркт миокарда; ишемическая болезнь сердца; врожденные пороки сердца;
	v	Страхователь не	имеет психических (нервных) заболеваний и/или расстройства; не состоит на учете в наркологических и/или психоневрологических диспансерах;
	v	Страхователь не переносил хирургические операции: по трансплантации органа или его части (в том числе, но не ограничиваясь, костного мозга), на клапанах сердца, трепанации черепа;
	v	у Страхователя за 6 месяцев, предшествующих заключению договора страхования, не отмечалась нецеленаправленная резкая потеря веса (10 кг и более), в случае если у данного лица индекс массы тела (отношение массы тела (кг) к квадрату роста (м)) находится в диапазоне менее 20 или более 35; а также у данного лица отмечалась патологическая кровопотеря из любых источников;
	v	 Страхователь не имеет отклонений от установленных лабораторных норм показателей онкомаркеров (если такие исследования проводились);
	v	 Страхователь не подвергался (подвергается) воздействию радиации, токсических или канцерогенных веществ при выполнении своих профессиональных обязанностей;
	v	Страхователь не выкуривает более 20 сигарет в день и/ или не курит ежедневно электронные сигареты, сигары, трубки, кальян/наргиле, или другие никотиновые заменители; не употребляет алкоголь более чем 5 единиц в день (одна единица = 300 мл пива или 100 мл вина или 20 мл спирта);
	v	 Страхователь и/или его ближайшие родственники (отец, мать, братья, сестры) в возрасте до 60 лет не болели онкологическими заболеваниями и / или не умирали от рака (в случае, если этот факт был известен Страхователю до заключения договора страхования).
10.	<style isBold="true">ЗАКЛЮЧИТЕЛЬНЫЕ ПОЛОЖЕНИЯ</style>
10.1.	К Страховому полису прилагаются и являются неотъемлемой частью Договора страхования Условия страхования «Выбери здоровье».
10.2.	В случае спорных ситуаций положения настоящего Страхового полиса имеют приоритетную силу по отношению к Условиям страхования. Во всем, что не предусмотрено положениями настоящего Страхового полиса, стороны руководствуются Условиями страхования.]]></text>
			</staticText>
		</band>
		<band height="324">
			<staticText>
				<reportElement x="-1" y="8" width="556" height="92" uuid="58e370b8-3ac0-4a69-9da7-0179cc6aefee">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.tabStopWidth" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0" tabStopWidth="25"/>
				</textElement>
				<text><![CDATA[10.3.	Никакие отметки (а также дополнения, исправления и т. п.), сделанные на Договоре страхо¬вания (Страховой полис и приложения к нему) от руки, не имеют юридической силы, если их верность не засвидетельствована собственноручными подписями Сторон и оригинальным оттиском печати Страховщика.
10.4.	Заключая Договор страхования, Страхователь подтверждает, что Страховой полис и Условия страхования «Выбери здоровье», утвержденные приказом генерального директора Страховщика от «_______»________2018г. №__________, Страхователем приняты. Условия страхования вручены Страхователю и получены им.
<style isBold="true">ПРИЛОЖЕНИЕ:</style> Условия страхования «Выбери здоровье».]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="0" y="110" width="271" height="13" backcolor="#C0C0C0" uuid="4b639882-5f80-4a67-966a-1de378b6bdc2">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Open Sans" size="9" isBold="true"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЩИК]]></text>
			</staticText>
			<staticText>
				<reportElement x="0" y="123" width="307" height="59" uuid="e809d404-5816-418c-8c42-38406354bf46">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.tabStopWidth" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Open Sans" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0" tabStopWidth="25"/>
				</textElement>
				<text><![CDATA[Генеральный директор ООО «РСХБ-Страхование жизни»
__________________________________ / Мальков Максим Владимирович/
Аналог собственноручной подписи и печати
м.п.]]></text>
			</staticText>
		</band>
	</detail>
	<pageFooter>
		<band height="30">
			<textField>
				<reportElement x="455" y="8" width="100" height="14" uuid="74c80864-705d-4d1a-8ce2-052e98e8d9bd"/>
				<textElement textAlignment="Right">
					<font fontName="Open Sans"/>
				</textElement>
				<textFieldExpression><![CDATA[$V{PAGE_NUMBER}]]></textFieldExpression>
			</textField>
		</band>
	</pageFooter>
</jasperReport>
'::text, 'utf8')) -- Пример печатной формы договора страхования
ON CONFLICT (type)
DO NOTHING;
insert into common_dict.PRINT_TEMPLATES(TYPE, COPIES_NUMBER, FILE_NAME, CONTENT)
values ('4f2434ae-5eb1-4b10-8f83-2cbcddfdbf95', 2, 'Договор страхования «Выбери здоровье Плюс»', convert_to('<?xml version="1.0" encoding="UTF-8"?>
<!-- Created with Jaspersoft Studio version 6.5.1.final using JasperReports Library version 6.5.1  -->
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="RshbInsuranceChooseHealth" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" isFloatColumnFooter="true" uuid="4eedbb89-b4f6-4469-9ab6-f642a1688cf7">
	<property name="com.jaspersoft.studio.data.defaultdataadapter" value="One Empty Record"/>
	<subDataset name="tableDataset" uuid="f13e6d36-5148-4ecc-bbe3-3035def80980">
		<queryString>
			<![CDATA[]]>
		</queryString>
	</subDataset>
	<parameter name="sign" class="java.lang.Boolean"/>
	<parameter name="stamp" class="java.lang.Boolean"/>
	<parameter name="contractNumber" class="java.lang.String"/>
	<parameter name="surname" class="java.lang.String"/>
	<parameter name="name" class="java.lang.String"/>
	<parameter name="patronymic" class="java.lang.String"/>
	<parameter name="birthDate" class="java.lang.String"/>
	<parameter name="contractStartDate" class="java.lang.String"/>
	<parameter name="contractSignDate" class="java.lang.String"/>
	<parameter name="phoneNumber" class="java.lang.String"/>
	<parameter name="email" class="java.lang.String">
		<defaultValueExpression><![CDATA[""]]></defaultValueExpression>
	</parameter>
	<parameter name="isTestInstance" class="java.lang.Boolean" isForPrompting="false">
		<parameterDescription><![CDATA[Инстанс приложения запущен на тестовом стенде]]></parameterDescription>
		<defaultValueExpression><![CDATA[true]]></defaultValueExpression>
	</parameter>
	<queryString>
		<![CDATA[]]>
	</queryString>
	<background>
		<band height="772">
			<image>
				<reportElement isPrintRepeatedValues="false" x="3" y="0" width="550" height="758" uuid="ea763663-ef82-4cb6-a25f-d7c500e2fa1a">
					<printWhenExpression><![CDATA[$P{isTestInstance} == true]]></printWhenExpression>
				</reportElement>
				<imageExpression><![CDATA[net.sf.jasperreports.renderers.BatikRenderer.getInstanceFromText("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"765\" height=\"990\"><text x=\"60\" y=\"40\" transform=\"matrix(.6,-.82,.83,.6,30,1055)\" style=\"font-size:220px;font-weight:bold;fill:#d8d8d8\">ОБРАЗЕЦ</text></svg>")]]></imageExpression>
			</image>
		</band>
	</background>
	<detail>
		<band height="772">
			<staticText>
				<reportElement x="0" y="0" width="271" height="15" uuid="13533ce6-dbe7-4b4d-9667-044ed58e5a09">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Center">
					<font fontName="Arial" size="11" isBold="true"/>
				</textElement>
				<text><![CDATA[ДОГОВОР СТРАХОВАНИЯ (Страховой полис) «Выбери здоровье плюс» ]]></text>
			</staticText>
			<textField>
				<reportElement x="1" y="15" width="279" height="35" uuid="b1030e44-bdf5-48a4-aaaf-f2be11f5788f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Center">
					<font fontName="Arial" size="11" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["«Выбери здоровье Плюс» № " + $P{contractNumber} + "\nот " + $P{contractSignDate}]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement x="0" y="50" width="280" height="160" uuid="1d4eea10-38c3-4880-879f-4d32eb4ca9c2">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[По настоящему Договору страхования (Страховому полису) «<style isBold="true">Выбери здоровье Плюс</style>», являющемуся офертой (далее – Страховой полис, Договор страхования) Страховщик предлагает Страхователю, в соответствии со статьей 435 Гражданского кодекса Российской Федерации, заключить Договор добровольного страхования на нижеследующих условиях. Договор страхования заключается путем принятия и акцепта Страхователем настоящего Страхового полиса (оферты), подписанного Страховщиком. На основании ст. 435, 438 и п. 2 ст. 940 ГК РФ]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="1" y="210" width="130" height="180" backcolor="#C0C0C0" uuid="2ca31443-b24e-4580-b580-eaddad0fb35a">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЩИК]]></text>
			</staticText>
			<staticText>
				<reportElement x="140" y="210" width="416" height="180" uuid="00ed8b66-a12b-4377-899f-809f0801f972">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[ООО «РСХБ-Страхование жизни»,  лицензия на осуществление добровольного личного страхования, за исключением  добровольного страхования жизни, СЛ № 4358, выдана Банком России без ограничения срока действия
<style isBold="true">Адрес:</style> г. Москва, Гагаринский пер., д. 3;
<style isBold="true">Телефон:</style> 8 (495) 745 99 55;
<style isBold="true">Режим работы:</style> понедельник-четверг: с 9.00 до 18.00, пятница: с 9.00 до 16.45.

<style isBold="true">Банковские реквизиты:</style> Расчетный счет: 40701810100000000160; ИНН 7704447253; Банк получателя: АО «РОССЕЛЬХОЗБАНК», г. Москва, БИК Банка получателя: 044525111, Корр. счет: 30101810200000000111

www.rshbins-life.ru]]></text>
			</staticText>
			<staticText>
				<reportElement x="290" y="0" width="263" height="210" uuid="439df76f-1377-4599-abb8-ea3d3cb0cbda">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[акцептом настоящего Страхового полиса (оферты) считается принятие Страхового полиса, что подтверждается оплатой страховой премии в соответствии с условиями, содержащимися в Страховом полисе. Договор страхования заключается на основании Условий страхования №2-МС «Выбери здоровье Плюс», утвержденных приказом Генерального директора Страховщика от «25» сентября 2018г. № 79 (Далее – Условия страхования). Положения, содержащиеся в Условиях страхования и не включенные в текст настоящего Страхового полиса, применяются к Договору страхования и обязательны для Страхователя (Выгодоприобретателя).]]></text>
			</staticText>
			<textField>
				<reportElement x="455" y="758" width="100" height="14" uuid="e921e847-017a-4f8d-8a6d-32902da42898"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[1]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement stretchType="ElementGroupBottom" mode="Opaque" x="0" y="400" width="130" height="358" backcolor="#C0C0C0" uuid="27a489d8-c21a-4cbf-b91d-32469f102b83">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВАТЕЛЬ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" stretchType="ElementGroupBottom" x="140" y="400" width="416" height="358" uuid="70843296-76f4-49bb-ad86-4cb04cdc058f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Bottom" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[]]></text>
			</staticText>
			<textField isStretchWithOverflow="true">
				<reportElement stretchType="ContainerBottom" x="145" y="410" width="409" height="119" uuid="c7223a32-04c4-467d-8595-015f96872745">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<textFieldExpression><![CDATA["Фамилия <style isItalic=\"true\"> " +$P{surname} + " </style>, Имя <style isItalic=\"true\" >" + $P{name} + "</style>, Отчество <style isItalic=\"true\">" + $P{patronymic} + "</style>\nДата рождения <style isItalic=\"true\">" + $P{birthDate} + "</style> Телефон <style isItalic=\"true\">" + $P{phoneNumber} + "</style>\nАдрес электронной почты <style isItalic=\"true\">" + $P{email} + "</style>"]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement positionType="Float" x="140" y="529" width="415" height="220" uuid="e806d396-b92b-49ec-8077-12f47876b5c5">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страхователем по настоящему Договору страхования является дееспособное физическое лицо, отвечающее требованиям, предусмотренным в п.1.4.4. Условий страхования, заключившее со Страховщиком Договор страхования и указанное в Платежном поручении в качестве плательщика страховой премии. В Платежном поручении указываются по меньшей мере следующие данные: фамилия, имя, отчество Страхователя, дата и номер Договора страхования. Страховщик не заключает на условиях, указанных в настоящем Страховом полисе, Договоры страхования в отношении лиц, не соответствующих условиям, указанным в п.1.4.4. Условий страхования. Данное условие является существенным условием Договора страхования. Если лицо, оплатившее Договор страхования, не соответствует условиям, указанным в 1.4.4. Условий страхования, Договор страхования является незаключенным ввиду несогласования Сторонами существенных условий Договора (условия о Застрахованном лице). В таком случае Страховщик производит возврат поступивших денежных средств лицу, совершившему платеж, в порядке и сроки, предусмотренные Условиями страхования.]]></text>
			</staticText>
		</band>
		<band height="754">
			<staticText>
				<reportElement mode="Opaque" x="0" y="160" width="130" height="580" backcolor="#C0C0C0" uuid="8ae4b8bd-24b8-4545-b147-5a91368e72a6">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЫЕ РИСКИ.
СТРАХОВЫЕ СЛУЧАИ.]]></text>
			</staticText>
			<staticText>
				<reportElement x="140" y="160" width="414" height="580" uuid="53678cb7-f610-4702-873c-828126d6b7bd">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Top" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[<style isBold="true">Страховым риском</style>, согласно Договору страхования и Условиям страхования, является риск возникновения в период страхования обстоятельств, требующих оказания медицинских и иных услуг Застрахованному лицу <style isBold="true">в связи с</style>:
<style isBold="true">1.1. Злокачественным новообразованием,</style> а именно: злокачественным новообразованием, характеризующимся неконтролируемым ростом и распространением злокачественных клеток, проникающих в ткань различного гистологического типа, и относящимся к кодам C00-C43, C45-C97 по МКБ-10, <style isBold="true">за исключением</style>: С44 – эпителиальных опухолей кожи (включая базалиому, плоскоклеточный рак), C91.1 – хронического лимфоцитарного В – клеточного лейкоза, а также возникновениея новообразования при наличии у Застрахованного лица ВИЧ-инфекции или СПИДа.
<style isBold="true">Страховым случаем</style>, с учетом всех положений, определений и исключений из страхования, предусмотренных Договором страхования и Условиями страхования, является документально подтверждённое обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим пунктом, при одновременном наличии следующих условий: диагноз злокачественного новообразования подтвержден гистологическими или (в случае системных онкологических заболеваний) цитологическими исследованиями и заключением врача-онколога; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу впервые в жизни; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу в течение Периода страхования, по истечении периода ожидания; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, предусмотренных п.10.1.2. Условий страхования в течение Периода страхования.
<style isBold="true">1.2. Трансплантацией костного мозга</style>, а именно: плановым медицинским мероприятием, удовлетворяющим следующим условиям:
- событие признано страховым случаем по Договору страхования;
- в наличии донор, подходящий для трансплантации Застрахованному лицу;
- оказание услуг осуществляется в больнице, подтвердившей возможность оказания услуги, согласованной Сервисной компанией;
- не является экспериментальной процедурой и/или процедурой, выполняемой в научно-исследовательских целях;
- проводится в соответствии с законодательством Российской Федерации.
<style isBold="true">Страховым случаем</style>, с учетом всех положений, определений и исключений из страхования, предусмотренных Условиями страхования, является документально подтвержденное обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим пунктом, при одновременном наличии следующих условий: диагноз лимфомы или лейкоза установлен в течение ]]></text>
			</staticText>
			<textField>
				<reportElement x="453" y="740" width="100" height="14" uuid="8f9e3dfd-b543-4252-b86b-52423bbadf36"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[2]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement positionType="Float" x="139" y="76" width="416" height="78" uuid="5b036380-182f-427c-acd0-5be6776fe87b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[<style isBold="true">Общество с ограниченной ответственностью "СОЮЗМЕДСЕРВИС" (ООО "СоюзМедСервис").
Круглосуточная служба поддержки: 8 (800) 600 45 99, 8 (495) 797 79 33</style>
<style isBold="true">Адрес</style>: 143422, Московская обл., Красногорский р-н, с. Петрово-Дальнее, ул. Тихвинская, д. 10 <style isBold="true">Эл. адрес</style>: help@s-med-s.ru]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="76" width="130" height="78" backcolor="#C0C0C0" uuid="7ccb4ce6-b6a9-48d6-9587-20bd06e1fff5">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СЕРВИСНАЯ КОМПАНИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="41" width="130" height="29" backcolor="#C0C0C0" uuid="8e41abb0-55cb-4a91-9075-1b9e745f2886">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ВЫГОДОПРИОБРЕТА
ТЕЛЬ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="140" y="41" width="416" height="29" uuid="18a8b6e4-3197-4947-9340-e030c4034957">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Застрахованное лицо]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="140" y="7" width="416" height="28" uuid="41d5d2e8-d3e5-4ee8-a2c2-6cf1e947c55f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страхователь, при соблюдении условий, предусмотренных п.1.4.4. Условий страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="7" width="130" height="28" backcolor="#C0C0C0" uuid="b5a9672c-ebe1-4c61-8319-6891027516bc">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ЗАСТРАХОВАННОЕ ЛИЦО]]></text>
			</staticText>
		</band>
		<band height="772">
			<textField>
				<reportElement x="455" y="758" width="100" height="14" uuid="5a296896-1cd6-4b58-9626-182af1e38aa4"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[3]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement x="140" y="10" width="414" height="748" uuid="c72cd6b6-ad04-4763-9572-06e1dd9f9103">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Top" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[срока действия Договора страхования и подтвержден гистологически;  трансплантация костного мозга назначена лечащим врачом при лечении по поводу заболевания, диагностированного впервые в жизни в течение Периода страхования, по истечении периода ожидания; Сервисной компанией получено подтверждение необходимости проведения трансплантации не менее чем двумя Врачами-специалистами в соответствующей области медицины в соответствии с принятыми медицинскими критериями; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, предусмотренных п.10.1.2. Условий страхования в течение Периода страхования.
<style isBold="true">1.3. Аортокоронарным шунтированием</style>, а именно: хирургической операцией по рекомендации кардиолога, направленной на восстановление кровотока в артериях сердца путём обхода места сужения (закупорки) одной или нескольких коронарных артерий с помощью обходных трансплантатов (шунтов), признанной страховым случаем. При этом любое коронарное заболевание, лечение которого осуществляется с помощью метода, не являющегося аортокоронарным шунтированием, например, хирургические операции по пластике сосудов, стентирование, - страхованием не покрываются.
<style isBold="true">Страховым случаем</style>, с учетом всех положений, определений и исключений из страхования, предусмотренных Условиями страхования, является документально подтвержденное обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим пунктом, при одновременном наличии следующих условий:  Аортокоронарное шунтирование назначено лечащим врачом при лечении по поводу заболевания, диагностированного впервые в жизни в течение Периода страхования, по истечении периода ожидания; необходимость операции возникла в Период страхования и подтверждена результатами коронарной ангиографии; Сервисной компанией получено подтверждение необходимости хирургического вмешательства, согласно мнению сертифицированного медицинского специалиста из сертифицированного медицинского учреждения; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, предусмотренных п.10.1.2. Условий страхования, в течение Периода страхования.
<style isBold="true">1.4. Хирургической операцией по замене / восстановлению сердечных клапанов</style>, а именно: хирургической операцией на сердечных клапанах, рекомендованной лечащим врачом - кардиологом, направленной на замену или лечение одного или нескольких сердечных клапанов, признанной страховым случаем. При этом лечение поражения сердечных клапанов в результате эндокардита, вызванного венерическим заболеванием, страхованием не покрывается.
Страховым случаем, с учетом всех положений, определений и исключений из страхования, предусмотренных Условиями страхования, является документально подтвержденное обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим пунктом, при одновременном наличии следующих условий:   хирургическая операция на сердечных клапанах назначена лечащим врачом при лечении по поводу заболевания, диагностированного впервые в течение Периода страхования, по истечении периода ожидания; необходимость операции (лечения) обусловлена развитием стеноза / недостаточности или комбинацией этих состояний и возникла в Период страхования; Сервисной компанией получено подтверждение необходимости хирургического вмешательства, согласно мнению сертифицированного медицинского специалиста из сертифицированного медицинского учреждения; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, ]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="0" y="10" width="130" height="748" backcolor="#C0C0C0" uuid="0c58ad17-1bb6-400c-b7f2-c65afd94a15c">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[]]></text>
			</staticText>
		</band>
		<band height="760">
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="670" width="130" height="50" backcolor="#C0C0C0" uuid="a269e097-15ab-4324-98d1-cc31dbd1e8ce">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ЛИМИТЫ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="141" y="670" width="416" height="50" uuid="f4e7a2e1-3637-4a32-966e-6ca2efa5bafb">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Максимальный лимит ответственности Страховщика по оплате организации медицинских и иных услуг по Договору страхования в совокупности равен страховой сумме]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="141" y="450" width="417" height="21" uuid="a320100b-c1d1-4321-a0ef-31ea0a22488b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Center" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="true"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[9 000 000 (Девять миллионов) рублей]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="141" y="480" width="416" height="180" uuid="89b7d22d-5d05-4439-abde-6d00e81de622">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страховая премия составляет <style isBold="true">14 990 (Четырнадцать тысяч девятьсот девяносто) рублей 00 копеек.</style>
Страховой тариф составляет 0,166556%
Страховая премия подлежит оплате единовременно в день заключения Договора страхования. Сумма и дата оплаты указываются на документе, подтверждающем оплату страховой премии.
Если страховая премия не будет уплачена в срок, указанный в настоящем пункте, или будет уплачена в ином размере, чем указан в Страховом полисе, Договор страхования считается незаключенным ввиду несогласования его существенных условий, при этом денежные средства считаются ошибочно уплаченными и подлежат возврату лицу, совершившему платеж, в порядке и сроки, предусмотренные Условиями страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="2" y="480" width="130" height="180" backcolor="#C0C0C0" uuid="3a8b1e27-b482-4435-9e6a-149844bfe6af">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВАЯ ПРЕМИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="3" y="450" width="130" height="21" backcolor="#C0C0C0" uuid="50b4f490-1a8c-426d-9e9b-1901ec7e0100">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВАЯ СУММА]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="3" y="290" width="129" height="151" backcolor="#C0C0C0" uuid="4dc2685b-009d-40bc-bfef-c53f994c1e13">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ПЕРИОД ОЖИДАНИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="141" y="290" width="416" height="151" uuid="9824ed1f-5c25-44f3-bc77-d2109ca68fef">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[<style isBold="true">120 (Сто двадцать) календарных дней</style> с даты заключения Договора страхования.
В течение данного периода времени Страховщик не несет обязательств по организации оказания медицинских и иных услуг (из числа событий, предусмотренных Договором страхования). Обращения Застрахованного лица в этот период не являются страховым случаем, организация услуг не производится, страховая выплата по данным событиям не осуществляется.
При повторном заключении аналогичного Страхового полиса, Стороны при определении периода ожидания руководствуются положениями раздела 6 Условий страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="90" width="130" height="190" backcolor="#C0C0C0" uuid="c59547f4-78d6-4479-80e3-b282a6b4710d">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СРОК ДЕЙСТВИЯ ДОГОВОРА СТРАХОВАНИЯ

ПЕРИОД СТРАХОВАНИЯ]]></text>
			</staticText>
			<textField isStretchWithOverflow="true">
				<reportElement stretchType="ContainerBottom" x="140" y="90" width="416" height="190" uuid="42128406-a137-40e6-b670-699bdde03d09">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<box topPadding="0" leftPadding="0" bottomPadding="0" rightPadding="0">
					<pen lineWidth="1.0" lineStyle="Solid"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<textFieldExpression><![CDATA["\n<style isBold=\"true\">Дата заключения Договора страхования "+$P{contractSignDate}+"г.\nСрок действия Договора страхования</style> составляет 1 (один) год с даты вступления Страхового полиса в силу.\n<style isBold=\"true\">Дата вступления Договора страхования в силу "+$P{contractStartDate}+"г.,\nдо указанной даты Страхователь вправе отказаться от Договора страхования и получить возврат страховой премии в порядке п. 9.9.5.1 Условий.\nПериод страхования</style> начинается с 00 часов 00 минут 121 (Сто двадцать первого) дня с даты заключения Страхового полиса и действует до окончания срока действия Договора страхования\nПри повторном заключении аналогичного Страхового полиса, Стороны при определении срока действия Договора страхования и периода страхования руководствуются положениями раздела 6 и 7 Условий страхования."]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement positionType="Float" x="141" y="50" width="416" height="30" uuid="49532e9a-9902-476d-8a1f-58afdf7931a6">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Услуги, предусмотренные Страховым полисом, оказываются на территории Российской Федерации.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="50" width="130" height="30" backcolor="#C0C0C0" uuid="b8430c02-b46b-4f71-9cd5-4c3a2aed3335">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ТЕРРИТОРИЯ ОКАЗАНИЯ УСЛУГ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="10" width="130" height="30" backcolor="#C0C0C0" uuid="6a4cfc77-7fc1-4e2e-9766-73a5de30a48c">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="141" y="10" width="416" height="30" uuid="9e307ede-2dc4-4910-9d0d-6c01294c74f4">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[предусмотренных пунктом 10.1.2. Условий, в течение Периода страхования.]]></text>
			</staticText>
			<textField>
				<reportElement x="455" y="746" width="100" height="14" uuid="28520854-d70a-4cd3-b1fb-eb01fac9c7f7"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[4]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="0" y="10" width="271" height="750" uuid="4a2eb15b-0af0-44dd-82e1-37fc074eadc9">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[<style isBold="true">2. ОСНОВНЫЕ ПОЛОЖЕНИЯ ДОГОВОРА СТРАХОВАНИЯ </style>
2.1. В соответствии со Страховым полисом и Условиями, Сервисная компания организовывает и оплачивает следующие услуги при наступлении страхового случая:
<style isBold="true">2.1.1. Медицинская транспортировка</style> (медицинская эвакуация) Застрахованного лица к поставщику медицинских услуг и/или между медицинскими организациями и возвращение обратно, включая трансфер автомобилем скорой медицинской помощи или на такси от места жительства до аэропорта (транспортного узла), из аэропорта (транспортного узла) до отеля (апартаментов) и/или до медицинской организации, в которой будет проводиться лечение и обратно.
<style isBold="true">2.1.2. Оплата билета</style> эконом класса для Застрахованного, а также при наличии медицинских показаний – оплата медицинского сопровождения и дополнительных мест и оборудования в самолете (ином средстве транспорта) при регулярном рейсе.
<style isBold="true">2.1.3. Проживание Застрахованного лица</style>: подлежит оплате проживание в отеле (3 или 4 звезды) или эквивалентного стандартного номера в апартаментах с оплатой услуг, включенных в стоимость номера для Застрахованного лица. Не подлежат оплате дополнительные услуги, не включённые в стоимость номера.
<style isBold="true">2.1.4. Услуги по репатриации</style> в случае смерти Застрахованного лица во время поездки: транспортировка останков Застрахованного лица до места постоянного проживания Застрахованного лица.
<style isBold="true">2.1.5. Лечение на территории Российской Федерации</style>, проводимое по поводу страхового случая:
2.1.5.1. Медицинская помощь в амбулаторных условиях, в условиях дневного стационара, в стационарных условиях, в том числе:
а) осмотры врачами, в том числе врачами-специалистами;
б) диагностические медицинские вмешательства, выполняемые медицинскими организациями по выбору Сервисной компании на территории страны оказания услуг, в том числе лабораторные исследования, визуализирующие исследования, эндоскопические исследования, функциональная диагностика;
в) лечебные медицинские вмешательства в пределах страховой суммы (кроме имплантаций и трансплантации, которые производятся только в случаях, прямо указанных в Условиях и в объеме, указанном в Условиях), включающие хирургическое лечение, химиотерапию, лучевую терапию, иные методы лечения, научно обоснованные, разрешенные к применению на территории страны оказания услуг и применяемые в рамках оказания медицинской помощи медицинскими организациями по выбору Сервисной компании, на территории страны оказания услуг;
г) трансплантация костного мозга, выполняемая медицинской организацией, имеющей соответствующую лицензию, по выбору Сервисной компании;
д) имплантация, необходимая в целях реконструктивного лечения груди после проведения мастэктомии, включая стоимость имплантатов на сумму <style isBold="true">(лимит ответственности) составляет 900 000 (Девятьсот тысяч) рублей</style> в период действия Договора страхования на один страховой случай;
е) лекарственные средства, и расходные материалы, применяемые при лечении в стационарных условиях]]></text>
			</staticText>
			<staticText>
				<reportElement x="285" y="10" width="280" height="750" uuid="5485a024-86f7-4981-b32c-acb195b89e40">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[страны оказания услуг и применяемые в рамках оказания медицинской помощи медицинскими организациями по выбору Сервисной компании, на территории страны оказания услуг;
г) трансплантация костного мозга, выполняемая медицинской организацией, имеющей соответствующую лицензию, по выбору Сервисной компании;
д) имплантация, необходимая в целях реконструктивного лечения груди после проведения мастэктомии, включая стоимость имплантатов на сумму <style isBold="true">(лимит ответственности) составляет 900 000 (Девятьсот тысяч) рублей</style> в период действия Договора страхования на один страховой случай;
е) лекарственные средства, и расходные материалы, применяемые при лечении в стационарных условиях и в условиях дневного стационара.
2.1.5.2. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 30 (Тридцати) календарных дней после окончания срока действия Договора страхования, а также расходы в соответствии с п. 2.1.2. и 2.1.4. Страхового полиса.
2.1.5.3. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, при наличии состояния, угрожающего жизни Застрахованного лица (прекращение оказываемой медицинской помощи может повлечь смерть Застрахованного лица), оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 90 (девяноста) календарных дней после окончания срока действия Договора страхования, а также расходы в соответствии с п. 2.1.2. и 2.1.4. Страхового полиса.
2.2. Страховщик осуществляет оплату организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица (в том числе, но не ограничиваясь этим, при экстренной медицинской транспортировке Застрахованного лица), только в случае наличия медицинских показаний к сопровождению Застрахованного лица, определенных Врачом. Оплата организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица осуществляется в пределах лимитов (страховой суммы), установленных Договором страхования.
<style isBold="true">3. ИСКЛЮЧЕНИЯ.</style>
Не являются страховыми случаями (не покрывается страхованием), и страховая выплата не производится по следующим событиям/заболеваниям и]]></text>
			</staticText>
			<textField>
				<reportElement x="457" y="759" width="100" height="12" uuid="1b9dfc32-5d14-4246-8770-baabcee69f67"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="10"/>
				</textElement>
				<textFieldExpression><![CDATA[5]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="285" y="10" width="280" height="750" uuid="c51d45a4-f239-45b7-a017-60e4c561d95b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[3.11. Услуги и расходы в связи с родовыми травмами и/или врождёнными пороками развития.
3.12. Услуги, не назначенные Застрахованному лицу лечащим врачом, либо не являющиеся необходимыми с медицинской точки зрения по поводу страхового случая.
3.13. Услуги и расходы в связи с заболеваниями и состояниями, которые являются прямым или косвенным следствием синдрома приобретенного иммунодефицита (СПИД) или носительства вируса иммунодефицита человека (ВИЧ), включая мутацию и любое побочное действие.
3.14. В связи с расстройством здоровья, в том числе травматическим повреждением, наступившим в результате занятий профессиональным спортом.
3.15. Услуги и расходы в связи с расстройством здоровья, наступившим в местах лишения свободы, изоляторах временного содержания и других учреждениях, предназначенных для содержания лиц, подозреваемых, обвиняемых в совершении преступления или осужденных за совершенные преступления.
3.16. Услуги и расходы в связи с расстройством здоровья, наступившим в результате профессиональной деятельности Застрахованного лица, непосредственно связанной с химическими веществами и газами (включая асбест, растворители, бензол, хлористый винил, бериллий, никель, соединения хрома, радон, пестициды, пыль с оксидом кремния, диоксины), со взрывчатыми веществами, с ионизирующими излучениями, ультрафиолетовым излучением, с микроволновым излучением, с высоковольтными электрическими сетями.
3.17. Услуги и расходы в связи с применением экспериментальных методов лечения, не допущенных к использованию на территории страны оказания услуг.
3.18. Услуги и расходы в связи со злокачественным новообразованием, протекающим на фоне ВИЧ–инфекции или СПИД.
3.19. Услуги и расходы в связи с существовавшими до даты заключения Договора страхования заболеваниями и состояниями, а также несчастными случаями, диагностированными / произошедшими Застрахованному лицу  / с Застрахованным лицом или о которых было известно Застрахованному лицу до даты начала действия Договора страхования (лечение, предусмотренное страхованием было рекомендовано или запланировано до момента заключения Договора страхования).
3.20. Услуги и расходы в связи с заболеваниями и медицинскими состояниями, возникшими в результате занятия Застрахованного лица следующими экстремальными видами спорта, сопряженными с повышенным риском для жизни и здоровья: автоспорт, мотоспорт, альпинизм, спелеология, бокс и любые другие виды боевых единоборств, экстремальные виды велоспорта]]></text>
			</staticText>
			<staticText>
				<reportElement x="0" y="10" width="271" height="750" uuid="d88cfa2c-3144-4a30-b285-fe536fa16430">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[состояниям/расходам /услугам:
3.1. Услуги и расходы в связи с первичным диагностированием у Застрахованного лица заболевания.
3.2. Услуги и расходы, связанные с событиями / случаями, прямо не указанными в Договоре страхования как страховой случай.
3.3. Услуги и расходы, прямо не указанные в Договоре страхования как услуги и расходы, подлежащие организации и оплате.
3.4. Услуги и расходы по заболеваниям/состояниям, указанным в Договоре страхования, но возникшим до окончания периода ожидания или после истечения срока действия Договора страхования.
3.5. Услуги и расходы, оказанные / понесенные до окончания периода ожидания или после истечения срока действия Договора страхования, за исключением обстоятельств, указанных в пп. 2.1.5.2 и 2.1.5.3. Страхового полиса.
3.6. Услуги и расходы, необходимость которых возникла в связи с нарушением Застрахованным лицом рекомендаций лечащего врача и/или правил и распорядка медицинского учреждения, в котором Застрахованное лицо проходит лечение.
3.7. Психохирургия.
3.8. Хирургические операции по трансплантации органов (частей органов) или любого вида трансплантации костного мозга в следующих случаях:
3.8.1. если трансплантация таких органов и (или) их долей не предусмотрена Договором страхования;
3.8.2. если потребность в трансплантации органов возникла вследствие алкогольной болезни печени;
3.8.3. если трансплантация органов является аутологичной (реципиент трансплантата является донором для самого себя), за исключением трансплантации костного мозга;
3.8.4. если при трансплантации органов Застрахованное лицо является донором по отношению к третьему лицу;
3.8.5. если трансплантация органов включает в себя лечение стволовыми клетками (кроме трансплантации костного мозга).
3.9. Медицинские и иные услуги, выполняемые в эстетических и/или косметических целях, включая, но не ограничиваясь: операции по коррекции зрения (миопии, астигматизма, близорукости); бариатрические операции, включая, но не ограничиваясь операциями, направленными на уменьшение объема желудка или кишечника, кроме операций по реконструкции груди после резекции / удаления молочной железы, проведенной в рамках Договора страхования и в соответствии с его условиями.
3.10. Услуги и расходы, выполняемые по поводу всех форм поражений сердечных клапанов в результате эндокардита, вызванного венерическими заболеваниями (инфекциями, передающимися преимущественно половым путем).]]></text>
			</staticText>
			<textField>
				<reportElement x="460" y="758" width="100" height="12" uuid="92e58189-5c2f-4cbe-8071-34ec89f66f10"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="10"/>
				</textElement>
				<textFieldExpression><![CDATA[6]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="285" y="10" width="280" height="750" uuid="88dbb4fe-c30a-4b82-bf98-4c20ce0ccec2">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[сторонами его существенных условий, и иными условиями страхования;
- что до заключения Страхового полиса ему была предоставлена полная информация о страховой услуге согласно Закону Российской Федерации от 07.02.1992 № 2300-1 «О защите прав потребителей», в том числе о размере страховой премии, порядке ее оплаты и последствиях ее неоплаты; о порядке установления страховой суммы; о перечне страховых случаев; об исключениях из страхования; о требованиях к Застрахованному лицу, декларируемых Страховым полисом; о порядке действий Страхователя при наступлении события, имеющего признаки страхового случая; о порядке и определении размера страховой выплаты; о фирменном наименовании и о месте нахождения Страховщика, Сервисной компании, о номерах телефонов, о режиме работы Страховщика, Сервисной компании, которая позволила ему сделать правильный выбор страховой услуги, а также о том, что он был вправе обратиться к Страховщику для согласования иного содержания отдельных условий Договора страхования;
- свое ознакомление, понимает и соглашается с тем, что при наступлении событий по страховым рискам, перечисленным в Страховом полисе, у Страховщика возникает обязанность осуществить организацию оказания медицинских и иных услуг в общей сложности не более страховой суммы, установленной Договором страхования.
- что ознакомлен с последствиями, предусмотренными ст. 431.2 Гражданского кодекса Российской Федерации, наступающими в случае, если при заключении Страхового полиса либо до или после его заключения Страхователь дал Страховщику недостоверные заверения об обстоятельствах, имеющих значение для заключения Страхового полиса, его исполнения или прекращения (в том числе определения вероятности наступления страхового случая и размера возможных убытков от его наступления);
- что обстоятельства, оговоренные в Страховом полисе, имеют существенное значение для заключения Страхового полиса, его исполнения и прекращения (в том числе определения вероятности наступления страхового случая и размера возможных убытков от его наступления);
- что является гражданином Российской Федерации;
- что не является публичным должностным лицом (в том числе иностранным публичным должностным лицом, должностным лицом публичных международных организаций, а также лицом, замещающим (занимающим) государственную должность РФ, должность члена совета директоров ЦБ РФ, должность федеральной государственной службы, назначение и освобождение от которой осуществляется Президентом РФ или Правительством РФ, должность в ЦБ РФ, государственной корпорации и иных организациях,     ]]></text>
			</staticText>
			<staticText>
				<reportElement x="0" y="10" width="271" height="750" uuid="b55d9025-8718-46ec-8515-058330ab4230">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[ (включая маунтинбайк), фридайвинг, скайсерфинг, дайвинг (глубина погружения более 25 метров), кайтинг, бейсджампинг, экстремальные водные виды спорта (в том числе, аквабайк, водные лыжи), парашютный спорт, парапланеризм, дельтапланеризм, конный спорт.
3.21. Услуги и расходы в связи с получением Застрахованным лицом медицинских и иных услуг в медицинских и иных организациях, выбор которых не был согласован с Сервисной компанией.
3.22. Услуги и расходы в связи с раком кожи, за исключением меланомы.
3.23. Услуги и расходы в связи с Эпителиальными опухолями кожи (включая базалиому, плоскоклеточный рак) (код С44 по МКБ-10), Хроническим лимфоцитарным В-клеточным лейкозом (код C91.1 по МКБ-10).
4. Права и обязанности Страховщика и Страхователя (Выгодоприобретателя) указаны в Условиях страхования (раздел 12).
5. Страховщик не заключает на условиях, содержащихся в Условиях страхования и Страховом полисе, более одного Договора страхования с одним и тем же лицом. Данное условие является существенным; оплата Страхователем Договора(-ов) страхования при наличии заключенного и не прекратившего своего действия Договора страхования не признается акцептом и такие Договоры страхования являются незаключенными ввиду несогласования Сторонами существенных условий Договора. В таком случае Страховщик производит возврат поступивших денежных средств лицу, совершившему платеж в течение 20 (Двадцати) рабочих дней с момента получения письменного заявления плательщика.
При этом Страховщик имеет право предложить заключение Договоров страхования на особых условиях.
6. Порядок взаимодействия сторон при наступлении события, имеющего признаки страхового случая определен в разделе 10 Условий страхования.
<style isBold="true">7. ОСНОВАНИЯ ОТКАЗА В СТРАХОВОЙ ВЫПЛАТЕ</style> определены в разделе 13 Условий страхования.
<style isBold="true">8. ДЕКЛАРАЦИЯ И СОГЛАСИЯ СТРАХОВАТЕЛЯ</style>:
8.1. Заключая Договор страхования и оплачивая страховую премию, Страхователь подтверждает:
- свое ознакомление и согласие с условиями страхования, изложенными в настоящем Страховом полисе и Условиях страхования, в частности, Страхователь подтверждает, что ознакомлен и согласен с исключениями, порядком определения размера страховой выплаты и установленными лимитами ответственности, перечнем оснований для отказа в страховой выплате, условиями досрочного прекращения Договора страхования и условиями, при которых Договор страхования считается незаключенным ввиду несогласования]]></text>
			</staticText>
			<textField>
				<reportElement x="461" y="757" width="100" height="12" uuid="64a90aba-1898-4b07-993b-0ceb93bcc96d"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="10"/>
				</textElement>
				<textFieldExpression><![CDATA[7]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="285" y="10" width="280" height="750" uuid="e42b083b-d6b0-43c4-885e-c8681a457344">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[для информирования о новинках страховых продуктов, участия в маркетинговых, рекламных акциях и исследованиях, а также для осуществления информационного сопровождения исполнения Договора страхования, в том числе посредством направления уведомлений с применением СМС-сообщений, чатов, посредством электронной почты и иными доступными способами. Страхователь дает согласие поручить обработку его персональных данных третьим лицам на основании заключенных Страховщиком с этими лицами Договоров /соглашений (агентских, возмездного оказания услуг, о взаимном сотрудничестве, хранении, обеспечении конфиденциальности и безопасности и др.) в целях предоставления страховой услуги (далее- Обработчики). Страхователь дает согласие на передачу (предоставление) персональных данных Обработчикам, а также иным третьим лицам, круг которых ограничен и определен опосредованно как лица, с которыми Страховщик вправе взаимодействовать в связи с исполнением Договора страхования (в т. ч. при рассмотрении страхового события);
- на предоставление Страховщику и Сервисной компании любой информации /сведений /документов (в т. ч. данных о состоянии здоровья, составляющие врачебную тайну), связанных с оказанием страховой услуги, государственными органами, федеральными государственными учреждениями МСЭ и Фондом ОМС, медицинскими и иными учреждениями (организациями, государственными органами), в том числе: любые медицинские документы и/или их заверенные копии (результаты лабораторных и инструментальных исследований, результаты лечения, прогноз по заболеванию и т.д.), как в связи с оценкой степени страхового риска, так и в связи с событиями, имеющими признаки страхового случая. Данное согласие имеет силу и действует с даты заключения Страхового полиса до истечения 6 (шести) лет после прекращения обязательств по Страховому полису;
- на использование его персональных данных в целях продвижения Страховщиком своих услуг на рынке путем осуществления прямых контактов с помощью средств связи, а также для осуществления информационного сопровождения в связи с оказанием страховой услуги (в т. ч. для СМС-рассылок).
- дает свое согласие на использование Страховщиком факсимильного воспроизведения подписи и печати Страховщика на Страховом полисе с помощью средств механического или иного копирования, электронно-цифровой подписи либо иного аналога собственноручной подписи.
Перечень действий с персональными данными и общее описание Перечень действий с персональными данными и общее описание способов их обработки: сбор, запись, систематизация, накопление, хранение, уточнение (обновление, ]]></text>
			</staticText>
			<staticText>
				<reportElement x="0" y="10" width="271" height="750" uuid="f850e4c6-145b-4a81-b82f-e911423a2a14">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[созданных РФ на основании федеральных законов, включенную в перечни должностей, определяемые Президентом РФ), а также супругом(-ой) и /или родственником такого публичного должностного лица. В ином случае Страхователь обязуется представить подтверждающие вышеназванные данные документы и /или сведения (в т. ч. об адресе работодателя, степени родства либо статусе по отношению к публичному должностному лицу (с учетом того, что применимо);
- не имеет регистрации, места жительства /нахождения, счета в банке, зарегистрированном в государстве (на территории), которое(-ая) не выполняет рекомендации ФАТФ. Страхователь не является субъектом санкций Управления по контролю за иностранными активами Министерства финансов США и Европейского Союза;
- бенефициарным владельцем (физическим лицом, которое имеет возможность контролировать действия клиента) является Страхователь; целью установления Страхователем деловых отношений со Страховщиком является получение страховой услуги;
- вся информация (в т. ч. указанная в настоящем разделе Договора страхования) является полной, достоверной и действительной на дату предъявления предоставленных им сведений, а также подтверждает обязанность в случае изменений идентификационных сведений сообщить об этих изменениях Страховщику в течении 5 рабочих дней с момента их изменения;
- подтверждает, что Условия ему вручены, разъяснены и понятны, с условиями страхования он согласен;
- подтверждает, что не имеет Страхового полиса «Выбери здоровье», «Выбери здоровье Классика», «Выбери здоровье плюс», «Выбери здоровье Премиум», «Выбери здоровье премиум плюс», «Выбери здоровье платинум», «Выбери здоровье платинум плюс» ООО «РСХБ-Страхование жизни», срок действия которого полностью или частично совпадает со сроком действия настоящего Страхового полиса;
- подтверждает, что источниками происхождения средств, вносимых в качестве страховой премии, являются личные накопления и/или кредитные средства.
8.2. Заключая Договор страхования и оплачивая страховую премию, Страхователь дает согласие:
- Страховщику, а также Сервисной компании и/или их уполномоченным представителям на обработку персональных данных, в соответствии с положениями настоящего Страхового полиса и Условий страхования, Федеральным законом от 27.07.2006 №152-ФЗ «О персональных данных» (далее – Закон) в целях надлежащего исполнения Договора страхования, организации оказания услуг, включения персональных данных в информационную систему персональных данных]]></text>
			</staticText>
			<textField>
				<reportElement x="462" y="758" width="100" height="12" uuid="0d3db07c-173d-4327-a7b1-aa7a53b57ec1"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="10"/>
				</textElement>
				<textFieldExpression><![CDATA[8]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="285" y="10" width="280" height="748" uuid="8a31771c-935a-4e38-b872-5b024897f9ff">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[справок, актов, заключений, результатов обследования).
<style isBold="true">8.4. Заключая Договор страхования и оплачивая страховую премию, Страхователь подтверждает, что</style>:
- возраст Страхователя (Застрахованного лица) на дату акцепта настоящего Страхового полиса не менее 18 (восемнадцати) и не более 54 (пятидесяти четырех) лет;
- Страхователь (Застрахованное лицо) является дееспособным физическим лицом;
- Страхователь (Застрахованное лицо) не являлся/не является инвалидом I - II группы, ребенком инвалидом, в отношении него не принималось врачебное решение о направлении для установления ему группы инвалидности, не является лицом, имеющим действующее направление на медико-социальную экспертизу (МСЭ), и МСЭ не рассматривает документы на установление ему группы инвалидности;
- Страхователь (Застрахованное лицо) не нуждается в постоянном уходе в соответствии с медицинским заключением;
- Страхователь (Застрахованное лицо) не имеет заболевания и/или функционального нарушения из нижеуказанных (по которым в течение жизни устанавливался диагноз, проводилось/либо проводится лечение, либо в отношении которых, лицо находилось/находится под наблюдением врача специалиста): СПИД или ВИЧ-инфекция; любые злокачественные новообразования, в том числе но не ограничиваясь: рак in situ, лейкозы, миелома, лимфомы, болезнь Ходжкина; любые виды опухолей или кист головного мозга и/или спинного мозга, пищевод Барретта, дисплазия шейки матки, доброкачественная гиперплазия предстательной железы, полицитемия, фиброаденома молочной железы; язва желудка, болезнь Крона, неспецифический язвенный колит, хронические гепатиты вирусной и невирусной природы, циррозы печени любой этиологии, алкогольная болезнь печени, хронический панкреатит; аутоиммунные заболевания (ревматизм, системная красная волчанка, болезнь Вагнера, склеродермия); хроническая дыхательная недостаточность II-III степени; хроническая обструктивная болезнь легких (ХОБЛ); первичный иммунодефицит, амилоидоз, крипторхизм, синдром Дауна, туберкулез, сахарный диабет, хроническая почечная недостаточность любой стадии; кардиомиопатия, перенесенный в прошлом инфаркт миокарда, ишемическая болезнь сердца/стенокардия, врожденные пороки сердца; - Страхователь (Застрахованное лицо) не переносил инсультов (нарушений мозгового кровообращения);
- Страхователю (Застрахованному лицу) не устанавливался диагноз эпилепсии, слабоумия, психических заболеваний и/или расстройств поведения, не состоял/не состоит на учете в психоневрологическом и/или наркологическом]]></text>
			</staticText>
			<staticText>
				<reportElement x="0" y="10" width="271" height="761" uuid="d8926742-00ea-4c89-a193-79b5e1b2a3ff">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[изменение), извлечение, использование, передача (предоставление, доступ), обезличивание, блокирование, удаление, уничтожение персональных данных; персональные данные будут обрабатываться с использованием различных сочетаний средств автоматизации и неавтоматизированных средств обработки (смешанная обработка). Перечень обрабатываемых персональных данных: фамилия, имя, отчество, дата и место рождения, гражданство, реквизиты документа, удостоверяющего личность (серия, номер, кем и когда выдан, код подразделения и др.), ИНН (при наличии), контактная информация (адрес места жительства, фактический адрес и др.), платежные реквизиты, иные персональные данные, содержащиеся в документах, которые были оформлены при заключении Договора страхования или переданы/будут переданы Страховщику в связи с оказанием страховой услуги, будут получены в ходе рассмотрения страхового события и/или сообщены Страховщику устно. Согласие действует в течение срока действия Договора страхования и еще шесть лет после его прекращения. Согласие может быть отозвано посредством направления письменного уведомления Страховщику.
8.3. Страхователь обязуется предоставить Страховщику и Сервисной компании любую медицинскую информацию: об обращениях за медицинской помощью, состоянии его здоровья и диагнозе, иные сведения, полученные при медицинском обследовании и лечении. Страхователь дает свое согласие на предоставление Страховщику любыми лечебно-профилактическими или особого типа учреждениями здравоохранения и /или частными врачами, у которых Страхователь проходил лечение, находится или находился под наблюдением, сведений о факте обращения Страхователя за оказанием медицинской помощи, состоянии его здоровья и диагнозе, иные сведения, полученные при медицинском обследовании и лечении. Страхователь уполномочивает Страховщика и Сервисной компании на получение сведений, составляющих врачебную тайну, в любом виде и в любой форме (в т. ч. на получение справок, актов, заключений, результатов обследования). Страхователь дает свое согласие на предоставление Страховщику любыми лечебно-профилактическими или особого типа учреждениями здравоохранения и /или частными врачами, у которых Страхователь проходил лечение, находится или находился под наблюдением, сведений о факте обращения Страхователя за оказанием медицинской помощи, состоянии его здоровья и диагнозе, иные сведения, полученные при медицинском обследовании и лечении. Страхователь уполномочивает Страховщика и Сервисной компании на получение сведений, составляющих врачебную тайну, в любом виде и в любой форме (в т. ч. на получение ]]></text>
			</staticText>
			<textField>
				<reportElement x="462" y="758" width="100" height="12" uuid="784abead-0d8c-4867-8403-ebfcd23d0d82"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="10"/>
				</textElement>
				<textFieldExpression><![CDATA[9]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="285" y="10" width="271" height="200" uuid="6579a5e9-5c8e-413d-a1d4-5a4440473bf6">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[страхования (Страховой полис и приложения к нему) от руки, не имеют юридической силы, если их верность не засвидетельствована собственноручными подписями Сторон и оригинальным оттиском печати Страховщика.
9.4. Заключая Договор страхования и оплачивая страховую премию, Страхователь подтверждает, что Страховой полис и Условия страхования №2-МС «Выбери здоровье Плюс», утвержденные приказом Генерального директора Страховщика от «25» сентября 2018г. № 79, Страхователем приняты. Условия страхования вручены Страхователю и получены им.
ПРИЛОЖЕНИЕ: Условия страхования №2-МС «Выбери здоровье Плюс».]]></text>
			</staticText>
			<staticText>
				<reportElement x="0" y="10" width="271" height="761" uuid="a3a3b0a1-60b2-4b28-b41c-4574e06265d6">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[диспансере; Страхователь (Застрахованное лицо) не употребляет наркотические, токсические и/или сильнодействующие вещества с целью лечения или по иной причине, ему не устанавливался диагноз алкоголизм, наркомания, токсикомания; не состоит по любой из указанных причин на диспансерном учете;
- Страхователь (Застрахованное лицо) не переносил хирургических операций по трансплантации органа или его части (в том числе, но не ограничиваясь, костного мозга), операций на сердце и его сосудах, аорте, операций шунтирования, стентирования, трепанации черепа;
- у Страхователя (Застрахованного лица) за 6 месяцев, предшествующих заключению Договора страхования, не отмечалась нецеленаправленная резкая потеря веса (10 кг и более);
- у Страхователя (Застрахованного лица) индекс массы тела (отношение массы тела (кг) к квадрату роста (м)) находится в диапазоне менее 20 и не более 35;
- У Страхователя  (Застрахованного лица) не отмечалась патологическая кровопотеря из любых источников;
- Страхователь (Застрахованное лицо) не имеет отклонений от установленных лабораторных норм показателей онкомаркеров (если такие исследования проводились);
- Страхователь (Застрахованное лицо) не подвергался (подвергается) воздействию радиации, токсических или канцерогенных веществ при выполнении своих профессиональных обязанностей;
- Страхователь (Застрахованное лицо) не выкуривает более 20 сигарет в день и/ или не курит ежедневно электронные сигареты, сигары, трубки, кальян/наргиле, или другие никотиновые заменители; не употребляет алкоголь более чем 5 единиц в день (одна единица = 300 мл пива или 100 мл вина или 20 мл спирта);
- Страхователь (Застрахованное лицо) и/или его ближайшие родственники (отец, мать, братья, сестры) в возрасте до 60 лет не болели онкологическими заболеваниями и / или не умирали от рака (в случае, если этот факт был известен Страхователю (Застрахованному лицу) до заключения Договора страхования).
<style isBold="true">9. ЗАКЛЮЧИТЕЛЬНЫЕ ПОЛОЖЕНИЯ</style>
9.1. К Страховому полису прилагаются и являются неотъемлемой частью Договора страхования Условия страхования №2-МС «Выбери здоровье Плюс».
9.2. В случае спорных ситуаций положения настоящего Страхового полиса имеют приоритетную силу по отношению к Условиям страхования. Во всем, что не предусмотрено положениями настоящего Страхового полиса, стороны руководствуются Условиями страхования.
9.3. Никакие отметки (а также дополнения, исправления и т. п.), сделанные на Договоре]]></text>
			</staticText>
			<staticText>
				<reportElement x="285" y="233" width="271" height="97" uuid="3749e8df-2d50-47b5-b6a8-bde33ea13b5c">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.tabStopWidth" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0" tabStopWidth="25"/>
				</textElement>
				<text><![CDATA[Генеральный директор
ООО «РСХБ-Страхование жизни»

__________________________________
Мальков Максим Владимирович/
Аналог собственноручной подписи и печати
м.п.]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="285" y="220" width="271" height="13" backcolor="#C0C0C0" uuid="59889652-d5db-4c19-adcd-e83081ca6b5b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="true"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЩИК]]></text>
			</staticText>
			<textField>
				<reportElement x="462" y="758" width="100" height="12" uuid="8ba81c26-3bfb-4c79-88a9-27cd7dbd7a23"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="10"/>
				</textElement>
				<textFieldExpression><![CDATA[10]]></textFieldExpression>
			</textField>
			<image>
				<reportElement x="330" y="252" width="79" height="31" uuid="fdccf4ba-2c2c-45e0-8c77-a06dba85f6ca">
					<printWhenExpression><![CDATA[$P{sign}]]></printWhenExpression>
				</reportElement>
				<imageExpression><![CDATA["templates/sign.png"]]></imageExpression>
			</image>
			<image>
				<reportElement x="321" y="266" width="121" height="121" uuid="59cf4f73-7880-447f-a977-020d6a62a452">
					<printWhenExpression><![CDATA[$P{stamp}]]></printWhenExpression>
				</reportElement>
				<imageExpression><![CDATA["templates/stamp.png"]]></imageExpression>
			</image>
		</band>
	</detail>
	<pageFooter>
		<band height="30"/>
	</pageFooter>
</jasperReport>
'::text, 'utf8')) -- Пример печатной формы договора страхования
ON CONFLICT (type)
DO NOTHING;

insert into common_dict.PRINT_TEMPLATES(TYPE, COPIES_NUMBER, FILE_NAME, CONTENT)
values ('4f2434ae-5eb1-4b10-8f83-2cbcddfdbf96', 3, 'Выбери здоровье «Классика»', convert_to('<?xml version="1.0" encoding="UTF-8"?>
<!-- Created with Jaspersoft Studio version 6.5.1.final using JasperReports Library version 6.5.1  -->
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="RshbInsuranceChooseHealth" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" isFloatColumnFooter="true" uuid="4eedbb89-b4f6-4469-9ab6-f642a1688cf7">
	<property name="com.jaspersoft.studio.data.defaultdataadapter" value="One Empty Record"/>
	<subDataset name="tableDataset" uuid="f13e6d36-5148-4ecc-bbe3-3035def80980">
		<queryString>
			<![CDATA[]]>
		</queryString>
	</subDataset>
	<parameter name="sign" class="java.lang.Boolean"/>
	<parameter name="stamp" class="java.lang.Boolean"/>
	<parameter name="contractNumber" class="java.lang.String"/>
	<parameter name="surname" class="java.lang.String"/>
	<parameter name="name" class="java.lang.String"/>
	<parameter name="patronymic" class="java.lang.String"/>
	<parameter name="birthDate" class="java.lang.String"/>
	<parameter name="contractStartDate" class="java.lang.String"/>
	<parameter name="contractSignDate" class="java.lang.String"/>
	<parameter name="phoneNumber" class="java.lang.String"/>
	<parameter name="email" class="java.lang.String">
		<defaultValueExpression><![CDATA[""]]></defaultValueExpression>
	</parameter>
	<parameter name="isTestInstance" class="java.lang.Boolean" isForPrompting="false">
		<parameterDescription><![CDATA[Инстанс приложения запущен на тестовом стенде]]></parameterDescription>
		<defaultValueExpression><![CDATA[true]]></defaultValueExpression>
	</parameter>
	<queryString>
		<![CDATA[]]>
	</queryString>
	<background>
		<band height="772">
			<image>
				<reportElement isPrintRepeatedValues="false" x="3" y="0" width="550" height="758" uuid="ea763663-ef82-4cb6-a25f-d7c500e2fa1a">
					<printWhenExpression><![CDATA[$P{isTestInstance} == true]]></printWhenExpression>
				</reportElement>
				<imageExpression><![CDATA[net.sf.jasperreports.renderers.BatikRenderer.getInstanceFromText("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"765\" height=\"990\"><text x=\"60\" y=\"40\" transform=\"matrix(.6,-.82,.83,.6,30,1055)\" style=\"font-size:220px;font-weight:bold;fill:#d8d8d8\">ОБРАЗЕЦ</text></svg>")]]></imageExpression>
			</image>
		</band>
	</background>
	<detail>
		<band height="772">
			<staticText>
				<reportElement x="0" y="0" width="271" height="15" uuid="13533ce6-dbe7-4b4d-9667-044ed58e5a09">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Center">
					<font fontName="Arial" size="11" isBold="true"/>
				</textElement>
				<text><![CDATA[ДОГОВОР СТРАХОВАНИЯ (Страховой полис) «Выбери здоровье классика» ]]></text>
			</staticText>
			<textField>
				<reportElement x="1" y="15" width="279" height="35" uuid="b1030e44-bdf5-48a4-aaaf-f2be11f5788f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Center">
					<font fontName="Arial" size="11" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["«Выбери здоровье классика» № " + $P{contractNumber}+ "\nот " + $P{contractSignDate}]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement x="0" y="50" width="280" height="160" uuid="1d4eea10-38c3-4880-879f-4d32eb4ca9c2">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[По настоящему Договору страхования (Страховому полису) «<style isBold="true">Выбери здоровье Классика</style>», являющемуся офертой (далее – Страховой полис, Договор страхования) Страховщик предлагает Страхователю, в соответствии со статьей 435 Гражданского кодекса Российской Федерации, заключить Договор добровольного страхования на нижеследующих условиях.
Договор страхования заключается путем принятия и акцепта Страхователем настоящего Страхового полиса (оферты), подписанного Страховщиком. На основании ст. 435, 438 и п. 2 ст. 940 ГК РФ]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="1" y="210" width="130" height="180" backcolor="#C0C0C0" uuid="2ca31443-b24e-4580-b580-eaddad0fb35a">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЩИК]]></text>
			</staticText>
			<staticText>
				<reportElement x="140" y="210" width="416" height="180" uuid="00ed8b66-a12b-4377-899f-809f0801f972">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[ООО «РСХБ-Страхование жизни»,  лицензия на осуществление добровольного личного страхования, за исключением  добровольного страхования жизни, СЛ № 4358, выдана Банком России без ограничения срока действия
<style isBold="true">Адрес:</style> г. Москва, Гагаринский пер., д. 3;
<style isBold="true">Телефон:</style> 8 (495) 745 99 55;
<style isBold="true">Режим работы:</style> понедельник-четверг: с 9.00 до 18.00, пятница: с 9.00 до 16.45.

<style isBold="true">Банковские реквизиты:</style> Расчетный счет: 40701810100000000160; ИНН 7704447253; Банк получателя: АО «РОССЕЛЬХОЗБАНК», г. Москва, БИК Банка получателя: 044525111, Корр. счет: 30101810200000000111

www.rshbins-life.ru]]></text>
			</staticText>
			<staticText>
				<reportElement stretchType="ElementGroupBottom" mode="Opaque" x="1" y="400" width="130" height="355" backcolor="#C0C0C0" uuid="27a489d8-c21a-4cbf-b91d-32469f102b83">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВАТЕЛЬ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" stretchType="ElementGroupBottom" x="140" y="400" width="416" height="355" uuid="70843296-76f4-49bb-ad86-4cb04cdc058f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Bottom" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[]]></text>
			</staticText>
			<textField isStretchWithOverflow="true">
				<reportElement stretchType="ContainerBottom" x="148" y="407" width="406" height="140" uuid="c7223a32-04c4-467d-8595-015f96872745">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<textFieldExpression><![CDATA["Фамилия <style isItalic=\"true\"> " +$P{surname} + " </style>, Имя <style isItalic=\"true\" >" + $P{name} + "</style>, Отчество <style isItalic=\"true\">" + $P{patronymic} + "</style>\nДата рождения <style isItalic=\"true\">" + $P{birthDate} + "</style> Телефон <style isItalic=\"true\">" + $P{phoneNumber} + "</style>\nАдрес электронной почты <style isItalic=\"true\">" + $P{email} + "</style>"]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement positionType="Float" x="142" y="547" width="415" height="208" uuid="e806d396-b92b-49ec-8077-12f47876b5c5">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страхователем по настоящему Договору страхования является дееспособное физическое лицо, отвечающее требованиям, предусмотренным в п.1.4.4. Условий страхования, заключившее со Страховщиком Договор страхования и указанное в Платежном поручении в качестве плательщика страховой премии. В Платежном поручении указываются по меньшей мере следующие данные: фамилия, имя, отчество Страхователя, дата и номер Договора страхования. Страховщик не заключает на условиях, указанных в настоящем Страховом полисе, Договоры страхования в отношении лиц, не соответствующих условиям, указанным в п.1.4.4. Условий страхования. Данное условие является существенным условием Договора страхования. Если лицо, оплатившее Договор страхования, не соответствует условиям, указанным в 1.4.4. Условий страхования, Договор страхования является незаключенным ввиду несогласования Сторонами существенных условий Договора (условия о Застрахованном лице). В таком случае Страховщик производит возврат поступивших денежных средств лицу, совершившему платеж, в порядке ]]></text>
			</staticText>
			<staticText>
				<reportElement x="290" y="0" width="263" height="210" uuid="439df76f-1377-4599-abb8-ea3d3cb0cbda">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[акцептом настоящего Страхового полиса (оферты) считается принятие страхового полиса, что подтверждается оплатой страховой премии в соответствии с условиями, содержащимися в Страховом полисе. Договор страхования заключается на основании Условий страхования №1-МС «Выбери здоровье классика», утвержденных приказом Генерального директора Страховщика от «25» сентября 2018г. № 79 (Далее – Условия страхования). Положения, содержащиеся в Условиях страхования и не включенные в текст настоящего Страхового полиса, применяются к Договору страхования и обязательны для Страхователя (Выгодоприобретателя).]]></text>
			</staticText>
			<textField>
				<reportElement x="457" y="755" width="100" height="14" uuid="8558ff52-0b46-4518-8fb9-079d15cc2a84"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[1]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<textField>
				<reportElement x="465" y="758" width="100" height="14" uuid="ecf4668c-f944-4e13-903c-0696ffa3a859"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[2]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement positionType="Float" x="144" y="148" width="410" height="91" uuid="5b036380-182f-427c-acd0-5be6776fe87b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[<style isBold="true">Общество с ограниченной ответственностью "СОЮЗМЕДСЕРВИС" (ООО "СоюзМедСервис").
Круглосуточная служба поддержки: 8 (800) 600 45 99, 8 (495) 797 79 33</style>
<style isBold="true">Адрес</style>: 143422, Московская обл., Красногорский р-н, с. Петрово-Дальнее, ул. Тихвинская, д. 10 <style isBold="true">Эл. адрес</style>: help@s-med-s.ru]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="148" width="130" height="91" backcolor="#C0C0C0" uuid="7ccb4ce6-b6a9-48d6-9587-20bd06e1fff5">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СЕРВИСНАЯ КОМПАНИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="50" width="130" height="30" backcolor="#C0C0C0" uuid="8e41abb0-55cb-4a91-9075-1b9e745f2886">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ВЫГОДОПРИОБРЕТА
ТЕЛЬ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="142" y="50" width="413" height="30" uuid="18a8b6e4-3197-4947-9340-e030c4034957">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Застрахованное лицо]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="90" width="130" height="45" backcolor="#C0C0C0" uuid="b5a9672c-ebe1-4c61-8319-6891027516bc">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ЗАСТРАХОВАННОЕ ЛИЦО]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="143" y="91" width="411" height="43" uuid="41d5d2e8-d3e5-4ee8-a2c2-6cf1e947c55f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страхователь, при соблюдении условий, предусмотренных п.1.4.4. Условий страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="9" width="130" height="30" backcolor="#C0C0C0" uuid="e4a5c154-1f29-49ab-8f47-66b7b567fd0a">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="143" y="8" width="413" height="31" uuid="9acb58d2-75f5-4fa3-bf69-848ef448b9d8">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[и сроки, предусмотренные Условиями страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="1" y="250" width="130" height="380" backcolor="#C0C0C0" uuid="21705866-74f7-444a-8a0e-499a0c6c4204">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЫЕ РИСКИ.
СТРАХОВЫЕ СЛУЧАИ.]]></text>
			</staticText>
			<staticText>
				<reportElement x="142" y="250" width="413" height="380" uuid="6ab23497-b117-4cdd-8425-e75729e96e9f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Top" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[<style isBold="true">Страховым риском</style>, согласно Договору страхования и Условиям страхования, является риск возникновения в период страхования обстоятельств, требующих оказания медицинских и иных услуг Застрахованному лицу <style isBold="true">в связи с</style>:
<style isBold="true">Злокачественным новообразованием,</style> а именно: злокачественным новообразованием, характеризующимся неконтролируемым ростом и распространением злокачественных клеток, проникающих в ткань различного гистологического типа, и относящимся к кодам C00-C43, C45-C97 по МКБ-10, <style isBold="true">за исключением</style>: С44 – эпителиальных опухолей кожи (включая базалиому, плоскоклеточный рак), C91.1 – хронического лимфоцитарного В – клеточного лейкоза, а также возникновениея новообразования при наличии у Застрахованного лица ВИЧ-инфекции или СПИДа.
<style isBold="true">Страховым случаем</style>, с учетом всех положений, определений и исключений из страхования, предусмотренных Договором страхования и Условиями страхования, является документально подтверждённое обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим пунктом, при одновременном наличии следующих условий: диагноз злокачественного новообразования подтвержден гистологическими или (в случае системных онкологических заболеваний) цитологическими исследованиями и заключением врача-онколога; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу впервые в жизни; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу в течение Периода страхования, по истечении периода ожидания; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, предусмотренных п.10.1.2. Условий страхования в течение Периода страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="642" width="130" height="30" backcolor="#C0C0C0" uuid="b20f88d9-e81f-45e4-93c7-36d1aac70991">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ТЕРРИТОРИЯ ОКАЗАНИЯ УСЛУГ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="142" y="642" width="413" height="30" uuid="b10ba949-d2e3-487b-bfd1-4dfe45872951">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Услуги, предусмотренные Страховым полисом, оказываются на территории Российской Федерации.]]></text>
			</staticText>
			<textField isStretchWithOverflow="true">
				<reportElement stretchType="ContainerBottom" x="141" y="682" width="416" height="68" uuid="35b4c42c-0c71-46eb-b993-7924bbd95d44">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<box topPadding="0" leftPadding="0" bottomPadding="0" rightPadding="0">
					<pen lineWidth="1.0" lineStyle="Solid"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph lineSpacing="Single" firstLineIndent="0" leftIndent="6" rightIndent="6"/>
				</textElement>
				<textFieldExpression><![CDATA["<style isBold=\"true\">Дата заключения Договора страхования "+$P{contractSignDate}+"г.\nСрок действия Договора страхования</style> составляет 1 (один) год с даты вступления Страхового полиса в силу.\n<style isBold=\"true\">Дата вступления Договора страхования в силу "+$P{contractStartDate}+"г.,\nдо указанной даты Страхователь вправе отказаться</style>"]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="490" width="130" height="50" backcolor="#C0C0C0" uuid="92873e1c-38c8-4a79-abcf-9feb42ab7c69">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ЛИМИТЫ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="139" y="490" width="416" height="50" uuid="75c76f28-31f4-4028-9de0-b909898c9a39">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Максимальный лимит ответственности Страховщика по оплате организации медицинских и иных услуг по Договору страхования в совокупности равен страховой сумме.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="139" y="310" width="416" height="170" uuid="d57d2769-8b76-4fe5-a6b9-79763c974c9e">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страховая премия составляет <style isBold="true">9 990 (Девять тысяч девятьсот девяносто) рублей 00 копеек.</style>
Страховой тариф 0,1665%
Страховая премия подлежит оплате единовременно в день заключения Договора страхования. Сумма и дата оплаты указываются на документе, подтверждающем оплату страховой премии.
Если страховая премия не будет уплачена в срок, указанный в настоящем пункте, или будет уплачена в ином размере, чем указан в Страховом полисе, Договор страхования считается незаключенным ввиду несогласования его существенных условий, при этом денежные средства считаются ошибочно уплаченными и подлежат возврату лицу, совершившему платеж, в порядке и сроки, предусмотренные Условиями страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="310" width="130" height="170" backcolor="#C0C0C0" uuid="eb1c86fe-920e-4561-88ab-f0595df3386a">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВАЯ ПРЕМИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="280" width="130" height="21" backcolor="#C0C0C0" uuid="036d742a-5c53-48f9-8e4b-fd28affd13d3">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВАЯ СУММА]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="140" y="280" width="416" height="21" uuid="36c0dcc4-02b7-4d8d-881c-3a8e2a9515c8">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Center" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" isBold="true"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[6 000 000 (Шесть миллионов) рублей]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="141" y="130" width="416" height="140" uuid="82682a43-0e6f-4f54-ad7a-134d5289b10f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[<style isBold="true">120 (Сто двадцать) календарных дней</style> с даты заключения договора страхования.
В течение данного периода времени Страховщик не несет обязательств по организации оказания медицинских и иных услуг (из числа событий, предусмотренных Договором страхования). Обращения Застрахованного лица в этот период не являются страховым случаем, организация услуг не производится, страховая выплата по данным событиям не осуществляется.
При повторном заключении аналогичного Страхового полиса, Стороны при определении периода ожидания руководствуются положениями раздела 6 Условий страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="130" width="130" height="140" backcolor="#C0C0C0" uuid="4908ef0c-9c8f-466a-bdd7-9f1352b433ca">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ПЕРИОД ОЖИДАНИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="-90" width="130" height="68" backcolor="#C0C0C0" uuid="df2d24ca-a776-4831-83b3-fe61ca78aa31">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СРОК ДЕЙСТВИЯ ДОГОВОРА СТРАХОВАНИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="10" width="130" height="110" backcolor="#C0C0C0" uuid="ff2da9a8-6d1d-4b24-a2cd-1220a8a2965f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ПЕРИОД СТРАХОВАНИЯ]]></text>
			</staticText>
			<textField isStretchWithOverflow="true">
				<reportElement stretchType="ContainerBottom" x="139" y="10" width="416" height="110" uuid="2f629782-7a5b-47d5-8984-cd66cba17035">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<box topPadding="0" leftPadding="0" bottomPadding="0" rightPadding="0">
					<pen lineWidth="1.0" lineStyle="Solid"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph lineSpacing="Single" firstLineIndent="0" leftIndent="6" rightIndent="6"/>
				</textElement>
				<textFieldExpression><![CDATA["<style isBold=\"true\">от Договора страхования и получить возврат страховой премии в порядке п. 9.9.5.1 Условий.\nПериод страхования</style> начинается с 00 часов 00 минут 121 (Сто двадцать первого) дня с даты заключения Страхового полиса и действует до окончания срока действия Договора страхования\nПри повторном заключении аналогичного Страхового полиса, Стороны при определении срока действия Договора страхования и периода страхования руководствуются положениями раздела 6 и 7 Условий страхования."]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="465" y="758" width="100" height="14" uuid="4bc4634d-d0dd-4cae-a624-57dd18ca4e78"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[3]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="5" y="10" width="255" height="750" uuid="4a2eb15b-0af0-44dd-82e1-37fc074eadc9">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[<style isBold="true">2. ОСНОВНЫЕ ПОЛОЖЕНИЯ ДОГОВОРА СТРАХОВАНИЯ</style>
2.1. В соответствии со Страховым полисом и Условиями, Сервисная компания организовывает и оплачивает следующие услуги при наступлении страхового случая:
2.1.1. <style isBold="true">Медицинская транспортировка</style> (медицинская эвакуация) Застрахованного лица к поставщику медицинских услуг и/или между медицинскими организациями и возвращение обратно, включая трансфер автомобилем скорой медицинской помощи или на такси от места жительства до аэропорта (транспортного узла), из аэропорта (транспортного узла) до отеля (апартаментов) и/или до медицинской организации, в которой будет проводиться лечение и обратно.
2.1.2. <style isBold="true">Оплата билета</style> эконом класса для Застрахованного, а также при наличии медицинских показаний – оплата медицинского сопровождения и дополнительных мест и оборудования в самолете (ином средстве транспорта) при регулярном рейсе.
2.1.3. <style isBold="true">Проживание Застрахованного лица</style>: подлежит оплате проживание в отеле (3 или 4 звезды) или эквивалентного стандартного номера в апартаментах с оплатой услуг, включенных в стоимость номера для Застрахованного лица. Не подлежат оплате дополнительные услуги, не включённые в стоимость номера.
2.1.4. <style isBold="true">Услуги по репатриации</style> в случае смерти Застрахованного лица во время поездки: транспортировка останков Застрахованного лица до места постоянного проживания Застрахованного лица.
2.1.5. <style isBold="true">Лечение на территории Российской Федерации</style>, проводимое по поводу страхового случая:
2.1.5.1. <style isBold="true">Медицинская помощь</style> в амбулаторных условиях, в условиях дневного стационара, в стационарных условиях, в том числе:
а) осмотры врачами, в том числе врачами-специалистами;
б) диагностические медицинские вмешательства, выполняемые медицинскими организациями по выбору Сервисной компании на территории страны оказания услуг, в том числе лабораторные исследования, визуализирующие исследования, эндоскопические исследования, функциональная диагностика;
в) лечебные медицинские вмешательства в пределах страховой суммы (кроме имплантаций и трансплантации, которые производятся только в случаях, прямо указанных в Условиях и в объеме, указанном в Условиях), включающие хирургическое лечение, химиотерапию, лучевую терапию, иные методы лечения, научно ]]></text>
			</staticText>
			<staticText>
				<reportElement x="290" y="10" width="275" height="740" uuid="5485a024-86f7-4981-b32c-acb195b89e40">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[обоснованные, разрешенные к применению на территории страны оказания услуг и применяемые в рамках оказания медицинской помощи медицинскими организациями по выбору Сервисной компании, на территории страны оказания услуг;
г) трансплантация костного мозга, выполняемая медицинской организацией, имеющей соответствующую лицензию, по выбору Сервисной компании;
д) имплантация, необходимая в целях реконструктивного лечения груди после проведения мастэктомии, включая стоимость имплантатов на сумму <style isBold="true">(лимит ответственности) составляет 900 000 (Девятьсот тысяч) рублей</style> в период действия Договора страхования на один страховой случай;
е) лекарственные средства, и расходные материалы, применяемые при лечении в стационарных условиях и в условиях дневного стационара.
2.1.5.2. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 30 (Тридцати) календарных дней после окончания срока действия Договора страхования, а также расходы в соответствии с п. 2.1.2. и 2.1.4. Страхового полиса.
2.1.5.3. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, при наличии состояния, угрожающего жизни Застрахованного лица (прекращение оказываемой медицинской помощи может повлечь смерть Застрахованного лица), оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 90 (девяноста) календарных дней после окончания срока действия Договора страхования, а также расходы в соответствии с п. 2.1.2. и 2.1.4. Страхового полиса.
2.2. Страховщик осуществляет оплату организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица (в том числе, но не ограничиваясь этим, при экстренной медицинской транспортировке Застрахованного лица), только в случае наличия медицинских показаний к сопровождению Застрахованного лица, определенных Врачом. Оплата организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица осуществляется в пределах лимитов (страховой суммы), установленных Договором страхования.]]></text>
			</staticText>
			<textField>
				<reportElement x="465" y="758" width="100" height="14" uuid="89d1cbe4-3d4e-4045-9f45-ab5f2f09e52e"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[4]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="290" y="10" width="275" height="740" uuid="1dcf5f45-78c4-440a-9dff-15d7ae3e2a95">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[груди после резекции / удаления молочной железы, проведенной в рамках Договора страхования и в соответствии с его условиями.
3.10. Услуги и расходы в связи с родовыми травмами и/или врождёнными пороками развития.
3.11. Услуги, не назначенные Застрахованному лицу лечащим врачом, либо не являющиеся необходимыми с медицинской точки зрения по поводу страхового случая.
3.12. Услуги и расходы в связи с заболеваниями и состояниями, которые являются прямым или косвенным следствием синдрома приобретенного иммунодефицита (СПИД) или носительства вируса иммунодефицита человека (ВИЧ), включая мутацию и любое побочное действие.
3.13. Услуги и расходы в связи с расстройством здоровья, наступившим в местах лишения свободы, изоляторах временного содержания и других учреждениях, предназначенных для содержания лиц, подозреваемых, обвиняемых в совершении преступления или осужденных за совершенные преступления.
3.14. Услуги и расходы в связи с расстройством здоровья, наступившим в результате профессиональной деятельности Застрахованного лица, непосредственно связанной с химическими веществами и газами (включая асбест, растворители, бензол, хлористый винил, бериллий, никель, соединения хрома, радон, пестициды, пыль с оксидом кремния, диоксины), со взрывчатыми веществами, с ионизирующими излучениями, ультрафиолетовым излучением, с микроволновым излучением, с высоковольтными электрическими сетями.
3.15. Услуги и расходы в связи с применением экспериментальных методов лечения, не допущенных к использованию в стране оказания услуг.
3.16. Услуги и расходы в связи со злокачественным новообразованием, протекающим на фоне ВИЧ–инфекции или СПИД.
3.17. Услуги и расходы в связи с существовавшими до даты заключения Договора страхования заболеваниями и состояниями, а также несчастными случаями, диагностированными / произошедшими Застрахованному лицу / с Застрахованным лицом или о которых было известно Застрахованному лицу до даты начала действия Договора страхования (лечение, предусмотренное страхованием было рекомендовано или запланировано до момента заключения Договора страхования).
3.18. Услуги и расходы в связи с получением Застрахованным лицом медицинских и иных услуг в медицинских и иных организациях, выбор которых не был согласован с Сервисной компанией.
3.19. Услуги и расходы в связи с раком кожи, за исключением меланомы.
3.20. Услуги и расходы в связи с Эпителиальными ]]></text>
			</staticText>
			<staticText>
				<reportElement x="0" y="10" width="260" height="750" uuid="76db0f2a-72a3-43b3-ac58-c770a710b599">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[<style isBold="true">3. ИСКЛЮЧЕНИЯ.</style>
Не являются страховыми случаями (не покрывается страхованием), и страховая выплата не производится по следующим событиям/заболеваниям и состояниям/расходам /услугам:
3.1. Услуги и расходы в связи с первичным диагностированием у Застрахованного лица заболевания.
3.2. Услуги и расходы, связанные с событиями / случаями, прямо не указанными в Договоре страхования как страховой случай.
3.3. Услуги и расходы, прямо не указанные в Договоре страхования как услуги и расходы, подлежащие организации и оплате.
3.4. Услуги и расходы по заболеваниям/состояниям, указанным в Договоре страхования, но возникшим до окончания периода ожидания или после истечения срока действия Договора страхования.
3.5. Услуги и расходы, оказанные / понесенные до окончания периода ожидания или после истечения срока действия Договора страхования, за исключением обстоятельств, указанных в пп. 2.1.5.2 и 2.1.5.3. Страхового полиса.
3.6. Услуги и расходы, необходимость которых возникла в связи с нарушением Застрахованным лицом рекомендаций лечащего врача и/или правил и распорядка медицинского учреждения, в котором Застрахованное лицо проходит лечение.
3.7. Психохирургия.
3.8. Хирургические операции по трансплантации органов (частей органов) или любого вида трансплантации костного мозга в следующих случаях:
3.8.1. если трансплантация таких органов и (или) их долей не предусмотрена Договором страхования;
3.8.2. если потребность в трансплантации органов возникла вследствие алкогольной болезни печени;
3.8.3. если трансплантация органов является аутологичной (реципиент трансплантата является донором для самого себя), за исключением трансплантации костного мозга;
3.8.4. если при трансплантации органов Застрахованное лицо является донором по отношению к третьему лицу;
3.8.5. если трансплантация органов включает в себя лечение стволовыми клетками (кроме трансплантации костного мозга).
3.9. Медицинские и иные услуги, выполняемые в эстетических и/или косметических целях, включая, но не ограничиваясь: операции по коррекции зрения (миопии, астигматизма, близорукости); бариатрические операции, включая, но не ограничиваясь операциями, направленными на уменьшение объема желудка или кишечника, кроме операций по реконструкции ]]></text>
			</staticText>
			<textField>
				<reportElement x="465" y="758" width="100" height="14" uuid="9fbc9d8a-1188-4240-8168-8a94c90a5acc"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[5]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="0" y="10" width="260" height="750" uuid="0b732311-eaae-4926-980d-95124e80c34b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[опухолями кожи (включая базалиому, плоскоклеточный рак) (код С44 по МКБ-10), Хроническим лимфоцитарным В-клеточным лейкозом (код C91.1 по МКБ-10).
4. Права и обязанности Страховщика и Страхователя (Выгодоприобретателя) указаны в Условиях страхования (раздел 12).
5. Страховщик не заключает на условиях, содержащихся в Условиях страхования и Страховом полисе, более одного Договора страхования с одним и тем же лицом. Данное условие является существенным; оплата Страхователем Договора(-ов) страхования при наличии заключенного и не прекратившего своего действия Договора страхования не признается акцептом и такие Договоры страхования являются незаключенными ввиду несогласования Сторонами существенных условий Договора. В таком случае Страховщик производит возврат поступивших денежных средств лицу, совершившему платеж в течение 20 (Двадцати) рабочих дней с момента получения письменного заявления плательщика.
При этом Страховщик имеет право предложить заключение Договоров страхования на особых условиях.
6. Порядок взаимодействия сторон при наступлении события, имеющего признаки страхового случая определен в разделе 10 Условий страхования.
<style isBold="true">7. ОСНОВАНИЯ ОТКАЗА В СТРАХОВОЙ ВЫПЛАТЕ</style> определены в разделе 13 Условий страхования.
<style isBold="true">8. ДЕКЛАРАЦИЯ И СОГЛАСИЯ СТРАХОВАТЕЛЯ:</style>
8.1. Заключая Договор страхования и оплачивая страховую премию, Страхователь подтверждает:
- свое ознакомление и согласие с условиями страхования, изложенными в настоящем Страховом полисе и Условиях страхования, в частности, Страхователь подтверждает, что ознакомлен и согласен с исключениями, порядком определения размера страховой выплаты и установленными лимитами ответственности, перечнем оснований для отказа в страховой выплате, условиями досрочного прекращения Договора страхования и условиями, при которых Договор страхования считается незаключенным ввиду несогласования сторонами его существенных условий, и иными условиями страхования;
- что до заключения Страхового полиса ему была предоставлена полная информация о страховой услуге согласно Закону Российской Федерации от 07.02.1992 № 2300-1 «О защите прав потребителей», в том числе о размере страховой премии, порядке ее оплаты и последствиях ее неоплаты; о порядке установления страховой суммы; о перечне страховых случаев; об ]]></text>
			</staticText>
			<staticText>
				<reportElement x="290" y="10" width="274" height="740" uuid="16243173-e460-4eba-8134-23a9e5e7917f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[исключениях из страхования; о требованиях к Застрахованному лицу, декларируемых Страховым полисом; о порядке действий Страхователя при наступлении события, имеющего признаки страхового случая; о порядке и определении размера страховой выплаты; о фирменном наименовании и о месте нахождения Страховщика, Сервисной компании, о номерах телефонов, о режиме работы Страховщика, Сервисной компании, которая позволила ему сделать правильный выбор страховой услуги, а также о том, что он был вправе обратиться к Страховщику для согласования иного содержания отдельных условий Договора страхования;
- свое ознакомление, понимает и соглашается с тем, что при наступлении событий по страховым рискам, перечисленным в Страховом полисе, у Страховщика возникает обязанность осуществить организацию оказания медицинских и иных услуг в общей сложности не более страховой суммы, установленной Договором страхования.
- что ознакомлен с последствиями, предусмотренными ст. 431.2 Гражданского кодекса Российской Федерации, наступающими в случае, если при заключении Страхового полиса либо до или после его заключения Страхователь дал Страховщику недостоверные заверения об обстоятельствах, имеющих значение для заключения Страхового полиса, его исполнения или прекращения (в том числе определения вероятности наступления страхового случая и размера возможных убытков от его наступления);
- что обстоятельства, оговоренные в Страховом полисе, имеют существенное значение для заключения Страхового полиса, его исполнения и прекращения (в том числе определения вероятности наступления страхового случая и размера возможных убытков от его наступления);
- что является гражданином Российской Федерации;
- что не является публичным должностным лицом (в том числе иностранным публичным должностным лицом, должностным лицом публичных международных организаций, а также лицом, замещающим (занимающим) государственную должность РФ, должность члена совета директоров ЦБ РФ, должность федеральной государственной службы, назначение и освобождение от которой осуществляется Президентом РФ или Правительством РФ, должность в ЦБ РФ, государственной корпорации и иных организациях, созданных РФ на основании федеральных законов, включенную в перечни должностей, определяемые Президентом РФ), а также супругом(-ой) и /или родственником такого публичного должностного лица. В ином случае Страхователь обязуется представить подтверждающие вышеназванные данные документы и /или сведения (в т. ч. об адресе работодателя, степени родства ]]></text>
			</staticText>
			<textField>
				<reportElement x="465" y="758" width="100" height="14" uuid="f7f43b2b-ede9-4d5c-8a73-3d4bbc823fc9"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[6]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="0" y="10" width="260" height="750" uuid="06e9920c-ffe1-40e3-9d5f-a1b9d3acf214">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[либо статусе по отношению к публичному должностному лицу (с учетом того, что применимо);
- не имеет регистрации, места жительства /нахождения, счета в банке, зарегистрированном в государстве (на территории), которое(-ая) не выполняет рекомендации ФАТФ. Страхователь не является субъектом санкций Управления по контролю за иностранными активами Министерства финансов США и Европейского Союза;
- бенефициарным владельцем (физическим лицом, которое имеет возможность контролировать действия клиента) является Страхователь; целью установления Страхователем деловых отношений со Страховщиком является получение страховой услуги;
- вся информация (в т. ч. указанная в настоящем разделе Договора страхования) является полной, достоверной и действительной на дату предъявления предоставленных им сведений, а также подтверждает обязанность в случае изменений идентификационных сведений сообщить об этих изменениях Страховщику в течении 5 рабочих дней с момента их изменения;
- подтверждает, что Условия ему вручены, разъяснены и понятны, с условиями страхования он согласен;
- подтверждает, что не имеет Страхового полиса «Выбери здоровье», «Выбери здоровье классика», «Выбери здоровье плюс», «Выбери здоровье премиум», «Выбери здоровье премиум плюс», «Выбери здоровье платинум», «Выбери здоровье платинум плюс» ООО «РСХБ-Страхование жизни», срок действия которого полностью или частично совпадает со сроком действия настоящего Страхового полиса;
- подтверждает, что источниками происхождения средств, вносимых в качестве страховой премии, являются личные накопления и/или кредитные средства.
8.2. Заключая Договор страхования и оплачивая страховую премию, Страхователь дает согласие:
- Страховщику, а также Сервисной компании и/или их уполномоченным представителям на обработку персональных данных, в соответствии с положениями настоящего Страхового полиса и Условий страхования, Федеральным законом от 27.07.2006 №152-ФЗ «О персональных данных» (далее – Закон) в целях надлежащего исполнения Договора страхования, организации оказания услуг, включения персональных данных в информационную систему персональных данных для информирования о новинках страховых продуктов, участия в маркетинговых, рекламных акциях и исследованиях, а также для осуществления информационного сопровождения исполнения Договора страхования, в том числе]]></text>
			</staticText>
			<staticText>
				<reportElement x="290" y="10" width="275" height="740" uuid="9bf16fb7-95ea-4ff1-a127-ba2da5245f3b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[посредством направления уведомлений с применением СМС-сообщений, чатов, посредством электронной почты и иными доступными способами. Страхователь дает согласие поручить обработку его персональных данных третьим лицам на основании заключенных Страховщиком с этими лицами Договоров /соглашений (агентских, возмездного оказания услуг, о взаимном сотрудничестве, хранении, обеспечении конфиденциальности и безопасности и др.) в целях предоставления страховой услуги (далее- Обработчики). Страхователь дает согласие на передачу (предоставление) персональных данных Обработчикам, а также иным третьим лицам, круг которых ограничен и определен опосредованно как лица, с которыми Страховщик вправе взаимодействовать в связи с исполнением Договора страхования (в т. ч. при рассмотрении страхового события);
- на предоставление Страховщику и Сервисной компании любой информации /сведений /документов (в т. ч. данных о состоянии здоровья, составляющие врачебную тайну), связанных с оказанием страховой услуги, государственными органами, федеральными государственными учреждениями МСЭ и Фондом ОМС, медицинскими и иными учреждениями (организациями, государственными органами), в том числе: любые медицинские документы и/или их заверенные копии (результаты лабораторных и инструментальных исследований, результаты лечения, прогноз по заболеванию и т.д.), как в связи с оценкой степени страхового риска, так и в связи с событиями, имеющими признаки страхового случая. Данное согласие имеет силу и действует с даты заключения Страхового полиса до истечения 6 (шести) лет после прекращения обязательств по Страховому полису;
- на использование его персональных данных в целях продвижения Страховщиком своих услуг на рынке путем осуществления прямых контактов с помощью средств связи, а также для осуществления информационного сопровождения в связи с оказанием страховой услуги (в т. ч. для СМС-рассылок).
- дает свое согласие на использование Страховщиком факсимильного воспроизведения подписи и печати Страховщика на Страховом полисе с помощью средств механического или иного копирования, электронно-цифровой подписи либо иного аналога собственноручной подписи.
Перечень действий с персональными данными и общее описание способов их обработки: сбор, запись, систематизация, накопление, хранение, уточнение (обновление, изменение), извлечение, использование, передача (предоставление, доступ), обезличивание, блокирование, удаление, уничтожение персональных данных; персональные данные будут обрабатываться с использованием]]></text>
			</staticText>
			<textField>
				<reportElement x="465" y="758" width="100" height="14" uuid="0abc5240-d8ce-4500-b4fb-038b8d04c789"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[7]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="0" y="10" width="260" height="750" uuid="c86b4637-0a5c-4484-bd28-bce3a458d2a6">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[различных сочетаний средств автоматизации и неавтоматизированных средств обработки (смешанная обработка). Перечень обрабатываемых персональных данных: фамилия, имя, отчество, дата и место рождения, гражданство, реквизиты документа, удостоверяющего личность (серия, номер, кем и когда выдан, код подразделения и др.), ИНН (при наличии), контактная информация (адрес места жительства, фактический адрес и др.), платежные реквизиты, иные персональные данные, содержащиеся в документах, которые были оформлены при заключении Договора страхования или переданы/будут переданы Страховщику в связи с оказанием страховой услуги, будут получены в ходе рассмотрения страхового события и/или сообщены Страховщику устно. Согласие действует в течение срока действия Договора страхования и еще шесть лет после его прекращения. Согласие может быть отозвано посредством направления письменного уведомления Страховщику.
8.3. Страхователь обязуется предоставить Страховщику и Сервисной компании любую медицинскую информацию: об обращениях за медицинской помощью, состоянии его здоровья и диагнозе, иные сведения, полученные при медицинском обследовании и лечении. Страхователь дает свое согласие на предоставление Страховщику любыми лечебно-профилактическими или особого типа учреждениями здравоохранения и /или частными врачами, у которых Страхователь проходил лечение, находится или находился под наблюдением, сведений о факте обращения Страхователя за оказанием медицинской помощи, состоянии его здоровья и диагнозе, иные сведения, полученные при медицинском обследовании и лечении. Страхователь уполномочивает Страховщика и Сервисной компании на получение сведений, составляющих врачебную тайну, в любом виде и в любой форме (в т. ч. на получение справок, актов, заключений, результатов обследования). Страхователь дает свое согласие на предоставление Страховщику любыми лечебно-профилактическими или особого типа учреждениями здравоохранения и /или частными врачами, у которых Страхователь проходил лечение, находится или находился под наблюдением, сведений о факте обращения Страхователя за оказанием медицинской помощи, состоянии его здоровья и диагнозе, иные сведения, полученные при медицинском обследовании и лечении. Страхователь уполномочивает Страховщика и Сервисной компании на получение сведений, составляющих врачебную тайну, в любом виде и в любой форме (в т. ч. на получение справок, актов, заключений, результатов обследования).]]></text>
			</staticText>
			<textField>
				<reportElement x="465" y="758" width="100" height="14" uuid="6f32c723-a5cf-4419-acfa-f26302287346"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[8]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement x="290" y="10" width="275" height="740" uuid="efdc9b5c-77cc-4f53-8bbd-2facc04cbfcf">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[<style isBold="true">8.4. Заключая Договор страхования и оплачивая страховую премию, Страхователь подтверждает, что</style>:
- возраст Страхователя (Застрахованного лица) на дату акцепта настоящего Страхового полиса не менее 18 (восемнадцати) и не более 54 (пятидесяти четырех) лет;
- Страхователь (Застрахованное лицо) является дееспособным физическим лицом;
- Страхователь (Застрахованное лицо) не являлся/не является инвалидом I - II группы, ребенком инвалидом, в отношении него не принималось врачебное решение о направлении для установления ему группы инвалидности, не является лицом, имеющим действующее направление на медико-социальную экспертизу (МСЭ), и МСЭ не рассматривает документы на установление ему группы инвалидности;
- Страхователь (Застрахованное лицо) не нуждается в постоянном уходе в соответствии с медицинским заключением;
- Страхователь (Застрахованное лицо) не имеет заболевания и (или) функциональные нарушения из нижеуказанных (по которым в течение жизни устанавливался диагноз, проводилось и(или) проводится лечение, либо в отношении которых лицо находилось (находится) под наблюдением врача-специалиста): СПИД или ВИЧ-инфекция, злокачественные новообразования, в том числе но не ограничиваясь: рак in situ, лейкозы, миелома, лимфомы, болезнь Ходжкина; любые виды опухолей или кист головного мозга и/или спинного мозга, пищевод Барретта, дисплазия шейки матки, доброкачественная гиперплазия предстательной железы, полицитемия, фиброаденома молочной железы; язва желудка, болезнь Крона, неспецифический язвенный колит, хронические гепатиты вирусной и невирусной природы, циррозы печени любой этиологии, алкогольная болезнь печени, хронический панкреатит;
- хроническая дыхательная недостаточность II-III степени; хроническая обструктивная болезнь легких (ХОБЛ); первичный иммунодефицит, амилоидоз, крипторхизм, туберкулез, хроническая почечная недостаточность любой стадии;
- Страхователю (Застрахованному лицу) не устанавливался диагноз эпилепсии, слабоумия, психических заболеваний и/или расстройств поведения не состоял/не состоит на учете в психоневрологическом и/или наркологическом диспансере;
- Страхователь (Застрахованное лицо) не употребляет наркотические, токсические и/или сильнодействующие вещества с целью лечения или по иной причине, ему не устанавливался диагноз алкоголизм, наркомания, токсикомания; не состоит по любой из указанных причин на диспансерном учете;]]></text>
			</staticText>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="292" y="170" width="271" height="110" uuid="40330400-c0d4-4ebf-918a-bf150bbe4727">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.tabStopWidth" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0" tabStopWidth="25"/>
				</textElement>
				<text><![CDATA[Генеральный директор
ООО «РСХБ-Страхование жизни»

__________________________________
Мальков Максим Владимирович/
Аналог собственноручной подписи и печати
м.п.]]></text>
			</staticText>
			<staticText>
				<reportElement x="0" y="10" width="260" height="750" uuid="6b55ec65-3e62-4477-9174-43c7899c9003">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[- Страхователь (Застрахованное лицо) не переносил хирургических операции по трансплантации органа или его части (в том числе, но не ограничиваясь, костного мозга), трепанации черепа;
- у Страхователя (Застрахованного лица) за 6 месяцев, предшествующих заключению Договора страхования, не отмечалась нецеленаправленная резкая потеря веса (10 кг и более);
-	У Страхователя (Застрахованного лица) индекс массы тела (отношение массы тела (кг) к квадрату роста (м)) находится в диапазоне не менее 20 и не более 35;
-	У Страхователя (Застрахованного лица) не отмечалась патологическая кровопотеря из любых источников;
- Страхователь (Застрахованное лицо) не имеет отклонений от установленных лабораторных норм показателей онкомаркеров (если такие исследования проводились);
- Страхователь (Застрахованное лицо) не подвергался (подвергается) воздействию радиации, токсических или канцерогенных веществ при выполнении своих профессиональных обязанностей;
- Страхователь (Застрахованное лицо) не выкуривает более 20 сигарет в день и/ или не курит ежедневно электронные сигареты, сигары, трубки, кальян/наргиле, или другие никотиновые заменители; не употребляет алкоголь более чем 5 единиц в день (одна единица = 300 мл пива или 100 мл вина или 20 мл спирта);
- Страхователь (Застрахованное лицо) и/или его ближайшие родственники (отец, мать, братья, сестры) в возрасте до 60 лет не болели онкологическими заболеваниями и / или не умирали от рака (в случае, если этот факт был известен Страхователю (Застрахованному лицу) до заключения Договора страхования).
<style isBold="true">9. ЗАКЛЮЧИТЕЛЬНЫЕ ПОЛОЖЕНИЯ</style>
9.1. К Страховому полису прилагаются и являются неотъемлемой частью Договора страхования Условия страхования №1-МС «Выбери здоровье классика».
9.2. В случае спорных ситуаций положения настоящего Страхового полиса имеют приоритетную силу по отношению к Условиям страхования. Во всем, что не предусмотрено положениями настоящего Страхового полиса, стороны руководствуются Условиями страхования.
9.3. Никакие отметки (а также дополнения, исправления и т. п.), сделанные на Договоре страхования (Страховой полис и приложения к нему) от руки, не имеют юридической силы, если их верность не засвидетельствована собственноручными подписями Сторон и оригинальным оттиском печати Страховщика.
9.4. Заключая Договор страхования и оплачивая]]></text>
			</staticText>
			<staticText>
				<reportElement x="290" y="10" width="275" height="130" uuid="7a262abf-b585-44d7-ae98-fa70144b4890">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[страховую премию, Страхователь (Застрахованное лицо) подтверждает, что Страховой полис и Условия страхования №1-МС «Выбери здоровье классика», утвержденные приказом Генерального директора Страховщика от «25» сентября 2018г. № 79, Страхователем приняты. Условия страхования вручены Страхователю и получены им.
ПРИЛОЖЕНИЕ: Условия страхования №1-МС «Выбери здоровье классика».
]]></text>
			</staticText>
			<textField>
				<reportElement x="465" y="758" width="100" height="14" uuid="0710ee42-1325-4d5e-9930-668792ed3b82"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[9]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement mode="Opaque" x="292" y="157" width="271" height="13" backcolor="#C0C0C0" uuid="c37291c7-cb87-4422-b870-2899f1a333b6">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="true"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЩИК]]></text>
			</staticText>
			<image>
				<reportElement x="340" y="189" width="79" height="31" uuid="f08e8881-44c7-454f-87bc-4e5c61f50b9c">
					<printWhenExpression><![CDATA[$P{sign}]]></printWhenExpression>
				</reportElement>
				<imageExpression><![CDATA["templates/sign.png"]]></imageExpression>
			</image>
			<image>
				<reportElement x="323" y="204" width="121" height="121" uuid="16eed965-43d4-43c0-9d5e-040221dbae7d">
					<printWhenExpression><![CDATA[$P{stamp}]]></printWhenExpression>
				</reportElement>
				<imageExpression><![CDATA["templates/stamp.png"]]></imageExpression>
			</image>
		</band>
	</detail>
	<pageFooter>
		<band height="30"/>
	</pageFooter>
</jasperReport>
'::text, 'utf8'))
ON CONFLICT (type)
DO NOTHING;

insert into common_dict.PRINT_TEMPLATES(TYPE, COPIES_NUMBER, FILE_NAME, CONTENT)
values ('4f2434ae-5eb1-4b10-8f83-2cbcddfdbf97', 4, 'ДОГОВОР СТРАХОВАНИЯ (Страховой полис) «Выбери здоровье»', convert_to('<?xml version="1.0" encoding="UTF-8"?>
<!-- Created with Jaspersoft Studio version 6.5.1.final using JasperReports Library version 6.5.1  -->
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="RshbInsuranceChooseHealth" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" isFloatColumnFooter="true" uuid="4eedbb89-b4f6-4469-9ab6-f642a1688cf7">
	<property name="com.jaspersoft.studio.data.defaultdataadapter" value="One Empty Record"/>
	<subDataset name="tableDataset" uuid="f13e6d36-5148-4ecc-bbe3-3035def80980">
		<queryString>
			<![CDATA[]]>
		</queryString>
	</subDataset>
	<parameter name="sign" class="java.lang.Boolean"/>
	<parameter name="stamp" class="java.lang.Boolean"/>
	<parameter name="contractNumber" class="java.lang.String"/>
	<parameter name="surname" class="java.lang.String"/>
	<parameter name="name" class="java.lang.String"/>
	<parameter name="patronymic" class="java.lang.String"/>
	<parameter name="birthDate" class="java.lang.String"/>
	<parameter name="contractStartDate" class="java.lang.String"/>
	<parameter name="contractSignDate" class="java.lang.String"/>
	<parameter name="phoneNumber" class="java.lang.String"/>
	<parameter name="email" class="java.lang.String">
		<defaultValueExpression><![CDATA[""]]></defaultValueExpression>
	</parameter>
	<parameter name="isTestInstance" class="java.lang.Boolean" isForPrompting="false">
		<parameterDescription><![CDATA[Инстанс приложения запущен на тестовом стенде]]></parameterDescription>
		<defaultValueExpression><![CDATA[true]]></defaultValueExpression>
	</parameter>
	<queryString>
		<![CDATA[]]>
	</queryString>
	<background>
		<band height="772">
			<image>
				<reportElement isPrintRepeatedValues="false" x="3" y="0" width="550" height="758" uuid="ea763663-ef82-4cb6-a25f-d7c500e2fa1a">
					<printWhenExpression><![CDATA[$P{isTestInstance} == true]]></printWhenExpression>
				</reportElement>
				<imageExpression><![CDATA[net.sf.jasperreports.renderers.BatikRenderer.getInstanceFromText("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"765\" height=\"990\"><text x=\"60\" y=\"40\" transform=\"matrix(.6,-.82,.83,.6,30,1055)\" style=\"font-size:220px;font-weight:bold;fill:#d8d8d8\">ОБРАЗЕЦ</text></svg>")]]></imageExpression>
			</image>
		</band>
	</background>
	<detail>
		<band height="772">
			<staticText>
				<reportElement x="0" y="0" width="280" height="15" uuid="13533ce6-dbe7-4b4d-9667-044ed58e5a09">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Center">
					<font fontName="Arial" size="11" isBold="true"/>
				</textElement>
				<text><![CDATA[ДОГОВОР СТРАХОВАНИЯ (Страховой полис) «Выбери здоровье» ]]></text>
			</staticText>
			<textField>
				<reportElement x="0" y="15" width="280" height="35" uuid="b1030e44-bdf5-48a4-aaaf-f2be11f5788f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Center">
					<font fontName="Arial" size="11" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["«Выбери здоровье» № " + $P{contractNumber}+ "\nот " + $P{contractSignDate}]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement x="0" y="50" width="280" height="160" uuid="1d4eea10-38c3-4880-879f-4d32eb4ca9c2">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[По настоящему Договору страхования (Страховому полису) «<style isBold="true">Выбери здоровье</style>», являющемуся офертой (далее – Страховой полис, Договор страхования) Страховщик предлагает Страхователю, в соответствии со статьей 435 Гражданского кодекса Российской Федерации, заключить Договор добровольного страхования на нижеследующих условиях. Договор страхования заключается путем принятия и акцепта Страхователем настоящего Страхового полиса (оферты), подписанного Страховщиком. На основании ст. 435, 438 и п. 2 ст. 940 ГК РФ]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="0" y="210" width="130" height="180" backcolor="#C0C0C0" uuid="2ca31443-b24e-4580-b580-eaddad0fb35a">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЩИК]]></text>
			</staticText>
			<staticText>
				<reportElement x="140" y="210" width="416" height="180" uuid="00ed8b66-a12b-4377-899f-809f0801f972">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[ООО «РСХБ-Страхование жизни»,  лицензия на осуществление добровольного личного страхования, за исключением  добровольного страхования жизни, СЛ № 4358, выдана Банком России без ограничения срока действия
<style isBold="true">Адрес:</style> г. Москва, Гагаринский пер., д. 3;
<style isBold="true">Телефон:</style> 8 (495) 745 99 55;
<style isBold="true">Режим работы:</style> понедельник-четверг: с 9.00 до 18.00, пятница: с 9.00 до 16.45.

<style isBold="true">Банковские реквизиты:</style> Расчетный счет: 40701810100000000160; ИНН 7704447253; Банк получателя: АО «РОССЕЛЬХОЗБАНК», г. Москва, БИК Банка получателя: 044525111, Корр. счет: 30101810200000000111

www.rshbins-life.ru]]></text>
			</staticText>
			<staticText>
				<reportElement stretchType="ElementGroupBottom" mode="Opaque" x="0" y="400" width="130" height="356" backcolor="#C0C0C0" uuid="27a489d8-c21a-4cbf-b91d-32469f102b83">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВАТЕЛЬ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" stretchType="ElementGroupBottom" x="140" y="400" width="416" height="356" uuid="70843296-76f4-49bb-ad86-4cb04cdc058f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Bottom" markup="styled">
					<font fontName="Arial" size="9" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[]]></text>
			</staticText>
			<textField isStretchWithOverflow="true">
				<reportElement stretchType="ContainerBottom" x="145" y="410" width="409" height="119" uuid="c7223a32-04c4-467d-8595-015f96872745">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<textFieldExpression><![CDATA["Фамилия <style isItalic=\"true\"> " +$P{surname} + " </style>, Имя <style isItalic=\"true\" >" + $P{name} + "</style>, Отчество <style isItalic=\"true\">" + $P{patronymic} + "</style>\nДата рождения <style isItalic=\"true\">" + $P{birthDate} + "</style> Телефон <style isItalic=\"true\">" + $P{phoneNumber} + "</style>\nАдрес электронной почты <style isItalic=\"true\">" + $P{email} + "</style>"]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement positionType="Float" x="140" y="529" width="415" height="220" uuid="e806d396-b92b-49ec-8077-12f47876b5c5">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страхователем по настоящему Договору страхования является дееспособное физическое лицо, отвечающее требованиям, предусмотренным в п.1.4.4. Условий страхования, заключившее со Страховщиком Договор страхования и указанное в Платежном поручении в качестве плательщика страховой премии. В Платежном поручении указываются по меньшей мере следующие данные: фамилия, имя, отчество Страхователя, дата и номер Договора страхования. Страховщик не заключает на условиях, указанных в настоящем Страховом полисе, Договоры страхования в отношении лиц, не соответствующих условиям, указанным в п.1.4.4. Условий страхования. Данное условие является существенным условием Договора страхования. Если лицо, оплатившее Договор страхования, не соответствует условиям, указанным в 1.4.4. Условий страхования, Договор страхования является незаключенным ввиду несогласования Сторонами существенных условий Договора (условия о Застрахованном лице). В таком случае Страховщик производит возврат поступивших денежных средств лицу, совершившему платеж, в порядке и сроки, предусмотренные Условиями страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement x="290" y="0" width="263" height="210" uuid="439df76f-1377-4599-abb8-ea3d3cb0cbda">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[акцептом настоящего Страхового полиса (оферты) считается принятие страхового полиса, что подтверждается оплатой страховой премии в соответствии с условиями, содержащимися в Страховом полисе. Договор страхования заключается на основании Условий страхования №1-МС «Выбери здоровье», утвержденных приказом Генерального директора Страховщика от «25» сентября 2018г. № 79 (Далее – Условия страхования). Положения, содержащиеся в Условиях страхования и не включенные в текст настоящего Страхового полиса, применяются к Договору страхования и обязательны для Страхователя (Выгодоприобретателя).]]></text>
			</staticText>
			<textField>
				<reportElement x="455" y="758" width="100" height="14" uuid="8558ff52-0b46-4518-8fb9-079d15cc2a84"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[1]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement positionType="Float" x="140" y="85" width="416" height="75" uuid="5b036380-182f-427c-acd0-5be6776fe87b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[<style isBold="true">Общество с ограниченной ответственностью "СОЮЗМЕДСЕРВИС" (ООО "СоюзМедСервис").
Круглосуточная служба поддержки: 8 (800) 600 45 99, 8 (495) 797 79 33</style>
<style isBold="true">Адрес</style>: 143422, Московская обл., Красногорский р-н, с. Петрово-Дальнее, ул. Тихвинская, д. 10 <style isBold="true">Эл. адрес</style>: help@s-med-s.ru]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="10" width="130" height="28" backcolor="#C0C0C0" uuid="b5a9672c-ebe1-4c61-8319-6891027516bc">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ЗАСТРАХОВАННОЕ ЛИЦО]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="140" y="10" width="416" height="28" uuid="41d5d2e8-d3e5-4ee8-a2c2-6cf1e947c55f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страхователь, при соблюдении условий, предусмотренных п.1.4.4. Условий страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="48" width="130" height="28" backcolor="#C0C0C0" uuid="8e41abb0-55cb-4a91-9075-1b9e745f2886">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ВЫГОДОПРИОБРЕТА
ТЕЛЬ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="140" y="48" width="416" height="28" uuid="18a8b6e4-3197-4947-9340-e030c4034957">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Застрахованное лицо]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="85" width="130" height="75" backcolor="#C0C0C0" uuid="7ccb4ce6-b6a9-48d6-9587-20bd06e1fff5">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СЕРВИСНАЯ КОМПАНИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="0" y="170" width="130" height="375" backcolor="#C0C0C0" uuid="89be9e58-ce04-4661-a547-6d09560391b5">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЫЕ РИСКИ.
СТРАХОВЫЕ СЛУЧАИ.]]></text>
			</staticText>
			<staticText>
				<reportElement x="140" y="170" width="416" height="375" uuid="4d407a6b-22e2-430d-bced-764c6325a91a">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Top" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[<style isBold="true">Страховым риском</style>, согласно Договору страхования и Условиям страхования, является риск возникновения в период страхования обстоятельств, требующих оказания медицинских и иных услуг Застрахованному лицу <style isBold="true">в связи с</style>:
<style isBold="true">Злокачественным новообразованием,</style> а именно: злокачественным новообразованием, характеризующимся неконтролируемым ростом и распространением злокачественных клеток, проникающих в ткань различного гистологического типа, и относящимся к кодам C00-C43, C45-C97 по МКБ-10, <style isBold="true">за исключением</style>: С44 – эпителиальных опухолей кожи (включая базалиому, плоскоклеточный рак), C91.1 – хронического лимфоцитарного В – клеточного лейкоза, а также возникновения новообразования при наличии у Застрахованного лица ВИЧ-инфекции или СПИДа.
<style isBold="true">Страховым случаем</style>, с учетом всех положений, определений и исключений из страхования, предусмотренных Договором страхования и Условиями страхования, является документально подтверждённое обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим пунктом, при одновременном наличии следующих условий: диагноз злокачественного новообразования подтвержден гистологическими или (в случае системных онкологических заболеваний) цитологическими исследованиями и заключением врача-онколога; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу впервые в жизни; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу в течение Периода страхования, по истечении периода ожидания; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, предусмотренных п.10.1.2. Условий страхования в течение Периода страхования.]]></text>
			</staticText>
			<textField>
				<reportElement x="455" y="758" width="100" height="14" uuid="99ede26b-35a0-4e0d-a63e-f332fe6ada90"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[2]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement positionType="Float" x="140" y="553" width="416" height="30" uuid="cbba7ddb-614e-4e8a-b974-c979eb2bf17c">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Услуги, предусмотренные Страховым полисом, оказываются на территории Российской Федерации.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="553" width="130" height="30" backcolor="#C0C0C0" uuid="9f559e40-dbeb-4e9b-a625-ad9e6cbf7705">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ТЕРРИТОРИЯ ОКАЗАНИЯ УСЛУГ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="592" width="130" height="165" backcolor="#C0C0C0" uuid="e05d0153-1b43-42c8-a400-7e414afaf0ab">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СРОК ДЕЙСТВИЯ ДОГОВОРА СТРАХОВАНИЯ

ПЕРИОД СТРАХОВАНИЯ]]></text>
			</staticText>
			<textField isStretchWithOverflow="true">
				<reportElement stretchType="ContainerBottom" x="140" y="592" width="416" height="165" uuid="609dd471-07de-4aed-94fe-ad89e674646b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<box topPadding="0" leftPadding="0" bottomPadding="0" rightPadding="0">
					<pen lineWidth="1.0" lineStyle="Solid"/>
				</box>
				<textElement textAlignment="Left" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<textFieldExpression><![CDATA["<style isBold=\"true\">Дата заключения Договора страхования "+$P{contractSignDate}+"г.\nСрок действия Договора страхования</style> составляет 1 (один) год с даты вступления Страхового полиса в силу.\n<style isBold=\"true\">Дата вступления Договора страхования в силу "+$P{contractStartDate}+"г,\nдо указанной даты Страхователь вправе отказаться от Договора страхования и получить возврат страховой премии в порядке п. 9.9.5.1 Условий.\nПериод страхования</style> начинается с 00 часов 00 минут 121 (Сто двадцать первого) дня с даты заключения Страхового полиса и действует до окончания срока действия Договора страхования\nПри повторном заключении аналогичного Страхового полиса, Стороны при определении срока действия Договора страхования и периода страхования руководствуются положениями раздела 6 и 7 Условий страхования."]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement positionType="Float" x="140" y="10" width="416" height="132" uuid="82951d3e-5619-4016-9c2c-b9e772c83388">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[<style isBold="true">120 (Сто двадцать) календарных дней</style> с даты заключения договора страхования.
В течение данного периода времени Страховщик не несет обязательств по организации оказания медицинских и иных услуг (из числа событий, предусмотренных Договором страхования). Обращения Застрахованного лица в этот период не являются страховым случаем, организация услуг не производится, страховая выплата по данным событиям не осуществляется.
При повторном заключении аналогичного Страхового полиса, Стороны при определении периода ожидания руководствуются положениями раздела 6 Условий страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="0" y="10" width="130" height="132" backcolor="#C0C0C0" uuid="578f55a2-d170-4cc7-bc57-83e8fdc2cb0f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ПЕРИОД ОЖИДАНИЯ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="152" width="130" height="21" backcolor="#C0C0C0" uuid="5efb369c-c154-488b-9c2e-cfd1f7740d11">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВАЯ СУММА]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="140" y="152" width="416" height="21" uuid="36222d17-5006-4890-8a13-0b4e5bc1a376">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Center" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="true"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[6 000 000 (Шесть миллионов) рублей]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="140" y="181" width="416" height="158" uuid="1463ef71-efa3-4ab5-916a-b7281f287d8b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Страховая премия составляет <style isBold="true">14 990 (Четырнадцать тысяч девятьсот девяносто) рублей 00 копеек.</style>
Страховой тариф 0,249834%
Страховая премия подлежит оплате единовременно в день заключения Договора страхования. Сумма и дата оплаты указываются на документе, подтверждающем оплату страховой премии.
Если страховая премия не будет уплачена в срок, указанный в настоящем пункте, или будет уплачена в ином размере, чем указан в Страховом полисе, Договор страхования считается незаключенным ввиду несогласования его существенных условий, при этом денежные средства считаются ошибочно уплаченными и подлежат возврату лицу, совершившему платеж, в порядке и сроки, предусмотренные Условиями страхования.]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="181" width="130" height="158" backcolor="#C0C0C0" uuid="32f6df88-ebd5-48ac-8f54-599036bb3880">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВАЯ ПРЕМИЯ]]></text>
			</staticText>
			<textField>
				<reportElement x="455" y="758" width="100" height="14" uuid="ecf4668c-f944-4e13-903c-0696ffa3a859"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[3]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement positionType="Float" mode="Opaque" x="1" y="349" width="130" height="41" backcolor="#C0C0C0" uuid="a0b368c9-270f-4dae-829f-74edef3dac61">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[ЛИМИТЫ]]></text>
			</staticText>
			<staticText>
				<reportElement positionType="Float" x="140" y="349" width="416" height="41" uuid="3dc84df8-149d-410e-8522-d3495cebab94">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="1.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left" verticalAlignment="Middle" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="6"/>
				</textElement>
				<text><![CDATA[Максимальный лимит ответственности Страховщика по оплате организации медицинских и иных услуг по Договору страхования в совокупности равен страховой сумме.]]></text>
			</staticText>
			<staticText>
				<reportElement x="0" y="400" width="271" height="350" uuid="4a2eb15b-0af0-44dd-82e1-37fc074eadc9">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[<style isBold="true">2. ОСНОВНЫЕ ПОЛОЖЕНИЯ ДОГОВОРА СТРАХОВАНИЯ </style>
2.1. В соответствии со Страховым полисом и Условиями, Сервисная компания организовывает и оплачивает следующие услуги при наступлении страхового случая:
2.1.1. <style isBold="true">Медицинская транспортировка</style> (медицинская эвакуация) Застрахованного лица к поставщику медицинских услуг и/или между медицинскими организациями и возвращение обратно, включая трансфер автомобилем скорой медицинской помощи или на такси от места жительства до аэропорта (транспортного узла), из аэропорта (транспортного узла) до отеля (апартаментов) и/или до медицинской организации, в которой будет проводиться лечение и обратно.
2.1.2. <style isBold="true">Оплата билета</style> эконом класса для Застрахованного, а также при наличии медицинских показаний – оплата медицинского сопровождения и дополнительных мест и оборудования в самолете (ином средстве транспорта) при регулярном рейсе.
2.1.3. <style isBold="true">Проживание Застрахованного лица</style>: подлежит оплате проживание в отеле (3 или 4 звезды) или эквивалентного стандартного номера в апартаментах с оплатой услуг, включенных в стоимость номера для Застрахованного лица. Не подлежат оплате дополнительные услуги, не ]]></text>
			</staticText>
			<staticText>
				<reportElement x="280" y="400" width="271" height="350" uuid="5485a024-86f7-4981-b32c-acb195b89e40">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[включённые в стоимость номера.
2.1.4. <style isBold="true">Услуги по репатриации</style> в случае смерти Застрахованного лица во время поездки: транспортировка останков Застрахованного лица до места постоянного проживания Застрахованного лица.
2.1.5. <style isBold="true">Лечение на территории Российской Федерации</style>, проводимое по поводу страхового случая:
2.1.5.1. <style isBold="true">Медицинская помощь</style> в амбулаторных условиях, в условиях дневного стационара, в стационарных условиях, в том числе:
а) осмотры врачами, в том числе врачами-специалистами;
б) диагностические медицинские вмешательства, выполняемые медицинскими организациями по выбору Сервисной компании на территории страны оказания услуг, в том числе лабораторные исследования, визуализирующие исследования, эндоскопические исследования, функциональная диагностика;
в) лечебные медицинские вмешательства в пределах страховой суммы (кроме имплантаций и трансплантации, которые производятся только в случаях, прямо указанных в Условиях и в объеме, указанном в Условиях), включающие хирургическое лечение, химиотерапию, лучевую терапию, иные]]></text>
			</staticText>
		</band>
		<band height="772">
			<textField>
				<reportElement x="455" y="758" width="100" height="14" uuid="89d1cbe4-3d4e-4045-9f45-ab5f2f09e52e"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[4]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement x="0" y="10" width="271" height="747" uuid="8f76b97f-b715-4166-9584-99bbb4714a46">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[методы лечения, научно обоснованные, разрешенные к применению на территории страны оказания услуг и применяемые в рамках оказания медицинской помощи медицинскими организациями по выбору Сервисной компании, на территории страны оказания услуг;
г) трансплантация костного мозга, выполняемая медицинской организацией, имеющей соответствующую лицензию, по выбору Сервисной компании;
д) имплантация, необходимая в целях реконструктивного лечения груди после проведения мастэктомии, включая стоимость имплантатов на сумму (<style isBold="true">лимит ответственности) составляет 900 000 (Девятьсот тысяч) рублей</style> в период действия Договора страхования на один страховой случай;
е) лекарственные средства, и расходные материалы, применяемые при лечении в стационарных условиях и в
условиях дневного стационара.
2.1.5.2. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 30 (Тридцати) календарных дней после окончания срока действия Договора страхования, а также расходы в соответствии с п. 2.1.2. и 2.1.4. Страхового полиса.
2.1.5.3. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, при наличии состояния, угрожающего жизни Застрахованного лица (прекращение оказываемой медицинской помощи может повлечь смерть Застрахованного лица), оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 90 (девяноста) календарных дней после окончания срока действия Договора страхования, а также расходы в соответствии с п. 2.1.2. и 2.1.4. Страхового полиса.
2.2.	Страховщик осуществляет оплату организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица (в том числе, но не ограничиваясь этим, при экстренной медицинской транспортировке Застрахованного лица), только в случае наличия медицинских показаний к сопровождению Застрахованного лица, определенных Врачом. Оплата организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица осуществляется в пределах лимитов ]]></text>
			</staticText>
			<staticText>
				<reportElement x="280" y="10" width="271" height="747" uuid="8dd0d397-c8f9-42b4-94f3-5e45f4e542d6">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[(страховой суммы), установленных Договором страхования.
3.	ИСКЛЮЧЕНИЯ.
Не являются страховыми случаями (не покрывается страхованием), и страховая выплата не производится по следующим событиям/заболеваниям и состояниям/расходам /услугам:
3.1.	Услуги и расходы в связи с первичным диагностированием у Застрахованного лица заболевания.
3.2.	Услуги и расходы, связанные с событиями / случаями, прямо не указанными в Договоре страхования как страховой случай.
3.3.	Услуги и расходы, прямо не указанные в Договоре страхования как услуги и расходы, подлежащие организации и оплате.
3.4.	Услуги и расходы по заболеваниям/состояниям, указанным в Договоре страхования, но возникшим до окончания периода ожидания или после истечения срока действия Договора страхования.
3.5.	Услуги и расходы, оказанные / понесенные до окончания периода ожидания или после истечения срока действия Договора страхования, за исключением обстоятельств, указанных в пп. 2.1.5.2 и 2.1.5.3. Страхового полиса.
3.6.	Услуги и расходы, необходимость которых возникла в связи с нарушением Застрахованным лицом рекомендаций лечащего врача и/или правил и распорядка медицинского учреждения, в котором Застрахованное лицо проходит лечение.
3.7.	Психохирургия.
3.8.	Хирургические операции по трансплантации органов (частей органов) или любого вида трансплантации костного мозга в следующих случаях:
3.8.1.	если трансплантация таких органов и (или) их долей не предусмотрена Договором страхования;
3.8.2. если потребность в трансплантации органов возникла вследствие алкогольной болезни печени;
3.8.3. если трансплантация органов является аутологичной (реципиент трансплантата является донором для самого себя), за исключением трансплантации костного мозга;
3.8.4. если при трансплантации органов Застрахованное лицо является донором по отношению к третьему лицу;
3.8.5. если трансплантация органов включает в себя лечение стволовыми клетками (кроме трансплантации костного мозга).
3.9. Медицинские и иные услуги, выполняемые в эстетических и/или косметических целях, включая, но не ограничиваясь: операции по коррекции зрения (миопии, астигматизма, близорукости); бариатрические операции, включая, но не ограничиваясь операциями, направленными на уменьшение объема желудка или кишечника, кроме]]></text>
			</staticText>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="280" y="10" width="271" height="750" uuid="1dcf5f45-78c4-440a-9dff-15d7ae3e2a95">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[3.20. Услуги и расходы в связи с Эпителиальными опухолями кожи (включая базалиому, плоскоклеточный рак) (код С44 по МКБ-10), Хроническим лимфоцитарным В-клеточным лейкозом (код C91.1 по МКБ-10).
4. Права и обязанности Страховщика и Страхователя (Выгодоприобретателя) указаны в Условиях страхования (раздел 12).
5. Страховщик не заключает на условиях, содержащихся в Условиях страхования и Страховом полисе, более одного Договора страхования с одним и тем же лицом. Данное условие является существенным; оплата Страхователем Договора(-ов) страхования при наличии заключенного и не прекратившего своего действия Договора страхования не признается акцептом и такие Договоры страхования являются незаключенными ввиду несогласования Сторонами существенных условий Договора. В таком случае Страховщик производит возврат поступивших денежных средств лицу, совершившему платеж в течение 20 (Двадцати) рабочих дней с момента получения письменного заявления плательщика.
При этом Страховщик имеет право предложить заключение Договоров страхования на особых условиях.
6. Порядок взаимодействия сторон при наступлении события, имеющего признаки страхового случая определен в разделе 10 Условий страхования.
<style isBold="true">7. ОСНОВАНИЯ ОТКАЗА В СТРАХОВОЙ ВЫПЛАТЕ</style> определены в разделе 13 Условий страхования.
<style isBold="true">8. ДЕКЛАРАЦИЯ И СОГЛАСИЯ СТРАХОВАТЕЛЯ:</style>
8.1. Заключая Договор страхования и оплачивая страховую премию, Страхователь подтверждает:
- свое ознакомление и согласие с условиями страхования, изложенными в настоящем Страховом полисе и Условиях страхования, в частности, Страхователь подтверждает, что ознакомлен и согласен с исключениями, порядком определения размера страховой выплаты и установленными лимитами ответственности, перечнем оснований для отказа в страховой выплате, условиями досрочного прекращения Договора страхования и условиями, при которых Договор страхования считается незаключенным ввиду несогласования сторонами его существенных условий, и иными условиями страхования;
- что до заключения Страхового полиса ему была предоставлена полная информация о страховой услуге согласно Закону Российской Федерации от 07.02.1992 № 2300-1 «О защите прав потребителей», в том числе о размере страховой премии, порядке ее оплаты и последствиях ее неоплаты; о порядке установления страховой суммы; о перечне страховых случаев; об исключениях из страхования; о требованиях к Застрахованному лицу, декларируемых Страховым полисом; о порядке действий Страхователя при]]></text>
			</staticText>
			<staticText>
				<reportElement x="0" y="10" width="271" height="750" uuid="76db0f2a-72a3-43b3-ac58-c770a710b599">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[операций по реконструкции груди после резекции / удаления молочной железы, проведенной в рамках Договора страхования и в соответствии с его условиями.
3.10. Услуги и расходы в связи с родовыми травмами и/или врождёнными пороками развития.
3.11. Услуги, не назначенные Застрахованному лицу лечащим врачом, либо не являющиеся необходимыми с медицинской точки зрения по поводу страхового случая.
3.12. Услуги и расходы в связи с заболеваниями и состояниями, которые являются прямым или косвенным следствием синдрома приобретенного иммунодефицита (СПИД) или носительства вируса иммунодефицита человека (ВИЧ), включая мутацию и любое побочное действие.
3.13. Услуги и расходы в связи с расстройством здоровья, наступившим в местах лишения свободы, изоляторах временного содержания и других учреждениях, предназначенных для содержания лиц, подозреваемых, обвиняемых в совершении преступления или осужденных за совершенные преступления.
3.14. Услуги и расходы в связи с расстройством здоровья, наступившим в результате профессиональной деятельности Застрахованного лица, непосредственно связанной с химическими веществами и газами (включая асбест, растворители, бензол, хлористый винил, бериллий, никель, соединения хрома, радон, пестициды, пыль с оксидом кремния, диоксины), со взрывчатыми веществами, с ионизирующими излучениями, ультрафиолетовым излучением, с микроволновым излучением, с высоковольтными электрическими сетями.
3.15. Услуги и расходы в связи с применением экспериментальных методов лечения, не допущенных к использованию в стране оказания услуг.
3.16. Услуги и расходы в связи со злокачественным новообразованием, протекающим на фоне ВИЧ–инфекции или СПИД.
3.17. Услуги и расходы в связи с существовавшими до даты заключения Договора страхования заболеваниями и состояниями, а также несчастными случаями, диагностированными / произошедшими Застрахованному лицу / с Застрахованным лицом или о которых было известно Застрахованному лицу до даты начала действия Договора страхования (лечение, предусмотренное страхованием было рекомендовано или запланировано до момента заключения Договора страхования).
3.18. Услуги и расходы в связи с получением Застрахованным лицом медицинских и иных услуг в медицинских и иных организациях, выбор которых не был согласован с Сервисной компанией.
3.19. Услуги и расходы в связи с раком кожи, за исключением меланомы.]]></text>
			</staticText>
			<textField>
				<reportElement x="455" y="758" width="100" height="14" uuid="9fbc9d8a-1188-4240-8168-8a94c90a5acc"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[5]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="0" y="10" width="271" height="750" uuid="0b732311-eaae-4926-980d-95124e80c34b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[наступлении события, имеющего признаки страхового случая; о порядке и определении размера страховой выплаты; о фирменном наименовании и о месте нахождения Страховщика, Сервисной компании, о номерах телефонов, о режиме работы Страховщика, Сервисной компании, которая позволила ему сделать правильный выбор страховой услуги, а также о том, что он был вправе обратиться к Страховщику для согласования иного содержания отдельных условий Договора страхования;
- свое ознакомление, понимает и соглашается с тем, что при наступлении событий по страховым рискам, перечисленным в Страховом полисе, у Страховщика возникает обязанность осуществить организацию оказания медицинских и иных услуг в общей сложности не более страховой суммы, установленной Договором страхования.
- что ознакомлен с последствиями, предусмотренными ст. 431.2 Гражданского кодекса Российской Федерации, наступающими в случае, если при заключении Страхового полиса либо до или после его заключения Страхователь дал Страховщику недостоверные заверения об обстоятельствах, имеющих значение для заключения Страхового полиса, его исполнения или прекращения (в том числе определения вероятности наступления страхового случая и размера возможных убытков от его наступления);
- что обстоятельства, оговоренные в Страховом полисе, имеют существенное значение для заключения Страхового полиса, его исполнения и прекращения (в том числе определения вероятности наступления страхового случая и размера возможных убытков от его наступления);
- что является гражданином Российской Федерации;
- что не является публичным должностным лицом (в том числе иностранным публичным должностным лицом, должностным лицом публичных международных организаций, а также лицом, замещающим (занимающим) государственную должность РФ, должность члена совета директоров ЦБ РФ, должность федеральной государственной службы, назначение и освобождение от которой осуществляется Президентом РФ или Правительством РФ, должность в ЦБ РФ, государственной корпорации и иных организациях, созданных РФ на основании федеральных законов, включенную в перечни должностей, определяемые Президентом РФ), а также супругом(-ой) и /или родственником такого публичного должностного лица. В ином случае Страхователь обязуется представить подтверждающие вышеназванные данные документы и /или сведения (в т. ч. об адресе работодателя, степени родства либо статусе по отношению к публичному должностному лицу (с учетом того, что применимо);
- не имеет регистрации, места жительства /нахождения, счета в банке, зарегистрированном в]]></text>
			</staticText>
			<staticText>
				<reportElement x="280" y="10" width="271" height="750" uuid="16243173-e460-4eba-8134-23a9e5e7917f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[государстве (на территории), которое(-ая) не выполняет рекомендации ФАТФ. Страхователь не является субъектом санкций Управления по контролю за иностранными активами Министерства финансов США и Европейского Союза;
- бенефициарным владельцем (физическим лицом, которое имеет возможность контролировать действия клиента) является Страхователь; целью установления Страхователем деловых отношений со Страховщиком является получение страховой услуги;
- вся информация (в т. ч. указанная в настоящем разделе Договора страхования) является полной, достоверной и действительной на дату предъявления предоставленных им сведений, а также подтверждает обязанность в случае изменений идентификационных сведений сообщить об этих изменениях Страховщику в течении 5 рабочих дней с момента их изменения;
- подтверждает, что Условия ему вручены, разъяснены и понятны, с условиями страхования он согласен;
- подтверждает, что не имеет Страхового полиса «Выбери здоровье», «Выбери здоровье классика», «Выбери здоровье плюс», «Выбери здоровье премиум», «Выбери здоровье премиум плюс», «Выбери здоровье платинум», «Выбери здоровье платинум плюс» ООО «РСХБ-Страхование жизни», срок действия которого полностью или частично совпадает со сроком действия настоящего Страхового полиса;
- подтверждает, что источниками происхождения средств, вносимых в качестве страховой премии, являются личные накопления и/или кредитные средства.
8.2. Заключая Договор страхования и оплачивая страховую премию, Страхователь дает согласие:
- Страховщику, а также Сервисной компании и/или их уполномоченным представителям на обработку персональных данных, в соответствии с положениями настоящего Страхового полиса и Условий страхования, Федеральным законом от 27.07.2006 №152-ФЗ «О персональных данных» (далее – Закон) в целях надлежащего исполнения Договора страхования, организации оказания услуг, включения персональных данных в информационную систему персональных данных для информирования о новинках страховых продуктов, участия в маркетинговых, рекламных акциях и исследованиях, а также для осуществления информационного сопровождения исполнения Договора страхования, в том числе посредством направления уведомлений с применением СМС-сообщений, чатов, посредством электронной почты и иными доступными способами. Страхователь дает согласие поручить обработку его персональных данных третьим лицам на основании заключенных Страховщиком с этими лицами Договоров /соглашений (агентских,]]></text>
			</staticText>
			<textField>
				<reportElement x="455" y="758" width="100" height="14" uuid="f7f43b2b-ede9-4d5c-8a73-3d4bbc823fc9"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[6]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="0" y="10" width="271" height="750" uuid="cf736a79-9c41-4611-b5e7-249df1fd9487">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[возмездного оказания услуг, о взаимном сотрудничестве, хранении, обеспечении конфиденциальности и безопасности и др.) в целях предоставления страховой услуги (далее- Обработчики). Страхователь дает согласие на передачу (предоставление) персональных данных Обработчикам, а также иным третьим лицам, круг которых ограничен и определен опосредованно как лица, с которыми Страховщик вправе взаимодействовать в связи с исполнением Договора страхования (в т. ч. при рассмо¬трении страхового события);
- на предоставление Страховщику и Сервисной компании любой информации /сведений /документов (в т. ч. данных о состоянии здоровья, составляющие врачебную тайну), связанных с оказанием страховой услуги, государственными органами, федеральными государственными учреждениями МСЭ и Фондом ОМС, медицинскими и иными учреждениями (организациями, государственными органами), в том числе: любые медицинские документы и/или их заверенные копии (результаты лабораторных и инструментальных исследований, результаты лечения, прогноз по заболеванию и т.д.), как в связи с оценкой степени страхового риска, так и в связи с событиями, имеющими признаки страхового случая. Данное согласие имеет силу и действует с даты заключения Страхового полиса до истечения 6 (шести) лет после прекращения обязательств по Страховому полису;
- на использование его персональных данных в целях продвижения Страховщиком своих услуг на рынке путем осуществления прямых контактов с помощью средств связи, а также для осуществления информационного сопровождения в связи с оказанием страховой услуги (в т. ч. для СМС-рассылок).
- дает свое согласие на использование Страховщиком факсимильного воспроизведения подписи и печати Страховщика на Страховом полисе с помощью средств механического или иного копирования, электронно-цифровой подписи либо иного аналога собственноручной подписи.
Перечень действий с персональными данными и общее описание способов их обработки: сбор, запись, систематизация, накопление, хранение, уточнение (обновление, изменение), извлечение, использование, передача (предоставление, доступ), обезличивание, блокирование, удаление, уничтожение персональных данных; персональные данные будут обрабатываться с использованием различных сочетаний средств автоматизации и неавтоматизированных средств обработки (смешанная обработка). Перечень обрабатываемых персональных данных: фамилия, имя, отчество, дата и место рождения, гражданство, реквизиты документа, удостоверяющего личность (серия, номер, кем и когда выдан, код подразделения и ]]></text>
			</staticText>
			<staticText>
				<reportElement x="280" y="10" width="271" height="750" uuid="07c51402-7750-4473-8469-23d0d2f0c52f">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[др.), ИНН (при наличии),контактная информация (адрес места жительства, фактический адрес и др.), платежные реквизиты, иные персональные данные, содержащиеся в документах, которые были оформлены при заключении Договора страхования или переданы/будут переданы Страховщику в связи с оказанием страховой услуги, будут получены в ходе рассмотрения страхового события и/или сообщены Страховщику устно. Согласие действует в течение срока действия Договора страхования и еще шесть лет после его прекращения. Согласие может быть отозвано посредством направления письменного уведомления Страховщику.
8.3. Страхователь обязуется предоставить Страховщику и Сервисной компании любую медицинскую информацию: об обращениях за медицинской помощью, состоянии его здоровья и диагнозе, иные сведения, полученные при медицинском обследовании и лечении. Страхователь дает свое согласие на предоставление Страховщику любыми лечебно-профилактическими или особого типа учреждениями здравоохранения и /или частными врачами, у которых Страхователь проходил лечение, находится или находился под наблюдением, сведений о факте обращения Страхователя за оказанием медицинской помощи, состоянии его здоровья и диагнозе, иные сведения, полученные при медицинском обследовании и лечении. Страхователь уполномочивает Страховщика и Сервисной компании на получение сведений, составляющих врачебную тайну, в любом виде и в любой форме (в т. ч. на получение справок, актов, заключений, результатов обследования). Страхователь дает свое согласие на предоставление Страховщику любыми лечебно-профилактическими или особого типа учреждениями здравоохранения и /или частными врачами, у которых Страхователь проходил лечение, находится или находился под наблюдением, сведений о факте обращения Страхователя за оказанием медицинской помощи, состоянии его здоровья и диагнозе, иные сведения, полученные при медицинском обследовании и лечении. Страхователь уполномочивает Страховщика и Сервисной компании на получение сведений, составляющих врачебную тайну, в любом виде и в любой форме (в т. ч. на получение справок, актов, заключений, результатов обследования).
<style isBold="true">8.4. Заключая Договор страхования и оплачивая страховую премию, Страхователь подтверждает, что</style>:
- возраст Страхователя (Застрахованного лица) на дату акцепта настоящего Страхового полиса не менее 55 (пятидесяти пяти) и не более 64 (шестидесяти четырех) лет;
- Страхователь (Застрахованное лицо) является дееспособным физическим лицом;]]></text>
			</staticText>
			<textField>
				<reportElement x="455" y="758" width="100" height="14" uuid="8aac8af9-a45d-405c-a42e-1651055264a0"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[7]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement x="0" y="10" width="271" height="750" uuid="06e9920c-ffe1-40e3-9d5f-a1b9d3acf214">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[- Страхователь (Застрахованное лицо) не являлся/не является инвалидом I - II группы, ребенком инвалидом, в отношении него не принималось врачебное решение о направлении для установления ему группы инвалидности, не является лицом, имеющим действующее направление на медико-социальную экспертизу (МСЭ), и МСЭ не рассматривает документы на установление ему группы инвалидности;
- Страхователь (Застрахованное лицо) не нуждается в постоянном уходе в соответствии с медицинским заключением;
- Страхователь (Застрахованное лицо) не имеет заболевания и (или) функциональные нарушения из нижеуказанных (по которым в течение жизни устанавливался диагноз, проводилось и(или) проводится лечение, либо в отношении которых лицо находилось (находится) под наблюдением врача-специалиста): СПИД или ВИЧ-инфекция, злокачественные новообразования, в том числе но не ограничиваясь: рак in situ, лейкозы, миелома, лимфомы, болезнь Ходжкина; любые виды опухолей или кист головного мозга и/или спинного мозга, пищевод Барретта, дисплазия шейки матки, доброкачественная гиперплазия предстательной железы, полицитемия, фиброаденома молочной железы; язва желудка, болезнь Крона, неспецифический язвенный колит, хронические гепатиты вирусной и невирусной природы, циррозы печени любой этиологии, алкогольная болезнь печени, хронический панкреатит, хроническая дыхательная недостаточность II-III степени; хроническая обструктивная болезнь легких (ХОБЛ); первичный иммунодефицит, амилоидоз, крипторхизм, синдром Дауна, туберкулез, сахарный диабет, хроническая почечная недостаточность любой стадии;
- Страхователю (Застрахованному лицу) не устанавливался диагноз эпилепсии, слабоумия, психических заболеваний и/или расстройств поведения не состоял/не состоит на учете в психоневрологическом и/или наркологическом диспансере;
- Страхователь (Застрахованное лицо) не употребляет наркотические, токсические и/или сильнодействующие вещества с целью лечения или по иной причине, ему не устанавливался диагноз алкоголизм, наркомания, токсикомания; не состоит по любой из указанных причин на диспансерном учете;
- Страхователь (Застрахованное лицо) не переносил хирургических операции по трансплантации органа или его части (в том числе, но не ограничиваясь, костного мозга), трепанации черепа;
- у Страхователя (Застрахованного лица) за 6 месяцев, предшествующих заключению Договора страхования, не отмечалась нецеленаправленная резкая потеря веса (10 кг и более);]]></text>
			</staticText>
			<staticText>
				<reportElement x="285" y="10" width="271" height="750" uuid="9bf16fb7-95ea-4ff1-a127-ba2da5245f3b">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
				</textElement>
				<text><![CDATA[- У Страхователя (Застрахованного лица) индекс массы тела (отношение массы тела (кг) к квадрату роста (м)) находится в диапазоне не менее 20 и не более 35;
- У Страхователя (Застрахованного лица) не отмечалась патологическая кровопотеря из любых источников;
 - Страхователь (Застрахованное лицо) не имеет отклонений от установленных лабораторных норм показателей онкомаркеров (если такие исследования проводились);
- Страхователь (Застрахованное лицо) не подвергался (подвергается) воздействию радиации, токсических или канцерогенных веществ при выполнении своих профессиональных обязанностей;
- Страхователь (Застрахованное лицо) не выкуривает более 20 сигарет в день и/ или не курит ежедневно электронные сигареты, сигары, трубки, кальян/наргиле, или другие никотиновые заменители; не употребляет алкоголь более чем 5 единиц в день (одна единица = 300 мл пива или 100 мл вина или 20 мл спирта);
- Страхователь (Застрахованное лицо) и/или его ближайшие родственники (отец, мать, братья, сестры) в возрасте до 60 лет не болели онкологическими заболеваниями и / или не умирали от рака (в случае, если этот факт был известен Страхователю (Застрахованному лицу) до заключения Договора страхования).
<style isBold="true">9. ЗАКЛЮЧИТЕЛЬНЫЕ ПОЛОЖЕНИЯ</style>
9.1. К Страховому полису прилагаются и являются неотъемлемой частью Договора страхования Условия страхования №1-МС «Выбери здоровье».
9.2. В случае спорных ситуаций положения настоящего Страхового полиса имеют приоритетную силу по отношению к Условиям страхования. Во всем, что не предусмотрено положениями настоящего Страхового полиса, стороны руководствуются Условиями страхования.
9.3. Никакие отметки (а также дополнения, исправления и т. п.), сделанные на Договоре страхования (Страховой полис и приложения к нему) от руки, не имеют юридической силы, если их верность не засвидетельствована собственноручными подписями Сторон и оригинальным оттиском печати Страховщика.
9.4. Заключая Договор страхования и оплачивая страховую премию, Страхователь подтверждает, что Страховой полис и Условия страхования №1-МС «Выбери здоровье», утвержденные приказом Генерального директора Страховщика от «25» сентября 2018г. № 79, Страхователем приняты. Условия страхования вручены Страхователю и получены им.
ПРИЛОЖЕНИЕ: Условия страхования №1-МС «Выбери здоровье».]]></text>
			</staticText>
			<textField>
				<reportElement x="455" y="758" width="100" height="14" uuid="175b0708-45b8-429d-b216-b8616f823fef"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[8]]></textFieldExpression>
			</textField>
		</band>
		<band height="772">
			<staticText>
				<reportElement mode="Opaque" x="0" y="20" width="271" height="13" backcolor="#C0C0C0" uuid="87b51742-7acf-4995-b97f-c2b64685b605">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
				</reportElement>
				<textElement textAlignment="Left" verticalAlignment="Middle">
					<font fontName="Arial" size="11" isBold="true"/>
					<paragraph leftIndent="5"/>
				</textElement>
				<text><![CDATA[СТРАХОВЩИК]]></text>
			</staticText>
			<staticText>
				<reportElement x="0" y="33" width="271" height="107" uuid="02d7d3bb-e325-4b9b-b4bd-c3f24e5b6981">
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
					<property name="com.jaspersoft.studio.unit.leftIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.rightIndent" value="px"/>
					<property name="com.jaspersoft.studio.unit.tabStopWidth" value="px"/>
				</reportElement>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Justified" markup="styled">
					<font fontName="Arial" size="11" isBold="false"/>
					<paragraph leftIndent="6" rightIndent="0" tabStopWidth="25"/>
				</textElement>
				<text><![CDATA[Генеральный директор
ОО «РСХБ-Страхование жизни»

__________________________________
Мальков Максим Владимирович/
Аналог собственноручной подписи и печати
м.п.]]></text>
			</staticText>
			<textField>
				<reportElement x="455" y="758" width="100" height="14" uuid="81097436-c56b-48d2-ae54-6834b50f8a68"/>
				<textElement textAlignment="Right">
					<font fontName="Arial" size="11"/>
				</textElement>
				<textFieldExpression><![CDATA[9]]></textFieldExpression>
			</textField>
			<image>
				<reportElement x="32" y="67" width="121" height="121" uuid="910b8e4c-1808-4617-82a2-8f61abef3af2">
					<printWhenExpression><![CDATA[$P{stamp}]]></printWhenExpression>
				</reportElement>
				<imageExpression><![CDATA["templates/stamp.png"]]></imageExpression>
			</image>
			<image>
				<reportElement x="40" y="52" width="79" height="31" uuid="fe1bd2e0-31b4-4dec-8bb8-b7ea2f6c8d9a">
					<printWhenExpression><![CDATA[$P{sign}]]></printWhenExpression>
				</reportElement>
				<imageExpression><![CDATA["templates/sign.png"]]></imageExpression>
			</image>
		</band>
	</detail>
	<pageFooter>
		<band height="30"/>
	</pageFooter>
</jasperReport>
'::text, 'utf8'))
ON CONFLICT (type)
DO NOTHING;

insert into common_dict.PRINT_TEMPLATES(TYPE, COPIES_NUMBER, FILE_NAME, CONTENT)
values ('4f2434ae-5eb1-4b10-8f83-2cbcddfdbf98', 5, 'УСЛОВИЯ СТРАХОВАНИЯ №2-МС «ВЫБЕРИ ЗДОРОВЬЕ ПЛЮС»', convert_to('<?xml version="1.0" encoding="UTF-8"?>
<!-- Created with Jaspersoft Studio version 6.6.0.final using JasperReports Library version 6.6.0  -->
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="RshbInsuranceChooseHealth" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" isFloatColumnFooter="true" uuid="4eedbb89-b4f6-4469-9ab6-f642a1688cf7">
    <property name="com.jaspersoft.studio.data.defaultdataadapter" value="One Empty Record"/>
    <subDataset name="tableDataset" uuid="f13e6d36-5148-4ecc-bbe3-3035def80980">
        <queryString>
            <![CDATA[]]>
        </queryString>
    </subDataset>
    <parameter name="contractNumber" class="java.lang.String"/>
    <parameter name="surname" class="java.lang.String"/>
    <parameter name="name" class="java.lang.String"/>
    <parameter name="patronymic" class="java.lang.String"/>
    <parameter name="birthDate" class="java.lang.String"/>
    <parameter name="contractStartDate" class="java.lang.String"/>
    <parameter name="contractSignDate" class="java.lang.String"/>
    <parameter name="phoneNumber" class="java.lang.String"/>
    <parameter name="email" class="java.lang.String">
        <defaultValueExpression><![CDATA[""]]></defaultValueExpression>
    </parameter>
    <parameter name="isTestInstance" class="java.lang.Boolean" isForPrompting="false">
        <parameterDescription><![CDATA[Инстанс приложения запущен на тестовом стенде]]></parameterDescription>
        <defaultValueExpression><![CDATA[true]]></defaultValueExpression>
    </parameter>
    <queryString>
        <![CDATA[]]>
    </queryString>
    <background>
        <band height="772">
            <image>
                <reportElement isPrintRepeatedValues="false" x="3" y="0" width="550" height="758" uuid="ea763663-ef82-4cb6-a25f-d7c500e2fa1a">
                    <printWhenExpression><![CDATA[$P{isTestInstance} == true]]></printWhenExpression>
                </reportElement>
                <imageExpression><![CDATA[net.sf.jasperreports.renderers.BatikRenderer.getInstanceFromText("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"765\" height=\"990\"><text x=\"60\" y=\"40\" transform=\"matrix(.6,-.82,.83,.6,30,1055)\" style=\"font-size:220px;font-weight:bold;fill:#d8d8d8\">ОБРАЗЕЦ</text></svg>")]]></imageExpression>
            </image>
        </band>
    </background>
    <detail>
        <band height="772">
            <staticText>
                <reportElement x="2" y="100" width="260" height="658" uuid="4a2eb15b-0af0-44dd-82e1-37fc074eadc9">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[1. ОБЩИЕ ПОЛОЖЕНИЯ
1.1. Настоящие Условия страхования №2-МС «Выбери здоровье Плюс» (далее - Условия) разработаны на основании Правил страхования на случай критических заболеваний с лечением ООО «РСХБ-Страхование жизни», утверждённых приказом Генерального директора Страховщика от «25» сентября 2018г. № 79. На основании настоящих Условий, в соответствии с выданной органом страхового надзора лицензией на осуществление страхования, и руководствуясь действующим законодательством Российской Федерации ООО «РСХБ-Страхование жизни» осуществляет заключение Договоров страхования, по которым осуществляется страхование имущественных интересов, связанных с оплатой организации и оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг вследствие расстройства здоровья Застрахованного лица в результате событий, предусмотренных Договором страхования из числа поименованных в разделе 3 Условий (далее – Договоры страхования).
1.2. Информация о Страховщике и условиях страхования размещена на официальном сайте Страховщика - http://www.rshbins-life.ru.
1.3. Положения, содержащиеся в настоящих Условиях и не включенные в текст Договора страхования, обязательны для Страхователя (Выгодоприобретателя), если в Договоре страхования прямо указывается на применение таких Условий или сами Условия приложены к нему.
1.4. Нижеперечисленные термины и определения, используемые в настоящих Условиях, имеют следующее значение:
1.4.1. Страховщик – Общество с ограниченной ответственностью «РСХБ-Страхование жизни» (ООО «РСХБ-Страхование жизни»), юридическое лицо, созданное и действующее в соответствии с законодательством Российской Федерации на основании полученной в установленном порядке лицензии.
1.4.2. Страхователь – дееспособное физическое лицо, заключившее со Страховщиком Договор страхования.
1.4.3. Выгодоприобретатель – Застрахованное лицо.]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="1b9dfc32-5d14-4246-8770-baabcee69f67"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[1]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="246" y="1" width="310" height="30" uuid="96d3d450-6d57-4e95-ae36-735678d3cb47">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Right" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[Приложение к Договору страхования
 «Выбери здоровье Плюс»]]></text>
            </staticText>
            <textField isStretchWithOverflow="true">
                <reportElement stretchType="ContainerBottom" x="91" y="33" width="464" height="30" uuid="f631d05d-15f8-40d7-bc5f-95912ad5bbe2">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Right" verticalAlignment="Middle" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <textFieldExpression><![CDATA["№ " +$P{contractNumber} +
"\nот "+ $P{contractSignDate}]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="31" y="64" width="500" height="30" uuid="4ef402f3-cf76-472b-93ee-8117cf2eb3bb">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Center" verticalAlignment="Middle" markup="styled">
                    <font fontName="Arial" size="11" isBold="true"/>
                </textElement>
                <text><![CDATA[УСЛОВИЯ СТРАХОВАНИЯ №2-МС «ВЫБЕРИ ЗДОРОВЬЕ ПЛЮС»]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="100" width="260" height="658" uuid="f4446d0f-e9ac-4546-8864-e7181f5f7047">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[1.4.4. Застрахованное лицо (Застрахованный) - названное в Договоре страхования физическое лицо, в отношении здоровья которого заключен Договор страхования. В рамках настоящих Условий Застрахованным лицом является Страхователь, при одновременном соблюдении следующих условий:
1.4.4.1. Возраст Страхователя (Застрахованного лица) не менее 18 (восемнадцати) лет и не более 54 (пятидесяти четырех) лет;
1.4.4.2. Страхователь (Застрахованное лицо) не являлся / не является инвалидом I или II группы, ребенком-инвалидом, в отношении него не принималось врачебное решение о направлении для установления ему группы инвалидности, не является лицом, имеющим действующее направление на медико-социальную экспертизу (МСЭ), и МСЭ не рассматривает документы на установление ему группы инвалидности;
1.4.4.3. Страхователь (Застрахованное лицо) не нуждается в постоянном уходе в соответствии с медицинским заключением;
1.4.4.4. Страхователь (Застрахованное лицо) не имеет заболевания и(или) функциональные нарушения из нижеуказанных (по которым в течение жизни устанавливался диагноз, проводилось и(или) проводится лечение, либо в отношении которых лицо находилось (находится) под наблюдением врача-специалиста): 	злокачественные новообразования, в том числе, но не ограничиваясь:
1.4.4.4.1.	 Рак in situ, лейкозы, миелома, лимфомы, болезнь Ходжкина; любые виды опухолей или кист головного мозга и/или спинного мозга, пищевод Барретта, дисплазия шейки матки, доброкачественная гиперплазия предстательной железы, полицитемия, фиброаденома молочной железы; язва желудка, болезнь Крона, неспецифический язвенный колит, хронические гепатиты вирусной и невирусной природы, циррозы печени любой этиологии, алкогольная болезнь печени, хронический панкреатит;
1.4.4.4.2.	 Аутоиммунные заболевания (ревматизм, системная красная волчанка, болезнь Вагнера, склеродермия); хроническая дыхательная недостаточность II-III степени; хроническая обструктивная болезнь легких (ХОБЛ); первичный иммунодефицит, ]]></text>
            </staticText>
        </band>
        <band height="772">
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="92e58189-5c2f-4cbe-8071-34ec89f66f10"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[2]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="c9880d7c-eac2-495c-a7ca-59dedd065314">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[амилоидоз, крипторхизм, синдром Дауна, туберкулез, сахарный диабет, хроническая почечная недостаточность любой стадии;
1.4.4.4.3.	Кардиомиопатия, перенесенный в прошлом инфаркт миокарда, ишемическая болезнь сердца/стенокардия, врожденные пороки сердца; Страхователь (Застрахованное лицо) не переносил хирургическиеинсультов (нарушений мозгового кровообращения);
1.4.4.5.	Страхователю (Застрахованному лицу) не устанавливался диагноз эпилепсии, слабоумия, психических заболеваний и/или расстройств поведения, не состоял/не состоит на учете в психоневрологическом и/или наркологическом диспансере;
1.4.4.6.	 Страхователь (Застрахованное лицо) не употребляет наркотические, токсические и/или сильнодействующие вещества с целью лечения или по иной причине, ему не устанавливался диагноз алкоголизм, наркомания, токсикомания; не состоит по любой из указанных причин на диспансерном учете;
1.4.4.7. Страхователь (Застрахованное лицо) не переносил хирургических операции: по трансплантации органа или его части (в том числе, но не ограничиваясь, костного мозга), операций на сердце и его сосудах, аорте, операций шунтирования, стенирования, трепанации черепа;
1.4.4.8. У Страхователя (Застрахованного лица) за 6 месяцев, предшествующих заключению Договора страхования, не отмечалась нецеленаправленная резкая потеря веса (10 кг и более);
1.4.4.9. У Страхователя (Застрахованного лица) индекс массы тела (отношение массы тела (кг) к квадрату роста (м)) находится в диапазоне не менее 20 и не более 35;
1.4.4.10 У Страхователя (Застрахованного лица) не отмечалась патологическая кровопотеря из любых источников;
1.4.4.11. Страхователь (Застрахованное лицо) не имеет отклонений от установленных лабораторных норм показателей онкомаркеров (если такие исследования проводились);
1.4.4.12. Страхователь (Застрахованное лицо) не подвергался (подвергается) воздействию радиации, токсических или канцерогенных веществ при выполнении своих профессиональных обязанностей;
1.4.4.13. Страхователь (Застрахованное лицо) не выкуривает более 20 сигарет в день и/ или не курит ежедневно электронные сигареты, сигары, трубки, кальян/наргиле, или другие никотиновые заменители; не употребляет алкоголь более чем 5 единиц в день (одна единица = 300 мл пива или]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="db54669b-edbd-408b-b865-64c40db4da6c">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[100 мл вина или 20 мл спирта);
1.4.4.11. Страхователь (Застрахованное лицо) и/или его ближайшие родственники (отец, мать, братья, сестры) в возрасте до 60 лет не болели онкологическими заболеваниями и / или не умирали от рака (в случае, если этот факт был известен Страхователю (Застрахованному лицу) до заключения Договора страхования).
1.5. Амбулаторные условия - условия, не предусматривающие круглосуточного медицинского наблюдения и лечения, в том числе на дому при вызове медицинского работника.
1.6. Больница (а также - сертифицированное медицинское учреждение / организация, лечебно-профилактическое учреждение) – юридическое лицо, независимо от организационно-правовой формы и формы собственности, осуществляющее медицинскую деятельность на основании лицензии (иного разрешения), выданной в соответствии с действующим законодательством страны оказания услуг (сертифицированное медицинское учреждение / организация, лечебно-профилактическое учреждение), осуществляющее медицинское лечение заболеваний или травм, оснащенное материально-техническими средствами и укомплектованное квалифицированным персоналом для выполнения мер диагностического и хирургического вмешательства, в котором круглосуточно присутствуют врачи и медицинский персонал.
1.7. Врач (а также-сертифицированный (квалифицированный) медицинский специалист) – специалист с оконченным высшим медицинским образованием, на законных основаниях и в соответствии с имеющимися сертификатами, квалификацией допущенный к осуществлению медицинской практики соответствующей специализации.
1.8. Период ожидания – период времени, предусмотренный Договором страхования, с момента вступления Договора страхования в силу и до момента начала периода страхования, обусловленного Договором страхования, в течение которого обращения Застрахованного лица за организацией и/или оказанием медицинских услуг (из числа событий, предусмотренных Договором страхования) не являются страховым случаем, и Страховщик не несет обязательств по страховой выплате.
1.9. Декларация о состоянии здоровья (далее – Декларация) – декларация, анкета, содержащая информацию о состоянии здоровья Застрахованного лица до момента заключения Договора страхования. Обстоятельства, изложенные в Декларации о состоянии]]></text>
            </staticText>
        </band>
        <band height="772">
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="64a90aba-1898-4b07-993b-0ceb93bcc96d"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[3]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="61f662b2-a073-4010-90be-8be8b9378bea">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[здоровья, имеют существенное значение для определения вероятности наступления страхового случая, а также для согласования сторонами условий Договора страхования о Застрахованном лице. Заключая Договор страхования и/или подписывая Декларацию Страхователь подтверждает соответствие состояния своего здоровья сведениям, содержащимся в Декларации.
1.10. Дневной стационар – условия, предусматривающие медицинское наблюдение и лечение в дневное время, но не требующие круглосуточного медицинского наблюдения и лечения. Дневной стационар обеспечивает структурное подразделение лечебно-профилактического учреждения, предназначен для проведения профилактических, диагностических, лечебных и реабилитационных мероприятий больным, не требующим круглосуточного медицинского наблюдения, с применением современных медицинских технологий в соответствии со стандартами и протоколами ведения больных.
1.11. Первичное диагностирование (первичная постановка диагноза) – факт установления Врачом впервые в жизни Застрахованному лицу диагноза заболевания. Первичное диагностирование, проведенное, в том числе, в период страхования (по истечении периода ожидания), включающее комплекс медицинских вмешательств, направленных на распознавание состояний или установление факта наличия либо отсутствия заболеваний, осуществляемых посредством сбора и анализа жалоб пациента, данных его анамнеза и осмотра, проведения лабораторных, инструментальных, и иных исследований в целях определения диагноза, выбора мероприятий по лечению пациента и (или) контроля за осуществлением этих мероприятий, не относится к событиям, на случай наступления которых осуществлено страхование, проводится Застрахованным лицом самостоятельно и за свой счет, т.е. расходы на первичное диагностирование не включаются в состав страховой выплаты вне зависимости от последующего признания / не признания события страховым случаем.
1.12. Период страхования - период времени, в течение которого наступление события, предусмотренного Договором страхования (страхового случая), влечет за собой возникновение обязанности Страховщика по осуществлению страховой выплаты. Период страхования начинается со дня, следующего за днем окончания периода ожидания (если период ожидания установлен) и действует до дня окончания срока действия Договора страхования включительно.
]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="9224301d-a7f2-4393-bc2e-88864d63333d">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[1.13. Срок действия Договора страхования – период времени в течение которого действует Договор страхования.
1.14. Психохирургия - лечение психических расстройств с помощью операций на головном мозге.
1.15. Стационар, стационарные условия - условия, обеспечивающие круглосуточное медицинское наблюдение и лечение.
1.16. Сервисная компания – специализированная организация, которая по поручению Страховщика обеспечивает организацию медицинских и иных услуг, предусмотренных Условиями страхования и Договором страхования, в Больницах или иных организациях.
1.17. Профессиональный спорт – часть спорта, направленная на организацию и проведение спортивных соревнований, за участие в которых и подготовку к которым в качестве своей основной деятельности спортсмены получают вознаграждение от организаторов таких соревнований и (или) заработную плату.
2. ОБЪЕКТ СТРАХОВАНИЯ
2.1. Объектом страхования являются не противоречащие законодательству Российской Федерации имущественные интересы, связанные с оплатой организации и оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг вследствие расстройства здоровья или состояния Застрахованного лица, требующих организации и оказания таких услуг, а также проведения профилактических мероприятий, снижающих степень опасных для жизни или здоровья Застрахованного лица угроз и (или) устраняющих их.

3. СТРАХОВОЙ РИСК.
СТРАХОВОЙ СЛУЧАЙ
3.1. Страховым риском является предполагаемое событие, на случай наступления которого проводится страхование. Событие, рассматриваемое в качестве страхового риска, должно обладать признаками вероятности и случайности его наступления.
Страховым риском, согласно Условиям страхования, является риск возникновения в период страхования обстоятельств, требующих оказания медицинских и иных услуг Застрахованному лицу в связи с:
3.1.1. Злокачественным новообразованием, а именно: злокачественным новообразованием, характеризующимся неконтролируемым ростом и распространением злокачественных клеток, проникающих в ткань различного гистологического типа, и относящимся к кодам C00-C43, C45-C97 по МКБ-10, за исключением: С44 – эпителиальных опухолей кожи (включая базалиому, плоскоклеточный рак), C91.1]]></text>
            </staticText>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="ecc020e8-b93a-4a15-9bde-5599dbe300fa">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.y" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[ – хронического лимфоцитарного В – клеточного лейкоза, а также возникновениея новообразования при наличии у Застрахованного лица ВИЧ-инфекции или СПИДа.
Страховым случаем, с учетом всех положений, определений и исключений из страхования, предусмотренных Условиями страхования, является документально подтвержденное обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим разделом Условий, при одновременном наличии следующих условий: диагноз злокачественного новообразования подтвержден гистологическими или (в случае системных онкологических заболеваний) цитологическими исследованиями и заключением врача - онколога; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу впервые; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу в течение Периода страхования, по истечении периода ожидания; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, предусмотренных пунктом 10.1.2. Условий в течение Периода страхования.
3.1.2. Трансплантацией костного мозга, а именно: плановым медицинским мероприятием, удовлетворяющим следующим условиям:
- событие признано страховым случаем по Договору страхования;
- в наличии донор, подходящий для трансплантации Застрахованному лицу;
- оказание услуг осуществляется в больнице, подтвердившей возможность оказания услуги, согласованной Сервисной компанией;
- не является экспериментальной процедурой и/или процедурой, выполняемой в научно-исследовательских целях;
- проводится в соответствии с законодательством Российской Федерации.
Страховым случаем, с учетом всех положений, определений и исключений из страхования, предусмотренных Условиями страхования, является документально подтвержденное обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим пунктом, при одновременном наличии следующих условий: диагноз лимфомы или лейкоза установлен в течение срока действия]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="8c240ce7-55c2-4c55-be46-8d26d37ce2c6">
                    <property name="com.jaspersoft.studio.unit.y" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[Договора страхования и подтвержден гистологически; трансплантация костного мозга назначена лечащим врачом при лечении по поводу заболевания, диагностированного впервые в течение Периода страхования, по истечении периода ожидания; Сервисной компанией получено подтверждение необходимости проведения трансплантации не менее чем двумя Врачами-специалистами в соответствующей области медицины в соответствии с принятыми медицинскими критериями; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, предусмотренных пунктом 10.1.2. Условий в течение Периода страхования.
3.1.3. Аортокоронарным шунтированием, а именно: хирургической операцией по рекомендации кардиолога, направленной на восстановление кровотока в артериях сердца путём обхода места сужения (закупорки) одной или нескольких коронарных артерий с помощью обходных трансплантатов (шунтов), признанной страховым случаем. При этом любое коронарное заболевание, лечение которого осуществляется с помощью метода, не являющегося аортокоронарным шунтированием, например, хирургические операции по пластике сосудов, стентирование, - страхованием не покрываются.
Страховым случаем, с учетом всех положений, определений и исключений из страхования, предусмотренных Условиями страхования, является документально подтвержденное обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим пунктом, при одновременном наличии следующих условий: Аортокоронарное шунтирование назначено лечащим врачом при лечении по поводу заболевания, диагностированного впервые в течение Периода страхования, по истечении периода ожидания; необходимость операции возникла в Период страхования и подтверждена результатами коронарной ангиографии; Сервисной компанией получено подтверждение необходимости хирургического вмешательства, согласно мнению сертифицированного медицинского специалиста из сертифицированного медицинского учреждения; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, предусмотренных пунктом 10.1.2. Условий в течение Периода страхования.
3.1.4. Хирургической операцией по замене / ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="2b6217e7-e3d5-4674-9bfb-57a9ceed5a59"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[4]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="295" y="10" width="260" height="740" uuid="d1b4258b-699c-45a7-8f3b-3d6d83519f04">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[лечение и обратно.
4.1.2. Оплата билета эконом класса для Застрахованного лица, а также при наличии медицинских показаний – оплата медицинского сопровождения и дополнительных мест и оборудования в самолете (ином средстве транспорта) при регулярном рейсе.
4.1.3. Проживание Застрахованного лица: подлежит оплате проживание в отеле (3 или 4 звезды) или эквивалентного стандартного номера в апартаментах с оплатой услуг, включенных в стоимость номера для Застрахованного лица. Не подлежат оплате дополнительные услуги, не включённые в стоимость номера.
4.1.4. Услуги по репатриации в случае смерти Застрахованного лица во время поездки: транспортировка останков Застрахованного лица до места постоянного проживания Застрахованного лица.
4.1.5. Лечение на территории Российской Федерации, проводимое по поводу страхового случая:
4.1.5.1. Медицинская помощь в амбулаторных условиях, в условиях дневного стационара, в стационарных условиях, в том числе:
а) осмотры врачами, в том числе врачами-специалистами;
б) диагностические медицинские вмешательства, выполняемые медицинскими организациями по выбору Сервисной компании на территории страны оказания услуг, в том числе лабораторные исследования, визуализирующие исследования, эндоскопические исследования, функциональная диагностика;
в) лечебные медицинские вмешательства в пределах страховой суммы (кроме имплантаций и  трансплантации, которые производятся только в случаях, прямо указанных в Условиях и в объеме, указанном в Условиях), включающие хирургическое лечение, химиотерапию, лучевую терапию, иные методы лечения, научно обоснованные, разрешенные к применению на территории страны оказания услуг и применяемые в рамках оказания медицинской помощи медицинскими организациями по выбору Сервисной компании, на территории страны оказания услуг;
г) трансплантация костного мозга, выполняемая медицинской организацией, имеющей соответствующую лицензию, по выбору Сервисной компании;
д) имплантация, необходимая в целях реконструктивного лечения груди после проведения мастэктомии, включая стоимость имплантатов. Договором страхования может быть установлен лимит расходов на один]]></text>
            </staticText>
            <staticText>
                <reportElement x="2" y="10" width="260" height="700" uuid="b29634ef-c772-4979-9915-889e994378dd">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[восстановлению сердечных клапанов, а именно: хирургической операцией на сердечных клапанах, рекомендованной лечащим врачом - кардиологом, направленной на замену или лечение одного или нескольких сердечных клапанов, признанной страховым случаем. При этом лечение поражения сердечных клапанов в результате эндокардита, вызванного венерическим заболеванием, страхованием не покрывается.
Страховым случаем, с учетом всех положений, определений и исключений из страхования, предусмотренных Условиями страхования, является документально подтвержденное обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим пунктом, при одновременном наличии следующих условий: хирургическая операция на сердечных клапанах назначена  лечащим врачом при лечении по поводу заболевания, диагностированного впервые в течение Периода страхования, по истечении периода ожидания; необходимость операции (лечения) обусловлена развитием стеноза / недостаточности или комбинацией этих состояний и возникла в Период страхования; Сервисной компанией получено подтверждение необходимости хирургического вмешательства, согласно мнению сертифицированного медицинского специалиста из сертифицированного медицинского учреждения; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, предусмотренных пунктом 10.1.2. Условий в течение Периода страхования.
4. ОБЪЕМ СТРАХОВОЙ ОТВЕТСТВЕННОСТИ
4.1. При наступлении страхового случая, предусмотренного Условиями и Договором страхования, Страховщик оплачивает организацию и оказание следующих медицинских и иных услуг в пределах установленной Договором страхования Страховой суммы:
4.1.1. Медицинская транспортировка (медицинская эвакуация) Застрахованного лица к поставщику медицинских услуг и/или между медицинскими организациями и возвращение обратно, включая трансфер автомобилем скорой медицинской помощи или на такси от места жительства до аэропорта (транспортного узла<sup>1</sup>), из аэропорта (транспортного узла) до отеля (апартаментов) и/или до медицинской организации, в которой будет проводиться]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="cb35a8ec-7b4c-4ac5-92f4-701cb21cd3fc"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[5]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="8" y="710" width="254" height="40" uuid="4746567a-9e1d-4c80-aa72-2079e0aa6a97">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[_______________________
<sup>1</sup> При отсутствии регулярных авиаперевозок
]]></text>
            </staticText>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="740" uuid="b259296b-b4ae-4ddc-a57d-a5adeb4c3cc9">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[страховой случай;
е) лекарственные средства и расходные материалы, применяемые при лечении в стационарных условиях и в условиях дневного стационара.
4.1.5.2. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 30 (Тридцати) календарных дней после окончания срока действия Договора страхования, а также расходы в соответствии с п. 4.1.2. и 4.1.4. Условий.
4.1.5.3. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, при наличии состояния, угрожающего жизни Застрахованного лица (прекращение оказываемой медицинской помощи может повлечь смерть Застрахованного лица), оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 90 (девяноста) календарных дней после окончания срока действия Договора страхования, а также расходы в соответствии с п. 4.1.2. и 4.1.4. Условий.
4.2. Страховщик осуществляет оплату организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица (в том числе, но не ограничиваясь этим, при экстренной медицинской транспортировке Застрахованного лица), только в случае наличия медицинских показаний к сопровождению Застрахованного лица, определенных Врачом. Оплата организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица осуществляется в пределах лимитов (страховой суммы), установленных Договором страхования.
5. ИСКЛЮЧЕНИЯ
5.1. Если иное не предусмотрено Договором страхования, не являются страховыми случаями (не покрывается страхованием), и страховая выплата не производится по следующим событиям/заболеваниям и состояниям/расходам/услугам:
5.1.1. Услуги и расходы в связи с первичным диагностированием у Застрахованного лица заболевания.
5.1.2. Услуги и расходы, связанные с событиями  / случаями, прямо не]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="740" uuid="e429e720-e2a6-4bca-81e7-5bb04545508f">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[указанными в Договоре страхования как страховой случай.
5.1.3. Услуги и расходы, прямо не указанные в Договоре страхования как услуги и расходы, подлежащие организации и оплате.
5.1.4. Услуги и расходы по заболеваниям/состояниям, указанным в Договоре страхования, но возникшим до окончания периода ожидания или после истечения срока действия Договора страхования.
5.1.5. Услуги и расходы, оказанные / понесенные до окончания периода ожидания или после истечения срока действия Договора страхования, за исключением указанных в п.п. 4.1.5.2, 4.1.5.3. Условий.
5.1.6. Услуги и расходы, необходимость которых возникла в связи с нарушением Застрахованным лицом рекомендаций лечащего врача и/или правил и распорядка медицинского учреждения, в котором Застрахованное лицо проходит лечение.
5.1.7. Психохирургия.
5.1.8. Хирургические операции по трансплантации органов или любого вида трансплантации костного мозга в следующих случаях:
5.1.8.1. если трансплантация таких органов и (или) их долей не предусмотрена Договором страхования;
5.1.8.2. если потребность в трансплантации органов возникла вследствие алкогольной болезни печени;
5.1.8.3. если трансплантация органов является аутологичной (реципиент трансплантата является донором для самого себя), за исключением трансплантации костного мозга;
5.1.8.4. если при трансплантации органов Застрахованное лицо является донором по отношению к третьему лицу;
5.1.8.5. если трансплантация органов включает в себя лечение стволовыми клетками (кроме трансплантации костного мозга).
5.1.9. Медицинские и иные услуги, выполняемые в эстетических и/или косметических целях, включая, но не ограничиваясь: операции по коррекции зрения (миопии, астигматизма, близорукости); бариатрические операции, включая, но не ограничиваясь операциями, направленными на уменьшение объема желудка или кишечника, кроме операций по реконструкции груди после резекции / удаления молочной железы, проведенной в рамках Договора страхования и в соответствии с его условиями.
5.1.10. Услуги и расходы в связи с родовыми травмами и/или врождёнными пороками развития.
5.1.11. Услуги и расходы, выполняемые по поводу всех форм поражений сердечных клапанов в результате эндокардита, вызванного венерическими заболеваниями (инфекциями, ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="6e8e4518-8b92-4087-8bc3-6374a4a3a853"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[6]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="ebce69ae-1e55-41b9-89ef-9372c09f0c0e"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[передающимися преимущественно половым путем).
5.1.12. Услуги, не назначенные Застрахованному лицу лечащим врачом, либо не являющиеся необходимыми с медицинской точки зрения по поводу страхового случая.
5.1.13. Услуги и расходы в связи с заболеваниями и состояниями, которые являются прямым или косвенным следствием синдрома приобретенного иммунодефицита (СПИД) или носительства вируса иммунодефицита человека (ВИЧ), включая мутацию и любое побочное действие.
5.1.14. В связи с расстройством здоровья, в том числе травматическим повреждением, наступившим в результате занятий профессиональным спортом.
5.1.15. Услуги и расходы в связи с расстройством здоровья, наступившим в местах лишения свободы, изоляторах временного содержания и других учреждениях, предназначенных для содержания лиц, подозреваемых, обвиняемых в совершении преступления или осужденных за совершенные преступления.
5.1.16. Услуги и расходы в связи с расстройством здоровья, наступившим в результате профессиональной деятельности Застрахованного лица, непосредственно связанной с химическими веществами и газами (включая асбест, растворители, бензол, хлористый винил, бериллий, никель, соединения хрома, радон, пестициды, пыль с оксидом кремния, диоксины), со взрывчатыми веществами, с ионизирующими излучениями, ультрафиолетовым излучением, с микроволновым излучением, с высоковольтными электрическими сетями.
5.1.17. Услуги и расходы в связи с применением экспериментальных методов лечения, не допущенных к использованию в стране оказания услуг.
5.1.18. Услуги и расходы в связи со злокачественным новообразованием, протекающим на фоне ВИЧ–инфекции или СПИД.
5.1.19. Услуги и расходы в связи с существовавшими до даты заключения Договора страхования заболеваниями и состояниями, а также несчастными случаями, диагностированными / произошедшими Застрахованному лицу / с Застрахованным лицом или о которых было известно Застрахованному лицу до даты начала действия страхования (лечение, предусмотренное страхованием было рекомендовано или запланировано до момента заключения Договора страхования).
5.1.20. Услуги и расходы в связи с получением Застрахованным]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="740" uuid="343ad776-f6fe-47a3-9b2a-dfe0132f92dc">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[лицом медицинских и иных услуг в медицинских и иных организациях, выбор которых не был согласован с Сервисной компанией.
5.1.21. Услуги и расходы в связи с заболеваниями и медицинскими состояниями, возникшими в результате занятия Застрахованного лица следующими экстремальными видами спорта, сопряженными с повышенным риском для жизни и здоровья: автоспорт, мотоспорт, альпинизм, спелеология, бокс и любые другие виды боевых единоборств, экстремальные виды велоспорта (включая маунтинбайк), фридайвинг, скайсерфинг, дайвинг (глубина погружения более 25 метров), кайтинг, бейсджампинг, экстремальные водные виды спорта (в том числе, аквабайк, водные лыжи), парашютный спорт, парапланеризм, дельтапланеризм, конный спорт.
5.1.22. Услуги и расходы в связи с раком кожи, за исключением меланомы.
5.1.23. Услуги и расходы в связи с Эпителиальными опухолями кожи (включая базалиому, плоскоклеточный рак) (код С44 по МКБ-10), Хроническим лимфоцитарным В-клеточным лейкозом (код C91.1 по МКБ-10).
5.2. Дополнительно к основаниям, указанным в пункте 5.1. Условий страхования, не признаются страховыми случаями, и страховая выплата не осуществляется в связи с расходами на:
5.2.1. Компенсацию морального вреда, в том числе связанного с качеством услуг, оказываемых третьими лицами (медицинскими учреждениями и т.д.).
5.2.2. Возмещение упущенной выгоды.
5.2.3. Социальные, трудовые компенсации, гарантийные выплаты, пособия.
5.2.4. Расходы, превышающие страховые суммы и лимиты ответственности, установленные в Договоре страхования.
6. ПЕРИОД ОЖИДАНИЯ
6.1. Если иное не предусмотрено Договором страхования, при заключении Договора страхования устанавливается период ожидания длительностью 120 (Сто двадцать) дней с даты заключения Договора страхования.
6.2. Если иное дополнительно не оговорено Договором страхования, период ожидания не устанавливается для Договоров страхования, заключаемых Страховщиком с тем же Страхователем повторно не позднее 30 (Тридцати) календарных дней с момента окончания срока действия ранее заключенного Договора страхования в соответствии с настоящими Условиями страхования. При повторном и последующем заключении Договора страхования с тем же Страхователем ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="35dadf0f-70ab-4994-a115-57374c216644"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[7]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="200c22ab-7125-4584-9ae2-eb2ce01dd637">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[в пределах установленного настоящим пунктом Условий страхования срока, период ожидания равен нулю. Данное положение Условий страхования не требует дополнительного внесения во вновь заключаемый с тем же Страхователем Договор страхования изменений.
7. ТЕРРИТОРИЯ ДЕЙСТВИЯ СТРАХОВАНИЯ. ПЕРИОД СТРАХОВАНИЯ, СРОК ДЕЙСТВИЯ ДОГОВОРА СТРАХОВАНИЯ
7.1. Территорией страхования, организации и оказания услуг, если иное не предусмотрено Договором страхования, является – Российская Федерация.
7.2. Если иное не установлено Договором страхования, срок действия Договора страхования составляет 1 (один) год с момента вступления Договора страхования в силу. Если иное не установлено Договором страхования период страхования начинается с 00 часов 00 минут 121 (Сто двадцать первого) дня с даты заключения Договора страхования и действует один год с даты вступления Договора страхования в силу.
7.3. Если иное не установлено Договором страхования, Договор страхования вступает в силу:
7.3.1. При первичном заключении Договора страхования, - в 00 часов 00 минут дня, указанного в Договоре страхования как «дата вступления Договора страхования в силу», при условии оплаты Страхователем страховой премии в полном объёме в срок, предусмотренный Договором страхования, и действует один год.
7.3.2. При повторном заключении Договора страхования (при условии оплаты страховой премии в полном объеме в течение 30 (Тридцати) календарных дней после окончания срока страхования ранее заключенного Договора страхования) - с 00 часов 00 минут дня, следующего за днем окончания срока действия предыдущего Договора страхования и действует один год.
7.3.3. При заключении Договора страхования по истечении 30 календарных дней с даты окончания срока действия предыдущего Договора страхования, - в 00 часов 00 минут дня, указанного в Договоре страхования как «дата вступления Договора страхования в силу», при условии оплаты Страхователем страховой премии в полном объёме в срок, предусмотренный Договором страхования, и действует один год.
7.4. Если иное не установлено Договором страхования или прямо не установлено настоящими Условиями, срок действия Договора страхования включает в себя Период]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="79c58ef6-78d9-40a6-b7ac-d3d7ef808b2d"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[ожидания.
8. ПОРЯДОК ОПРЕДЕЛЕНИЯ СТРАХОВОЙ СУММЫ, СТРАХОВОГО ТАРИФА, СТРАХОВОЙ ПРЕМИИ
8.1. Страховой суммой является денежная сумма, которая определена в порядке, установленном Договором страхования при его заключении, и исходя из которой устанавливается размер страховой премии, и размер страховой выплаты при наступлении страхового случая.
8.2. Размер страховой суммы устанавливается в Договоре страхования по соглашению Страховщика и Страхователя.
8.3. Договором страхования могут быть установлены лимиты ответственности Страховщика (ограничения максимальных сумм страховой выплаты в пределах страховой суммы) по отдельным случаям, заболеваниям (хирургическим операциям), видам расходов, и по различным их комбинациям.
8.4. Страховая сумма является уменьшаемой (агрегатной) страховой суммой, рассчитываемой как разность страховой суммы на начало срока действия Договора страхования и суммы страховой выплаты, осуществленной Страховщиком в период действия Договора страхования.
8.4.1. Если агрегатная страховая сумма исчерпана полностью, обязательства Страховщика по Договору страхования считаются исполненными в полном объеме. При этом Договор страхования прекращается досрочно, а уплаченная Страховщику страховая премия не подлежит возврату Страхователю.
8.5. Страховая сумма по Условиям устанавливается в рублях.
8.6. Страховой тариф представляет собой ставку страховой премии, взимаемую с единицы страховой суммы, с учетом объекта страхования и характера страхового риска, а также других условий страхования. Страховой тариф определяется Страховщиком с применением базовых тарифных ставок, рассчитанных на один год страхования, и поправочных (повышающих /понижающих) коэффициентов к ним (их предельных значений), которые могут применяться в зависимости от характера (степени) страхового риска (в частности, состояние здоровья, сведения о профессии / профессиональной деятельности / роде занятий), иных условий страхования, указанных в Условиях.
8.7. Страховой тариф по конкретному Договору страхования определяется по соглашению Сторон и указывается в Договоре страхования.
8.8. Страховой премией является плата за страхование, которую Страхователь обязан уплатить Страховщику в порядке и в сроки, ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="761e89d3-7b66-41a3-8def-6f8783bb064e"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[8]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="8440dabc-6362-4fe5-a2a0-e8f9539e3090">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[установленные Договором страхования.
При определении размера страховой премии, подлежащей уплате по Договору страхования, Страховщик применяет разработанные им страховые тарифы.
8.9. Страховая премия уплачивается в рублях, в соответствии с действующим законодательством Российской Федерации.
8.10. Если иное не предусмотрено Договором страхования, страховая премия уплачивается единовременно безналичным перечислением полной суммы страховой премии на расчетный счет Страховщика либо путем внесения средств в кассу Страховщика или получение денежных средств уполномоченным представителем Страховщика. Сумма и дата оплаты указываются на документе, подтверждающем оплату страховой премии.
8.10.1. Под документом, подтверждающим оплату страховой премии, понимается исполненное банком
платежное поручение или иной документ о перечислении страховой премии по Договору страхования.
8.10.2. Если иное не предусмотрено Договором страхования, в случае несоответствия суммы оплаченной страховой премии размеру страховой премии, указанному в Договоре страхования, Договор страхования не вступает в силу, ошибочно оплаченная денежная сумма подлежит возврату Страхователю в полном объеме в течение 20 (двадцати) рабочих дней с даты получения письменного заявления Страхователя.
8.11. Если иное не предусмотрено Договором страхования, датой оплаты страховой премии Страхователем является:
8.11.1. при платеже путем безналичных расчетов — дата списания денежных средств с расчетного счета Страхователя для их перечисления на расчетный счет Страховщика;
8.11.2. при платеже путем наличных расчетов — дата внесения платежа в кассу Страховщика или получение денежных средств уполномоченным представителем Страховщика.
8.12. Страхователь обязан сохранять документы, подтверждающие оплату страховой премии, и предъявлять их по требованию Страховщика.
8.13. Страховщик оставляет за собой право уведомлять Страхователя о необходимости произвести оплату страховой премии и /или о факте прекращения Договора страхования в связи с истечением срока страхования. При этом уведомление посредством СМС-сообщений/чатов на номер мобильного телефона рассматривается Сторонами как надлежащее уведомление и считается сделанным в
]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="eb12baba-d08f-439b-b213-37d561b3081f"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[письменной форме.
9. ПОРЯДОК ЗАКЛЮЧЕНИЯ, ИСПОЛНЕНИЯ И ПРЕКРАЩЕНИЯ ДОГОВОРА СТРАХОВАНИЯ
9.1. По Договору страхования Страховщик обязуется за обусловленную Договором страхования плату (страховую премию), уплачиваемую Страхователем, организовать предоставление Застрахованному лицу медицинских и иных услуг и оплатить их при наступлении предусмотренного Договором страхования события (страхового случая), в порядке и объеме, определенном Договором страхования.
9.2. При наличии расхождений между положениями Договора страхования, Условий и Правил страхования преимущественную силу имеют положения Договора страхования.
9.3. Если после заключения Договора страхования будет установлено, что Страхователь сообщил Страховщику заведомо ложные сведения об обстоятельствах, имеющих существенное значение для заключения Договора страхования, Страховщик вправе признать Договор недействительным и требовать применения последствий, предусмотренных Гражданским кодексом Российской Федерации.
9.4. Договор страхования заключается в письменной форме на основании устного заявления Страхователя. Несоблюдение письменной формы влечет недействительность Договора страхования.
9.5. Договор страхования может заключаться путем:
9.5.1. Составления одного документа, подписанного сторонами. Договор страхования в этом случае скрепляется собственноручной подписью Страхователя и аналогом собственноручной подписи уполномоченного лица и печати Страховщика. Под аналогом собственноручной подписи и печати понимается их графическое воспроизведение.
Договор страхования составляется в двух экземплярах.
9.5.2. Вручения Страхователю на основании устного заявления страхового полиса, подписанного Страховщиком. В этом случае, согласие Страхователя заключить Договор страхования на предложенных Страховщиком условиях подтверждается принятием от Страховщика Страхового полиса и Условий. Принятие Страхователем Страхового полиса и Условий страхования подтверждается оплатой Страхователем страховой премии в порядке и сроки, установленные Договором страхования. Подписание Страхового полиса Страховщиком с использованием факсимильного (или иного графического) воспроизведения подписи уполномоченного представителя и печати Страховщика является надлежащим ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="5bc40949-06d0-42cd-bbf5-6af4762669c4"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[9]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="a29d2aad-24c3-47c8-82b3-9993808dda57">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[подписанием Договора страхования со стороны Страховщика.
9.5.3. Направления электронного Договора страхования на основании письменного или устного заявления Страхователя с использованием официального сайта Страховщика в информационно-телекоммуникационной сети «Интернет» (согласно ст. 6.1. Закона Российской Федерации от 27.11.1992 №4015-1 «Об организации страхового дела в Российской Федерации»). В случае направления Страховщиком Страхователю – физическому лицу на основании его заявления Договора страхования, подписанного усиленной квалифицированной электронной подписью Страховщика, Договор страхования, составленный в виде электронного документа, считается заключенным Страхователем на предложенных Страховщиком условиях с момента уплаты Страхователем страховой премии или первого страхового взноса. Страхователь-физическое лицо уплачивает страховую премию (первый страховой взнос) после ознакомления с условиями, содержащимися в Договоре страхования и Условиях страхования, подтверждая тем самым свое согласие заключить этот Договор страхования на предложенных Страховщиком условиях.
Страховщик вправе предусмотреть на своем официальном сайте в сети «Интернет» возможность создания и отправки Страхователем (Застрахованным лицом, Выгодоприобретателем) Страховщику информации в электронной форме (в т. ч. обращений, касающихся заключения и/или изменения и/или досрочного прекращения Договора страхования и/или страховой выплаты и связанных с ними документов / сведений). При этом требования к использованию электронных документов и порядок обмена информацией в электронной форме (в т. ч. случаи и порядок создания и отправки указанной в настоящем пункте информации) устанавливаются соглашением между Страхователем (Застрахованным лицом, Выгодоприобретателем) и Страховщиком в соответствии с действующим законодательством Российской Федерации.
Любые документы, оформленные Страховщиком и/или Страхователем (Застрахованным лицом, Выгодоприобретателем) в виде электронного документа в соответствии с требованиями действующего законодательства и указанного в настоящем пункте соглашения, признаются равнозначными документам, оформленным на бумажном носителе.
9.6. В случае утраты Страхователем]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="33f0ea6b-a64c-448a-9b40-b282b498d7bf"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[вправе направить информацию в электронной форме с использованием официального сайта Страховщика в информационно-телекоммуникационной сети «Интернет» согласно страхового полиса или Договора страхования, по письменному заявлению Страхователя Страховщиком в период его действия выдается дубликат. После выдачи дубликата утраченный документ считается недействительным и выплаты по нему не производятся.
9.7. Страховщик может отдельно оговаривать в Договоре страхования положения, по которым должно быть достигнуто соглашение Сторон и которые в этой связи будут считаться существенными условиями Договора страхования. При несоблюдении данных положений Договор страхования будет считаться незаключенным и страховые выплаты по нему не будут производиться. В случаях, предусмотренных настоящим пунктом (если Договор страхования считается незаключенным) Страховщик производит возврат поступивших денежных средств в течение 20 (двадцати) рабочих дней с момента получения письменного заявления Страхователя.
9.8. Страховщик вправе, не изменяя сведения, обобщать и структурировать в процессе заключения и исполнения Договора страхования всю или часть имеющейся у него информации из Платежного поручения и /или информации, представленной Страхователем (в том числе для заключения Договора страхования), в своей базе данных. При этом Страховщик вправе формировать на основании базы данных документы (выгрузки, выписки, отчеты и т. д.), которые будут обладать той же юридической силой в части установления условий страхования, что и первоисточники.
9.9. Договор страхования прекращается в случаях:
9.9.1. Истечения срока, на который он был заключен - в 24 часа 00 минут дня его окончания, если Договором страхования не предусмотрено иное.
9.9.2. Исполнения Страховщиком обязательств по Договору страхования в полном объеме – с 00 часов 00 минут дня, следующего за днем исполнения указанных обязательств.
9.9.3. По соглашению сторон – с 00 часов 00 минут дня указанного, как дата досрочного прекращения Договора страхования в соответствующем письменном Соглашении.
9.9.4. Если возможность наступления страхового случая отпала, и существование страхового риска прекратилось по обстоятельствам иным, чем страховой случай – с 00 часов 00 минут даты прекращения существования страхового риска. В этом случае Страховщик имеет право на часть страховой премии, пропорционально времени,]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="4c41f6b4-331d-489e-90bc-16d652c54712"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[10]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="3bba0d1a-5dec-4fbc-b56a-c127d58347a8">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[в течение которого действовало страхование.
9.9.5. По требованию Страхователя. Страхователь вправе отказаться от Договора страхования в любое время, если к моменту отказа возможность наступления страхового случая не отпала по обстоятельствам, указанным в п 9.9.4 Условий.
Договор страхования считается прекратившим свое действие с даты получения Страховщиком письменного заявления Страхователя об отказе от Договора страхования или иной даты, установленной по соглашению сторон, но не ранее даты получения письменного заявления Страхователя об отказе от Договора страхования, за исключением случая, указанного в п. 9.9.5.1. Условий.
9.9.5.1. Страхователь - физическое лицо, имеет право отказаться от Договора страхования в течение 14 (четырнадцати) календарных дней со дня его заключения независимо от момента уплаты страховой премии, при отсутствии в данном периоде событий, имеющих признаки страхового случая, при этом уплаченная страховая премия подлежит возврату Страховщиком Страхователю в полном  объеме. Договор страхования считается прекратившим свое действие с даты получения Страховщиком письменного заявления Страхователя об отказе от Договора страхования или иной даты, установленной по соглашению сторон, но не позднее срока, определенного в соответствии с п. 9.9.5.1. Условий.
9.9.5.2. Если Страхователь – физическое лицо, отказался от Договора страхования в иной срок, чем предусмотренный п. 9.9.5.1. Условий, при отсутствии в данном периоде событий, имеющих признаки страхового случая, Страховщик при возврате уплаченной страховой премии удерживает ее часть пропорционально сроку действия Договора страхования, прошедшему с даты начала действия страхования, а также понесённые Страховщиком расходы на ведение дела, согласно утвержденной Страховщиком структуре тарифной ставки.
9.9.5.3. Возврат страховой премии в случаях, указанных в пп. 9.9.5.1, 9.9.5.2 Условий, осуществляется по выбору Страхователя наличными деньгами или в безналичном порядке в срок не превышающий 10 (десяти) рабочих дней со дня получения письменного заявления Страхователя об отказе от Договора страхования.
9.9.6. В иных случаях, предусмотренных законодательством Российской Федерации, Условиями и Договором страхования.
9.9.7. В целях заключения Договора страхования, изменения условий Договора]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="cd12cc7f-04b7-46b6-8013-20462a938ed7"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[страхования, получения страховой выплаты, в случаях и порядке, предусмотренных настоящими Условиями, Страхователь (Застрахованное лицо, Выгодоприобретатель) ст. 6.1. Закона Российской Федерации от 27.11.1992 № 4015-1 «Об организации страхового дела в Российской Федерации».
9.10. В период действия Договора страхования Страхователь обязан незамедлительно, но в любом случае не позднее 30 (тридцати) календарных дней, сообщить Страховщику об изменениях в сведениях или контактной информации о Страхователе. Любые извещения, заявления и обращения, направляемые Сторонами друг другу в рамках исполнения Договора страхования, а также лицами, в пользу или в отношении которых заключен Договор страхования, должны совершаться в письменной форме, и направляться по почтовым адресам, адресам электронной почты, телефонам и иным контактным данным Сторон, указанным в Договоре страхования (например, в письменном заявлении, уведомлении об изменении контактной информации или реквизитов).
9.11. Страховщик уведомляет заинтересованных лиц об изменении своей контактной информации и иных сведений путем размещения информационного сообщения на официальном сайте Страховщика. Если иное не установлено законом или Договором страхования, Страховщик вправе направлять Страхователю (Выгодоприобретателю, Застрахованному) сообщения посредством смс-сообщений, электронной почты по адресу, согласно сведениям, указанным Страхователем (Выгодоприобретателем, Застрахованным) в имеющихся у Страховщика документах, или посредством размещения информации на официальном сайте Страховщика в сети «Интернет». В таком случае сообщение считается направленным надлежащим образом, если можно достоверно  установить, от кого исходило сообщение и кому оно адресовано.
9.12. Внесение изменений в Договор страхования осуществляется в порядке, установленном законодательством Российской Федерации.
10. ПОРЯДОК ВЗАИМОДЕЙСТВИЯ СТОРОН ПРИ НАСТУПЛЕНИИ СОБЫТИЯ, ИМЕЮЩЕГО ПРИЗНАКИ СТРАХОВОГО СЛУЧАЯ
10.1. Уведомление о событии, имеющего признаки страхового случая.
10.1.1. После получения подтвержденного диагноза заболевания, указанного в п. 3.1 Условий, Страхователь должен в Период страхования, в кратчайшие сроки обратиться в Сервисную компанию с уведомлением о наступлении события, имеющего признаки страхового случая, с последующим предоставлением документов, которые ]]></text>
            </staticText>
            <textField>
                <reportElement x="456" y="757" width="100" height="14" uuid="b74b9393-9856-46bb-8942-2f1b37f2489c"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[11]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="3c2e9e69-1a05-4f39-9a74-4180365b24a8">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[запросит Сервисная компания.
10.1.2. Для признания события страховым случаем Сервисная компания вправе запросить оригиналы или заверенные надлежащим образом копии документов:
10.1.2.1. Уведомление о событии, имеющем признаки страхового случая, а также заявление о наступлении страхового случая (по форме, предложенной Страховщиком/Сервисной компанией).
10.1.2.2. Документ, удостоверяющий личность Страхователя (для гражданина Российской Федерации – паспорт гражданина Российской Федерации; для иностранного гражданина или лица без гражданства - документ, подтверждающий право на пребывание (проживание) в Российской Федерации; для временно проживающих – разрешение на временное проживание на территории Российской Федерации; для постоянного проживающих – вид на жительство; для беженцев – удостоверение беженца; для вынужденных переселенцев - удостоверение вынужденного переселенца).
10.1.2.3. Договор страхования и платежный документ, подтверждающий его оплату страховой премии.
В случае, если Страхователем производилось заключение Договоров страхования в соответствии с п.6.2 Условий, - все ранее заключенные Договоры страхования с платежными документами, подтверждающими их оплату.
10.1.2.4. Согласие Застрахованного лица на обработку его персональных данных (включая, все действия, перечисленные в ст. 3 Федерального закона от 27.07.2006 №152-ФЗ «О персональных данных» (далее - Закон)), в целях надлежащего исполнения Договора страхования, организации оказания услуг в отношении Страховщика, Сервисной компании, их уполномоченных представителей, а также третьих лиц, оказывающих услуги в связи с диагностированным заболеванием Застрахованного лица.
10.1.2.5. Согласие Застрахованного лица в соответствии с п. 3 ст. 13 Федерального закона от 21.11.2011 № 323-ФЗ «Об основах охраны здоровья граждан Российской Федерации» любому лечебному учреждению и/или врачу предоставлять ООО «РСХБ-Страхование жизни», осуществляющему страхование по Договору страхования, а также Сервисной компании по Договору страхования любые сведения, связанные с ним и составляющие врачебную тайну (любые медицинские документы и/или их заверенные копии, результаты лабораторных и инструментальных исследований, результаты лечения, прогноз по  ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="427b0e61-f396-4da7-ac5c-4a6e5019fc67"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[заболеванию и т.д.), как в связи с оценкой степени страхового риска, так и в связи с событиями, имеющими признаки страхового случая.
10.1.2.6. Медицинский документ (выписка из медицинской карты амбулаторного / стационарного больного, выписной эпикриз), заверенный печатью выдавшего учреждения и подписью ответственного лица, с указанием диагноза, послужившего причиной обращения за медицинской помощью в рамках настоящих Условий страхования, сроков лечения, результатов обследования и другой сопутствующей информации.
10.1.2.7. Результаты и заключения инструментальных, лабораторных методов диагностики / исследований, в т.ч.: гистологических или цитологических (в случае системных онкологических заболеваний); радиологических визуализирующих исследований; данные магнитно-резонансной томографии, результаты коронарной ангиографии.
10.1.2.8. Выписка из медицинской карты амбулаторного больного, содержащая информацию об имеющихся у Застрахованного лица заболеваниях за последние 5 лет.
10.1.2.9. Медицинский документ из онкологического диспансера по месту жительства о наличии и дате (датах) обращений либо об отсутствии обращений, а также Извещение о больном с впервые в жизни установленным диагнозом (форма 090/У).
10.1.2.10. Заключение врача – специалиста в предметной области с указанием полного клинического диагноза, показаний к лечению, подтверждающее необходимость назначенного лечения, а так же выбранный план лечения.
Указанный перечень документов и сведений является исчерпывающим. Страховщик (Сервисная компания) вправе сократить перечень документов, указанный в настоящем пункте, а также принять взамен указанных иные документы.
Если соглашением Сторон прямо не предусмотрено иное, документы, перечисленные выше в п. 10.1.2 Условий, должны предоставляться в виде оригиналов или в виде копий, заверенных нотариально или органом / учреждением / организацией, которые выдали документ и/или располагают его подлинником.
10.2. В случае признания события страховым случаем - в течение 15 (Пятнадцати) рабочих дней с момента получения Сервисной организацией полного комплекта документов по заявленному событию, Сервисная компания начинает организацию необходимых Застрахованному лицу услуг, предусмотренных страхованием, и информирует Застрахованное ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="5c2d8515-fb02-403c-bc9c-7c6a41dd98c7"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[12]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="c7b5613a-4507-4af4-bce1-87bc6eb7af6e">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[лицо о:
- специализированных медицинских учреждениях, центрах;
- рекомендованном лечащем враче – специалисте;
- дальнейших действиях Застрахованного лица, необходимых для оказания услуг, предусмотренных Договором страхования.
10.3. Если наступившее событие не признано страховым случаем, Страховщик в течение 10 (десяти) рабочих дней с момента принятия решение о непризнании события страховым случаем письменно информирует об этом Застрахованное лицо.
11. ПОРЯДОК ОПРЕДЕЛЕНИЯ И ОСУЩЕСТВЛЕНИЯ СТРАХОВОЙ ВЫПЛАТЫ, ОКАЗАНИЯ МЕДИЦИНСКИХ УСЛУГ
11.1. Предоставление медицинских и иных услуг, обусловленных Договором страхования осуществляется путем обращения Застрахованного лица в Сервисную компанию, указанную в Договоре страхования.
11.2. Застрахованное лицо при обращении в Сервисную компанию предоставляет документы, указанные в п. 10.1.2. Условий страхования.
11.3. Страховая выплата производится путем оплаты Страховщиком стоимости медицинских и иных услуг, предусмотренных Договором страхования непосредственно на счет Сервисной компании или иному лицу, организовавшему по согласованию со Сервисной компанией (Страховщиком) оказание медицинских и иных услуг Застрахованному лицу.
11.4. Размер страховой выплаты определяется в размере стоимости оказанной Застрахованному лицу медицинской и иной помощи в объеме, предусмотренном Договором страхования.
11.5. Перечисление страховой выплаты осуществляется Страховщиком на основании выставленного счета за оказанные медицинские и иные услуги.
11.5.1. Счет должен содержать: фамилию, имя, отчество (при наличии отчества) Застрахованного; дату его рождения; номер Договора страхования; диагноз; итоговую сумму к оплате; дату страхового случая; данные документа, удостоверяющего личность Застрахованного (в т.ч. паспортные данные Застрахованного (серия (при наличии), номер, дата и место выдачи, наименование и номер выдавшего органа); полных банковских реквизитов Сервисной компании.
11.5.2. К счету должны быть приложены копии медицинских документов из клиники, содержащих информацию о диагнозе, состоянии здоровья Застрахованного лица, проведённом лечении, проведенных обследованиях Застрахованного, лабораторных исследованиях, а также копии счетов организаций, оказавших Застрахованному ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="e006712b-0e9e-40d1-9142-4d690fafe63a"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[13]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="b00bedf8-b64b-4c99-8fbb-a51307e96ce0"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[услуги.
11.6. Договор страхования может предусматривать возмещение расходов, понесенных Выгодоприобретателем (Страхователем, Застрахованным лицом) по оплате медицинских и иных услуг, оказанных по согласованию с Сервисной компанией (Страховщиком) и в соответствии с условиями Договора страхования, непосредственно Выгодоприобретателю (Застрахованному лицу, Страхователю) наличными денежными средствами или перечислением на его счет. При этом затраты должны быть признаны Страховщиком обоснованными на основании документов, перечисленных в пункте 10.1.2 Условий страхования, подтверждающих необходимость понесенных затрат и факт оплаты.
11.6.1. В этом случае Выгодоприобретатель (Страхователь, Застрахованное лицо) дополнительно к документам, указанным в п. 10.1.2, предоставляет:
- заявление на выплату от Выгодоприобретателя, с указанием реквизитов для перечисления страховой выплаты;
- документы, подтверждающие правоспособность лица, обратившегося за выплатой.
- счета из организаций, оказавших услуги с указанием наименований услуг, стоимости, дат их оказания, номера Договора с организацией;
- оригиналы платежно-расчетных документов, подтверждающих факт оплаты медицинских и иных услуг, включенных в Договор страхования;
- копию направления на оказание медицинской помощи в амбулаторных, условиях дневного стационара, стационарных условиях из медицинской организации, предусмотренной Договором страхования (согласованной Сервисной компанией (Страховщиком)), заверенную надлежащим образом;

- документы, подтверждающие оказание Застрахованному лицу соответствующих услуг (заключение о проведенном обследовании или лечении, выписку из истории болезни, выписной эпикриз, результаты обследования, амбулаторную карту и т.д.);
- копию лицензии (с приложениями) медицинской организации, в которой Застрахованное лицо проходило лечение (в случае компенсации расходов на лечение).
11.6.2. Страховщик вправе сократить перечень обязательных для представления документов, если обстоятельства страхового случая или размер причиненного ущерба Страховщику известны и не вызывают у него сомнения.
11.7. После представления Выгодоприобретателем (Застрахованным лицом, Страхователем), всех необходимых документов, ]]></text>
            </staticText>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="190b8ef3-1a98-4781-991b-224d1a6f2571">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[указанных в п. 10.1.2, 11.6.1, позволяющих судить о причинах и обстоятельствах, повлекших наступление события, обладающего признаками страхового случая, и о размере страховой выплаты, Страховщик в течение 15 (пятнадцати) рабочих дней (если иной срок не предусмотрен в Договоре страхования) со дня представления Выгодоприобретателем (Застрахованным лицом, Страхователем) всех необходимых документов обязан принять одно из следующих решений:
11.7.1. О признании заявленного события страховым случаем.
В этом случае в указанный в п. 11.7 Условий страхования срок Страховщик утверждает Страховой акт, и Сервисная организация начинает осуществлять организацию оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг, либо Страховщик производит страховую выплату в случаях, предусмотренных п.11.6. Условий, в течение 10 (десяти) рабочих дней с даты утверждения Страхового акта, если иные сроки не предусмотрены Договором страхования.
11.7.2. Об отказе в страховой выплате.
В этом случае в течение 10 (десяти) рабочих дней с момента принятия решения об отказе в страховой выплате (в срок, предусмотренный п. 11.7. Условий) Страхователю (Застрахованному лицу, Выгодоприобретателю) направляется письменное уведомление с мотивированным обоснованием причин отказа, если иные сроки не предусмотрены Договором страхования.
11.7.3. О проведении страхового расследования.
Страховщик имеет право, письменно уведомив Страхователя (Застрахованное лицо, Выгодоприобретателя), вынести мотивированное решение об отсрочке принятия решения о признании или непризнании события страховым случаем или об отказе в страховой выплате, в случаях если:
- по фактам, послужившим причиной наступления страхового случая, возбуждено уголовное дело или начат судебный процесс - до окончания производства по уголовному делу или судебному процессу (до события, которое наступит ранее);
- возникла необходимость в экспертизе представленных документов. Отсрочка возможна, в случае, если у Страховщика имеются мотивированные сомнения в подлинности документов, подтверждающих страховой случай;
- полученные Страховщиком и предусмотренные Договором страхования документы не подтверждают наличие страхового события, в связи с чем возникла  необходимость в запросе дополнительных]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="c7f9cdd8-db46-45e9-b4d4-046195cfe243"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[документов. В этом случае, Страховщик вправе запросить дополнительно документы у Страхователя (Застрахованного лица, Выгодоприобретателя) и/или компетентных органов. При этом Страховщик обязан обосновать в своем запросе необходимость предоставления ему таковых документов.
Страховое расследование проводится в течение 30 (тридцати) рабочих дней после получения всей необходимой информации в соответствии с настоящим пунктом Условий страхования.
Решение о признании или непризнании события страховым случаем или об отказе в страховой выплате принимается в течение 15 (пятнадцати) рабочих дней после завершения страхового расследования.
11.8. Размер страховой выплаты определяется в зависимости от условий страхования, изложенных в конкретном Договоре страхования.
11.9. Страховщик не несет ответственность за объем и качество предоставляемых медицинских и иных услуг.
12. ПРАВА И ОБЯЗАННОСТИ СТОРОН
12.1. Страховщик и/или Сервисная компания имеют право:
12.1.1. Проверять подлинность документов и достоверность информации, сообщаемой Страхователем, любыми доступными ему способами, не противоречащими действующему законодательству, в том числе назначать соответствующие экспертизы, запрашивать дополнительные сведения у Страхователя, направлять запросы в компетентные органы, медицинские и иные учреждения.
12.1.2. Требовать от Застрахованного лица (Выгодоприобретателя) выполнения обязанностей по Договору страхования, включая обязанности, лежащие на Страхователе, но не выполненные им, при предъявлении Выгодоприобретателем требования о страховой выплате.
12.1.3. При наступлении события, имеющего признаки страхового случая, самостоятельно выяснять причины, обстоятельства наступившего события, имеющего признаки страхового случая. При необходимости потребовать у Страхователя (Застрахованного лица) прохождения медицинского обследования в указанном Страховщиком (Сервисной компании) лечебном учреждении либо у указанного Страховщиком (Сервисной компании) врача, если требуется дополнительная информация об подтверждении факта (причин) происшедшего события, имеющего признаки страхового случая.
12.1.4. Потребовать признания Договора страхования недействительным, если после заключения Договора страхования будет установлено, что Страхователь сообщил заведомо ложные сведения об обстоятельствах,]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="df80225d-2fc8-4ed2-ba68-324d389b78ed"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[14]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="3691a7e1-9a0b-4812-b673-47f3c9294300">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[имеющих существенное значение для определения вероятности наступления страхового случая и размера возможных убытков от его наступления (страхового риска).
12.1.5. Запросить сведения и/или документы, получение которых обусловлено требованиями законодательства Российской Федерации в сфере противодействия легализации (отмыванию) доходов, полученных преступным путем, и финансированию терроризма.
12.2. Страховщик обязан:
12.2.1. Разъяснять положения, содержащиеся в Условиях и Договоре страхования, по требованиям
 Страхователей, Застрахованных лиц, а также лиц, имеющих намерение заключить Договор страхования.
12.2.2. При наступлении страхового случая осуществить организацию оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг или страховую выплату в установленный Условиями и Договором страхования срок.
12.2.3. Обеспечить конфиденциальность во взаимоотношениях со Страхователем, не разглашать сведения о Договоре страхования, Страхователе, Застрахованном лице, их имущественном положении и состоянии здоровья, за исключением случаев, предусмотренных законодательством Российской Федерации.
12.2.4. Предоставить Страхователю информацию о лицензии Страховщика, контактах (месте нахождения, телефон/факс) и режиме работы структурного подразделения Страховщика и привлеченных Страховщиком сторонних организаций для оказания страховых услуг или сообщить информацию о сайте в информационно-телекоммуникационной сети «Интернет», на котором размещается вышеуказанная информация.
12.3. Страхователь имеет право:
12.3.1. Получить Условия, любые разъяснения по Условиям и заключенному Договору страхования.
12.3.2. Получить на основании письменного заявления дубликат Договора страхования в случае утери подлинника.
12.3.3. Требовать предоставления Застрахованному лицу медицинских и иных услуг, обусловленных Договором страхования, в соответствующем порядке и сроки.
12.3.4. Получить информационно – консультационные услуги Сервисной компании (по телефону, указанному в Договоре страхования) в связи с заболеваниями / состояниями, предусмотренными в Договоре страхования, в том числе:
12.3.4.1. разъяснения по условиям]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="efffc8e6-8f11-4b53-936c-fd913c4ff7a4"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[страхования, порядку и условиям получения услуг, предусмотренных Договором страхования;
12.3.4.2. информацию по порядку получения медицинской помощи в рамках программ Обязательного медицинского страхования;
12.3.5. Получать консультацию медицинских специалистов по вопросам подготовки к диагностическим и лабораторным исследованиям, в том числе по телефону, посредствам видеосвязи и чатов.
12.3.6. Один раз в течение Периода страхования получить второе медицинское мнение по поводу впервые диагностированных заболеваний / состояний, предусмотренных Договором страхования на основании выписного эпикриза, предоставленного Страхователем (Застрахованным).
12.4. Страхователь обязан:
12.4.1. До заключения Договора страхования ознакомиться с настоящими Условиями, Договором страхования (в том числе текстом Декларации).
12.4.2. Своевременно и в полном объеме уплачивать обусловленную Договором страхования страховую премию.
12.4.3. При заключении Договора страхования сообщить и/или иным образом подтвердить Страховщику необходимую достоверную информацию, касающуюся Застрахованного лица, а также все известные обстоятельства, имеющие существенное значение для определения вероятности наступления страхового случая. Существенными являются в том числе сведения,  приведенные в настоящих Условиях и Договоре страхования.
12.4.4. Ознакомить Застрахованное лицо, указанное в Договоре страхования, с Условиями страхования и условиями Договора страхования.
12.4.4.1. В случае заключения Договора страхования в соответствии с п. 9.5.2-9.5.3 Условий, - обеспечить соответствие достоверности данных, указанных в Декларации о состоянии здоровья Застрахованного лица, являющейся частью Страхового полиса и фактических данных о Застрахованном лице.
Подтверждением согласия Страхователя с данными, изложенными в Декларации Страхового полиса, является уплата страховой премии.
12.4.5. Предоставлять Страховщику информацию, необходимую для исполнения требований законодательства Российской Федерации в сфере противодействия легализации (отмыванию) доходов, полученных преступным путем, и финансированию терроризма, включая информацию о своих выгодоприобретателях, учредителях (участниках) и бенефициарных владельцах.
12.4.6. В период действия Договора страхования сообщать Страховщику о ставших ему]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="bcdbc1ca-ff0f-4b07-a22f-d6361fdf868a"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[15]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="e16e6b56-ea92-4329-b4cf-806b95a2b438">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[известными значительных изменениях в обстоятельствах, сообщенных Страховщику при заключении Договора страхования, если эти изменения могут существенно повлиять на увеличение страхового риска.
13. ОСНОВАНИЯ ОТКАЗА В СТРАХОВОЙ ВЫПЛАТЕ
13.1. Страховщик освобождается от страховой выплаты в следующих случаях:
13.1.1. Если страховой случай по любому страховому риску наступил вследствие умысла Страхователя, Выгодоприобретателя или Застрахованного лица.
13.1.2. Если страховой случай по любому страховому риску наступил вследствие:
13.1.2.1. Воздействия ядерного взрыва, радиации или радиоактивного заражения.
13.1.2.2. Военных действий, а также маневров или иных военных мероприятий.
13.1.2.3. Гражданской войны, народных волнений всякого рода или забастовок.
13.2. Страховщик отказывает в страховой выплате по следующим основаниям:
13.2.1. Произошедшее событие не является страховым случаем, т.е. не относится к событиям, на случай наступления которых был заключен Договор страхования (например, отнесено к исключениям (раздел 5 Условий страхования) или не может быть квалифицировано в качестве страхового случая, исходя из терминов и определений, определенных Условиями страхования).
13.2.2. Событие произошло до начала или после окончания (в т. ч. досрочного) срока действия Договора страхования (например, после прекращения срока действия Договора страхования).
13.2.3. Событие произошло в период ожидания.
13.2.4. Сумма страховой выплаты превышает лимит ответственности (лимит страхового обязательства). При этом возможен частичный отказ в страховой выплате пропорционально превышению лимита.
13.2.5. Событие произошло с лицом, которое не является Застрахованным лицом по Договору страхования, или событие произошло по страховому риску, который не предусмотрен в отношении Застрахованного лица.
13.2.6. По основаниям, предусмотренным действующим законодательством Российской Федерации (в т. ч. если Страховщик освобожден от  страховой выплаты).
14. ПОРЯДОК РАЗРЕШЕНИЯ СПОРОВ
14.1. При разрешении споров между Страхователем (Застрахованным лицом, Выгодоприобретателем) и Страховщиком стороны применяют обязательный претензионный досудебный порядок, если иное не предусмотрено законом.]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="e7b0b61e-83c8-408d-8388-0f6e67eca65e"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[14.2. Претензия должна содержать следующие реквизиты:
- наименование «претензия»;
- дата и место ее составления;
- суть требований и обстоятельства, имеющие отношение к событию, имеющему признаки страхового случая, и явившиеся основанием для предъявления претензии;
- сумма претензии и порядок ее расчета;
- подпись представителя стороны, имеющей претензию к другой стороне, и документ, подтверждающий его полномочия.
К претензии должны быть приложены документы, подтверждающие обоснованность заявленных в претензии требований.
14.3. Письменная мотивированная претензия должна быть вручена уполномоченному представителю стороны лично или направлена по почте заказным письмом с описью вложения и уведомлением о вручении.
14.4. Претензии, направленные иным образом, к рассмотрению не принимаются.
14.5. Надлежащим образом врученная претензия должна быть рассмотрена в течение 30 (тридцати) рабочих дней с даты ее получения.
14.6. Если иное не предусмотрено Договором страхования, все споры, которые возникли между Страховщиком и Страхователем (Застрахованным лицом, Выгодоприобретателем) в связи с Договором страхования и неразрешенные в досудебном порядке передаются в суд в соответствии с законодательством Российской Федерации.
15. ПЕРСОНАЛЬНЫЕ ДАННЫЕ. ТАЙНА СТРАХОВАНИЯ
15.1. Страховщик не вправе разглашать полученные им в результате своей профессиональной деятельности сведения о Страхователе (Застрахованном лице, Выгодоприобретателе), состоянии их здоровья, а также об имущественном положении этих лиц (тайна страхования).
15.2. При обработке персональных данных Страхователя (Застрахованного лица, Выгодоприобретателя), являющегося физическим лицом (далее – персональные данные), Страховщик должен руководствоваться законодательством Российской Федерации в области персональных данных.
15.3. Обработка персональных данных Страховщиком осуществляется:
15.3.1. Для целей заключения, исполнения (в том числе исполнения обязательств Сервисной компанией), изменения, прекращения Договора страхования.
15.3.2. Для целей перестрахования Страховщиком рисков, принятых по Договору страхования, и заключения, исполнения, изменения, прекращения]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="eb9fb57f-1c89-4c2e-9613-79acfd4c46a3"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[16]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="4f83e38b-69a5-48b3-83fb-547d784c1b5f">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[соответствующего(-их) Договора(-ов) перестрахования.
15.3.3. Для предусмотренных законом целей, а также для осуществления и выполнения возложенных законодательством Российской Федерации на Страховщика функций, полномочий и обязанностей.
15.3.4. Для целей осуществления прав и законных  интересов Страховщика (в т. ч. оценки страхового риска).
15.3.5. Для иных законных и заявленных субъекту персональных данных целей (при наличии).
15.4. Заключая Договор страхования, Страхователь подтверждает свое ознакомление с заявленными целями обработки персональных данных.
15.5. При обработке персональных данных Страховщик обязан соблюдать безопасность и конфиденциальность обрабатываемых персональных данных, а также выполнять иные требования, предусмотренные законодательством Российской Федерации в области персональных данных.
15.6. Страховщик обязан принимать меры, необходимые и достаточные для обеспечения выполнения указанных обязанностей. При этом Страховщик самостоятельно определяет состав и перечень мер, необходимых и достаточных для обеспечения выполнения обязанностей. В частности, Страховщик при обработке персональных данных обязан принимать необходимые правовые, организационные и технические меры или обеспечивать их принятие для защиты персональных данных от неправомерного или случайного доступа к ним, уничтожения, изменения, блокирования, копирования, предоставления, распространения персональных данных, а также от иных неправомерных действий в отношении персональных данных.
]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="751" uuid="acc7ffb1-0308-42b4-87c0-5c4accd29ebb">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="8e4048a0-1287-46d8-9648-38fdedce759e"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[17]]></textFieldExpression>
            </textField>
        </band>
    </detail>
    <pageFooter>
        <band height="30"/>
    </pageFooter>
</jasperReport>
'::text, 'utf8'))
ON CONFLICT (type)
DO NOTHING;

insert into common_dict.PRINT_TEMPLATES(TYPE, COPIES_NUMBER, FILE_NAME, CONTENT)
values ('4f2434ae-5eb1-4b10-8f83-2cbcddfdbf99', 6, 'УСЛОВИЯ СТРАХОВАНИЯ №1-МС «ВЫБЕРИ ЗДОРОВЬЕ КЛАССИКА»', convert_to('<?xml version="1.0" encoding="UTF-8"?>
<!-- Created with Jaspersoft Studio version 6.6.0.final using JasperReports Library version 6.6.0  -->
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="RshbInsuranceChooseHealth" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" isFloatColumnFooter="true" uuid="4eedbb89-b4f6-4469-9ab6-f642a1688cf7">
    <property name="com.jaspersoft.studio.data.defaultdataadapter" value="One Empty Record"/>
    <subDataset name="tableDataset" uuid="f13e6d36-5148-4ecc-bbe3-3035def80980">
        <queryString>
            <![CDATA[]]>
        </queryString>
    </subDataset>
    <parameter name="contractNumber" class="java.lang.String"/>
    <parameter name="surname" class="java.lang.String"/>
    <parameter name="name" class="java.lang.String"/>
    <parameter name="patronymic" class="java.lang.String"/>
    <parameter name="birthDate" class="java.lang.String"/>
    <parameter name="contractStartDate" class="java.lang.String"/>
    <parameter name="contractSignDate" class="java.lang.String"/>
    <parameter name="phoneNumber" class="java.lang.String"/>
    <parameter name="email" class="java.lang.String">
        <defaultValueExpression><![CDATA[""]]></defaultValueExpression>
    </parameter>
    <parameter name="isTestInstance" class="java.lang.Boolean" isForPrompting="false">
        <parameterDescription><![CDATA[Инстанс приложения запущен на тестовом стенде]]></parameterDescription>
        <defaultValueExpression><![CDATA[true]]></defaultValueExpression>
    </parameter>
    <queryString>
        <![CDATA[]]>
    </queryString>
    <background>
        <band height="772">
            <image>
                <reportElement isPrintRepeatedValues="false" x="3" y="0" width="550" height="758" uuid="ea763663-ef82-4cb6-a25f-d7c500e2fa1a">
                    <printWhenExpression><![CDATA[$P{isTestInstance} == true]]></printWhenExpression>
                </reportElement>
                <imageExpression><![CDATA[net.sf.jasperreports.renderers.BatikRenderer.getInstanceFromText("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"765\" height=\"990\"><text x=\"60\" y=\"40\" transform=\"matrix(.6,-.82,.83,.6,30,1055)\" style=\"font-size:220px;font-weight:bold;fill:#d8d8d8\">ОБРАЗЕЦ</text></svg>")]]></imageExpression>
            </image>
        </band>
    </background>
    <detail>
        <band height="772">
            <staticText>
                <reportElement x="2" y="100" width="260" height="658" uuid="4a2eb15b-0af0-44dd-82e1-37fc074eadc9">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[1. ОБЩИЕ ПОЛОЖЕНИЯ
1.1. Настоящие Условия страхования №1-МС «Выбери здоровье Классика» (далее - Условия) разработаны на основании Правил страхования на случай критических заболеваний с лечением ООО «РСХБ-Страхование жизни», утверждённых приказом Генерального директора Страховщика от «25» сентября 2018г. № 79. На основании настоящих Условий, в соответствии с выданной органом страхового надзора лицензией на осуществление страхования, и руководствуясь действующим законодательством Российской Федерации ООО «РСХБ-Страхование жизни» осуществляет заключение Договоров страхования, по которым осуществляется страхование имущественных интересов, связанных с оплатой организации и оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг вследствие расстройства здоровья Застрахованного лица в результате событий, предусмотренных Договором страхования из числа поименованных в разделе 3 Условий (далее – Договоры страхования).
1.2. Информация о Страховщике и условиях страхования размещена на официальном сайте Страховщика - http://www.rshbins-life.ru.
1.3. Положения, содержащиеся в настоящих Условиях и не включенные в текст Договора страхования, обязательны для Страхователя (Выгодоприобретателя), если в Договоре страхования прямо указывается на применение таких Условий или сами Условия приложены к нему.
1.4. Нижеперечисленные термины и определения, используемые в настоящих Условиях, имеют следующее значение:
1.4.1. Страховщик – Общество с ограниченной ответственностью «РСХБ-Страхование жизни» (ООО «РСХБ-Страхование жизни»), юридическое лицо, созданное и действующее в соответствии с законодательством Российской Федерации на основании полученной в установленном порядке лицензии.
1.4.2. Страхователь (Застрахованное лицо) – дееспособное физическое лицо, заключившее со Страховщиком Договор страхования.
1.4.3. Выгодоприобретатель – Застрахованное лицо.
1.4.4. Застрахованное лицо (Застрахованный) - ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="1b9dfc32-5d14-4246-8770-baabcee69f67"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[1]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="245" y="1" width="310" height="30" uuid="96d3d450-6d57-4e95-ae36-735678d3cb47">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Right" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[Приложение к Договору страхования
 «Выбери здоровье Классика»]]></text>
            </staticText>
            <textField isStretchWithOverflow="true">
                <reportElement stretchType="ContainerBottom" x="119" y="33" width="435" height="30" uuid="f631d05d-15f8-40d7-bc5f-95912ad5bbe2">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Right" verticalAlignment="Middle" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <textFieldExpression><![CDATA["№ " +$P{contractNumber} +
"\nот "+ $P{contractSignDate}]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="30" y="64" width="500" height="30" uuid="4ef402f3-cf76-472b-93ee-8117cf2eb3bb">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Center" verticalAlignment="Middle" markup="styled">
                    <font fontName="Arial" size="11" isBold="true"/>
                </textElement>
                <text><![CDATA[УСЛОВИЯ СТРАХОВАНИЯ №1-МС «ВЫБЕРИ ЗДОРОВЬЕ КЛАССИКА»]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="100" width="260" height="658" uuid="f4446d0f-e9ac-4546-8864-e7181f5f7047">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[названное в Договоре страхования физическое лицо, в отношении здоровья которого заключен Договор страхования. В рамках настоящих Условий Застрахованным лицом является Страхователь, при одновременном соблюдении следующих условий:
1.4.4.1. Возраст Страхователя (Застрахованного лица) не менее 18 (восемнадцати) лет и не более 54 (пятидесяти четырех) лет;
1.4.4.2. Страхователь не являлся/не является инвалидом I - II группы, ребенком инвалидом, в отношении него не принималось врачебное решение о направлении для установления ему группы инвалидности, не является лицом, имеющим действующее направление на медико-социальную  экспертизу (МСЭ), и МСЭ не рассматривает документы на установление ему группы инвалидности;
1.4.4.3. Страхователь (Застрахованное лицо) не нуждается в постоянном уходе в соответствии с медицинским заключением;
1.4.4.4. Страхователь (Застрахованное лицо) не имеет заболевания и (или) функциональные нарушения из нижеуказанных (по которым в течение жизни устанавливался диагноз, проводилось и(или) проводится лечение, либо в отношении которых лицо находилось (находится) под наблюдением врача-специалиста): СПИД или ВИЧ-инфекция, злокачественные новообразования, в том числе но не ограничиваясь:
1.4.4.4.1. Рак in situ, лейкозы, миелома, лимфомы, болезнь Ходжкина; любые виды опухолей или кист головного мозга и/или спинного мозга, пищевод Барретта, дисплазия шейки матки, доброкачественная гиперплазия предстательной железы, полицитемия, фиброаденома молочной железы; язва желудка, болезнь Крона, неспецифический язвенный колит, хронические гепатиты вирусной и невирусной природы, циррозы печени любой этиологии, алкогольная болезнь печени, хронический панкреатит;
1.4.4.4.2. Хроническая дыхательная недостаточность II-III степени; хроническая обструктивная болезнь легких (ХОБЛ); первичный иммунодефицит, амилоидоз, крипторхизм, туберкулез, хроническая почечная недостаточность любой стадии;
1.4.4.5. Страхователю (Застрахованному лицу) не устанавливался диагноз эпилепсии, слабоумия, ]]></text>
            </staticText>
        </band>
        <band height="772">
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="92e58189-5c2f-4cbe-8071-34ec89f66f10"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[2]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="c9880d7c-eac2-495c-a7ca-59dedd065314">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[психических заболеваний и/или расстройств поведения не состоял/не состоит на учете в психоневрологическом и/или наркологическом диспансере;
1.4.4.6. Страхователь (Застрахованное лицо) не употребляет наркотические, токсические и/или сильнодействующие вещества с целью лечения или по иной причине, ему не устанавливался диагноз алкоголизм, наркомания, токсикомания; не состоит по любой из указанных причин на диспансерном учете;
1.4.4.7. Страхователь (Застрахованное лицо) не переносил хирургических операции по трансплантации органа или его части (в том числе, но не ограничиваясь, костного мозга), трепанации черепа;
1.4.4.8. У Страхователя (Застрахованного лица) за 6 месяцев, предшествующих заключению Договора страхования, не отмечалась нецеленаправленная резкая потеря веса (10 кг и более);
1.4.4.9. У Страхователя  (Застрахованного лица) индекс массы тела (отношение массы тела (кг) к квадрату роста (м)) находится в диапазоне не менее 20 и не более 35;
1.4.4.10. У Страхователя (Застрахованного лица) не отмечалась патологическая кровопотеря из любых источников;
1.4.4.11. Страхователь (Застрахованное лицо) не имеет отклонений от установленных лабораторных норм показателей онкомаркеров (если такие исследования проводились);
1.4.4.12. Страхователь (Застрахованное лицо) не подвергался (подвергается) воздействию радиации,  токсических или канцерогенных веществ при выполнении своих профессиональных обязанностей;
1.4.4.12. Страхователь (Застрахованное лицо) не выкуривает более 20 сигарет в день и/ или не курит ежедневно электронные сигареты, сигары, трубки, кальян/наргиле, или другие никотиновые заменители; не употребляет алкоголь более чем 5 единиц в день (одна единица = 300 мл пива или 100 мл вина или 20 мл спирта);
1.4.4.13. Страхователь (Застрахованное лицо) и/или его ближайшие родственники (отец, мать, братья, сестры) в возрасте до 60 лет не болели онкологическими заболеваниями и / или не умирали от рака (в случае, если этот факт был известен Страхователю (Застрахованному лицу) до заключения Договора страхования).
1.5. Амбулаторные условия - условия, не предусматривающие круглосуточного медицинского наблюдения и лечения, в том числе на дому при вызове медицинского работника.]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="db54669b-edbd-408b-b865-64c40db4da6c">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[1.6. Больница (а также - сертифицированное медицинское учреждение / организация, лечебно-профилактическое учреждение) – юридическое лицо, независимо от организационно-правовой формы и формы собственности, осуществляющее медицинскую деятельность на основании лицензии (иного разрешения), выданной в соответствии с действующим законодательством страны оказания услуг (сертифицированное медицинское учреждение / организация, лечебно-профилактическое учреждение), осуществляющее медицинское лечение заболеваний или травм, оснащенное материально-техническими средствами и укомплектованное квалифицированным персоналом для выполнения мер диагностического и хирургического вмешательства, в котором круглосуточно присутствуют врачи и медицинский персонал.
1.7. Врач (а также-сертифицированный (квалифицированный) медицинский специалист) – специалист с оконченным высшим медицинским образованием, на законных основаниях и в соответствии с имеющимися сертификатами, квалификацией допущенный к осуществлению медицинской практики соответствующей специализации.
1.8. Период ожидания – период времени, предусмотренный Договором страхования, с момента вступления Договора страхования в силу и до момента начала периода страхования, обусловленного Договором страхования, в течение которого обращения Застрахованного лица за организацией и/или оказанием медицинских услуг (из числа событий, предусмотренных Договором страхования) не являются страховым случаем, и Страховщик не несет обязательств по страховой выплате.
1.9. Декларация о состоянии здоровья (далее – Декларация) – декларация, анкета, содержащая информацию о состоянии здоровья Застрахованного лица до момента заключения Договора страхования. Обстоятельства, изложенные в Декларации о состоянии здоровья, имеют существенное значение для определения вероятности наступления страхового случая, а также для согласования сторонами условий Договора страхования о Застрахованном лице. Заключая Договор страхования и/или подписывая Декларацию Страхователь подтверждает соответствие состояния своего здоровья сведениям, содержащимся в Декларации.
1.10. Дневной стационар – условия, предусматривающие медицинское наблюдение и лечение в дневное время, но не требующие ]]></text>
            </staticText>
        </band>
        <band height="772">
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="64a90aba-1898-4b07-993b-0ceb93bcc96d"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[3]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="61f662b2-a073-4010-90be-8be8b9378bea">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[круглосуточного медицинского наблюдения и лечения. Дневной стационар обеспечивает структурное подразделение лечебно-профилактического учреждения, предназначен для проведения профилактических, диагностических, лечебных и реабилитационных мероприятий больным, не требующим круглосуточного медицинского наблюдения, с применением современных медицинских технологий в соответствии со стандартами и протоколами ведения больных.
1.11. Первичное диагностирование (первичная постановка диагноза) – факт установления Врачом впервые в жизни Застрахованному лицу диагноза заболевания. Первичное диагностирование, проведенное, в том числе, в период страхования (по истечении периода ожидания), включающее комплекс медицинских вмешательств, направленных на распознавание состояний или установление факта наличия либо отсутствия заболеваний, осуществляемых посредством сбора и анализа жалоб пациента, данных его анамнеза и осмотра, проведения лабораторных, инструментальных, и иных исследований в целях определения диагноза, выбора мероприятий по лечению пациента и (или) контроля за осуществлением этих мероприятий, не относится к событиям, на случай наступления которых осуществлено страхование, проводится Застрахованным лицом самостоятельно и за свой счет, т.е. расходы на первичное диагностирование не включаются в состав страховой выплаты вне зависимости от последующего признания / не признания события страховым случаем.
1.12. Период страхования - период времени, в течение которого наступление события, предусмотренного Договором страхования (страхового случая), влечет за собой возникновение обязанности Страховщика по осуществлению страховой выплаты. Период страхования начинается со дня, следующего за днем окончания периода ожидания (если период ожидания установлен) и действует до дня окончания срока действия Договора страхования включительно.
1.13. Срок действия Договора страхования – период времени в течение которого действует Договор страхования.
1.14. Психохирургия - лечение психических расстройств с помощью операций на головном мозге.
1.15. Стационар, стационарные условия - условия, обеспечивающие круглосуточное медицинское наблюдение и лечение.
1.16. Сервисная компания – специализированная организация, которая по поручению Страховщика]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="740" uuid="9224301d-a7f2-4393-bc2e-88864d63333d">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[обеспечивает организацию медицинских и иных услуг, предусмотренных Условиями страхования и Договором страхования, в Больницах или иных организациях.
1.17. Профессиональный спорт – часть спорта, направленная на организацию и проведение спортивных соревнований, за участие в которых и подготовку к которым в качестве своей основной деятельности спортсмены получают вознаграждение от организаторов таких соревнований и (или) заработную плату.
2. ОБЪЕКТ СТРАХОВАНИЯ
2.1. Объектом страхования являются не противоречащие законодательству Российской Федерации имущественные интересы, связанные с оплатой организации и оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг вследствие расстройства здоровья или состояния Застрахованного лица, требующих организации и оказания таких услуг, а также проведения профилактических мероприятий, снижающих степень опасных для жизни или здоровья Застрахованного лица угроз и (или) устраняющих их.
3. СТРАХОВОЙ РИСК.
СТРАХОВОЙ СЛУЧАЙ
3.1. Страховым риском является предполагаемое событие, на случай наступления которого проводится страхование. Событие, рассматриваемое в качестве страхового риска, должно обладать признаками вероятности и случайности его наступления.
Страховым риском, согласно Условиям страхования, является риск возникновения в период страхования обстоятельств, требующих оказания медицинских и иных услуг Застрахованному лицу в связи с:
3.1.1. Злокачественным новообразованием, а именно: злокачественным новообразованием, характеризующимся неконтролируемым ростом и распространением злокачественных клеток, проникающих в ткань различного гистологического типа, и относящимся к кодам C00-C43, C45-C97 по МКБ-10, за исключением: С44 – эпителиальных опухолей кожи (включая базалиому, плоскоклеточный рак), C91.1 – хронического лимфоцитарного В – клеточного лейкоза, а также возникновения новообразования при наличии у Застрахованного лица ВИЧ-инфекции или СПИДа.
Страховым случаем, с учетом всех положений, определений и исключений из страхования, предусмотренных Условиями страхования, является документально подтвержденное обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с ]]></text>
            </staticText>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="703" uuid="ecc020e8-b93a-4a15-9bde-5599dbe300fa">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[возникновением обстоятельств, предусмотренных настоящим разделом Условий, при одновременном наличии следующих условий: диагноз злокачественного новообразования подтвержден гистологическими или (в случае системных онкологических заболеваний) цитологическими исследованиями и заключением врача - онколога; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу впервые; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу в течение Периода страхования, по истечении периода ожидания; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, предусмотренных пунктом 10.1.2. Условий в течение Периода страхования.

4. ОБЪЕМ СТРАХОВОЙ ОТВЕТСТВЕННОСТИ
4.1. При наступлении страхового случая, предусмотренного Условиями и Договором страхования, Страховщик оплачивает организацию и оказание следующих медицинских и иных услуг в пределах установленной Договором страхования Страховой суммы:
4.1.1. Медицинская транспортировка (медицинская эвакуация) Застрахованного лица к поставщику медицинских услуг и/или между медицинскими организациями и возвращение обратно, включая трансфер автомобилем скорой медицинской помощи или на такси от места жительства до аэропорта (транспортного узла<sup>1</sup>), из аэропорта (транспортного узла) до отеля (апартаментов) и/или до медицинской организации, в которой будет проводиться лечение и обратно.
4.1.2. Оплата билета эконом класса для Застрахованного лица, а также при наличии медицинских показаний – оплата медицинского сопровождения и дополнительных мест и оборудования в самолете (ином средстве транспорта) при регулярном рейсе.
4.1.3. Проживание Застрахованного лица: подлежит оплате проживание в отеле (3 или 4 звезды) или эквивалентного стандартного номера в апартаментах с оплатой услуг, включенных в стоимость номера для Застрахованного лица. Не подлежат оплате дополнительные услуги, не включённые в стоимость номера.
4.1.4. Услуги по репатриации в случае смерти Застрахованного лица во время поездки: транспортировка останков Застрахованного лица до ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="739" uuid="8c240ce7-55c2-4c55-be46-8d26d37ce2c6">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[места постоянного проживания Застрахованного лица.
4.1.5. Лечение на территории Российской Федерации, проводимое по поводу страхового случая:
4.1.5.1. Медицинская помощь в амбулаторных условиях, в условиях дневного стационара, в стационарных условиях, в том числе:
а) осмотры врачами, в том числе врачами-специалистами;
б) диагностические медицинские вмешательства, выполняемые медицинскими организациями по выбору Сервисной компании на территории страны оказания услуг, в том числе лабораторные исследования, визуализирующие исследования, эндоскопические исследования, функциональная диагностика;
в) лечебные медицинские вмешательства в пределах страховой суммы (кроме имплантаций и трансплантации, которые производятся только в случаях, прямо указанных в Условиях и в объеме, указанном в Условиях), включающие хирургическое лечение, химиотерапию, лучевую терапию, иные методы лечения, научно обоснованные, разрешенные к применению на территории страны оказания услуг и применяемые в рамках оказания медицинской помощи медицинскими организациями по выбору Сервисной компании, на территории страны оказания услуг;
г) трансплантация костного мозга, выполняемая медицинской организацией, имеющей соответствующую лицензию, по выбору Сервисной компании;
д) имплантация, необходимая в целях реконструктивного лечения груди после проведения мастэктомии, включая стоимость имплантатов. Договором страхования может быть установлен лимит расходов на один страховой случай;
е) лекарственные средства и расходные материалы, применяемые при лечении в стационарных условиях и в условиях дневного стационара.
4.1.5.2. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода  страхования, оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 30 (Тридцати) календарных дней после окончания срока ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="2b6217e7-e3d5-4674-9bfb-57a9ceed5a59"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[4]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="12" y="718" width="240" height="40" uuid="1b4711fd-44d7-42c5-bb86-f3c85edcde5d">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[_______________________
<sup>1</sup> При отсутствии регулярных авиаперевозок]]></text>
            </staticText>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="d1b4258b-699c-45a7-8f3b-3d6d83519f04">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[возникла в связи с нарушением Застрахованным лицом рекомендаций лечащего врача и/или правил и распорядка медицинского учреждения, в котором Застрахованное лицо проходит лечение.
5.1.7. Психохирургия.
5.1.8. Хирургические операции по трансплантации органов или любого вида трансплантации костного мозга в следующих случаях:
5.1.8.1. если трансплантация таких органов и (или) их долей не предусмотрена Договором страхования;
5.1.8.2. если потребность в трансплантации органов возникла вследствие алкогольной болезни печени;
5.1.8.3. если трансплантация органов является аутологичной (реципиент трансплантата является донором для самого себя), за исключением трансплантации костного мозга;
5.1.8.4. если при трансплантации органов Застрахованное лицо является донором по отношению к третьему лицу;
5.1.8.5. если трансплантация органов включает в себя лечение стволовыми клетками (кроме трансплантации костного мозга).
5.1.9. Медицинские и иные услуги, выполняемые в эстетических и/или косметических целях, включая, но не ограничиваясь: операции по коррекции зрения (миопии, астигматизма, близорукости); бариатрические операции, включая, но не ограничиваясь операциями, направленными на уменьшение объема желудка или кишечника, кроме операций по реконструкции груди после резекции / удаления молочной железы, проведенной в рамках Договора страхования и в соответствии с его условиями.
5.1.10. Услуги и расходы в связи с родовыми травмами и/или врождёнными пороками развития.
5.1.11. Услуги, не назначенные Застрахованному лицу лечащим врачом, либо не являющиеся необходимыми с медицинской точки зрения по поводу страхового случая.
5.1.12. Услуги и расходы в связи с заболеваниями и состояниями, которые являются прямым или косвенным следствием синдрома приобретенного иммунодефицита (СПИД) или носительства вируса иммунодефицита человека (ВИЧ), включая мутацию и любое побочное действие.
5.1.13. Услуги и расходы в связи с расстройством здоровья, наступившим в местах лишения свободы, изоляторах временного содержания и других учреждениях, предназначенных для содержания лиц, подозреваемых, обвиняемых в совершении преступления или осужденных за совершенные преступления.
5.1.14. Услуги и расходы в связи с расстройством здоровья, наступившим в результате профессиональной деятельности Застрахованного лица, непосредственно]]></text>
            </staticText>
            <staticText>
                <reportElement x="2" y="10" width="260" height="740" uuid="b29634ef-c772-4979-9915-889e994378dd">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[действия Договора страхования, а также расходы в соответствии с п. 4.1.2. и 4.1.4. Условий.
4.1.5.3. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, при наличии состояния, угрожающего жизни Застрахованного лица (прекращение оказываемой медицинской помощи может повлечь смерть Застрахованного лица), оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 90 (девяноста) календарных дней после окончания срока действия Договора страхования, а также расходы в соответствии с п. 4.1.2. и 4.1.4. Условий.
4.2. Страховщик осуществляет оплату организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица (в том числе, но не ограничиваясь этим, при экстренной медицинской транспортировке Застрахованного лица), только в случае наличия медицинских показаний к сопровождению Застрахованного лица, определенных Врачом. Оплата организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица осуществляется в пределах лимитов (страховой суммы), установленных Договором страхования.
5. ИСКЛЮЧЕНИЯ
5.1. Если иное не предусмотрено Договором страхования, не являются страховыми случаями (не покрывается страхованием), и страховая выплата не производится по следующим событиям/заболеваниям и состояниям/расходам/услугам:
5.1.1. Услуги и расходы в связи с первичным диагностированием у Застрахованного лица заболевания.
5.1.2. Услуги и расходы, связанные с событиями / случаями, прямо не указанными в Договоре страхования как страховой случай.
5.1.3. Услуги и расходы, прямо не указанные в Договоре страхования как услуги и расходы, подлежащие организации и оплате.
5.1.4. Услуги и расходы по заболеваниям/состояниям, указанным в Договоре страхования, но возникшим до окончания периода ожидания или после истечения срока действия Договора страхования.
5.1.5. Услуги и расходы, оказанные / понесенные до окончания периода ожидания или после истечения срока действия Договора страхования, за исключением указанных в п.п. 4.1.5.2, 4.1.5.3. Условий.
5.1.6. Услуги и расходы, необходимость которых]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="cb35a8ec-7b4c-4ac5-92f4-701cb21cd3fc"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[5]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="b259296b-b4ae-4ddc-a57d-a5adeb4c3cc9"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[связанной с химическими веществами и газами (включая асбест, растворители, бензол, хлористый винил, бериллий, никель, соединения хрома, радон, пестициды, пыль с оксидом кремния, диоксины), со взрывчатыми веществами, с ионизирующими излучениями, ультрафиолетовым излучением, с микроволновым излучением, с высоковольтными электрическими сетями.
5.1.15. Услуги и расходы в связи с применением экспериментальных методов лечения, не допущенных к использованию в стране оказания услуг.
5.1.16. Услуги и расходы в связи со злокачественным новообразованием, протекающим на фоне ВИЧ–инфекции или СПИД.
5.1.17. Услуги и расходы в связи с существовавшими до даты заключения Договора страхования заболеваниями и состояниями, а также несчастными случаями, диагностированными / произошедшими Застрахованному лицу / с Застрахованным лицом или о которых было известно Застрахованному лицу до даты начала действия страхования (лечение, предусмотренное страхованием было рекомендовано или запланировано до момента заключения Договора страхования).
5.1.18. Услуги и расходы в связи с получением Застрахованным лицом медицинских и иных услуг в медицинских и иных организациях, выбор которых не был согласован с Сервисной компанией.
5.1.19. Услуги и расходы в связи с раком кожи, за исключением меланомы.
5.1.20. Услуги и расходы в связи с Эпителиальными опухолями кожи (включая базалиому, плоскоклеточный рак) (код С44 по МКБ-10), Хроническим лимфоцитарным В-клеточным лейкозом (код C91.1 по МКБ-10).
5.2. Дополнительно к основаниям, указанным в пункте 5.1. Условий страхования, не признаются страховыми случаями, и страховая выплата не осуществляется в связи с расходами на:
5.2.1. Компенсацию морального вреда, в том числе связанного с качеством услуг, оказываемых третьими лицами (медицинскими учреждениями и т.д.).
5.2.2. Возмещение упущенной выгоды.
5.2.3. Социальные, трудовые компенсации, гарантийные выплаты, пособия.
5.2.4. Расходы, превышающие страховые суммы и лимиты ответственности, установленные в Договоре страхования.
6. ПЕРИОД ОЖИДАНИЯ
6.1. Если иное не предусмотрено Договором страхования, при заключении Договора страхования устанавливается период ожидания длительностью 120 (Сто двадцать) дней с даты ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="e429e720-e2a6-4bca-81e7-5bb04545508f"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[заключения Договора страхования.
6.2. Если иное дополнительно не оговорено Договором страхования, период ожидания не устанавливается для Договоров страхования, заключаемых Страховщиком с тем же Страхователем повторно не позднее 30 (Тридцати) календарных дней с момента окончания срока действия ранее заключенного Договора страхования в соответствии с настоящими Условиями страхования. При повторном и последующем заключении Договора страхования с тем же Страхователем в пределах установленного настоящим пунктом Условий страхования срока, период ожидания равен нулю. Данное положение Условий страхования не требует дополнительного внесения во вновь заключаемый с тем же Страхователем Договор страхования изменений.
7. ТЕРРИТОРИЯ ДЕЙСТВИЯ СТРАХОВАНИЯ. ПЕРИОД СТРАХОВАНИЯ, СРОК ДЕЙСТВИЯ ДОГОВОРА СТРАХОВАНИЯ
7.1. Территорией страхования, организации и оказания услуг, если иное не предусмотрено Договором страхования, является – Российская Федерация.
7.2. Если иное не установлено Договором страхования, срок действия Договора страхования составляет 1 (один) год с момента вступления Договора страхования в силу. Если иное не установлено Договором страхования период  страхования начинается с 00 часов 00 минут 121 (Сто двадцать первого) дня с даты заключения Договора страхования и действует один год с даты вступления Договора страхования в силу.
7.3. Если иное не установлено Договором страхования, Договор страхования вступает в силу:
7.3.1. При первичном заключении Договора страхования, - в 00 часов 00 минут дня, указанного в Договоре страхования как «дата вступления Договора страхования в силу», при условии оплаты Страхователем страховой премии в полном объёме в срок, предусмотренный Договором страхования, и действует один год.
7.3.2. При повторном заключении Договора страхования (при условии оплаты страховой премии в полном объеме в течение 30 (Тридцати) календарных дней после окончания срока страхования ранее заключенного Договора страхования) - с 00 часов 00 минут дня, следующего за днем окончания срока действия предыдущего Договора страхования и действует один год.
7.3.3. При заключении Договора страхования по истечении 30 календарных дней с даты окончания срока действия предыдущего ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="6e8e4518-8b92-4087-8bc3-6374a4a3a853"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[6]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="ebce69ae-1e55-41b9-89ef-9372c09f0c0e"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[Договора страхования, - в 00 часов 00 минут дня, указанного в Договоре страхования как «дата вступления Договора страхования в силу», при условии оплаты Страхователем страховой премии в полном объёме в срок, предусмотренный Договором страхования, и действует один год.
7.4. Если иное не установлено Договором страхования или прямо не установлено настоящими Условиями, срок действия Договора страхования включает в себя Период ожидания.
8. ПОРЯДОК ОПРЕДЕЛЕНИЯ СТРАХОВОЙ СУММЫ, СТРАХОВОГО ТАРИФА, СТРАХОВОЙ ПРЕМИИ
8.1. Страховой суммой является денежная сумма, которая определена в порядке, установленном Договором страхования при его заключении, и исходя из которой устанавливается размер страховой премии, и размер страховой выплаты при наступлении страхового случая.
8.2. Размер страховой суммы устанавливается в Договоре страхования по соглашению Страховщика и Страхователя.
8.3. Договором страхования могут быть установлены лимиты ответственности Страховщика (ограничения максимальных сумм страховой выплаты в пределах страховой суммы) по отдельным случаям, заболеваниям (хирургическим операциям), видам расходов, и по различным их комбинациям.
8.4. Страховая сумма является уменьшаемой (агрегатной) страховой суммой, рассчитываемой как разность страховой суммы на начало срока действия Договора страхования и суммы страховой выплаты, осуществленной Страховщиком в период действия Договора страхования.
8.4.1. Если агрегатная страховая сумма исчерпана полностью, обязательства Страховщика по Договору страхования считаются исполненными в полном объеме. При этом Договор страхования прекращается досрочно, а уплаченная Страховщику страховая премия не подлежит возврату Страхователю.
8.5. Страховая сумма по Условиям устанавливается в рублях.
8.6. Страховой тариф представляет собой ставку страховой премии, взимаемую с единицы страховой суммы, с учетом объекта страхования и характера страхового риска, а также других условий страхования. Страховой тариф определяется  Страховщиком с применением базовых тарифных ставок, рассчитанных на один год страхования, и поправочных (повышающих /понижающих) коэффициентов к ним (их предельных значений), которые могут применяться в зависимости от]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="343ad776-f6fe-47a3-9b2a-dfe0132f92dc"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[характера (степени) страхового риска (в частности, состояние здоровья, сведения о профессии / профессиональной деятельности / роде занятий), иных условий страхования, указанных в Условиях.
8.7. Страховой тариф по конкретному Договору страхования определяется по соглашению Сторон и указывается в Договоре страхования.
8.8. Страховой премией является плата за страхование, которую Страхователь обязан уплатить Страховщику в порядке и в сроки, установленные Договором страхования.
При определении размера страховой премии, подлежащей уплате по Договору страхования, Страховщик применяет разработанные им страховые тарифы.
8.9. Страховая премия уплачивается в рублях, в соответствии с действующим законодательством Российской Федерации.
8.10. Если иное не предусмотрено Договором страхования, страховая премия уплачивается единовременно безналичным перечислением полной суммы страховой премии на расчетный счет Страховщика либо путем внесения средств в кассу Страховщика или получение денежных средств уполномоченным представителем Страховщика. Сумма и дата оплаты указываются на документе, подтверждающем оплату страховой премии.
8.10.1. Под документом, подтверждающим оплату страховой премии, понимается исполненное банком платежное поручение или иной документ о перечислении страховой премии по Договору страхования.
8.10.2. Если иное не предусмотрено Договором страхования, в случае несоответствия суммы оплаченной страховой премии размеру страховой премии, указанному в Договоре страхования, Договор страхования не вступает в силу, ошибочно оплаченная денежная сумма подлежит возврату Страхователю в полном объеме в течение 20 (двадцати) рабочих дней с даты получения письменного заявления Страхователя.
8.11. Если иное не предусмотрено Договором страхования, датой оплаты страховой премии Страхователем является:
8.11.1. при платеже путем безналичных расчетов — дата списания денежных средств с расчетного счета Страхователя для их перечисления на расчетный счет Страховщика;
8.11.2. при платеже путем наличных расчетов — дата внесения платежа в кассу Страховщика или получение денежных средств уполномоченным представителем Страховщика.
8.12. Страхователь обязан сохранять документы, подтверждающие оплату страховой премии, и предъявлять их по требованию Страховщика.]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="35dadf0f-70ab-4994-a115-57374c216644"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[7]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="200c22ab-7125-4584-9ae2-eb2ce01dd637"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[8.13. Страховщик оставляет за собой право уведомлять Страхователя о необходимости произвести оплату страховой премии и /или о факте прекращения Договора страхования в связи с истечением срока страхования. При этом уведомление посредством СМС-сообщений/чатов на номер мобильного телефона рассматривается Сторонами как надлежащее уведомление и считается сделанным в письменной форме.
9. ПОРЯДОК ЗАКЛЮЧЕНИЯ, ИСПОЛНЕНИЯ И ПРЕКРАЩЕНИЯ ДОГОВОРА СТРАХОВАНИЯ
9.1. По Договору страхования Страховщик обязуется за обусловленную Договором страхования плату (страховую премию), уплачиваемую Страхователем, организовать предоставление Застрахованному лицу медицинских и иных услуг и оплатить их при наступлении предусмотренного Договором страхования события (страхового случая), в порядке и объеме, определенном Договором страхования.
9.2. При наличии расхождений между положениями Договора страхования, Условий и Правил страхования преимущественную силу имеют положения Договора страхования.
9.3. Если после заключения Договора страхования будет установлено, что Страхователь сообщил Страховщику заведомо ложные сведения об обстоятельствах, имеющих существенное значение для заключения Договора страхования, Страховщик вправе признать Договор недействительным и требовать применения последствий, предусмотренных Гражданским кодексом Российской Федерации.
9.4. Договор страхования заключается в письменной форме на основании устного заявления Страхователя. Несоблюдение письменной формы влечет недействительность Договора страхования.
9.5. Договор страхования может заключаться путем:
9.5.1. Составления одного документа, подписанного сторонами. Договор страхования в этом случае скрепляется собственноручной подписью Страхователя и аналогом собственноручной подписи уполномоченного лица и печати Страховщика. Под аналогом собственноручной подписи и печати понимается их графическое воспроизведение. Договор страхования составляется в двух экземплярах.
9.5.2. Вручения Страхователю на основании устного заявления страхового полиса, подписанного Страховщиком. В этом случае, согласие Страхователя заключить Договор страхования на предложенных Страховщиком условиях подтверждается принятием от ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="79c58ef6-78d9-40a6-b7ac-d3d7ef808b2d"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[Страховщика Страхового полиса и Условий. Принятие Страхователем Страхового полиса и Условий страхования подтверждается оплатой Страхователем страховой премии в порядке и сроки, установленные Договором страхования. Подписание Страхового полиса Страховщиком с использованием факсимильного (или иного графического) воспроизведения подписи уполномоченного представителя и печати Страховщика является надлежащим подписанием Договора страхования со стороны Страховщика.
9.5.3. Направления электронного Договора страхования на основании письменного или устного заявления Страхователя с использованием официального сайта Страховщика в информационно-телекоммуникационной сети «Интернет» (согласно ст. 6.1. Закона Российской Федерации от 27.11.1992 №4015-1 «Об организации страхового дела в Российской Федерации»). В случае направления Страховщиком Страхователю – физическому лицу на основании его заявления Договора страхования, подписанного усиленной квалифицированной электронной подписью Страховщика, Договор страхования, составленный в виде электронного документа, считается заключенным Страхователем на предложенных Страховщиком условиях с момента уплаты Страхователем страховой премии или первого страхового взноса. Страхователь-физическое лицо уплачивает страховую премию (первый страховой взнос) после ознакомления с условиями, содержащимися в Договоре страхования и Условиях страхования, подтверждая тем самым свое согласие заключить этот Договор страхования на предложенных Страховщиком условиях.
Страховщик вправе предусмотреть на своем официальном сайте в сети «Интернет» возможность создания и отправки Страхователем (Застрахованным лицом, Выгодоприобретателем) Страховщику информации в электронной форме (в т. ч. обращений, касающихся заключения и/или изменения и/или досрочного прекращения Договора страхования и/или страховой выплаты и связанных с ними документов / сведений). При этом требования к использованию электронных документов и порядок обмена информацией в электронной форме (в т. ч. случаи и порядок создания и отправки указанной в настоящем пункте информации) устанавливаются соглашением между Страхователем (Застрахованным лицом, Выгодоприобретателем) и Страховщиком в соответствии с действующим]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="761e89d3-7b66-41a3-8def-6f8783bb064e"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[8]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="8440dabc-6362-4fe5-a2a0-e8f9539e3090">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[законодательством Российской Федерации.
Любые документы, оформленные Страховщиком и/или Страхователем (Застрахованным лицом, Выгодоприобретателем) в виде электронного документа в соответствии с требованиями действующего законодательства и указанного в настоящем пункте соглашения, признаются равнозначными документам, оформленным на бумажном носителе.
9.6. В случае утраты Страхователем страхового полиса или Договора страхования, по письменному заявлению Страхователя Страховщиком в период его действия выдается дубликат. После выдачи дубликата утраченный документ считается недействительным и выплаты по нему не производятся.
9.7. Страховщик может отдельно оговаривать в Договоре страхования положения, по которым должно быть достигнуто соглашение Сторон и которые в этой связи будут считаться существенными условиями Договора страхования. При несоблюдении данных положений Договор страхования будет считаться незаключенным и страховые выплаты по нему не будут производиться. В случаях, предусмотренных настоящим пунктом (если Договор страхования считается незаключенным) Страховщик производит возврат поступивших денежных средств в течение 20 (двадцати) рабочих дней с момента получения письменного заявления Страхователя.
9.8. Страховщик вправе, не изменяя сведения, обобщать и структурировать в процессе заключения и исполнения Договора страхования всю или часть имеющейся у него информации из Платежного поручения и /или информации, представленной Страхователем (в том числе для заключения Договора страхования), в своей базе данных. При этом Страховщик вправе формировать на основании базы данных документы (выгрузки, выписки, отчеты и т. д.), которые будут обладать той же юридической силой в части установления условий страхования, что и первоисточники.
9.9. Договор страхования прекращается в случаях:
9.9.1. Истечения срока, на который он был заключен - в 24 часа 00 минут дня его окончания, если Договором страхования не предусмотрено иное.
9.9.2. Исполнения Страховщиком обязательств по Договору страхования в полном объеме – с 00 часов 00 минут дня, следующего за днем исполнения указанных обязательств.
9.9.3. По соглашению сторон – с 00 часов 00 минут дня указанного, как дата досрочного прекращения Договора страхования в соответствующем письменном Соглашении.]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="eb12baba-d08f-439b-b213-37d561b3081f"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[9.9.4. Если возможность наступления страхового случая отпала, и существование страхового риска прекратилось по обстоятельствам иным, чем страховой случай – с 00 часов 00 минут даты прекращения существования страхового риска. В этом случае Страховщик имеет право на часть страховой премии, пропорционально времени, в течение которого действовало страхование.
9.9.5. По требованию Страхователя. Страхователь вправе отказаться от Договора страхования в любое время, если к моменту отказа возможность наступления страхового случая не отпала по обстоятельствам, указанным в п 9.9.4 Условий.
Договор страхования считается прекратившим свое действие с даты получения Страховщиком письменного заявления Страхователя об отказе от Договора страхования или иной даты, установленной по соглашению сторон, но не ранее даты получения письменного заявления Страхователя об отказе от Договора страхования, за исключением случая, указанного в п. 9.9.5.1. Условий.
9.9.5.1. Страхователь - физическое лицо, имеет право отказаться от Договора страхования в течение 14 (четырнадцати) календарных дней со дня его заключения независимо от момента уплаты страховой премии, при отсутствии в данном периоде событий, имеющих признаки страхового случая, при этом уплаченная страховая премия подлежит возврату Страховщиком Страхователю в полном объеме. Договор страхования считается прекратившим свое действие с даты получения Страховщиком письменного заявления Страхователя об отказе от Договора страхования или иной даты, установленной по соглашению сторон, но не позднее срока, определенного в соответствии с п. 9.9.5.1. Условий.
9.9.5.2. Если Страхователь – физическое лицо, отказался от Договора страхования в иной срок, чем предусмотренный п. 9.9.5.1. Условий, при отсутствии в данном периоде событий, имеющих признаки страхового случая, Страховщик при возврате уплаченной страховой премии удерживает ее часть пропорционально сроку действия Договора страхования, прошедшему с даты начала действия страхования, а также понесённые Страховщиком расходы на ведение дела, согласно утвержденной Страховщиком структуре тарифной ставки.
9.9.5.3. Возврат страховой премии в случаях, указанных в пп. 9.9.5.1, 9.9.5.2 Условий, осуществляется по выбору Страхователя наличными деньгами или в безналичном порядке в срок не превышающий 10 (десяти) рабочих дней со дня получения письменного ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="5bc40949-06d0-42cd-bbf5-6af4762669c4"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[9]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="a29d2aad-24c3-47c8-82b3-9993808dda57"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[заявления Страхователя об отказе от Договора страхования.
9.9.6. В иных случаях, предусмотренных законодательством Российской Федерации, Условиями и Договором страхования.
9.9.7. В целях заключения Договора страхования, изменения условий Договора страхования, получения страховой выплаты, в случаях и порядке, предусмотренных настоящими Условиями, Страхователь (Застрахованное лицо, Выгодоприобретатель) вправе направить информацию в электронной форме с использованием официального сайта Страховщика в информационно-телекоммуникационной сети «Интернет» согласно ст. Закона Российской Федерации от 27.11.1992 № 4015-1 «Об организации страхового дела в Российской Федерации».
9.10. В период действия Договора страхования Страхователь обязан незамедлительно, но в любом случае не позднее 30 (тридцати) календарных дней, сообщить Страховщику об изменениях в сведениях или контактной информации о Страхователе. Любые извещения, заявления и обращения, направляемые Сторонами друг другу в рамках исполнения Договора страхования, а также лицами, в пользу или в отношении которых заключен Договор страхования, должны совершаться в письменной форме, и направляться по почтовым адресам, адресам электронной почты, телефонам и иным контактным данным Сторон, указанным в Договоре страхования (например, в письменном заявлении, уведомлении об изменении контактной информации или реквизитов).
9.11. Страховщик уведомляет заинтересованных лиц об изменении своей контактной информации и иных сведений путем размещения информационного сообщения на официальном сайте Страховщика. Если иное не установлено законом или Договором страхования, Страховщик вправе направлять Страхователю (Выгодоприобретателю, Застрахованному) сообщения посредством смс-сообщений, электронной почты по адресу, согласно сведениям, указанным Страхователем (Выгодоприобретателем, Застрахованным) в имеющихся у Страховщика документах, или посредством размещения информации на официальном сайте Страховщика в сети «Интернет». В таком случае сообщение считается направленным надлежащим образом, если можно достоверно установить, от кого исходило сообщение и кому оно адресовано.
9.12. Внесение изменений в Договор страхования осуществляется в порядке, установленном законодательством Российской Федерации.
10. ПОРЯДОК ВЗАИМОДЕЙСТВИЯ СТОРОН ПРИ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="33f0ea6b-a64c-448a-9b40-b282b498d7bf"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[НАСТУПЛЕНИИ СОБЫТИЯ, ИМЕЮЩЕГО ПРИЗНАКИ СТРАХОВОГО СЛУЧАЯ
10.1. Уведомление о событии, имеющего признаки страхового случая.
10.1.1. После получения подтвержденного диагноза заболевания, указанного в п. 3.1 Условий, Страхователь должен в Период страхования, в кратчайшие сроки обратиться в Сервисную компанию с уведомлением о наступлении события, имеющего признаки страхового случая, с последующим предоставлением документов, которые запросит Сервисная компания.
10.1.2. Для признания события страховым случаем Сервисная компания вправе запросить оригиналы или заверенные надлежащим образом копии документов:
10.1.2.1. Уведомление о событии, имеющем признаки страхового случая, а также заявление о наступлении страхового случая (по форме, предложенной Страховщиком/Сервисной компанией).
10.1.2.2. Документ, удостоверяющий личность Страхователя (для гражданина Российской Федерации – паспорт гражданина Российской Федерации; для иностранного гражданина или лица без гражданства - документ, подтверждающий право на пребывание (проживание) в Российской Федерации; для временно проживающих – разрешение на временное проживание на территории Российской Федерации; для постоянного проживающих – вид на жительство; для беженцев – удостоверение беженца; для вынужденных переселенцев - удостоверение вынужденного переселенца).
10.1.2.3. Договор страхования и платежный документ, подтверждающий его оплату страховой премии.
В случае, если Страхователем производилось заключение Договоров страхования в соответствии с п.6.2 Условий, - все ранее заключенные Договоры страхования с платежными документами, подтверждающими их оплату.
10.1.2.4. Согласие Застрахованного лица на обработку его персональных данных (включая, все действия, перечисленные в ст. 3 Федерального закона от 27.07.2006 №152-ФЗ «О персональных данных» (далее - Закон)), в целях надлежащего исполнения Договора страхования, организации оказания услуг в отношении Страховщика, Сервисной компании, их уполномоченных представителей, а также третьих лиц, оказывающих услуги в связи с диагностированным заболеванием Застрахованного лица.
10.1.2.5. Согласие Застрахованного лица в ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="4c41f6b4-331d-489e-90bc-16d652c54712"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[10]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="3bba0d1a-5dec-4fbc-b56a-c127d58347a8"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[соответствии с п. 3 ст. 13 Федерального закона от 21.11.2011 № 323-ФЗ «Об основах охраны здоровья граждан Российской Федерации» любому лечебному учреждению и/или врачу предоставлять ООО «РСХБ-Страхование жизни», осуществляющему страхование по Договору страхования, а также Сервисной компании по Договору страхования любые сведения, связанные с ним и составляющие врачебную тайну (любые медицинские документы и/или их заверенные копии, результаты лабораторных и инструментальных исследований, результаты лечения, прогноз по заболеванию и т.д.), как в связи с оценкой степени страхового риска, так и в связи с событиями, имеющими признаки страхового случая.
10.1.2.6. Медицинский документ (выписка из медицинской карты амбулаторного / стационарного больного, выписной эпикриз), заверенный печатью выдавшего учреждения и подписью ответственного лица, с указанием диагноза, послужившего причиной обращения за медицинской помощью в рамках настоящих Условий страхования, сроков лечения, результатов обследования и другой сопутствующей информации.
10.1.2.7. Результаты и заключения инструментальных, лабораторных методов диагностики / исследований, в т.ч.: гистологических или цитологических (в случае системных онкологических заболеваний); радиологических визуализирующих исследований; данные магнитно-резонансной томографии, результаты коронарной ангиографии.
10.1.2.8. Выписка из медицинской карты амбулаторного больного, содержащая информацию об имеющихся у Застрахованного лица заболеваниях за последние 5 лет.
10.1.2.9. Медицинский документ из онкологического диспансера по месту жительства о наличии и дате (датах) обращений либо об отсутствии обращений, а также Извещение о больном с впервые в жизни установленным диагнозом (форма 090/У).
10.1.2.10. Заключение врача – специалиста в предметной области с указанием полного клинического диагноза, показаний к лечению, подтверждающее необходимость назначенного лечения, а так же выбранный план лечения.
Указанный перечень документов и сведений является исчерпывающим. Страховщик (Сервисная компания) вправе сократить перечень документов, указанный в настоящем пункте, а также принять взамен указанных иные документы.
Если соглашением Сторон прямо не предусмотрено иное, документы, перечисленные выше в п. 10.1.2 Условий, должны ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="cd12cc7f-04b7-46b6-8013-20462a938ed7"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[предоставляться в виде оригиналов или в виде копий, заверенных нотариально или органом / учреждением / организацией, которые выдали документ и/или располагают его подлинником.
10.2. В случае признания события страховым случаем - в течение 15 (Пятнадцати) рабочих дней с момента получения Сервисной организацией полного комплекта документов по заявленному событию, Сервисная компания начинает организацию необходимых Застрахованному лицу услуг, предусмотренных страхованием, и информирует Застрахованное лицо о:
- специализированных медицинских учреждениях, центрах;
- рекомендованном лечащем враче – специалисте;
- дальнейших действиях Застрахованного лица, необходимых для оказания услуг, предусмотренных Договором страхования.
10.3. Если наступившее событие не признано страховым случаем, Страховщик в течение 10 (десяти) рабочих дней с момента принятия решение о непризнании события страховым случаем письменно информирует об этом Застрахованное лицо.
11. ПОРЯДОК ОПРЕДЕЛЕНИЯ И ОСУЩЕСТВЛЕНИЯ СТРАХОВОЙ ВЫПЛАТЫ, ОКАЗАНИЯ МЕДИЦИНСКИХ УСЛУГ
11.1. Предоставление медицинских и иных услуг, обусловленных Договором страхования осуществляется путем обращения Застрахованного лица в Сервисную компанию, указанную в Договоре страхования.
11.2. Застрахованное лицо при обращении в Сервисную компанию предоставляет документы, указанные в п. 10.1.2. Условий страхования.
11.3. Страховая выплата производится путем оплаты Страховщиком стоимости медицинских и иных услуг, предусмотренных Договором страхования непосредственно на счет Сервисной компании или иному лицу, организовавшему по согласованию со Сервисной компанией (Страховщиком) оказание медицинских и иных услуг Застрахованному лицу.
11.4. Размер страховой выплаты определяется в размере стоимости оказанной Застрахованному лицу медицинской и иной помощи в объеме, предусмотренном Договором страхования.
11.5. Перечисление страховой выплаты осуществляется Страховщиком на основании выставленного счета за оказанные медицинские и иные услуги.
11.5.1. Счет должен содержать: фамилию, имя, отчество (при наличии отчества) Застрахованного; дату его рождения; номер Договора страхования; диагноз; итоговую сумму к оплате; дату страхового случая; данные документа, удостоверяющего личность ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="b74b9393-9856-46bb-8942-2f1b37f2489c"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[11]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="3c2e9e69-1a05-4f39-9a74-4180365b24a8"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[Застрахованного (в т.ч. паспортные данные Застрахованного (серия (при наличии), номер, дата и место выдачи, наименование и номер выдавшего органа); полных банковских реквизитов Сервисной компании.
11.5.2. К счету должны быть приложены копии медицинских документов из клиники, содержащих информацию о диагнозе, состоянии здоровья Застрахованного лица, проведённом лечении, проведенных обследованиях Застрахованного, лабораторных исследованиях, а также копии счетов организаций, оказавших Застрахованному услуги.
11.6. Договор страхования может предусматривать возмещение расходов, понесенных  Выгодоприобретателем (Страхователем, Застрахованным лицом) по оплате медицинских и иных услуг, оказанных по согласованию с Сервисной компанией (Страховщиком) и в соответствии с условиями Договора страхования, непосредственно Выгодоприобретателю (Застрахованному лицу, Страхователю) наличными денежными средствами или перечислением на его счет. При этом затраты должны быть признаны Страховщиком обоснованными на основании документов, перечисленных в пункте 10.1.2 Условий страхования, подтверждающих необходимость понесенных затрат и факт оплаты.
11.6.1. В этом случае Выгодоприобретатель (Страхователь, Застрахованное лицо) дополнительно к документам, указанным в п. 10.1.2, предоставляет:
- заявление на выплату от Выгодоприобретателя, с указанием реквизитов для перечисления страховой выплаты;
- документы, подтверждающие правоспособность лица, обратившегося за выплатой.
- счета из организаций, оказавших услуги с указанием наименований услуг, стоимости, дат их оказания, номера Договора с организацией;
- оригиналы платежно-расчетных документов, подтверждающих факт оплаты медицинских и иных услуг, включенных в Договор страхования;
- копию направления на оказание медицинской помощи в амбулаторных, условиях дневного стационара, стационарных условиях из медицинской организации, предусмотренной Договором страхования (согласованной Сервисной компанией (Страховщиком)), заверенную надлежащим образом;
- документы, подтверждающие оказание Застрахованному лицу соответствующих услуг (заключение о проведенном обследовании или лечении, выписку из истории болезни, выписной эпикриз, результаты обследования, амбулаторную карту и т.д.);
- копию лицензии (с приложениями) медицинской]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="5c2d8515-fb02-403c-bc9c-7c6a41dd98c7"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[12]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="a634eb7b-3ae9-4628-9929-b1a72ec693c3">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[ организации, в которой Застрахованное лицо проходило лечение (в случае компенсации расходов на лечение).
11.6.2. Страховщик вправе сократить перечень обязательных для представления документов, если обстоятельства страхового случая или размер причиненного ущерба Страховщику известны и не вызывают у него сомнения.
11.7. После представления Выгодоприобретателем (Застрахованным лицом, Страхователем), всех необходимых документов, указанных в п. 10.1.2, 11.6.1, позволяющих судить о причинах и обстоятельствах, повлекших наступление события, обладающего признаками страхового случая, и о размере страховой выплаты, Страховщик в течение 15 (пятнадцати) рабочих дней (если иной срок не предусмотрен в Договоре страхования) со дня представления Выгодоприобретателем (Застрахованным лицом, Страхователем) всех необходимых документов обязан принять одно из следующих решений:
11.7.1. О признании заявленного события страховым случаем.
В этом случае в указанный в п. 11.7 Условий страхования срок Страховщик утверждает Страховой акт, и Сервисная организация начинает осуществлять организацию оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг, либо Страховщик производит страховую выплату в случаях, предусмотренных п.11.6. Условий, в течение 10 (десяти) рабочих дней с даты утверждения Страхового акта, если иные сроки не предусмотрены Договором страхования.
11.7.2. Об отказе в страховой выплате.
В этом случае в течение 10 (десяти) рабочих дней с момента принятия решения об отказе в страховой выплате (в срок, предусмотренный п. 11.7. Условий) Страхователю (Застрахованному лицу, Выгодоприобретателю) направляется письменное уведомление с мотивированным обоснованием причин отказа, если иные сроки не предусмотрены Договором страхования.
11.7.3. О проведении страхового расследования.
Страховщик имеет право, письменно уведомив Страхователя (Застрахованное лицо, Выгодоприобретателя), вынести мотивированное решение об отсрочке принятия решения о признании или непризнании события страховым случаем или об отказе в страховой выплате, в случаях если:
- по фактам, послужившим причиной наступления страхового случая, возбуждено уголовное дело или начат судебный процесс - до окончания производства по уголовному делу или судебному процессу (до события, которое наступит ранее);
- возникла необходимость в экспертизе представленных документов. Отсрочка возможна, в случае, если у Страховщика имеются ]]></text>
            </staticText>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="c6a74402-7efc-4b13-a6c0-dc8a9f5cb0b4"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[мотивированные сомнения в подлинности документов, подтверждающих страховой случай;
- полученные Страховщиком и предусмотренные Договором страхования документы не подтверждают наличие страхового события, в связи с чем возникла необходимость в запросе дополнительных документов. В этом случае, Страховщик вправе запросить дополнительно документы у Страхователя (Застрахованного лица, Выгодоприобретателя) и/или компетентных органов. При этом Страховщик обязан обосновать в своем запросе необходимость предоставления ему таковых документов.
Страховое расследование проводится в течение 30 (тридцати) рабочих дней после получения всей необходимой информации в соответствии с настоящим пунктом Условий страхования.
Решение о признании или непризнании события страховым случаем или об отказе в страховой выплате принимается в течение 15 (пятнадцати) рабочих дней после завершения страхового расследования.
11.8. Размер страховой выплаты определяется в зависимости от условий страхования, изложенных в конкретном Договоре страхования.
11.9. Страховщик не несет ответственность за объем и качество предоставляемых медицинских и иных услуг.
12. ПРАВА И ОБЯЗАННОСТИ СТОРОН
12.1. Страховщик и/или Сервисная компания имеют право:
12.1.1. Проверять подлинность документов и достоверность информации, сообщаемой Страхователем, любыми доступными ему способами, не противоречащими действующему законодательству, в том числе назначать соответствующие экспертизы, запрашивать дополнительные сведения у Страхователя, направлять запросы в компетентные органы, медицинские и иные учреждения.
12.1.2. Требовать от Застрахованного лица (Выгодоприобретателя) выполнения обязанностей по Договору страхования, включая обязанности, лежащие на Страхователе, но не выполненные им,  при предъявлении Выгодоприобретателем требования о страховой выплате.
12.1.3. При наступлении события, имеющего признаки страхового случая, самостоятельно выяснять причины, обстоятельства наступившего события, имеющего признаки страхового случая. При необходимости потребовать у Страхователя (Застрахованного лица) прохождения медицинского обследования в указанном Страховщиком (Сервисной компании) лечебном учреждении либо у указанного Страховщиком (Сервисной компании) врача, если требуется дополнительная информация об подтверждении факта (причин) происшедшего события,]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="a380a223-bf7d-4214-b0a2-f9ee89ee6fcc">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[ имеющего признаки страхового случая.
12.1.4. Потребовать признания Договора страхования недействительным, если после заключения Договора страхования будет установлено, что Страхователь сообщил заведомо ложные сведения об обстоятельствах, имеющих существенное значение для определения вероятности наступления страхового случая и размера возможных убытков от его наступления (страхового риска).
12.1.5. Запросить сведения и/или документы, получение которых обусловлено требованиями законодательства Российской Федерации в сфере противодействия легализации (отмыванию) доходов, полученных преступным путем, и финансированию терроризма.
12.2. Страховщик обязан:
12.2.1. Разъяснять положения, содержащиеся в Условиях и Договоре страхования, по требованиям Страхователей, Застрахованных лиц, а также лиц, имеющих намерение заключить Договор страхования.
12.2.2. При наступлении страхового случая осуществить организацию оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг или страховую выплату в установленный Условиями и Договором страхования срок.
12.2.3. Обеспечить конфиденциальность во взаимоотношениях со Страхователем, не разглашать сведения о Договоре страхования, Страхователе, Застрахованном лице, их имущественном положении и состоянии здоровья, за исключением случаев, предусмотренных законодательством Российской Федерации.
12.2.4. Предоставить Страхователю информацию о лицензии Страховщика, контактах (месте нахождения, телефон/факс) и режиме работы структурного подразделения Страховщика и привлеченных Страховщиком сторонних организаций для оказания страховых услуг или сообщить информацию о сайте в информационно-телекоммуникационной сети «Интернет», на котором размещается вышеуказанная информация.
12.3. Страхователь имеет право:
12.3.1. Получить Условия, любые разъяснения по Условиям и заключенному Договору страхования.
12.3.2. Получить на основании письменного заявления дубликат Договора страхования в случае утери подлинника.
12.3.3. Требовать предоставления Застрахованному лицу медицинских и иных услуг, обусловленных Договором страхования, в соответствующем порядке и сроки.
12.3.4. Получить информационно – консультационные услуги Сервисной компании (по телефону, указанному в Договоре ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="6c3a2a09-75f2-435e-b86a-c987646ea8ec"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[13]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="36126120-8b90-4bca-8eff-7b4724bb0eb3"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[страхования) в связи с заболеваниями / состояниями, предусмотренными в Договоре страхования, в том числе:
 12.3.4.1. разъяснения по условиям страхования, порядку и условиям получения услуг, предусмотренных Договором страхования;
12.3.4.2. информацию по порядку получения медицинской помощи в рамках программ Обязательного медицинского страхования;
12.3.5. Получать консультацию медицинских специалистов по вопросам подготовки к диагностическим и лабораторным исследованиям, в том числе по телефону, посредствам видеосвязи и чатов.
12.3.6. Один раз в течение Периода страхования получить второе медицинское мнение по поводу впервые диагностированных заболеваний / состояний, предусмотренных Договором страхования на основании выписного эпикриза, предоставленного Страхователем (Застрахованным лицом).
12.4. Страхователь обязан:
12.4.1. До заключения Договора страхования ознакомиться с настоящими Условиями, Договором страхования (в том числе текстом Декларации).
12.4.2. Своевременно и в полном объеме уплачивать обусловленную Договором страхования страховую премию.
12.4.3. При заключении Договора страхования сообщить и/или иным образом подтвердить Страховщику необходимую достоверную информацию, касающуюся Застрахованного лица, а также все известные обстоятельства, имеющие существенное значение для определения вероятности наступления страхового случая. Существенными являются в том числе сведения, приведенные в настоящих Условиях и Договоре страхования.
12.4.4. Ознакомить Застрахованное лицо, указанное в Договоре страхования, с Условиями страхования и условиями Договора страхования.
12.4.4.1. В случае заключения Договора страхования в соответствии с п. 9.5.2-9.5.3 Условий, - обеспечить соответствие достоверности данных, указанных в Декларации о состоянии здоровья Застрахованного лица, являющейся частью Страхового полиса и фактических данных о Застрахованном лице.
Подтверждением согласия Страхователя с данными, изложенными в Декларации Страхового полиса, является уплата страховой премии.
12.4.5. Предоставлять Страховщику информацию, необходимую для исполнения требований законодательства Российской Федерации в сфере противодействия легализации (отмыванию) доходов, полученных преступным путем, и финансированию терроризма, включая информацию о своих]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="8a10ee73-a383-4a89-984d-e574e827f82f">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[ выгодоприобретателях, учредителях (участниках) и бенефициарных владельцах.
12.4.6. В период действия Договора страхования сообщать Страховщику о ставших ему известными значительных изменениях в обстоятельствах, сообщенных Страховщику при заключении Договора страхования, если эти изменения могут существенно повлиять на увеличение страхового риска.
13. ОСНОВАНИЯ ОТКАЗА В СТРАХОВОЙ ВЫПЛАТЕ
13.1. Страховщик освобождается от страховой выплаты в следующих случаях:
13.1.1. Если страховой случай по любому страховому риску наступил вследствие умысла Страхователя, Выгодоприобретателя или Застрахованного лица.
13.1.2. Если страховой случай по любому страховому риску наступил вследствие:
13.1.2.1. Воздействия ядерного взрыва, радиации или  радиоактивного заражения.
13.1.2.2. Военных действий, а также маневров или иных военных мероприятий.
13.1.2.3. Гражданской войны, народных волнений всякого рода или забастовок.
13.2. Страховщик отказывает в страховой выплате по следующим основаниям:
13.2.1. Произошедшее событие не является страховым случаем, т.е. не относится к событиям, на случай наступления которых был заключен Договор страхования (например, отнесено к исключениям (раздел 5 Условий страхования) или не может быть квалифицировано в качестве страхового случая, исходя из терминов и определений, определенных Условиями страхования).
13.2.2. Событие произошло до начала или после окончания (в т. ч. досрочного) срока действия Договора страхования (например, после прекращения срока действия Договора страхования).
13.2.3. Событие произошло в период ожидания.
13.2.4. Сумма страховой выплаты превышает лимит ответственности (лимит страхового обязательства). При этом возможен частичный отказ в страховой выплате пропорционально превышению лимита.
13.2.5. Событие произошло с лицом, которое не является Застрахованным лицом по Договору страхования, или событие произошло по страховому риску, который не предусмотрен в отношении Застрахованного лица.
13.2.6. По основаниям, предусмотренным действующим законодательством Российской Федерации (в т. ч. если Страховщик освобожден от страховой выплаты).
14. ПОРЯДОК РАЗРЕШЕНИЯ СПОРОВ
14.1. При разрешении споров между Страхователем (Застрахованным лицом, ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="117052fe-c31d-4e45-ad2e-6e9abb91f162"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[14]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="2" y="10" width="260" height="748" uuid="475a39be-949f-4191-a7de-1f58f049c89f"/>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[Выгодоприобретателем) и Страховщиком стороны применяют обязательный претензионный досудебный порядок, если иное не предусмотрено законом.
14.2. Претензия должна содержать следующие реквизиты:
- наименование «претензия»;
- дата и место ее составления;
- суть требований и обстоятельства, имеющие отношение к событию, имеющему признаки страхового случая, и явившиеся основанием для предъявления претензии;
- сумма претензии и порядок ее расчета;
- подпись представителя стороны, имеющей претензию к другой стороне, и документ, подтверждающий его полномочия.
К претензии должны быть приложены документы, подтверждающие обоснованность заявленных в претензии требований.
14.3. Письменная мотивированная претензия должна быть вручена уполномоченному представителю стороны лично или направлена по почте заказным письмом с описью вложения и уведомлением о вручении.
14.4. Претензии, направленные иным образом, к рассмотрению не принимаются.
14.5. Надлежащим образом врученная претензия должна быть рассмотрена в течение 30 (тридцати) рабочих дней с даты ее получения.
14.6. Если иное не предусмотрено Договором страхования, все споры, которые возникли между Страховщиком и Страхователем (Застрахованным лицом, Выгодоприобретателем) в связи с Договором страхования и неразрешенные в досудебном порядке передаются в суд в соответствии с законодательством Российской Федерации.
15. ПЕРСОНАЛЬНЫЕ ДАННЫЕ. ТАЙНА СТРАХОВАНИЯ
15.1. Страховщик не вправе разглашать полученные им в результате своей профессиональной деятельности сведения о Страхователе (Застрахованном лице, Выгодоприобретателе), состоянии их здоровья, а также об имущественном положении этих лиц (тайна страхования).
15.2. При обработке персональных данных Страхователя (Застрахованного лица, Выгодоприобретателя), являющегося физическим лицом (далее – персональные данные), Страховщик должен руководствоваться законодательством Российской Федерации в области персональных данных.
15.3. Обработка персональных данных Страховщиком осуществляется:
15.3.1. Для целей заключения, исполнения (в том числе исполнения обязательств Сервисной компанией), изменения, прекращения Договора страхования.
]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="70470a51-9adf-40d7-9081-aa4023e8929a">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[15.3.2. Для целей перестрахования Страховщиком рисков, принятых по Договору страхования, и заключения, исполнения, 	изменения, прекращения соответствующего(-их) Договора(-ов) перестрахования.
15.3.3. Для предусмотренных законом целей, а также для осуществления и выполнения возложенных законодательством Российской Федерации на Страховщика функций, полномочий и обязанностей.
15.3.4. Для целей осуществления прав и законных интересов Страховщика (в т. ч. оценки страхового риска).
15.3.5. Для иных законных и заявленных субъекту персональных данных целей (при наличии).
15.4. Заключая Договор страхования, Страхователь подтверждает свое ознакомление с заявленными целями обработки персональных данных.
15.5. При обработке персональных данных Страховщик обязан соблюдать безопасность и конфиденциальность обрабатываемых персональных данных, а также выполнять иные требования, предусмотренные законодательством Российской Федерации в области персональных данных.
15.6. Страховщик обязан принимать меры, необходимые и достаточные для обеспечения выполнения указанных обязанностей. При этом Страховщик самостоятельно определяет состав и перечень мер, необходимых и достаточных для обеспечения выполнения обязанностей. В частности, Страховщик при обработке персональных данных обязан принимать необходимые правовые, организационные и технические меры или обеспечивать их принятие для защиты персональных данных от неправомерного или случайного доступа к ним, уничтожения, изменения, блокирования, копирования, предоставления, распространения персональных данных, а также от иных неправомерных действий в отношении персональных данных.]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="5295c35b-5de3-43d3-a556-37ae673c79a4"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[15]]></textFieldExpression>
            </textField>
        </band>
    </detail>
    <pageFooter>
        <band height="30"/>
    </pageFooter>
</jasperReport>
'::text, 'utf8'))
ON CONFLICT (type)
DO NOTHING;

insert into common_dict.PRINT_TEMPLATES(TYPE, COPIES_NUMBER, FILE_NAME, CONTENT)
values ('4f2434ae-5eb1-4b10-8f83-2cbcddfdb100', 7, 'УСЛОВИЯ СТРАХОВАНИЯ №1-МС «ВЫБЕРИ ЗДОРОВЬЕ»', convert_to('<?xml version="1.0" encoding="UTF-8"?>
<!-- Created with Jaspersoft Studio version 6.6.0.final using JasperReports Library version 6.6.0  -->
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="RshbInsuranceChooseHealth" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" isFloatColumnFooter="true" uuid="4eedbb89-b4f6-4469-9ab6-f642a1688cf7">
    <property name="com.jaspersoft.studio.data.defaultdataadapter" value="One Empty Record"/>
    <subDataset name="tableDataset" uuid="f13e6d36-5148-4ecc-bbe3-3035def80980">
        <queryString>
            <![CDATA[]]>
        </queryString>
    </subDataset>
    <parameter name="contractNumber" class="java.lang.String"/>
    <parameter name="surname" class="java.lang.String"/>
    <parameter name="name" class="java.lang.String"/>
    <parameter name="patronymic" class="java.lang.String"/>
    <parameter name="birthDate" class="java.lang.String"/>
    <parameter name="contractStartDate" class="java.lang.String"/>
    <parameter name="contractSignDate" class="java.lang.String"/>
    <parameter name="phoneNumber" class="java.lang.String"/>
    <parameter name="email" class="java.lang.String">
        <defaultValueExpression><![CDATA[""]]></defaultValueExpression>
    </parameter>
    <parameter name="isTestInstance" class="java.lang.Boolean" isForPrompting="false">
        <parameterDescription><![CDATA[Инстанс приложения запущен на тестовом стенде]]></parameterDescription>
        <defaultValueExpression><![CDATA[true]]></defaultValueExpression>
    </parameter>
    <queryString>
        <![CDATA[]]>
    </queryString>
    <background>
        <band height="772">
            <image>
                <reportElement isPrintRepeatedValues="false" x="3" y="0" width="550" height="758" uuid="ea763663-ef82-4cb6-a25f-d7c500e2fa1a">
                    <printWhenExpression><![CDATA[$P{isTestInstance} == true]]></printWhenExpression>
                </reportElement>
                <imageExpression><![CDATA[net.sf.jasperreports.renderers.BatikRenderer.getInstanceFromText("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"765\" height=\"990\"><text x=\"60\" y=\"40\" transform=\"matrix(.6,-.82,.83,.6,30,1055)\" style=\"font-size:220px;font-weight:bold;fill:#d8d8d8\">ОБРАЗЕЦ</text></svg>")]]></imageExpression>
            </image>
        </band>
    </background>
    <detail>
        <band height="772">
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="1b9dfc32-5d14-4246-8770-baabcee69f67"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[1]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="244" y="1" width="310" height="30" uuid="96d3d450-6d57-4e95-ae36-735678d3cb47">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Right" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[Приложение к Договору страхования
 «Выбери здоровье»]]></text>
            </staticText>
            <textField isStretchWithOverflow="true">
                <reportElement stretchType="ContainerBottom" x="244" y="33" width="310" height="30" uuid="f631d05d-15f8-40d7-bc5f-95912ad5bbe2">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Right" verticalAlignment="Middle" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <textFieldExpression><![CDATA["№ " +$P{contractNumber} +
"\nот "+ $P{contractSignDate}]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="31" y="64" width="500" height="30" uuid="4ef402f3-cf76-472b-93ee-8117cf2eb3bb">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Center" verticalAlignment="Middle" markup="styled">
                    <font fontName="Arial" size="11" isBold="true"/>
                </textElement>
                <text><![CDATA[УСЛОВИЯ СТРАХОВАНИЯ №1-МС «ВЫБЕРИ ЗДОРОВЬЕ»]]></text>
            </staticText>
            <staticText>
                <reportElement x="0" y="100" width="260" height="653" uuid="5c6ce88d-c383-4043-bd38-b9d80eabb1fa">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[1. ОБЩИЕ ПОЛОЖЕНИЯ
1.1. Настоящие Условия страхования №1-МС «Выбери здоровье» (далее - Условия) разработаны на основании Правил страхования на случай критических заболеваний с лечением ООО «РСХБ-Страхование жизни», утверждённых приказом Генерального директора Страховщика от «25» сентября 2018г. № 79. На основании настоящих Условий, в соответствии с выданной органом страхового надзора лицензией на осуществление страхования, и руководствуясь действующим законодательством Российской Федерации ООО «РСХБ-Страхование жизни» осуществляет заключение Договоров страхования, по которым осуществляется страхование имущественных интересов, связанных с оплатой организации и оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг вследствие расстройства здоровья Застрахованного лица в результате событий, предусмотренных Договором страхования из числа поименованных в разделе 3 Условий (далее – Договоры страхования).
1.2. Информация о Страховщике и условиях страхования размещена на официальном сайте Страховщика - http://www.rshbins-life.ru.
1.3. Положения, содержащиеся в настоящих Условиях и не включенные в текст Договора страхования, обязательны для Страхователя (Выгодоприобретателя), если в Договоре страхования прямо указывается на применение таких Условий или сами Условия приложены к нему.
1.4. Нижеперечисленные термины и определения, используемые в настоящих Условиях, имеют следующее значение:
1.4.1. Страховщик – Общество с ограниченной ответственностью «РСХБ-Страхование жизни» (ООО «РСХБ-Страхование жизни»), юридическое лицо, созданное и действующее в соответствии с законодательством Российской Федерации на основании полученной в установленном порядке лицензии.
1.4.2. Страхователь (Застрахованное лицо) – дееспособное физическое лицо, заключившее со Страховщиком Договор страхования.
1.4.3. Выгодоприобретатель – Застрахованное лицо.
1.4.4. Застрахованное лицо (Застрахованный) - названное в Договоре страхования физическое ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="100" width="260" height="653" uuid="097f5fae-3d41-4829-99ea-177579d3465a">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[лицо, в отношении здоровья которого заключен Договор страхования. В рамках настоящих Условий Застрахованным лицом является Страхователь, при одновременном соблюдении следующих условий:
1.4.4.1. Возраст Страхователя (Застрахованного лица) не менее 55 (пятидесяти пяти) лет и не более 64 (шестидесяти четырех) лет;
1.4.4.2. Страхователь не являлся/не является инвалидом I - II группы, ребенком инвалидом, в отношении него не принималось врачебное решение о направлении для установления ему группы инвалидности, не является лицом, имеющим действующее направление на медико-социальную экспертизу (МСЭ), и МСЭ не рассматривает документы на установление ему группы инвалидности;
1.4.4.3. Страхователь (Застрахованное лицо) не нуждается в постоянном уходе в соответствии с медицинским заключением;
1.4.4.4. Страхователь (Застрахованное лицо) не имеет заболевания и (или) функциональные нарушения из нижеуказанных (по которым в течение жизни устанавливался диагноз, проводилось и(или) проводится лечение, либо в отношении которых лицо находилось (находится) под наблюдением врача-специалиста): СПИД или ВИЧ-инфекция, злокачественные новообразования, в том числе но не ограничиваясь:
1.4.4.4.1. Рак in situ, лейкозы, миелома, лимфомы, болезнь Ходжкина; любые виды опухолей или кист головного мозга и/или спинного мозга, пищевод Барретта, дисплазия шейки матки, доброкачественная гиперплазия предстательной железы, полицитемия, фиброаденома молочной железы; язва желудка, болезнь Крона, неспецифический язвенный колит, хронические гепатиты вирусной и невирусной природы, циррозы печени любой этиологии, алкогольная болезнь печени, хронический панкреатит;
1.4.4.4.2. Хроническая дыхательная недостаточность II-III степени; хроническая обструктивная болезнь легких (ХОБЛ); первичный иммунодефицит, амилоидоз, крипторхизм, туберкулез, хроническая почечная недостаточность любой стадии;
1.4.4.5. Страхователю (Застрахованному лицу) не устанавливался диагноз эпилепсии, слабоумия, психических заболеваний и/или расстройств поведения не состоял/не состоит на учете ]]></text>
            </staticText>
        </band>
        <band height="772">
            <property name="com.jaspersoft.studio.unit.height" value="mm"/>
            <staticText>
                <reportElement x="0" y="10" width="260" height="748" uuid="abfa0ec1-5582-41ae-8997-2d5d99102260">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.y" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[в психоневрологическом и/или наркологическом диспансере;
1.4.4.6. Страхователь (Застрахованное лицо) не употребляет наркотические, токсические и/или сильнодействующие вещества с целью лечения или по иной причине, ему не устанавливался диагноз алкоголизм, наркомания, токсикомания; не состоит по любой из указанных причин на диспансерном учете;
1.4.4.7. Страхователь (Застрахованное лицо) не переносил хирургических операции по трансплантации органа или его части (в том числе, но не ограничиваясь, костного мозга), трепанации черепа;
1.4.4.8. У Страхователя (Застрахованного лица) за 6 месяцев, предшествующих заключению Договора страхования, не отмечалась нецеленаправленная резкая потеря веса (10 кг и более);
1.4.4.9. У Страхователя (Застрахованного лица) индекс массы тела (отношение массы тела (кг) к квадрату роста (м)) находится в диапазоне не менее 20 или не более 35;
1.4.4.10. У Страхователя (Застрахованного лица) не отмечалась патологическая кровопотеря из любых источников;
1.4.4.11. Страхователь (Застрахованное лицо) не имеет отклонений от установленных лабораторных норм показателей онкомаркеров (если такие исследования проводились);
1.4.4.12. Страхователь (Застрахованное лицо) не подвергался (подвергается) воздействию радиации, токсических или канцерогенных веществ при выполнении своих профессиональных обязанностей;
1.4.4.13. Страхователь (Застрахованное лицо) не выкуривает более 20 сигарет в день и/ или не курит ежедневно электронные сигареты, сигары, трубки, кальян/наргиле, или другие никотиновые заменители; не употребляет алкоголь более чем 5 единиц в день (одна единица = 300 мл пива или 100 мл вина или 20 мл спирта);
1.4.4.14. Страхователь (Застрахованное лицо) и/или его ближайшие родственники (отец, мать, братья, сестры) в возрасте до 60 лет не болели онкологическими заболеваниями и / или не умирали от рака (в случае, если этот факт был известен Страхователю (Застрахованному лицу) до заключения Договора страхования).
1.5. Амбулаторные условия - условия, не предусматривающие круглосуточного медицинского наблюдения и лечения, в том числе на дому при вызове медицинского работника.
1.6. Больница (а также - сертифицированное медицинское учреждение / организация, лечебно-профилактическое учреждение) – юридическое лицо, независимо от организационно-правовой формы и формы собственности, осуществляющее медицинскую деятельность]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="b4888f59-fd80-4481-8c77-063783079c94">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[на основании лицензии (иного разрешения), выданной в соответствии с действующим законодательством страны оказания услуг (сертифицированное медицинское учреждение / организация, лечебно -профилактическое учреждение), осуществляющее медицинское лечение заболеваний или травм, оснащенное материально-техническими средствами и укомплектованное квалифицированным персоналом для выполнения мер диагностического и хирургического вмешательства, в котором круглосуточно присутствуют врачи и медицинский персонал.
1.7. Врач (а также-сертифицированный (квалифицированный) медицинский специалист) – специалист с оконченным высшим медицинским образованием, на законных основаниях и в соответствии с имеющимися сертификатами, квалификацией допущенный к осуществлению медицинской практики соответствующей специализации.
1.8. Период ожидания – период времени, предусмотренный Договором страхования, с момента вступления Договора страхования в силу и до момента начала периода страхования, обусловленного Договором страхования, в течение которого обращения Застрахованного лица за организацией и/или оказанием медицинских услуг (из числа событий, предусмотренных Договором страхования) не являются страховым случаем, и Страховщик не несет обязательств по страховой выплате.
1.9. Декларация о состоянии здоровья (далее – Декларация) – декларация, анкета, содержащая информацию о состоянии здоровья Застрахованного лица до момента заключения Договора страхования. Обстоятельства, изложенные в Декларации о состоянии здоровья, имеют существенное значение для определения вероятности наступления страхового случая, а также для согласования сторонами условий Договора страхования о Застрахованном лице. Заключая Договор страхования и/или подписывая Декларацию Страхователь подтверждает соответствие состояния своего здоровья сведениям, содержащимся в Декларации.
1.10. Дневной стационар – условия, предусматривающие медицинское наблюдение и лечение в дневное время, но не требующие круглосуточного медицинского наблюдения и лечения. Дневной стационар обеспечивает структурное подразделение лечебно-профилактического учреждения, предназначен для проведения профилактических, диагностических, лечебных и реабилитационных мероприятий больным, не требующим круглосуточного медицинского наблюдения, с применением современных медицинских технологий в соответствии со стандартами и ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="1526a6c1-5674-4713-ae48-e8a812cd8965"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[2]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="0" y="10" width="260" height="748" uuid="4a2eb15b-0af0-44dd-82e1-37fc074eadc9">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[протоколами ведения больных.
1.11. Первичное диагностирование (первичная постановка диагноза) – факт установления Врачом впервые в жизни Застрахованному лицу диагноза заболевания. Первичное диагностирование, проведенное, в том числе, в период страхования (по истечении периода ожидания), включающее комплекс медицинских вмешательств, направленных на распознавание состояний или установление факта наличия либо отсутствия заболеваний, осуществляемых посредством сбора и анализа жалоб пациента, данных его анамнеза и осмотра, проведения лабораторных, инструментальных, и иных исследований в целях определения диагноза, выбора мероприятий по лечению пациента и (или) контроля за осуществлением этих мероприятий, не относится к событиям, на случай наступления которых осуществлено страхование, проводится Застрахованным лицом самостоятельно и за свой счет, т.е. расходы на первичное диагностирование не включаются в состав страховой выплаты вне зависимости от последующего признания / не признания события страховым случаем.
1.12. Период страхования - период времени, в течение которого наступление события, предусмотренного Договором страхования (страхового случая), влечет за собой возникновение обязанности Страховщика по осуществлению страховой выплаты. Период страхования начинается со дня, следующего за днем окончания периода ожидания (если период ожидания установлен) и действует до дня окончания срока действия Договора страхования включительно.
1.13. Срок действия Договора страхования – период времени в течение которого действует Договор страхования.
1.14. Психохирургия - лечение психических расстройств с помощью операций на головном мозге.
1.15. Стационар, стационарные условия - условия, обеспечивающие круглосуточное медицинское наблюдение и лечение.
1.16. Сервисная компания – специализированная организация, которая по поручению Страховщика обеспечивает организацию медицинских и иных услуг, предусмотренных Условиями страхования и Договором страхования, в Больницах или иных организациях.
1.17. Профессиональный спорт – часть спорта, направленная на организацию и проведение спортивных соревнований, за участие в которых и подготовку к которым в качестве своей основной деятельности спортсмены получают вознаграждение от организаторов таких соревнований и (или) заработную плату.]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="f4446d0f-e9ac-4546-8864-e7181f5f7047">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[2. ОБЪЕКТ СТРАХОВАНИЯ
2.1. Объектом страхования являются не противоречащие законодательству Российской Федерации имущественные интересы, связанные с оплатой организации и оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг вследствие расстройства здоровья или состояния Застрахованного лица, требующих организации и оказания таких услуг, а также проведения профилактических мероприятий, снижающих степень опасных для жизни или здоровья Застрахованного лица угроз и (или) устраняющих их.
3. СТРАХОВОЙ РИСК.
СТРАХОВОЙ СЛУЧАЙ
3.1. Страховым риском является предполагаемое событие, на случай наступления которого проводится страхование. Событие, рассматриваемое в качестве страхового риска, должно обладать признаками вероятности и случайности его наступления.
Страховым риском, согласно Условиям страхования, является риск возникновения в период страхования обстоятельств, требующих оказания медицинских и иных услуг Застрахованному лицу в связи с:
3.1.1. Злокачественным новообразованием, а именно: злокачественным новообразованием, характеризующимся неконтролируемым ростом и распространением злокачественных клеток, проникающих в ткань различного гистологического типа, и относящимся к кодам C00-C43, C45-C97 по МКБ-10, за исключением: С44 – эпителиальных опухолей кожи (включая базалиому, плоскоклеточный рак), C91.1 – хронического лимфоцитарного В – клеточного лейкоза, а также возникновения новообразования при наличии у Застрахованного лица ВИЧ-инфекции или СПИДа.
Страховым случаем, с учетом всех положений, определений и исключений из страхования, предусмотренных Условиями страхования, является документально подтвержденное обращение Застрахованного лица в Сервисную компанию для организации предусмотренных страхованием медицинских и иных услуг в связи с возникновением обстоятельств, предусмотренных настоящим разделом Условий, при одновременном наличии следующих условий: диагноз злокачественного новообразования подтвержден гистологическими или (в случае системных онкологических заболеваний) цитологическими исследованиями и заключением врача - онколога; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу впервые; диагноз указанного в настоящем пункте злокачественного новообразования установлен Застрахованному лицу в течение ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="9b98150f-e4f1-4fc1-b1c0-6968cc15657a"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[3]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="92e58189-5c2f-4cbe-8071-34ec89f66f10"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[4]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="0" y="10" width="260" height="700" uuid="c9880d7c-eac2-495c-a7ca-59dedd065314">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[Периода страхования, по истечении периода ожидания; Застрахованное лицо обратилось в Сервисную компанию с полным пакетом документов, предусмотренных пунктом 10.1.2. Условий в течение Периода страхования.
4. ОБЪЕМ СТРАХОВОЙ ОТВЕТСТВЕННОСТИ
4.1. При наступлении страхового случая, предусмотренного Условиями и Договором страхования, Страховщик оплачивает организацию и оказание следующих медицинских и иных услуг в пределах установленной Договором страхования Страховой суммы:
4.1.1. Медицинская транспортировка (медицинская эвакуация) Застрахованного лица к поставщику медицинских услуг и/или между медицинскими организациями и возвращение обратно, включая трансфер автомобилем скорой медицинской помощи или на такси от места жительства до аэропорта (транспортного узла<sup>1</sup>), из аэропорта (транспортного узла) до отеля (апартаментов) и/или до медицинской организации, в которой будет проводиться лечение и обратно.
4.1.2. Оплата билета эконом класса для Застрахованного лица, а также при наличии медицинских показаний – оплата медицинского сопровождения и дополнительных мест и оборудования в самолете (ином средстве транспорта) при регулярном рейсе.
4.1.3. Проживание Застрахованного лица: подлежит оплате проживание в отеле (3 или 4 звезды) или эквивалентного стандартного номера в апартаментах с оплатой услуг, включенных в стоимость номера для Застрахованного лица. Не подлежат оплате дополнительные услуги, не включённые в стоимость номера.
4.1.4. Услуги по репатриации в случае смерти Застрахованного лица во время поездки: транспортировка останков Застрахованного лица до места постоянного проживания Застрахованного лица.
4.1.5. Лечение на территории Российской Федерации, проводимое по поводу страхового случая:
4.1.5.1. Медицинская помощь в амбулаторных условиях, в условиях дневного стационара, в стационарных условиях, в том числе:
а) осмотры врачами, в том числе врачами-специалистами;
б) диагностические медицинские вмешательства, выполняемые медицинскими организациями по выбору Сервисной компании на территории страны оказания услуг, в том числе лабораторные исследования,]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="db54669b-edbd-408b-b865-64c40db4da6c">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[визуализирующие исследования, эндоскопические исследования, функциональная диагностика;
в) лечебные медицинские вмешательства в пределах страховой суммы (кроме имплантаций и трансплантации, которые производятся только в случаях, прямо указанных в Условиях и в объеме, указанном в Условиях), включающие хирургическое лечение, химиотерапию, лучевую терапию, иные методы лечения, научно обоснованные, разрешенные к применению на территории страны оказания услуг и применяемые в рамках оказания медицинской помощи медицинскими организациями по выбору Сервисной компании, на территории страны оказания услуг;
г) трансплантация костного мозга, выполняемая медицинской организацией, имеющей соответствующую лицензию, по выбору Сервисной компании;
д) имплантация, необходимая в целях реконструктивного лечения груди после проведения мастэктомии, включая стоимость имплантатов. Договором страхования может быть установлен лимит расходов на один страховой случай;
е) лекарственные средства и расходные материалы, применяемые при лечении в стационарных условиях и в условиях дневного стационара.
4.1.5.2. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 30 (Тридцати) календарных дней после окончания срока действия Договора страхования, а также расходы в соответствии с п. 4.1.2. и 4.1.4. Условий.
4.1.5.3. В случае истечения срока действия Договора страхования при неоконченном лечении в стационарных условиях, при условии, что сообщение о страховом случае было заявлено и согласовано Сервисной компанией в течение Периода страхования, при наличии состояния, угрожающего жизни Застрахованного лица (прекращение оказываемой медицинской помощи может повлечь смерть Застрахованного лица), оплате подлежат расходы на лечение в стационарных условиях до выписки Застрахованного лица из стационара, но не более 90 (девяноста) календарных дней после окончания срока действия Договора страхования, а также расходы в соответствии с п. 4.1.2. и 4.1.4. Условий.
4.2. Страховщик осуществляет оплату ]]></text>
            </staticText>
        </band>
        <band height="772">
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="64a90aba-1898-4b07-993b-0ceb93bcc96d"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[5]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="0" y="10" width="260" height="748" uuid="61f662b2-a073-4010-90be-8be8b9378bea">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица (в том числе, но не ограничиваясь этим, при экстренной медицинской транспортировке Застрахованного лица), только в случае наличия медицинских показаний к сопровождению Застрахованного лица, определенных Врачом. Оплата организации и оказания услуг медицинского и/или иного сопровождения Застрахованного лица осуществляется в пределах лимитов (страховой суммы), установленных Договором страхования. 5. ИСКЛЮЧЕНИЯ
5.1. Если иное не предусмотрено Договором страхования, не являются страховыми случаями (не покрывается страхованием), и страховая выплата не производится по следующим событиям/заболеваниям и состояниям/расходам/услугам:
5.1.1. Услуги и расходы в связи с первичным диагностированием у Застрахованного лица заболевания.
5.1.2. Услуги и расходы, связанные с событиями / случаями, прямо не указанными в Договоре страхования как страховой случай.
5.1.3. Услуги и расходы, прямо не указанные в Договоре страхования как услуги и расходы, подлежащие организации и оплате.
5.1.4. Услуги и расходы по заболеваниям/состояниям, указанным в Договоре страхования, но возникшим до окончания периода ожидания или после истечения срока действия Договора страхования.
5.1.5. Услуги и расходы, оказанные / понесенные до окончания периода ожидания или после истечения срока действия Договора страхования, за исключением указанных в п.п. 4.1.5.2, 4.1.5.3. Условий.
5.1.6. Услуги и расходы, необходимость которых возникла в связи с нарушением Застрахованным лицом рекомендаций лечащего врача и/или правил и распорядка медицинского учреждения, в котором Застрахованное лицо проходит лечение.
5.1.7. Психохирургия.
5.1.8. Хирургические операции по трансплантации органов или любого вида трансплантации костного мозга в следующих случаях:
5.1.8.1. если трансплантация таких органов и (или) их долей не предусмотрена Договором страхования;
5.1.8.2. если потребность в трансплантации органов возникла вследствие алкогольной болезни печени;
5.1.8.3. если трансплантация органов является аутологичной (реципиент трансплантата является донором для самого себя), за исключением трансплантации костного мозга;
5.1.8.4. если при трансплантации органов Застрахованное лицо является донором по ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="9224301d-a7f2-4393-bc2e-88864d63333d">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[отношению к третьему лицу;
5.1.8.5. если трансплантация органов включает в себя лечение стволовыми клетками (кроме трансплантации костного мозга).
5.1.9. Медицинские и иные услуги, выполняемые в эстетических и/или косметических целях, включая, но не ограничиваясь: операции по коррекции зрения (миопии, астигматизма, близорукости); бариатрические операции, включая, но не ограничиваясь операциями, направленными на уменьшение объема желудка или кишечника, кроме операций по реконструкции груди после резекции/ удаления молочной железы, проведенной в рамках Договора страхования и в соответствии с его условиями.
5.1.10. Услуги и расходы в связи с родовыми травмами и/или врождёнными пороками развития.
5.1.11. Услуги, не назначенные Застрахованному лицу лечащим врачом, либо не являющиеся необходимыми с медицинской точки зрения по поводу страхового случая.
5.1.12. Услуги и расходы в связи с заболеваниями и состояниями, которые являются прямым или косвенным следствием синдрома приобретенного иммунодефицита (СПИД) или носительства вируса иммунодефицита человека (ВИЧ), включая мутацию и любое побочное действие.
5.1.13. Услуги и расходы в связи с расстройством здоровья, наступившим в местах лишения свободы, изоляторах временного содержания и других учреждениях, предназначенных для содержания лиц, подозреваемых, обвиняемых в совершении преступления или осужденных за совершенные преступления.
5.1.14. Услуги и расходы в связи с расстройством здоровья, наступившим в результате профессиональной деятельности Застрахованного лица, непосредственно связанной с химическими веществами и газами (включая асбест, растворители, бензол, хлористый винил, бериллий, никель, соединения хрома, радон, пестициды, пыль с оксидом кремния, диоксины), со взрывчатыми веществами, с ионизирующими излучениями, ультрафиолетовым излучением, с микроволновым излучением, с высоковольтными электрическими сетями.
5.1.15. Услуги и расходы в связи с применением экспериментальных методов лечения, не допущенных к использованию в стране оказания услуг.
5.1.16. Услуги и расходы в связи со злокачественным новообразованием, протекающим на фоне ВИЧ–инфекции или СПИД.
5.1.17. Услуги и расходы в связи с существовавшими до даты заключения Договора страхования заболеваниями и состояниями, а также несчастными случаями,]]></text>
            </staticText>
            <staticText>
                <reportElement x="1" y="-61" width="270" height="40" uuid="2a5e3102-ab2d-40e8-a686-d78ebf847388">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[_______________________
<sup>1</sup> При отсутствии регулярных авиаперевозок]]></text>
            </staticText>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="0" y="10" width="260" height="748" uuid="ecc020e8-b93a-4a15-9bde-5599dbe300fa">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[диагностированными / произошедшими Застрахованному лицу / с Застрахованным лицом или о которых было известно Застрахованному лицу до даты начала действия страхования (лечение, предусмотренное страхованием было рекомендовано или запланировано до момента заключения Договора страхования).
5.1.18. Услуги и расходы в связи с получением Застрахованным лицом медицинских и иных услуг в медицинских и иных организациях, выбор которых не был согласован с Сервисной компанией.
5.1.19. Услуги и расходы в связи с раком кожи, за исключением меланомы. 5.1.20. Услуги и расходы в связи с Эпителиальными опухолями кожи (включая базалиому, плоскоклеточный рак) (код С44 по МКБ-10), Хроническим лимфоцитарным В-клеточным лейкозом (код C91.1 по МКБ-10).
5.2. Дополнительно к основаниям, указанным в пункте 5.1. Условий страхования, не признаются страховыми случаями, и страховая выплата не осуществляется в связи с расходами на:
5.2.1. Компенсацию морального вреда, в том числе связанного с качеством услуг, оказываемых третьими лицами (медицинскими учреждениями и т.д.).
5.2.2. Возмещение упущенной выгоды.
5.2.3. Социальные, трудовые компенсации, гарантийные выплаты, пособия.
5.2.4. Расходы, превышающие страховые суммы и лимиты ответственности, установленные в Договоре страхования.
6. ПЕРИОД ОЖИДАНИЯ
6.1. Если иное не предусмотрено Договором страхования, при заключении Договора страхования устанавливается период ожидания длительностью 120 (Сто двадцать) дней с даты заключения Договора страхования.
6.2. Если иное дополнительно не оговорено Договором страхования, период ожидания не устанавливается для Договоров страхования, заключаемых Страховщиком с тем же Страхователем повторно не позднее 30 (Тридцати) календарных дней с момента окончания срока действия ранее заключенного Договора страхования в соответствии с настоящими Условиями страхования. При повторном и последующем заключении Договора страхования с тем же Страхователем в пределах установленного настоящим пунктом Условий страхования срока, период ожидания равен нулю. Данное положение Условий страхования не требует дополнительного внесения во вновь заключаемый с тем же Страхователем Договор страхования изменений.
7. ТЕРРИТОРИЯ ДЕЙСТВИЯ СТРАХОВАНИЯ. ПЕРИОД СТРАХОВАНИЯ, СРОК ДЕЙСТВИЯ ДОГОВОРА СТРАХОВАНИЯ
7.1. Территорией страхования, организации и ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="8c240ce7-55c2-4c55-be46-8d26d37ce2c6">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[оказания услуг, если иное не предусмотрено Договором страхования, является – Российская Федерация.
7.2. Если иное не установлено Договором страхования, срок действия Договора страхования составляет 1 (один) год с момента вступления Договора страхования в силу. Если иное не установлено Договором страхования период страхования начинается с 00 часов 00 минут 121 (Сто двадцать первого) дня с даты заключения Договора страхования и действует один год с даты вступления Договора страхования в силу. 7.3. Если иное не установлено Договором страхования, Договор страхования вступает в силу:
7.3.1. При первичном заключении Договора страхования, - в 00 часов 00 минут дня, указанного в Договоре страхования как «дата вступления Договора страхования в силу», при условии оплаты Страхователем страховой премии в полном объёме в срок, предусмотренный Договором страхования, и действует один год.
7.3.2. При повторном заключении Договора страхования (при условии оплаты страховой премии в полном объеме в течение 30 (Тридцати) календарных дней после окончания срока страхования ранее заключенного Договора страхования) - с 00 часов 00 минут дня, следующего за днем окончания срока действия предыдущего Договора страхования и действует один год.
7.3.3. При заключении Договора страхования по истечении 30 календарных дней с даты окончания срока действия предыдущего Договора страхования, - в 00 часов 00 минут дня, указанного в Договоре страхования как «дата вступления Договора страхования в силу», при условии оплаты Страхователем страховой премии в полном объёме в срок, предусмотренный Договором страхования, и действует один год.
7.4. Если иное не установлено Договором страхования или прямо не установлено настоящими Условиями, срок действия Договора страхования включает в себя Период ожидания.
8. ПОРЯДОК ОПРЕДЕЛЕНИЯ СТРАХОВОЙ СУММЫ, СТРАХОВОГО ТАРИФА, СТРАХОВОЙ ПРЕМИИ
8.1. Страховой суммой является денежная сумма, которая определена в порядке, установленном Договором страхования при его заключении, и исходя из которой устанавливается размер страховой премии, и размер страховой выплаты при наступлении страхового случая.
8.2. Размер страховой суммы устанавливается в Договоре страхования по соглашению Страховщика и Страхователя.
8.3. Договором страхования могут быть ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="2b6217e7-e3d5-4674-9bfb-57a9ceed5a59"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[6]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="d1b4258b-699c-45a7-8f3b-3d6d83519f04">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[Страховщика. Сумма и дата оплаты указываются на документе, подтверждающем оплату страховой премии.
8.10.1. Под документом, подтверждающим оплату страховой премии, понимается исполненное банком платежное поручение или иной документ о перечислении страховой премии по Договору страхования.
8.10.2. Если иное не предусмотрено Договором страхования, в случае несоответствия суммы оплаченной страховой премии размеру страховой премии, указанному в Договоре страхования, Договор страхования не вступает в силу, ошибочно оплаченная денежная сумма подлежит возврату Страхователю в полном объеме в течение 20 (двадцати) рабочих дней с даты получения письменного заявления Страхователя.
8.11. Если иное не предусмотрено Договором страхования, датой оплаты страховой премии Страхователем является:
8.11.1. при платеже путем безналичных расчетов — дата списания денежных средств с расчетного счета Страхователя для их перечисления на расчетный счет Страховщика;
8.11.2. при платеже путем наличных расчетов — дата внесения платежа в кассу Страховщика или получение денежных средств уполномоченным представителем Страховщика.
8.12. Страхователь обязан сохранять документы, подтверждающие оплату страховой премии, и предъявлять их по требованию Страховщика.
8.13. Страховщик оставляет за собой право уведомлять Страхователя о необходимости произвести оплату страховой премии и /или о факте прекращения Договора страхования в связи с истечением срока страхования. При этом уведомление посредством СМС-сообщений/чатов на номер мобильного телефона рассматривается Сторонами как надлежащее уведомление и считается сделанным в письменной форме.
9. ПОРЯДОК ЗАКЛЮЧЕНИЯ, ИСПОЛНЕНИЯ И ПРЕКРАЩЕНИЯ ДОГОВОРА СТРАХОВАНИЯ
9.1. По Договору страхования Страховщик обязуется за обусловленную Договором страхования плату (страховую премию), уплачиваемую Страхователем, организовать предоставление Застрахованному лицу медицинских и иных услуг и оплатить их при наступлении предусмотренного Договором страхования события (страхового случая), в порядке и объеме, определенном Договором страхования.
9.2. При наличии расхождений между положениями Договора страхования, Условий и Правил страхования преимущественную силу имеют положения Договора страхования.
9.3. Если после заключения Договора страхования будет установлено, что Страхователь сообщил Страховщику заведомо ]]></text>
            </staticText>
            <staticText>
                <reportElement x="0" y="10" width="260" height="748" uuid="b29634ef-c772-4979-9915-889e994378dd">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[установлены лимиты ответственности Страховщика (ограничения максимальных сумм страховой выплаты в пределах страховой суммы) по отдельным случаям, заболеваниям (хирургическим операциям), видам расходов, и по различным их комбинациям.
8.4. Страховая сумма является уменьшаемой (агрегатной) страховой суммой, рассчитываемой как разность страховой суммы на начало срока действия Договора страхования и суммы страховой выплаты, осуществленной Страховщиком в период действия Договора страхования.
8.4.1. Если агрегатная страховая сумма исчерпана полностью, обязательства Страховщика по Договору страхования считаются исполненными в полном объеме. При этом Договор страхования прекращается досрочно, а уплаченная Страховщику страховая премия не подлежит возврату Страхователю.
8.5. Страховая сумма по Условиям устанавливается в рублях.
8.6. Страховой тариф представляет собой ставку страховой премии, взимаемую с единицы страховой суммы, с учетом объекта страхования и характера страхового риска, а также других условий страхования. Страховой тариф определяется Страховщиком с применением базовых тарифных ставок, рассчитанных на один год страхования, и поправочных (повышающих /понижающих) коэффициентов к ним (их предельных значений), которые могут применяться в зависимости от характера (степени) страхового риска (в частности, состояние здоровья, сведения о профессии / профессиональной деятельности / роде занятий), иных условий страхования, указанных в Условиях.
8.7. Страховой тариф по конкретному Договору страхования определяется по соглашению Сторон и указывается в Договоре страхования.
8.8. Страховой премией является плата за страхование, которую Страхователь обязан уплатить Страховщику в порядке и в сроки, установленные Договором страхования.
При определении размера страховой премии, подлежащей уплате по Договору страхования, Страховщик применяет разработанные им страховые тарифы.
8.9. Страховая премия уплачивается в рублях, в соответствии с действующим законодательством Российской Федерации.
8.10. Если иное не предусмотрено Договором страхования, страховая премия уплачивается единовременно безналичным перечислением полной суммы страховой премии на расчетный счет Страховщика либо путем внесения средств в кассу Страховщика или получение денежных средств уполномоченным представителем ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="cb35a8ec-7b4c-4ac5-92f4-701cb21cd3fc"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[7]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="0" y="10" width="260" height="748" uuid="2c44d09e-9f39-45ff-aa27-eea3a042cacb">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[ложные сведения об обстоятельствах, имеющих существенное значение для заключения Договора страхования, Страховщик вправе признать Договор недействительным и требовать применения последствий, предусмотренных Гражданским кодексом Российской Федерации.
9.4. Договор страхования заключается в письменной форме на основании устного заявления Страхователя. Несоблюдение письменной формы влечет недействительность Договора страхования.
9.5. Договор страхования может заключаться путем:
9.5.1. Составления одного документа, подписанного сторонами. Договор страхования в этом случае скрепляется собственноручной подписью Страхователя и аналогом собственноручной подписи уполномоченного лица и печати Страховщика. Под аналогом собственноручной подписи и печати понимается их графическое воспроизведение. Договор страхования составляется в двух экземплярах.
9.5.2. Вручения Страхователю на основании устного заявления страхового полиса, подписанного Страховщиком. В этом случае, согласие Страхователя заключить Договор страхования на предложенных Страховщиком условиях подтверждается принятием от Страховщика Страхового полиса и Условий. Принятие Страхователем Страхового полиса и Условий страхования подтверждается оплатой Страхователем страховой премии в порядке и сроки, установленные Договором страхования. Подписание Страхового полиса Страховщиком с использованием факсимильного (или иного графического) воспроизведения подписи уполномоченного представителя и печати Страховщика является надлежащим подписанием Договора страхования со стороны Страховщика.
9.5.3. Направления электронного Договора страхования на основании письменного или устного заявления Страхователя с использованием официального сайта Страховщика в информационно-телекоммуникационной сети «Интернет» (согласно ст. 6.1. Закона Российской Федерации от 27.11.1992 №4015-1 «Об организации страхового дела в Российской Федерации»). В случае направления Страховщиком Страхователю – физическому лицу на основании его заявления Договора страхования, подписанного усиленной квалифицированной электронной подписью Страховщика, Договор страхования, составленный в виде электронного документа, считается заключенным Страхователем на предложенных Страховщиком условиях с момента уплаты Страхователем страховой премии или первого страхового взноса. ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="dcf023d9-86f7-41ec-b45e-fb9bf317f6ab">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[Страхователь-физическое лицо уплачивает страховую премию (первый страховой взнос) после ознакомления с условиями, содержащимися в Договоре страхования и Условиях страхования, подтверждая тем самым свое согласие заключить этот Договор страхования на предложенных Страховщиком условиях.
Страховщик вправе предусмотреть на своем официальном сайте в сети «Интернет» возможность создания и отправки Страхователем (Застрахованным лицом, Выгодоприобретателем) Страховщику информации в электронной форме (в т. ч. обращений, касающихся заключения и/или изменения и/или досрочного прекращения Договора страхования и/или страховой выплаты и связанных с ними документов / сведений). При этом требования к использованию электронных документов и порядок обмена информацией в электронной форме (в т. ч. случаи и порядок создания и отправки указанной в настоящем пункте информации) устанавливаются соглашением между  Страхователем (Застрахованным лицом, Выгодоприобретателем) и Страховщиком в соответствии с действующим законодательством Российской Федерации.
Любые документы, оформленные Страховщиком и/или Страхователем (Застрахованным лицом, Выгодоприобретателем) в виде электронного документа в соответствии с требованиями действующего законодательства и указанного в настоящем пункте соглашения, признаются равнозначными документам, оформленным на бумажном носителе.
9.6. В случае утраты Страхователем страхового полиса или Договора страхования, по письменному заявлению Страхователя Страховщиком в период его действия выдается дубликат. После выдачи дубликата утраченный документ считается недействительным и выплаты по нему не производятся.
9.7. Страховщик может отдельно оговаривать в Договоре страхования положения, по которым должно быть достигнуто соглашение Сторон и которые в этой связи будут считаться существенными условиями Договора страхования. При несоблюдении данных положений Договор страхования будет считаться незаключенным и страховые выплаты по нему не будут производиться. В случаях, предусмотренных настоящим пунктом (если Договор страхования считается незаключенным) Страховщик производит возврат поступивших денежных средств в течение 20 (двадцати) рабочих дней с момента получения письменного заявления Страхователя.
9.8. Страховщик вправе, не изменяя сведения, обобщать и структурировать в процессе заключения и исполнения Договора ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="d4a8d694-8b5f-4ad6-b16b-474ba384331a"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[8]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="0" y="10" width="260" height="748" uuid="b259296b-b4ae-4ddc-a57d-a5adeb4c3cc9">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[страхования всю или часть имеющейся у него информации из Платежного поручения и /или информации, представленной Страхователем (в том числе для заключения Договора страхования), в своей базе данных. При этом Страховщик вправе формировать на основании базы данных документы (выгрузки, выписки, отчеты и т. д.), которые будут обладать той же юридической силой в части установления условий страхования, что и первоисточники.
9.9. Договор страхования прекращается в случаях:
9.9.1. Истечения срока, на который он был заключен - в 24 часа 00 минут дня его окончания, если Договором страхования не предусмотрено иное.
9.9.2. Исполнения Страховщиком обязательств по Договору страхования в полном объеме – с 00 часов 00 минут дня, следующего за днем исполнения указанных обязательств.
9.9.3. По соглашению сторон – с 00 часов 00 минут дня указанного, как дата досрочного прекращения Договора страхования в соответствующем письменном Соглашении. 9.9.4. Если возможность наступления страхового случая отпала, и существование страхового риска прекратилось по обстоятельствам иным, чем страховой случай – с 00 часов 00 минут даты прекращения существования страхового риска. В этом случае Страховщик имеет право на часть страховой премии, пропорционально времени, в течение которого действовало страхование.
9.9.5. По требованию Страхователя. Страхователь вправе отказаться от Договора страхования в любое время, если к моменту отказа возможность наступления страхового случая не отпала по обстоятельствам, указанным в п 9.9.4 Условий.
Договор страхования считается прекратившим свое действие с даты получения Страховщиком письменного заявления Страхователя об отказе от Договора страхования или иной даты, установленной по соглашению сторон, но не ранее даты получения письменного заявления Страхователя об отказе от Договора страхования, за исключением случая, указанного в п. 9.9.5.1. Условий.
9.9.5.1. Страхователь - физическое лицо, имеет право отказаться от Договора страхования в течение 14 (четырнадцати) календарных дней со дня его заключения независимо от момента уплаты страховой премии, при отсутствии в данном периоде событий, имеющих признаки страхового случая, при этом уплаченная страховая премия подлежит возврату Страховщиком Страхователю в полном объеме. Договор страхования считается прекратившим свое действие с даты получения Страховщиком письменного заявления Страхователя об отказе ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="e429e720-e2a6-4bca-81e7-5bb04545508f">
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[от Договора страхования или иной даты, установленной по соглашению сторон, но не позднее срока, определенного в соответствии с п. 9.9.5.1. Условий.
9.9.5.2. Если Страхователь – физическое лицо, отказался от Договора страхования в иной срок, чем предусмотренный п. 9.9.5.1. Условий, при отсутствии в данном периоде событий, имеющих признаки страхового случая, Страховщик при возврате уплаченной страховой премии удерживает ее часть пропорционально сроку действия Договора страхования, прошедшему с даты начала действия страхования, а также понесённые Страховщиком расходы на ведение дела, согласно утвержденной Страховщиком структуре тарифной ставки.
9.9.5.3. Возврат страховой премии в случаях, указанных в пп. 9.9.5.1, 9.9.5.2 Условий, осуществляется по выбору Страхователя наличными деньгами или в безналичном порядке в срок не превышающий 10 (десяти) рабочих дней со дня получения письменного заявления Страхователя об отказе от Договора страхования.
9.9.6. В иных случаях, предусмотренных законодательством Российской Федерации, Условиями и Договором страхования.
9.9.7. В целях заключения Договора страхования, изменения условий Договора страхования, получения страховой выплаты, в случаях и порядке, предусмотренных настоящими Условиями, Страхователь (Застрахованное лицо, Выгодоприобретатель) вправе направить информацию в электронной форме с использованием официального сайта Страховщика в информационно-телекоммуникационной сети «Интернет» согласно ст. 6.1 Закона Российской Федерации от 27.11.1992 № 4015-1 «Об организации страхового дела в Российской Федерации».
9.10. В период действия Договора страхования Страхователь обязан незамедлительно, но в любом случае не позднее 30 (тридцати) календарных дней, сообщить Страховщику об изменениях в сведениях или контактной информации о Страхователе. Любые извещения, заявления и обращения, направляемые Сторонами друг другу в рамках исполнения Договора страхования, а также лицами, в пользу или в отношении которых заключен Договор страхования, должны совершаться в письменной форме, и направляться по почтовым адресам, адресам электронной почты, телефонам и иным контактным данным Сторон, указанным в Договоре страхования (например, в письменном заявлении, уведомлении об изменении контактной информации или реквизитов).
9.11. Страховщик уведомляет заинтересованных лиц об изменении своей контактной информации и иных сведений путем размещения ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="6e8e4518-8b92-4087-8bc3-6374a4a3a853"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[9]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="0" y="10" width="260" height="748" uuid="ebce69ae-1e55-41b9-89ef-9372c09f0c0e">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.y" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[информационного сообщения на официальном сайте Страховщика. Если иное не установлено законом или Договором страхования, Страховщик вправе направлять Страхователю (Выгодоприобретателю, Застрахованному) сообщения посредством смс-сообщений, электронной почты по адресу, согласно сведениям, указанным Страхователем (Выгодоприобретателем, Застрахованным) в имеющихся у Страховщика документах, или посредством размещения информации на официальном сайте Страховщика в сети «Интернет». В таком случае сообщение считается направленным надлежащим образом, если можно достоверно установить, от кого исходило сообщение и кому оно адресовано.
9.12. Внесение изменений в Договор страхования осуществляется в порядке, установленном законодательством Российской Федерации.
10. ПОРЯДОК ВЗАИМОДЕЙСТВИЯ СТОРОН ПРИ НАСТУПЛЕНИИ СОБЫТИЯ, ИМЕЮЩЕГО ПРИЗНАКИ СТРАХОВОГО СЛУЧАЯ 10.1. Уведомление о событии, имеющего признаки страхового случая.
10.1.1. После получения подтвержденного диагноза заболевания, указанного в п. 3.1 Условий, Страхователь должен в Период страхования, в кратчайшие сроки обратиться в Сервисную компанию с уведомлением о наступлении события, имеющего признаки страхового случая, с последующим предоставлением документов, которые запросит Сервисная компания.
10.1.2. Для признания события страховым случаем Сервисная компания вправе запросить оригиналы или заверенные надлежащим образом копии документов:
10.1.2.1. Уведомление о событии, имеющем признаки страхового случая, а также заявление о наступлении страхового случая (по форме, предложенной Страховщиком/Сервисной компанией).
10.1.2.2. Документ, удостоверяющий личность Страхователя (для гражданина Российской Федерации – паспорт гражданина Российской Федерации; для иностранного гражданина или лица без гражданства - документ, подтверждающий право на пребывание (проживание) в Российской Федерации; для временно проживающих – разрешение на временное проживание на территории Российской Федерации; для постоянного проживающих – вид на жительство; для беженцев – удостоверение беженца; для вынужденных переселенцев - удостоверение вынужденного переселенца).
10.1.2.3. Договор страхования и платежный документ, подтверждающий его оплату страховой премии.]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="748" uuid="343ad776-f6fe-47a3-9b2a-dfe0132f92dc">
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[В случае, если Страхователем производилось заключение Договоров страхования в соответствии с п.6.2 Условий, - все ранее заключенные Договоры страхования с платежными документами, подтверждающими их оплату.
10.1.2.4. Согласие Застрахованного лица на обработку его персональных данных (включая, все действия, перечисленные в ст. 3 Федерального закона от 27.07.2006 №152-ФЗ «О персональных данных» (далее - Закон)), в целях надлежащего исполнения Договора страхования, организации оказания услуг в отношении Страховщика, Сервисной компании, их уполномоченных представителей, а также третьих лиц, оказывающих услуги в связи с диагностированным заболеванием Застрахованного лица.
10.1.2.5. Согласие Застрахованного лица в соответствии с п. 3 ст. 13 Федерального закона от 21.11.2011 № 323-ФЗ «Об основах охраны здоровья граждан Российской  Федерации»
любому лечебному учреждению и/или врачу предоставлять ООО «РСХБ-Страхование жизни», осуществляющему страхование по Договору страхования, а также Сервисной компании по Договору страхования любые сведения, связанные с ним и составляющие врачебную тайну (любые медицинские документы и/или их заверенные копии, результаты лабораторных и инструментальных исследований, результаты лечения, прогноз по заболеванию и т.д.), как в связи с оценкой степени страхового риска, так и в связи с событиями, имеющими признаки страхового случая.
10.1.2.6. Медицинский документ (выписка из медицинской карты амбулаторного / стационарного больного, выписной эпикриз), заверенный печатью выдавшего учреждения и подписью ответственного лица, с указанием диагноза, послужившего причиной обращения за медицинской помощью в рамках настоящих Условий страхования, сроков лечения, результатов обследования и другой сопутствующей информации.
10.1.2.7. Результаты и заключения инструментальных, лабораторных методов диагностики / исследований, в т.ч.: гистологических или цитологических (в случае системных онкологических заболеваний); радиологических визуализирующих исследований; данные магнитно-резонансной томографии, результаты коронарной ангиографии.
10.1.2.8. Выписка из медицинской карты амбулаторного больного, содержащая информацию об имеющихся у Застрахованного лица заболеваниях за последние 5 лет.
10.1.2.9. Медицинский документ из ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="35dadf0f-70ab-4994-a115-57374c216644"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[10]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="0" y="10" width="260" height="740" uuid="200c22ab-7125-4584-9ae2-eb2ce01dd637">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[онкологического диспансера по месту жительства о наличии и дате (датах) обращений либо об отсутствии обращений, а также Извещение о больном с впервые в жизни установленным диагнозом (форма 090/У).
10.1.2.10. Заключение врача – специалиста в предметной области с указанием полного клинического диагноза, показаний к лечению, подтверждающее необходимость назначенного лечения, а также выбранный план лечения.
Указанный перечень документов и сведений является исчерпывающим. Страховщик (Сервисная компания) вправе сократить перечень документов, указанный в настоящем пункте, а также принять взамен указанных иные документы. Если соглашением Сторон прямо не предусмотрено иное, документы, перечисленные выше в п. 10.1.2 Условий, должны предоставляться в виде оригиналов или в виде копий, заверенных нотариально или органом / учреждением / организацией, которые выдали документ и/или располагают его подлинником. 10.2. В случае признания события страховым случаем - в течение 15 (Пятнадцати) рабочих дней с момента получения Сервисной организацией полного комплекта документов по заявленному событию, Сервисная компания начинает организацию необходимых Застрахованному лицу услуг, предусмотренных страхованием, и информирует Застрахованное лицо о:
- специализированных медицинских учреждениях, центрах;
- рекомендованном лечащем враче – специалисте;
- дальнейших действиях Застрахованного лица, необходимых для оказания услуг, предусмотренных Договором страхования.
10.3. Если наступившее событие не признано страховым случаем, Страховщик в течение 10 (десяти) рабочих дней с момента принятия решение о непризнании события страховым случаем письменно информирует об этом Застрахованное лицо.
11. ПОРЯДОК ОПРЕДЕЛЕНИЯ И ОСУЩЕСТВЛЕНИЯ СТРАХОВОЙ ВЫПЛАТЫ, ОКАЗАНИЯ МЕДИЦИНСКИХ УСЛУГ
11.1. Предоставление медицинских и иных услуг, обусловленных Договором страхования осуществляется путем обращения Застрахованного лица в Сервисную компанию, указанную в Договоре страхования.
11.2. Застрахованное лицо при обращении в Сервисную компанию предоставляет документы, указанные в п. 10.1.2. Условий страхования.
11.3. Страховая выплата производится путем оплаты Страховщиком стоимости медицинских и иных услуг, предусмотренных Договором ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="740" uuid="79c58ef6-78d9-40a6-b7ac-d3d7ef808b2d">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[страхования непосредственно на счет Сервисной компании или иному лицу, организовавшему по согласованию со Сервисной компанией (Страховщиком) оказание медицинских и иных услуг Застрахованному лицу.
11.4. Размер страховой выплаты определяется в размере стоимости оказанной Застрахованному лицу медицинской и иной помощи в объеме, предусмотренном Договором страхования.
11.5. Перечисление страховой выплаты осуществляется Страховщиком на основании выставленного счета за оказанные медицинские и иные услуги.
11.5.1. Счет должен содержать: фамилию, имя, отчество (при наличии отчества) Застрахованного; дату его рождения; номер Договора страхования; диагноз; итоговую сумму к оплате; дату страхового случая; данные документа, удостоверяющего личность Застрахованного (в т.ч. паспортные данные Застрахованного (серия (при наличии), номер, дата и место выдачи, наименование и номер выдавшего органа); полных банковских реквизитов Сервисной компании.
11.5.2. К счету должны быть приложены копии
медицинских документов из клиники, содержащих информацию о диагнозе, состоянии здоровья Застрахованного лица, проведённом лечении, проведенных обследованиях Застрахованного, лабораторных исследованиях, а также копии счетов организаций, оказавших Застрахованному услуги.
11.6. Договор страхования может предусматривать возмещение расходов, понесенных Выгодоприобретателем (Страхователем, Застрахованным лицом) по оплате медицинских и иных услуг, оказанных по согласованию с Сервисной компанией (Страховщиком) и в соответствии с условиями Договора страхования, непосредственно Выгодоприобретателю (Застрахованному лицу, Страхователю) наличными денежными средствами или перечислением на его счет. При этом затраты должны быть признаны Страховщиком обоснованными на основании документов, перечисленных в пункте 10.1.2 Условий страхования, подтверждающих необходимость понесенных затрат и факт оплаты.
11.6.1. В этом случае Выгодоприобретатель (Страхователь, Застрахованное лицо) дополнительно к документам, указанным в п. 10.1.2, предоставляет:
- заявление на выплату от Выгодоприобретателя, с указанием реквизитов для перечисления страховой выплаты;
- документы, подтверждающие правоспособность лица, обратившегося за выплатой. ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="761e89d3-7b66-41a3-8def-6f8783bb064e"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[11]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="0" y="10" width="260" height="740" uuid="8440dabc-6362-4fe5-a2a0-e8f9539e3090">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[- счета из организаций, оказавших услуги с указанием наименований услуг, стоимости, дат их оказания, номера Договора с организацией;
- оригиналы платежно-расчетных документов, подтверждающих факт оплаты медицинских и иных услуг, включенных в Договор страхования;
- копию направления на оказание медицинской помощи в амбулаторных, условиях дневного стационара, стационарных условиях из медицинской организации, предусмотренной Договором страхования (согласованной Сервисной компанией (Страховщиком)), заверенную надлежащим образом;
- документы, подтверждающие оказание Застрахованному лицу соответствующих услуг (заключение о проведенном обследовании или лечении, выписку из истории болезни, выписной эпикриз, результаты обследования, амбулаторную карту и т.д.);
- копию лицензии (с приложениями) медицинской организации, в которой Застрахованное лицо проходило лечение (в случае компенсации расходов на лечение).
11.6.2. Страховщик вправе сократить перечень обязательных для представления документов, если обстоятельства страхового случая или размер причиненного ущерба Страховщику известны и не вызывают у него сомнения.11.7. После представления Выгодоприобретателем (Застрахованным лицом, Страхователем), всех необходимых документов, указанных в п. 10.1.2, 11.6.1, позволяющих судить о причинах и обстоятельствах, повлекших наступление события, обладающего признаками страхового случая, и о размере страховой выплаты, Страховщик в течение 15 (пятнадцати) рабочих дней (если иной срок не предусмотрен в Договоре страхования) со дня представления Выгодоприобретателем (Застрахованным лицом, Страхователем) всех необходимых документов обязан принять одно из следующих решений:
11.7.1. О признании заявленного события страховым случаем.
В этом случае в указанный в п. 11.7 Условий страхования срок Страховщик утверждает Страховой акт, и Сервисная организация начинает осуществлять организацию оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг, либо Страховщик производит страховую выплату в случаях, предусмотренных п.11.6. Условий, в течение 10 (десяти) рабочих дней с даты утверждения Страхового акта, если иные сроки не предусмотрены Договором страхования.
11.7.2. Об отказе в страховой выплате.
В этом случае в течение 10 (десяти) рабочих дней с момента принятия решения об отказе в страховой выплате (в срок, предусмотренный п. ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="740" uuid="eb12baba-d08f-439b-b213-37d561b3081f">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[11.7. Условий) Страхователю (Застрахованному лицу, Выгодоприобретателю) направляется письменное уведомление с мотивированным обоснованием причин отказа, если иные сроки не предусмотрены Договором страхования.
11.7.3. О проведении страхового расследования.
Страховщик имеет право, письменно уведомив Страхователя (Застрахованное лицо, Выгодоприобретателя), вынести мотивированное решение об отсрочке принятия решения о признании или непризнании события страховым случаем или об отказе в страховой выплате, в случаях если:
- по фактам, послужившим причиной наступления страхового случая, возбуждено уголовное дело или начат судебный процесс - до окончания производства по уголовному делу или судебному процессу (до события, которое наступит ранее);
- возникла необходимость в экспертизе представленных документов. Отсрочка возможна, в случае, если у Страховщика имеются мотивированные сомнения в подлинности документов, подтверждающих страховой случай;
- полученные Страховщиком и предусмотренные Договором страхования документы не подтверждают наличие страхового события, в связи с чем возникла необходимость в запросе дополнительных документов. В этом случае, Страховщик вправе запросить дополнительно  документы у Страхователя (Застрахованного лица, Выгодоприобретателя) и/или компетентных органов. При этом Страховщик обязан обосновать в своем запросе необходимость предоставления ему таковых документов.
Страховое расследование проводится в течение 30 (тридцати) рабочих дней после получения всей необходимой информации в соответствии с настоящим пунктом Условий страхования.
Решение о признании или непризнании события страховым случаем или об отказе в страховой выплате принимается в течение 15 (пятнадцати) рабочих дней после завершения страхового расследования.
11.8. Размер страховой выплаты определяется в зависимости от условий страхования, изложенных в конкретном Договоре страхования.
11.9. Страховщик не несет ответственность за объем и качество предоставляемых медицинских и иных услуг.
12. ПРАВА И ОБЯЗАННОСТИ СТОРОН
12.1. Страховщик и/или Сервисная компания имеют право:
12.1.1. Проверять подлинность документов и достоверность информации, сообщаемой Страхователем, любыми доступными ему способами, не противоречащими действующему законодательству, в том числе назначать соответствующие экспертизы, запрашивать ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="5bc40949-06d0-42cd-bbf5-6af4762669c4"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[12]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="0" y="10" width="260" height="740" uuid="c546f621-7c88-4f48-9ba2-1837b54eff2f">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[дополнительные сведения у Страхователя, направлять запросы в компетентные органы, медицинские и иные учреждения.
12.1.2. Требовать от Застрахованного лица (Выгодоприобретателя) выполнения обязанностей по Договору страхования, включая обязанности, лежащие на Страхователе, но не выполненные им, при предъявлении Выгодоприобретателем требования о страховой выплате.
12.1.3. При наступлении события, имеющего признаки страхового случая, самостоятельно выяснять причины, обстоятельства наступившего события, имеющего признаки страхового случая. При необходимости потребовать у Страхователя (Застрахованного лица) прохождения медицинского обследования в указанном Страховщиком (Сервисной компании) лечебном учреждении либо у указанного Страховщиком (Сервисной компании) врача, если требуется дополнительная информация об подтверждении факта (причин) происшедшего события, имеющего признаки страхового случая.
12.1.4. Потребовать признания Договора страхования недействительным, если после заключения Договора страхования будет установлено, что Страхователь сообщил заведомо ложные сведения об обстоятельствах, имеющих существенное значение для определения вероятности наступления страхового случая и размера возможных убытков от его наступления (страхового риска).
12.1.5. Запросить сведения и/или документы, получение которых обусловлено требованиями законодательства Российской Федерации в сфере противодействия легализации (отмыванию) доходов, полученных преступным путем, и финансированию терроризма.
12.2. Страховщик обязан:
12.2.1. Разъяснять положения, содержащиеся в Условиях и Договоре страхования, по требованиям Страхователей, Застрахованных лиц, а также лиц, имеющих намерение заключить Договор страхования.
12.2.2. При наступлении страхового случая осуществить организацию оказания медицинской и лекарственной помощи (медицинских услуг) и иных услуг или страховую выплату в установленный Условиями и Договором страхования срок.
12.2.3. Обеспечить конфиденциальность во взаимоотношениях со Страхователем, не разглашать сведения о Договоре страхования, Страхователе, Застрахованном лице, их имущественном положении и состоянии здоровья, за исключением случаев, предусмотренных законодательством Российской Федерации.]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="740" uuid="b453b178-4683-4b61-9d7a-1f88f8547a23">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[12.2.4. Предоставить Страхователю информацию о лицензии Страховщика, контактах (месте нахождения, телефон/факс) и режиме работы структурного подразделения Страховщика и привлеченных Страховщиком сторонних организаций для оказания страховых услуг или сообщить информацию о сайте в информационно-телекоммуникационной сети «Интернет», на котором размещается вышеуказанная информация.
12.3. Страхователь имеет право:
12.3.1. Получить Условия, любые разъяснения по Условиям и заключенному Договору страхования.
12.3.2. Получить на основании письменного заявления дубликат Договора страхования в случае утери подлинника.
12.3.3. Требовать предоставления Застрахованному лицу медицинских и иных услуг, обусловленных Договором страхования, в соответствующем порядке и сроки.
12.3.4. Получить информационно – консультационные услуги Сервисной компании (по телефону, указанному в Договоре страхования) в связи с заболеваниями / состояниями, предусмотренными в Договоре страхования, в том числе:
12.3.4.1. разъяснения по условиям страхования, порядку и условиям получения услуг, предусмотренных Договором страхования;
12.3.4.2. информацию по порядку получения медицинской помощи в рамках программ Обязательного медицинского страхования;
12.3.5. Получать консультацию медицинских специалистов по вопросам подготовки к диагностическим и лабораторным исследованиям, в том числе по телефону, посредствам видеосвязи и чатов.
12.3.6. Один раз в течение Периода страхования получить второе медицинское мнение по поводу впервые диагностированных заболеваний / состояний, предусмотренных Договором страхования на основании выписного эпикриза, предоставленного Страхователем (Застрахованным лицом).
12.4. Страхователь обязан:
12.4.1. До заключения Договора страхования ознакомиться с настоящими Условиями, Договором страхования (в том числе текстом Декларации).
12.4.2. Своевременно и в полном объеме уплачивать обусловленную Договором страхования страховую премию.
12.4.3. При заключении Договора страхования сообщить и/или иным образом подтвердить Страховщику необходимую достоверную информацию, касающуюся Застрахованного лица, а также все известные обстоятельства, имеющие существенное значение для ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="199f33ab-50d4-45d5-a1ec-fe564d60c4a3"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[13]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="0" y="10" width="260" height="740" uuid="a29d2aad-24c3-47c8-82b3-9993808dda57">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[определения вероятности наступления страхового случая. Существенными являются в том числе сведения, приведенные в настоящих Условиях и Договоре страхования.
12.4.4. Ознакомить Застрахованное лицо, указанное в Договоре страхования, с Условиями страхования и условиями Договора страхования.
12.4.4.1. В случае заключения Договора страхования в соответствии с п. 9.5.2-9.5.3 Условий, - обеспечить соответствие достоверности данных, указанных в Декларации о состоянии здоровья Застрахованного лица, являющейся частью Страхового полиса и фактических данных о Застрахованном лице.
Подтверждением согласия Страхователя с данными, изложенными в Декларации Страхового полиса, является уплата страховой премии.
12.4.5. Предоставлять Страховщику информацию, необходимую для исполнения требований законодательства Российской Федерации в сфере противодействия легализации (отмыванию) доходов, полученных преступным путем, и финансированию терроризма, включая информацию о своих выгодоприобретателях, учредителях (участниках) и бенефициарных владельцах.
12.4.6. В период действия Договора страхования сообщать Страховщику о ставших ему известными значительных изменениях в обстоятельствах, сообщенных Страховщику при заключении Договора страхования, если эти изменения могут существенно повлиять на увеличение страхового риска. 13. ОСНОВАНИЯ ОТКАЗА В СТРАХОВОЙ ВЫПЛАТЕ
13.1. Страховщик освобождается от страховой выплаты в следующих случаях:
13.1.1. Если страховой случай по любому страховому риску наступил вследствие умысла Страхователя, Выгодоприобретателя или Застрахованного лица.
13.1.2. Если страховой случай по любому страховому риску наступил вследствие:
13.1.2.1. Воздействия ядерного взрыва, радиации или радиоактивного заражения.
13.1.2.2. Военных действий, а также маневров или иных военных мероприятий.
13.1.2.3. Гражданской войны, народных волнений всякого рода или забастовок.
13.2. Страховщик отказывает в страховой выплате по следующим основаниям:
13.2.1. Произошедшее событие не является страховым случаем, т.е. не относится к событиям, на случай наступления которых был заключен Договор страхования (например, отнесено к исключениям (раздел 5 Условий страхования) или не может быть квалифицировано в качестве страхового случая, исходя из терминов и определений, определенных Условиями]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="740" uuid="33f0ea6b-a64c-448a-9b40-b282b498d7bf">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[ страхования).
13.2.2. Событие произошло до начала или после окончания (в т. ч. досрочного) срока действия Договора страхования (например, после прекращения срока действия Договора страхования).
13.2.3. Событие произошло в период ожидания.
13.2.4. Сумма страховой выплаты превышает лимит ответственности (лимит страхового обязательства). При этом возможен частичный отказ в страховой выплате пропорционально превышению лимита.
13.2.5. Событие произошло с лицом, которое не является Застрахованным лицом по Договору страхования, или событие произошло по страховому риску, который не предусмотрен в отношении Застрахованного лица.
13.2.6. По основаниям, предусмотренным действующим законодательством Российской Федерации (в т. ч. если Страховщик освобожден от страховой выплаты).
14. ПОРЯДОК РАЗРЕШЕНИЯ СПОРОВ
14.1. При разрешении споров между Страхователем (Застрахованным лицом, Выгодоприобретателем) и Страховщиком стороны применяют обязательный претензионный досудебный порядок, если иное не предусмотрено законом.
14.2. Претензия должна содержать следующие реквизиты:
- наименование «претензия»;
- дата и место ее составления;
- суть требований и обстоятельства, имеющие отношение к событию, имеющему признаки страхового случая, и явившиеся основанием для предъявления претензии;
- сумма претензии и порядок ее расчета;
- подпись представителя стороны, имеющей претензию к другой стороне, и документ, подтверждающий его полномочия.
К претензии должны быть приложены документы, подтверждающие обоснованность заявленных в претензии требований.
14.3. Письменная мотивированная претензия должна быть вручена уполномоченному представителю стороны лично или направлена по почте заказным письмом с описью вложения и уведомлением о вручении.
14.4. Претензии, направленные иным образом, к рассмотрению не принимаются.
14.5. Надлежащим образом врученная претензия должна быть рассмотрена в течение 30 (тридцати) рабочих дней с даты ее получения.
14.6. Если иное не предусмотрено Договором страхования, все споры, которые возникли между Страховщиком и Страхователем (Застрахованным лицом, Выгодоприобретателем) в связи с Договором страхования ]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="4c41f6b4-331d-489e-90bc-16d652c54712"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[14]]></textFieldExpression>
            </textField>
        </band>
        <band height="772">
            <staticText>
                <reportElement x="0" y="10" width="260" height="740" uuid="3bba0d1a-5dec-4fbc-b56a-c127d58347a8">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[и неразрешенные в досудебном порядке передаются в суд в соответствии с законодательством Российской Федерации.
15. ПЕРСОНАЛЬНЫЕ ДАННЫЕ. ТАЙНА СТРАХОВАНИЯ
15.1. Страховщик не вправе разглашать полученные им в результате своей профессиональной деятельности сведения о Страхователе (Застрахованном лице, Выгодоприобретателе), состоянии их здоровья, а также об имущественном положении этих лиц (тайна страхования).
15.2. При обработке персональных данных Страхователя (Застрахованного лица, Выгодоприобретателя), являющегося физическим лицом (далее – персональные данные), Страховщик должен руководствоваться законодательством Российской Федерации в области персональных данных.
15.3. Обработка персональных данных Страховщиком осуществляется:
15.3.1. Для целей заключения, исполнения (в том числе исполнения обязательств Сервисной компанией), изменения, прекращения Договора страхования.
15.3.2. Для целей перестрахования Страховщиком рисков, принятых по Договору страхования, и заключения, исполнения, 	изменения, прекращения соответствующего(-их) Договора(-ов) перестрахования.
15.3.3. Для предусмотренных законом целей, а также для осуществления и выполнения возложенных законодательством Российской Федерации на Страховщика функций, полномочий и обязанностей.
15.3.4. Для целей осуществления прав и законных интересов Страховщика (в т. ч. оценки страхового риска).
15.3.5. Для иных законных и заявленных субъекту персональных данных целей (при наличии).
15.4. Заключая Договор страхования, Страхователь подтверждает свое ознакомление с заявленными целями обработки персональных данных.
15.5. При обработке персональных данных Страховщик обязан соблюдать безопасность и конфиденциальность обрабатываемых персональных данных, а также выполнять иные требования, предусмотренные законодательством Российской Федерации в области персональных данных.
15.6. Страховщик обязан принимать меры, необходимые и достаточные для обеспечения выполнения указанных обязанностей. При этом Страховщик самостоятельно определяет состав и перечень мер, необходимых и достаточных для обеспечения выполнения обязанностей. ]]></text>
            </staticText>
            <staticText>
                <reportElement x="295" y="10" width="260" height="740" uuid="cd12cc7f-04b7-46b6-8013-20462a938ed7">
                    <property name="com.jaspersoft.studio.unit.height" value="px"/>
                    <property name="com.jaspersoft.studio.unit.width" value="mm"/>
                    <property name="com.jaspersoft.studio.unit.x" value="mm"/>
                </reportElement>
                <textElement textAlignment="Justified" markup="styled">
                    <font fontName="Arial" size="11" isBold="false"/>
                </textElement>
                <text><![CDATA[В частности, Страховщик при обработке персональных данных обязан принимать необходимые правовые, организационные и технические меры или обеспечивать их принятие для защиты персональных данных от неправомерного или случайного доступа к ним, уничтожения, изменения, блокирования, копирования, предоставления, распространения персональных данных, а также от иных неправомерных действий в отношении персональных данных.
]]></text>
            </staticText>
            <textField>
                <reportElement x="455" y="758" width="100" height="14" uuid="b74b9393-9856-46bb-8942-2f1b37f2489c"/>
                <textElement textAlignment="Right">
                    <font fontName="Arial" size="11"/>
                </textElement>
                <textFieldExpression><![CDATA[15]]></textFieldExpression>
            </textField>
        </band>
    </detail>
    <pageFooter>
        <band height="30"/>
    </pageFooter>
</jasperReport>
'::text, 'utf8'))
ON CONFLICT (type)
DO NOTHING;

insert into common_dict.addresses (aoguid, offname, postalcode, shortname, level, orig_level, okato)
values ('0c5b2444-70a0-4932-980c-b4dc0d3f02b5', 'Москва', '', 'г', 0, 1, '45000000000');
insert into common_dict.addresses (aoguid, offname, postalcode, shortname, level, orig_level, okato)
values ('bd8e6511-e4b9-4841-90de-6bbc231a789e', 'Крым', '', 'Респ', 0, 1, '35000000000');
insert into common_dict.addresses (aoguid, offname, postalcode, shortname, level, orig_level, okato)
values ('ed36085a-b2f5-454f-b9a9-1c9a678ee618', 'Вологодская', '', 'обл', 0, 1, '19000000000');
insert into common_dict.addresses (aoguid, offname, postalcode, shortname, level, orig_level, okato)
values ('d02f30fc-83bf-4c0f-ac2b-5729a866a207', 'Камчатский', '', 'край', 0, 1, '30000000000');
insert into common_dict.addresses (aoguid, offname, postalcode, shortname, level, orig_level, okato)
values ('f136159b-404a-4f1f-8d8d-d169e1374d5c', 'Чукотский', '', 'АО', 0, 1, '77000000000');