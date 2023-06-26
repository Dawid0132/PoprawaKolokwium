package com.example.jaz24965nbp.Pojo;

import java.util.List;

public class GoldResponse {

    private String startDate;

    private String endDate;

    private List<Gold> goldList;

    public GoldResponse() {
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setGoldList(List<Gold> goldList) {
        this.goldList = goldList;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public List<Gold> getGoldList() {
        return goldList;
    }

    public GoldResponse(String startDate, String endDate, List<Gold> goldList) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.goldList = goldList;
    }
}
