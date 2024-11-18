package com.example.coursework2.service;

import com.example.coursework2.Question;

import java.util.Set;

public interface ExaminerService {
    Set<Question> getQuestions(int number);
}
