package com.example.jaz24965nbp.DB;


import com.example.jaz24965nbp.Category.Category;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "goldRequests")
public class GoldRequest {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Category category;


    private String startDate;


    private String endDate;

    private double average;


    private LocalDateTime addedAt;

    public GoldRequest(Long id, Category category, String startDate, String endDate, double average, LocalDateTime addedAt) {
        this.id = id;
        this.category = category;
        this.startDate = startDate;
        this.endDate = endDate;
        this.average = average;
        this.addedAt = addedAt;
    }

    public GoldRequest() {
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setAddedAt(LocalDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public Long getId() {
        return id;
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

    public LocalDateTime getAddedAt() {
        return addedAt;
    }
}
