package com.example.sinav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PuanHesaplama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puan_hesaplama);
        final EditText puan=(EditText) findViewById(R.id.editText);
        final EditText yanlisSayisi=(EditText) findViewById(R.id.editText2);
        Button hesapla=(Button) findViewById(R.id.button3);
        final TextView sonuc=(TextView) findViewById(R.id.textView);
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer deger1=
                        Integer.parseInt(puan.getText().toString());
                Integer yanlis=
                        Integer.parseInt(yanlisSayisi.getText().toString());
                Integer net=deger1-(yanlis/3);
                sonuc.setText(net.toString());
            }
        });
    }
}
