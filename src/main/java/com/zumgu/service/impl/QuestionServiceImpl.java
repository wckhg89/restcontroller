package com.zumgu.service.impl;

import com.zumgu.model.Question;
import com.zumgu.repository.QuestionRepository;
import com.zumgu.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 강홍구 on 2016-12-10.
 */
@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }
}
