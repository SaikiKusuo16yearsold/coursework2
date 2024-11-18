package com.example.coursework2.controller;

import com.example.coursework2.Question;
import com.example.coursework2.service.ExaminerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Set;

@RestController
public class QuestionsСontroller {
    private final ExaminerService examinerService;


    public QuestionsСontroller(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping(path = "exam/get")
    public Set<Question> randomWords(@RequestParam int amount) {
        return examinerService.getQuestions(amount);
    }
}
