package com.studentai.assistant.controller;

import com.studentai.assistant.model.*;
import com.studentai.assistant.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AIController {

    @Autowired
    private AIService aiService;

    @PostMapping("/summarize")
    public SummaryResponse summarize(@RequestBody SummaryRequest request) {
        String result = aiService.summarizeText(request.getText());
        return new SummaryResponse(result);
    }

    @PostMapping("/quiz")
    public QuizResponse generateQuiz(@RequestBody QuizRequest request) {
        List<String> questions = aiService.generateQuiz(request.getTopic());
        return new QuizResponse(questions);
    }
}