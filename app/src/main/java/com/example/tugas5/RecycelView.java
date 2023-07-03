package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecycelView extends AppCompatActivity {
    ListView list;
    String[] negara;
    ArrayAdapter<String> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycel_view);
        list = findViewById(R.id.recicelview);
        negara = new String[]{"Indonesia", "Malaysia", "Singapura", "India", "China", "Jepang", "Palestina"};
        arr = new ArrayAdapter<String>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,negara);
        list.setAdapter(arr);
    }
}