
package org.joda.xmlAdapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.joda.time.DateTime;

public class JodaDateTimeAdapter extends XmlAdapter<String, DateTime>
{
	public DateTime unmarshal(String v) throws Exception
	{
		return new DateTime(v);
	}

	public String marshal(DateTime v) throws Exception
	{
		return v.toString();
	}
}
