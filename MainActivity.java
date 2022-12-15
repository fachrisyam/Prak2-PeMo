package com.example.c1_prak2_13020190149;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnHasil;
    private EditText txtNama,txtStb;
    private CheckBox chk1,chk2,chk3,chk4,chk5,chk6;
    private RadioGroup RGjurusan;
    private Spinner angkatan;

    static final String KEY_STB = "STB";
    static final String KEY_NAMA = "NAMA";
    static final String KEY_JURUSAN = "JURUSAN";
    static final String KEY_ANGKATAN = "ANGKATAN";
    static final String KEY_MINAT = "MINAT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHasil = findViewById(R.id.button);

        txtNama = findViewById(R.id.txtNama);
        txtStb = findViewById(R.id.txtStb);

        chk1 = findViewById(R.id.checkBox);
        chk2 = findViewById(R.id.checkBox2);
        chk3 = findViewById(R.id.checkBox3);
        chk4 = findViewById(R.id.checkBox4);
        chk5 = findViewById(R.id.checkBox5);
        chk6 = findViewById(R.id.checkBox6);

        RGjurusan = findViewById(R.id.radioGroup);

        angkatan = findViewById(R.id.spinner);

        String kontenSpinner[] = {"-Pilih Angkatan-","2019","2020"};
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item,kontenSpinner
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        angkatan.setAdapter(adapter);

    }

    public void btnClick(View view){
        String jurusan="";
        switch (RGjurusan.getCheckedRadioButtonId()){
            case R.id.rbSi:
                jurusan = "Sistem Informasi";
                break;
            case R.id.rbTI:
                jurusan = "Teknik Informatika";
                break;
        }

        String minat="";

        if(chk1.isChecked()) minat = minat + "- BEM\n";
        if(chk2.isChecked()) minat = minat + "- Penulisan Karya Ilmiah\n";
        if(chk3.isChecked()) minat = minat + "- Kewirausahaan\n";
        if(chk4.isChecked()) minat = minat + "- Ksesnian\n";
        if(chk5.isChecked()) minat = minat + "- Jurnalistik\n";
        if(chk6.isChecked()) minat = minat + "- Olahraga\n";



        Intent intent = new Intent(this,Ringkasan.class);
        intent.putExtra(KEY_STB,txtStb.getText().toString());
        intent.putExtra(KEY_NAMA,txtNama.getText().toString());
        intent.putExtra(KEY_JURUSAN,jurusan);
        intent.putExtra(KEY_ANGKATAN,angkatan.getSelectedItem().toString());
        intent.putExtra(KEY_MINAT,minat);
        startActivity(intent);


    }
}
