package com.example.recycleview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    GameAdapter gameAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        gameAdapter = new GameAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        gameAdapter.setData(getlist());
        recyclerView.setAdapter(gameAdapter);


    }

    public List<Game> getlist() {
        List<Game> list = new ArrayList<>();
        list.add(new Game(R.drawable.pubg, "PUBG"));
        list.add(new Game(R.drawable.lq, "PUBG"));
        list.add(new Game(R.drawable.unnamed, "PUBG"));
        list.add(new Game(R.drawable.minecraft, "PUBG"));
        list.add(new Game(R.drawable.vgvd, "PUBG"));
        list.add(new Game(R.drawable.lm, "PUBG"));
        list.add(new Game(R.drawable.pubg, "PUBG"));
        list.add(new Game(R.drawable.lq, "PUBG"));
        list.add(new Game(R.drawable.unnamed, "PUBG"));
        list.add(new Game(R.drawable.minecraft, "PUBG"));
        list.add(new Game(R.drawable.vgvd, "PUBG"));
        list.add(new Game(R.drawable.lm, "PUBG"));
        return list;
    }
}