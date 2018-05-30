package com.example.rachelwestwater.gamereviewapp;

import java.io.Serializable;

public class Game implements Serializable {

    private Integer ranking;
    private String title;
    private Integer year;
    private String publisher;


    public Game(Integer ranking, String title, Integer year, String publisher) {
        this.ranking = ranking;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getPublisher() { return publisher; }

}
