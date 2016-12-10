package com.zumgu.controller;

import com.zumgu.model.Question;
import com.zumgu.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 강홍구 on 2016-12-10.
 */

@RestController
@RequestMapping("/api/v1")
public class APIController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/questions")
    public List<Question> getQuestion () {
        return questionService.findAll();
    }
}
