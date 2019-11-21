package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Data extends AppCompatActivity {

HashMap<Integer, ArrayList<String>> AllData;
ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        listView=findViewById(R.id.listview);
        AllData= (HashMap<Integer,ArrayList<String>>)getIntent().getSerializableExtra("AllData");
        //Intent intent =getIntent();
        ArrayList<value> SingleData= new ArrayList<>();
        for (int i=0;i<AllData.size();i++){
            ArrayList<String> temp=AllData.get(i);
            String Name=temp.get(0);
            String Age=temp.get(1);
            String Nationlity=temp.get(2);
            SingleData.add(new value(Name,Age,Nationlity));
        }
        Addapter addapter = new Addapter(Data.this,SingleData);
        listView.setAdapter(addapter);




    }


}
