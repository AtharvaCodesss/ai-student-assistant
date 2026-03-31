package com.studentai.assistant.model;

import java.util.List;

public class QuizResponse {

    private List<String> questions;

    public QuizResponse(List<String> questions) {
        this.questions = questions;
    }

    public List<String> getQuestions() {
        return questions;
    }
}