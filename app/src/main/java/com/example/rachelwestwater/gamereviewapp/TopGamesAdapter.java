package com.example.rachelwestwater.gamereviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopGamesAdapter extends ArrayAdapter<Game> {

    public TopGamesAdapter(Context context, ArrayList<Game> games) {
        super(context, 0, games);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.games_item, parent, false);
        }

        Game currentMovie = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentMovie.getRanking().toString());

        TextView year = listItemView.findViewById(R.id.year);
        year.setText(currentMovie.getYear().toString());

        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentMovie.getTitle());

        TextView publisher = listItemView.findViewById(R.id.year);
        publisher.setText(currentMovie.getPublisher());

        listItemView.setTag(currentMovie);

        return listItemView;
    }
}
