package com.zumgu.config.module;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.zumgu.config.serializer.QuestionSerializer;
import com.zumgu.model.Question;

/**
 * Created by 강홍구 on 2016-12-10.
 */
public class QuestionCustomModule extends SimpleModule {
    public QuestionCustomModule() {
        super();
        this.addSerializer(Question.class, new QuestionSerializer());

    }
}
