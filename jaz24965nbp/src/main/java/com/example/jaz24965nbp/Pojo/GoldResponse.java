package com.example.jaz24965nbp.Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class GoldResponse {
    private List<Gold> goldList;

    public GoldResponse() {
    }


    public void setGoldList(List<Gold> goldList) {
        this.goldList = goldList;
    }


    public List<Gold> getGoldList() {
        return goldList;
    }

    public GoldResponse(List<Gold> goldList) {
        this.goldList = goldList;
    }
}
