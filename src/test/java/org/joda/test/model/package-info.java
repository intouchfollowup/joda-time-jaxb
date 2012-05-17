@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(type=DateTime.class, 
        value=JodaDateTimeAdapter.class),
    @XmlJavaTypeAdapter(type=DateMidnight.class, 
        value=JodaDateMidnightAdapter.class),
    @XmlJavaTypeAdapter(type=LocalDate.class, 
        value=JodaLocalDateAdapter.class),
    @XmlJavaTypeAdapter(type=LocalTime.class, 
        value=JodaLocalTimeAdapter.class),
    @XmlJavaTypeAdapter(type=LocalDateTime.class, 
        value=JodaLocalDateTimeAdapter.class)
})
package org.joda.test.model;
 

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.xmlAdapter.JodaDateMidnightAdapter;
import org.joda.xmlAdapter.JodaDateTimeAdapter;
import org.joda.xmlAdapter.JodaLocalDateAdapter;
import org.joda.xmlAdapter.JodaLocalDateTimeAdapter;
import org.joda.xmlAdapter.JodaLocalTimeAdapter;

