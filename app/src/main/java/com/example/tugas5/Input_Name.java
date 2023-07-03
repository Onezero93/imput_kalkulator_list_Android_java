package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Input_Name extends AppCompatActivity {
EditText input_name;
TextView tampil_name;
Button tampilkan_name;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_name);
        input_name = findViewById(R.id.edt_nama);
        tampil_name = findViewById(R.id.tv_tampilnama);
        tampilkan_name = findViewById(R.id.btn_tampil);
        tampilkan_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampil_name.setText(input_name.getText());
            }
        });
    }
}