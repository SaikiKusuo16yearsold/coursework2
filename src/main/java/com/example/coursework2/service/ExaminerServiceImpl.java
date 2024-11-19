package com.example.coursework2.service;

import com.example.coursework2.Question;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.*;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionServices questionService;

    public ExaminerServiceImpl(QuestionServices questionService) {
        this.questionService = questionService;
    }


    @Override
    public Set<Question> getQuestions(int number) throws BadRequestException {
        List<Question> allQuestions = new ArrayList<>(questionService.getAllQuestions());

        if (number > allQuestions.size()) {
            throw new BadRequestException("Number of questions is greater than the number of questions");
        }

        Set<Question> randomQuestions = new HashSet<>();

        while (randomQuestions.size() < number) {
            int index = questionService.getRandomQuestion(allQuestions.size());
            randomQuestions.add(allQuestions.get(index));
        }

        return randomQuestions;
    }


}