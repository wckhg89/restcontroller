package com.zumgu.config.module;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.joda.time.DateTime;

/**
 * Created by 강홍구 on 2016-12-10.
 */
public class DateTimeModule extends SimpleModule {

    public DateTimeModule() {
        super();
        addSerializer(DateTime.class, new DateTimeSerializer());
        addDeserializer(DateTime.class, new DateTimeDeserializer());
    }
}