package com.zumgu;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<DateTime, Timestamp> {
  @Override
  public Timestamp convertToDatabaseColumn(DateTime localDateTime) {

      return localDateTime != null ? new Timestamp(localDateTime.getMillis()) : null;
      // return localDateTime != null ? Timestamp.valueOf(localDateTime) : null;
   }

  @Override
  public DateTime convertToEntityAttribute(Timestamp timestamp) {
      return timestamp != null ? new DateTime(timestamp, DateTimeZone.UTC) : null;
      // return timestamp != null ? timestamp.toLocalDateTime() : null;
   }
}
