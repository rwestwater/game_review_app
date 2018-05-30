package com.example.rachelwestwater.gamereviewapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;

    @Before
    public void before(){
        game = new Game(1, "Super Mario World", 1990, "Nintendo");
    }

    @Test
    public void getRankingTest (){
        assertEquals((Integer)1, game.getRanking());
    }

    @Test
    public void geTitleTest (){
        assertEquals("Super Mario World", game.getTitle());
    }

    @Test
    public void getYearTest (){
        assertEquals((Integer)1990, game.getYear());
    }

    @Test
    public void getPublisherTest (){
        assertEquals("Nintendo", game.getPublisher());
    }
}
