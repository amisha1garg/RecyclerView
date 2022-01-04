package com.ford.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String s1[], s2[];
    RecyclerView recyclerView;
    int [] images={R.drawable.burger,
            R.drawable.french_fries,
            R.drawable.gol_gappe,
            R.drawable.kachori,
            R.drawable.momos,
            R.drawable.pizza,
            R.drawable.samosa,
            R.drawable.sub,
            R.drawable.sweet_corn,
            R.drawable.sweets};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.food_menu);
        s2 = getResources().getStringArray(R.array.price);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}