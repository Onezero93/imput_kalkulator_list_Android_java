package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
    EditText bilangan1, bilangan2;
    Button tambah, kurang, kali, bagi, delet;
    TextView hasil_bilangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        bilangan1 = findViewById(R.id.bil1);
        bilangan2 = findViewById(R.id.bil2);
        tambah = findViewById(R.id.btntambah);
        kurang = findViewById(R.id.btnkurang);
        kali = findViewById(R.id.btnkali);
        bagi = findViewById(R.id.btnbagi);
        delet = findViewById(R.id.btnhapus);
        hasil_bilangan = findViewById(R.id.tvhasil);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(bilangan1.getText().toString().trim());
                int angka2 = Integer.parseInt(bilangan2.getText().toString().trim());
                int hasil = angka1 + angka2;
                String hasil_angka = String.valueOf(hasil);
                hasil_bilangan.setText(hasil_angka);
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(bilangan1.getText().toString().trim());
                int angka2 = Integer.parseInt(bilangan2.getText().toString().trim());
                int hasil = angka1 - angka2;
                String hasil_angka = String.valueOf(hasil);
                hasil_bilangan.setText(hasil_angka);
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(bilangan1.getText().toString().trim());
                int angka2 = Integer.parseInt(bilangan2.getText().toString().trim());
                int hasil = angka1 * angka2;
                String hasil_angka = String.valueOf(hasil);
                hasil_bilangan.setText(hasil_angka);
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double angka1 = Integer.parseInt(bilangan1.getText().toString().trim());
                double angka2 = Integer.parseInt(bilangan2.getText().toString().trim());
                double hasil = angka1 / angka2;
                String hasil_angka = String.valueOf(hasil);
                hasil_bilangan.setText(hasil_angka);
            }
        });
        delet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hapusText();
            }

            private void hapusText() {
                bilangan1.setText("");
                bilangan2.setText("");
                hasil_bilangan.setText("");
            }
        });
    }
}