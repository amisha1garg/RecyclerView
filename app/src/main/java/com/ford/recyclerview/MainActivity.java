package com.ford.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.lifecycle.ViewModelProviders;


import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LifecycleOwner {

    RecyclerView recyclerView;
    MainViewModel viewModel;
    MainActivity context;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        context = this;


        myAdapter = new MyAdapter();
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        viewModel = ViewModelProviders.of(context).get(MainViewModel.class);
        viewModel.getUserMutableLiveData().observe(context, userListUpdateObserver);
    }

    Observer<ArrayList<Menu>> userListUpdateObserver = new Observer<ArrayList<Menu>>() {
        @Override
        public void onChanged(ArrayList<Menu> menuArrayList) {
            myAdapter.updateMenu(menuArrayList);
        }
    };


}
