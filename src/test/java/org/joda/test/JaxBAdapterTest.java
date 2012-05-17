
package org.joda.test;

import static junit.framework.Assert.*;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.joda.test.model.Root;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.junit.Test;

public class JaxBAdapterTest
{
	final String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
			"<root>\n" +
			"    <dateTime>2011-05-30T11:02:30.000-07:00</dateTime>\n" +
			"    <dateMidnight>2011-05-30T00:00:00.000-07:00</dateMidnight>\n" +
			"    <localDate>2011-05-30</localDate>\n" +
			"    <localTime>11:02:30.000</localTime>\n" +
			"    <localDateTime>2011-05-30T11:02:30.000</localDateTime>\n" +
			"</root>";

	@Test
	public void test() throws JAXBException
	{

		Root root = new Root();

		DateTimeZone tz = DateTimeZone.forID("America/Vancouver");
		root.setDateTime(new DateTime(2011, 5, 30, 11, 2, 30, 0, tz));
		root.setDateMidnight(new DateMidnight(2011, 5, 30, tz));
		root.setLocalDate(new LocalDate(2011, 5, 30));
		root.setLocalTime(new LocalTime(11, 2, 30));
		root.setLocalDateTime(new LocalDateTime(2011, 5, 30, 11, 2, 30));

		JAXBContext jc = JAXBContext.newInstance(Root.class);

		StringWriter stringWriter = new StringWriter();
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(root, stringWriter);

		String xml = stringWriter.toString();
		System.out.println(xml);

		// Just strip all whitespace and compare
		assertEquals(expected.replaceAll("\\s", ""), xml.replaceAll("\\s", ""));
	}

}
