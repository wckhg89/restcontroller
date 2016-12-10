package com.zumgu.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zumgu.config.module.DateTimeModule;
import com.zumgu.config.module.QuestionCustomModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * Created by 강홍구 on 2016-12-10.
 */
@Configuration
public class MessageConverterConfig {
    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = new ObjectMapper();
        // objectMapper.registerModule(new QuestionCustomModule());
        objectMapper.registerModule(new DateTimeModule());
        jsonConverter.setObjectMapper(objectMapper);


        return jsonConverter;
    }

}
