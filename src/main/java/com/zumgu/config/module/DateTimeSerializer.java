package com.zumgu.config.module;

public class DateTimeSerializer extends StdScalarSerializer<DateTime> {

    public DateTimeSerializer() {
        super(DateTime.class);
    }

    @Override
    public void serialize(DateTime dateTime,
                          JsonGenerator jsonGenerator,
                          SerializerProvider provider) throws IOException, JsonGenerationException {
        String dateTimeAsString = ISODateTimeFormat.withZoneUTC().print(dateTime);
        jsonGenerator.writeString(dateTimeAsString);
    }
}