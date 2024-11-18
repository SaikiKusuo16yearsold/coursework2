package com.example.coursework2.service;

import com.example.coursework2.Question;

import java.util.HashSet;
import java.util.Set;

public class JavaQuestionService implements QuestionServices {
    private Set<Question> allQuestions = new HashSet();

    @Override
    public Question add(String QuestionText, String QuestionAnswer) {
        Question question = new Question(QuestionText, QuestionAnswer);
        allQuestions.add(question);
        return question;
    }

    @Override
    public Question remove(String QuestionText, String QuestionAnswer) {
        Question question = new Question(QuestionText, QuestionAnswer);
        allQuestions.remove(question);
        return question;
    }

    @Override
    public Set<Question> getAllQuestions() {
        return allQuestions;
    }
}
