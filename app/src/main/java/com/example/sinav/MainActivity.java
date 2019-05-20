package com.example.sinav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ac(View btn){
        switch (btn.getId()){
            case R.id.btnpuan:{
                Intent puan=
                        new Intent(
                                getApplicationContext(),
                                PuanHesaplama.class);
                startActivity(puan);
                break;}
            case R.id.btnVki:{
                Intent vki=
                        new Intent(
                                getApplicationContext(),
                                VKI.class);
                startActivity(vki);
                break;}
        }
    }
}
