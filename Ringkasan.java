package com.example.c1_prak2_13020190149;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ringkasan extends AppCompatActivity {
    private Button btnTutup;
    private TextView tvStb,tvNama,tvAng,tvMinat,tvJur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ringkasan);

        btnTutup = findViewById(R.id.button2);
        tvStb = findViewById(R.id.tvStb);
        tvNama = findViewById(R.id.tvNama);
        tvAng = findViewById(R.id.tvAng);
        tvMinat = findViewById(R.id.tvMinat);
        tvJur = findViewById(R.id.tvJur);

        tvStb.setText(getIntent().getStringExtra(MainActivity.KEY_STB));
        tvNama.setText(getIntent().getStringExtra(MainActivity.KEY_NAMA));
        tvAng.setText(getIntent().getStringExtra(MainActivity.KEY_ANGKATAN));
        tvMinat.setText(getIntent().getStringExtra(MainActivity.KEY_MINAT));
        tvJur.setText(getIntent().getStringExtra(MainActivity.KEY_JURUSAN));


    }

    public void btnTutup(View view){
        finish();
    }
}
