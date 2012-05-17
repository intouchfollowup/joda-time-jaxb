
package org.joda.xmlAdapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.joda.time.LocalTime;

public class JodaLocalTimeAdapter extends XmlAdapter<String, LocalTime>
{
	public LocalTime unmarshal(String v) throws Exception
	{
		return new LocalTime(v);
	}

	public String marshal(LocalTime v) throws Exception
	{
		return v.toString();
	}
}
