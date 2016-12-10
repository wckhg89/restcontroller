package com.zumgu.service;

import com.zumgu.model.Question;

import java.util.List;

/**
 * Created by 강홍구 on 2016-12-10.
 */
public interface QuestionService {
    List<Question> findAll();
}
