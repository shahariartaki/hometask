package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    EditText name,age, nationality;
    Button Add,Show;
    HashMap<Integer, ArrayList<String>> AllData;
    ArrayList<String> singleData;
    int i=0;
    Spinner nation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        nationality=findViewById(R.id.nationality);
        Add=findViewById(R.id.add);
        Show=findViewById(R.id.Show);
        nation=findViewById(R.id.spriner);

        AllData = new HashMap<Integer, ArrayList<String>>();



        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singleData =new ArrayList<>();
                singleData.add(name.getText().toString());
                singleData.add(age.getText().toString());
                singleData.add(nationality.getText().toString());
                AllData.put(i,singleData);
                Log.e("AllData",AllData.toString());
                i++;

                Toast.makeText(getApplicationContext(),"Successfully Saved Your Data",Toast.LENGTH_SHORT).show();

            }
        });

        Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Data.class);
                intent.putExtra("AllData",AllData);
                startActivity(intent);

            }
        });



    }


}
