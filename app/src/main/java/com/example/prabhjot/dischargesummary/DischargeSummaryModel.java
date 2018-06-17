package com.example.prabhjot.dischargesummary;

public class DischargeSummaryModel {

    private String title;
    private String description;

    public DischargeSummaryModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}