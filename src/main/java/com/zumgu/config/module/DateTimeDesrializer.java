package com.zumgu.config.module;



import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import java.io.IOException;

public class DateTimeDesrializer extends StdScalarDeserializer<DateTime> {

    public DateTimeDesrializer() {
        super(DateTime.class);
    }

    @Override
    public DateTime deserialize(JsonParser jsonParser,
                                DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        try {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_STRING) {
                String dateTimeAsString = jsonParser.getText().trim();
                return ISODateTimeFormat.withZoneUTC().parseDateTime(dateTimeAsString);
            }
        } finally {
            throw deserializationContext.mappingException(getValueClass());
        }
    }
}