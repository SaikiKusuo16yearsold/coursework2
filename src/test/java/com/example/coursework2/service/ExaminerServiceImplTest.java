package com.example.coursework2.service;

import com.example.coursework2.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


//    private QuestionServices JavaQuestionService;
//    private final ExaminerServiceImpl out = new ExaminerServiceImpl(JavaQuestionService);
//
//
@ExtendWith(MockitoExtension.class)
class ExampleServiceImplTest {
    @Mock
    private JavaQuestionService service;

    @InjectMocks
    private ExaminerServiceImpl out;

    @Test
    public void getQuestionsTest() {
//        Set<Question> answer = Set.of(new Question("дима", "1"), new Question("дима", "2"), new Question("дима", "4"));
//        when(service.getAllQuestions())
//                .thenReturn(answer);
////        service.add("дима", "1");
////        service.add("дима", "2");
////        when(service.randomNumber(2))
////                .thenReturn(0);
//
//        assertEquals(answer, out.getQuestions(3));
        Set<Question> answer  =  Set.of(new Question("дима", "1"), new Question("дима", "1"));
        when(service.getAllQuestions())
                .thenReturn(answer);
        assertEquals(answer, out.getQuestions(2));
    }
    }

