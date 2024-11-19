package com.example.coursework2.service;

import com.example.coursework2.model.Question;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JavaQuestionServiceTest {

    private final JavaQuestionService out = new JavaQuestionService();


    @Test
    public void testAddQuestion() {
        out.add("Дмитрий", "Даванков");
        assertEquals(1, out.getAllQuestions().size());
        for (Question question : out.getAllQuestions()) {
            assertEquals(question, new Question("Дмитрий", "Даванков"));
        }
    }

    @Test
    public void testRemove() {
        out.add("Дмитрий", "Даванков");
        out.add("Дмитрий", "Даванков1");
        assertEquals(2, out.getAllQuestions().size());
        out.remove("Дмитрий", "Даванков");
        assertEquals(1, out.getAllQuestions().size());
        for (Question question : out.getAllQuestions()) {
            assertEquals(question, new Question("Дмитрий", "Даванков1"));
        }
    }

    @Test
    public void testGetAllQuestions() {
        out.add("Дмитрий", "Даванков");
        out.add("Дмитрий", "Даванков1");
        assertEquals(Set.of(new Question("Дмитрий", "Даванков"),
                        new Question("Дмитрий", "Даванков1"))
                , out.getAllQuestions());
    }


}