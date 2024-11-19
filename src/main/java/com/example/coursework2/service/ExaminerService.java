package com.example.coursework2.service;

import com.example.coursework2.model.Question;
import org.apache.coyote.BadRequestException;

import java.util.Set;

public interface ExaminerService {
    Set<Question> getQuestions(int number) throws BadRequestException;
}