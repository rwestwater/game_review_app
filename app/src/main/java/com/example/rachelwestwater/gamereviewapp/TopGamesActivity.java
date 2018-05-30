package com.example.rachelwestwater.gamereviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopGamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_game);

        TopGames topGames = new TopGames();
        ArrayList<Game> list = topGames.getList();

        TopGamesAdapter gamesAdapter = new TopGamesAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(gamesAdapter);
    }

    public void onListItemClick(View listItem) {
        Game game = (Game)listItem.getTag();
        Log.d("Game Title: ", game.getTitle());

        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("game", game);
        startActivity(intent);
    }
}
