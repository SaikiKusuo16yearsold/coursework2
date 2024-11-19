package com.example.coursework2.service;

import com.example.coursework2.model.Question;
import org.apache.coyote.BadRequestException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService service;
    @InjectMocks
    private ExaminerServiceImpl out;

    //    }
    @Test
    public void testGetQuestions_Success() throws BadRequestException {
        // Подготовка данных
        int amount = 3;
        Question question1 = new Question("Дмитрий", "устал");
        Question question2 = new Question("Дмитрий1", "поспал");
        Question question3 = new Question("Дмитрий111", "ест");


        // Настройка мока
        Set<Question> mockQuestions = new HashSet<>(Arrays.asList(question1, question2, question3));

        when(service.getAllQuestions())
                .thenReturn(mockQuestions);

        when(service.getRandomQuestion(mockQuestions.size()))
                .thenReturn(0)
                .thenReturn(1)
                .thenReturn(2);
        Set<Question> questions = out.getQuestions(amount);

        assertTrue(questions.contains(new Question("Дмитрий", "устал")));
        assertTrue(questions.contains(new Question("Дмитрий1", "поспал")));
        assertTrue(questions.contains(new Question("Дмитрий111", "ест")));
    }

    @Test
    public void testСallingException() throws BadRequestException {
        // Подготовка данных
        int amount = 3;
        Question question1 = new Question("Дмитрий", "устал");
        Question question2 = new Question("Дмитрий1", "поспал");
        Question question3 = new Question("Дмитрий111", "ест");


        // Настройка мока
        Set<Question> mockQuestions = new HashSet<>(Arrays.asList(question1, question2, question3));

        when(service.getAllQuestions())
                .thenReturn(mockQuestions);

        assertThrows(BadRequestException.class, () -> out.getQuestions(4));

    }
}

