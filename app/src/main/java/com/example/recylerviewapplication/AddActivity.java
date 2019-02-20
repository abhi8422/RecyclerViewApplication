package com.example.recylerviewapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddActivity extends AppCompatActivity {
EditText edtname,edtadd;
String name,address;
List<String> stringList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        edtname=findViewById(R.id.name);
        edtadd=findViewById(R.id.address);
    }

    public void onClick(View view) {
        name=edtname.getText().toString().trim();
        address=edtadd.getText().toString().trim();
        stringList= new ArrayList<>();
        stringList.add(name);
        stringList.add(address);
        Intent i=new Intent(this,MainActivity.class);
        i.putExtra("Listdata", (Serializable) stringList);
        startActivity(i);
        Toast.makeText(this,"data added",Toast.LENGTH_SHORT).show();
    }
}
