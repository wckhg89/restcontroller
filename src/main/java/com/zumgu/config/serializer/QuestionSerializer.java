package com.zumgu.config.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.zumgu.model.Question;

import java.io.IOException;

/**
 * Created by 강홍구 on 2016-12-10.
 */
public class QuestionSerializer extends JsonSerializer<Question> {

    @Override
    public void serialize(Question value, JsonGenerator gen, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        gen.writeStartObject();

        gen.writeFieldName("time");
        gen.writeString(String.valueOf(value.getTimestampCreateDate()));

        gen.writeEndObject();
    }
}
