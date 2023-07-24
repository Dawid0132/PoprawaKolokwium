package com.example.jaz24965nbp.Pojo;

import com.example.jaz24965nbp.Category.Category;

public class GoldRequest {
    private Category category;

    private String startDate;


    private String endDate;

    private double average;

    public GoldRequest(Category category, String startDate, String endDate, double average) {
        this.category = category;
        this.startDate = startDate;
        this.endDate = endDate;
        this.average = average;
    }

    public GoldRequest() {
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Category getCategory() {
        return category;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public double getAverage() {
        return average;
    }
}
