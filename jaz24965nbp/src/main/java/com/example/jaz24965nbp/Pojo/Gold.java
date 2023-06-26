package com.example.jaz24965nbp.Pojo;

public class Gold {
    private String data;

    private double cena;

    public Gold() {
    }

    public Gold(String data, double cena) {
        this.data = data;
        this.cena = cena;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getData() {
        return data;
    }

    public double getCena() {
        return cena;
    }
}
