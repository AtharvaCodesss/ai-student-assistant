package com.studentai.assistant.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AIService {

    // 🔹 Summarize (FULL TEXT, NO CUT)
    public String summarizeText(String text) {
        return text;
    }

    // 🔹 Quiz Generator
    public List<String> generateQuiz(String topic) {

        List<String> questions = new ArrayList<>();

        questions.add("What is " + topic + "?");
        questions.add("Which of the following is true about " + topic + "?");
        questions.add("Where is " + topic + " used?");
        questions.add("Which keyword is related to " + topic + "?");

        return questions;
    }
}