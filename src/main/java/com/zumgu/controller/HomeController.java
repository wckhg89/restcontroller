package com.zumgu.controller;

import com.zumgu.model.Question;
import com.zumgu.repository.QuestionRepository;
import com.zumgu.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by 강홍구 on 2016-12-10.
 */
@Controller
public class HomeController {

    @Autowired
    QuestionService questionService;

    @GetMapping("")
    public String home (Model model) {
        List<Question> questions = questionService.findAll();

        model.addAttribute("questions", questions);

        return "/index";
    }
}
