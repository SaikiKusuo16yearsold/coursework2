package com.example.coursework2.service;

import com.example.coursework2.Question;

import java.util.ArrayList;
import java.util.List;

public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionServices questionService;

    public ExaminerServiceImpl(QuestionServices questionService) {
        this.questionService = questionService;
    }

    List<Question> randomQuestion = new ArrayList<>();
}
