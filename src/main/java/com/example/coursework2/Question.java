package com.example.coursework2;

import java.util.Objects;

public class Question {
    public String question;
    public String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на идентичность
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и тип
        Question employee = (Question) obj; // Приведение типа
        return question == employee.question &&
                answer == employee.answer &&
                Objects.equals(question, employee.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }
}



