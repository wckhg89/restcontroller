package com.zumgu.config.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;

/**
 * Created by 강홍구 on 2016-12-10.
 */
public class DateTimeSerializer extends JsonSerializer<DateTime> {

    @Override
    public void serialize(DateTime value, JsonGenerator gen, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        //gen.writeStartObject();
        //gen.writeFieldName("timestamp");
        // gen.writeString(String.valueOf());
        gen.writeNumber(value.getMillis());
        //gen.writeFieldName("formmated");
        //gen.writeString(String.valueOf(DateTimeFormat.forPattern("yyyy.MM.dd HH:mm:ss").print(value)));

        //gen.writeEndObject();
    }
}
