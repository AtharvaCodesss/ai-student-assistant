package com.studentai.assistant.model;

public class SummaryResponse {
    private String summary;

    public SummaryResponse(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }
}