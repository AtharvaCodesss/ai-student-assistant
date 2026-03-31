package com.studentai.assistant.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin(origins = "*")
public class AIController {


    // ===================== SUMMARIZE =====================
    @PostMapping("/summarize")
    public Map<String, String> summarize(@RequestBody Map<String, String> request) {

        String text = request.get("text");

        // 🔒 Safety check (prevents crash)
        if (text == null || text.trim().isEmpty()) {
            text = "No input provided";
        }

        // 🧠 Simple summary logic
        String summary;
        if (text.length() > 50) {
            summary = text.substring(0, 50) + "...";
        } else {
            summary = text;
        }

        Map<String, String> response = new HashMap<>();
        response.put("summary", summary);

        return response;
    }

    // ===================== QUIZ =====================
    @PostMapping("/quiz")
    public Map<String, List<String>> quiz(@RequestBody Map<String, String> request) {

        String topic = request.get("topic");

        // 🔒 Safety check
        if (topic == null || topic.trim().isEmpty()) {
            topic = "General Knowledge";
        }

        List<String> questions = new ArrayList<>();

        questions.add("What is " + topic + "?");
        questions.add("Explain the basics of " + topic + ".");
        questions.add("Why is " + topic + " important?");
        questions.add("Give one real-life example of " + topic + ".");
        questions.add("What are advantages of " + topic + "?");

        Map<String, List<String>> response = new HashMap<>();
        response.put("questions", questions);

        return response;
    }


}
