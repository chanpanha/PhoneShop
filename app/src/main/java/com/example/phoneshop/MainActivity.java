package com.example.phoneshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        //Set the Layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter();
        String [] brandPhones = {"A","B","C","D","E","F"};
        recyclerViewAdapter.setBrandPhones(brandPhones);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
