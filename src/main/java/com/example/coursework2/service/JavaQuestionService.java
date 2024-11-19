package com.example.coursework2.service;

import com.example.coursework2.Question;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
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

    @Override
    public int getRandomQuestion(int maximum) {
        Random random = new Random();
        return random.nextInt(maximum);
    }

}