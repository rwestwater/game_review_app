package com.example.rachelwestwater.gamereviewapp;

import java.util.ArrayList;

public class TopGames {

        private ArrayList<Game> list;
        private String gameReview;

        public TopGames() {
            list = new ArrayList<Game>();
            list.add(new Game(1, "Super Mario World", 1990, "Nintendo"));
            list.add(new Game(2, "The Legend of Zelda: Ocarina of Time", 1998, "Nintendo"));
            list.add(new Game(3, "Portal", 2007, "Valve"));
            list.add(new Game(4, "Super Metroid", 1994, "Nintendo"));
            list.add(new Game(5, "The Legend of Zelda: A Link to the Past", 1991, "Nintendo"));
            list.add(new Game(6, "Super Mario Bros. 3", 1998, "Nintendo"));
            list.add(new Game(7, "Tetris", 1984, "Various"));
            list.add(new Game(8, "Half-Life 2", 2004, "Valve"));
            list.add(new Game(9, "Red Dead Redemption", 2010, "Rockstar Games"));
            list.add(new Game(10, "Super Mario 64", 1996, "Nintendo"));
        }

        public ArrayList<Game> getList() {
            return new ArrayList<Game>(list);
        }

}


