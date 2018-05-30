package com.example.rachelwestwater.gamereviewapp;

import android.content.Intent;
import android.os.Bundle;

public class ReviewActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent intent = getIntent();
        Review review = (Game)intent.getSerializableExtra("game");
    }
}

