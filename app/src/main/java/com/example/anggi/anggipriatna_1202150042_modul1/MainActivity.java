package com.example.anggi.anggipriatna_1202150042_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button abnormal, eatbus;
    EditText makanan, jumlah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abnormal = (Button)findViewById(R.id.btn_abnormal);
        eatbus = (Button)findViewById(R.id.btn_eatbus);
        makanan = (EditText)findViewById(R.id.nama_menu);
        jumlah = (EditText)findViewById(R.id.jumlah_menu);


        abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hitungan = new Intent(MainActivity.this,SecondActivity.class);
                String tempat = abnormal.getText().toString();
                hitungan.putExtra("makanan", makanan.getText().toString());
                hitungan.putExtra("tempat", tempat);
                hitungan.putExtra("porsi", jumlah.getText().toString());
                startActivity(hitungan);

            }
        });


        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hitungan = new Intent(MainActivity.this,SecondActivity.class);
                String tempat = eatbus.getText().toString();
                hitungan.putExtra("makanan", makanan.getText().toString());
                hitungan.putExtra("tempat", tempat);
                hitungan.putExtra("porsi", jumlah.getText().toString());
                startActivity(hitungan);
            }
        });
    }}
