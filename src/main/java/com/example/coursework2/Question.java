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
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и совпадение классов
        Question question1 = (Question) obj; // Приведение типа
        return Objects.equals(question, question1.question) &&
                Objects.equals(answer, question1.answer); // Сравнение полей
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer); // Генерация хеш-кода на основе полей
    }
}



