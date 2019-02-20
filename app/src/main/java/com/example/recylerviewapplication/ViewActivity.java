package com.example.recylerviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity {
RecyclerView mrecyclerView;
ArrayList<String> myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        mrecyclerView=findViewById(R.id.recycler);
        myList = (ArrayList<String>) getIntent().getSerializableExtra("finallist");
        RecyclerAdapter adapter=new RecyclerAdapter(myList);
        mrecyclerView.setAdapter(adapter);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
