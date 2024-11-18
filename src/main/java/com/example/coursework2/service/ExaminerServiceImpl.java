package com.example.coursework2.service;

import com.example.coursework2.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionServices questionService;

    public ExaminerServiceImpl(QuestionServices questionService) {
        this.questionService = questionService;
    }



    @Override
    public Set<Question> getQuestions(int number) {
        List<Question> allQuestions = new ArrayList<>(questionService.getAllQuestions());

        if (number > allQuestions.size()) {
            throw new RuntimeException("Number of questions is greater than the number of questions");
        }

        Set<Question> randomQuestions = new HashSet<>();
        Random random = new Random();

        while (randomQuestions.size() < number) {
            int index = questionService.randomNumber(allQuestions.size());
            randomQuestions.add(allQuestions.get(index));
        }

        return randomQuestions;
    }


}