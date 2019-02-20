package com.example.recylerviewapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ArrayList<String> myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.Addbtn).setOnClickListener(this);
        findViewById(R.id.Viewbtn).setOnClickListener(this);
         myList = (ArrayList<String>) getIntent().getSerializableExtra("Listdata");

    }

    @Override
    public void onClick(View v) {
    int id=v.getId();
        switch (id){
            case R.id.Addbtn: Intent i=new Intent(MainActivity.this,AddActivity.class);
                                startActivity(i);
                                break;
            case R.id.Viewbtn: Intent i1=new Intent(MainActivity.this,ViewActivity.class);
                                i1.putExtra("finallist",myList);
                                startActivity(i1);
                                break;

        }
    }
}
