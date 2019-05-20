package com.example.sinav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VKI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vki);
        final EditText boy=(EditText) findViewById(R.id.txtboy);
        final EditText kilo=(EditText) findViewById(R.id.txtKilo);
        Button hesapla=(Button) findViewById(R.id.btnhesapla);
        final TextView Vki=(TextView) findViewById(R.id.txtVKI);
        final TextView durum=(TextView) findViewById(R.id.txtDurum);
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double uzunluk=Double.parseDouble(boy.getText().toString());
                Double agirlik=Double.parseDouble(kilo.getText().toString());
                Double d=agirlik/(uzunluk*uzunluk);
                Vki.setText(d.toString());
                if (d<25){
                durum.setText("normal");
                }
                else if (d>=25 && d<30){
                    durum.setText("Kilolu");
                }
                else if (d>=30 && d<40){
                    durum.setText("fazla kilolusun");
                }
                else if (d>=40){
                    durum.setText("Tehlikedesin");
                }
            }
        });
    }
}
