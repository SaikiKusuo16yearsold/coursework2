package com.example.coursework2.controller;

import com.example.coursework2.Question;
import com.example.coursework2.service.QuestionServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

public class JavaQuestionController {
    private final QuestionServices questionServices;

    public JavaQuestionController(QuestionServices questionServices) {
        this.questionServices = questionServices;
    }


    @GetMapping(path = "/exam/java/add")
    public Question addQuestion(@RequestParam String QuestionText, @RequestParam String QuestionAnswer) {
        return questionServices.add(QuestionText, QuestionAnswer);
    }

    @GetMapping(path = "/exam/java/remove")
    public Question removeQuestion(@RequestParam String QuestionText, @RequestParam String QuestionAnswer) {
        return questionServices.remove(QuestionText, QuestionAnswer);
    }

    @GetMapping(path = "/exam/java")
    public Set<Question> removeQuestion() {
        return questionServices.getAllQuestions();
    }

}

