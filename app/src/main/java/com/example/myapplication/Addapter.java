package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Addapter extends ArrayAdapter {

    public Addapter(@NonNull Context context, ArrayList<value> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView==null)
        {
            convertView=LayoutInflater.from(getContext()).inflate(R.layout.data_style,parent,false);
        }

        value value = (value)getItem(position);
        TextView name = convertView.findViewById(R.id.names);
        TextView age = convertView.findViewById(R.id.ages);
        TextView nationlity = convertView.findViewById(R.id.nationalitys);

        name.setText(value.Name);
        age.setText(value.Age);
        nationlity.setText(value.Nationlity);

        return convertView;
    }


}
class value{
    String Name,Age,Nationlity;
    public value(String name, String age, String nationlity) {
        Name=name;
        Age=age;
        Nationlity=nationlity;
    }
}
