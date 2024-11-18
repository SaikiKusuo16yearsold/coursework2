package com.example.coursework2.service;

import com.example.coursework2.Question;

import java.util.Set;

public interface QuestionServices {

    Question add(String QuestionText, String QuestionAnswer);

    Question remove(String QuestionText, String QuestionAnswer);

    Set<Question> getAllQuestions();

    int randomNumber(int maximum);
}
