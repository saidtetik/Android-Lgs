package com.example.lgspuanhesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent i = getIntent();
        ((TextView)findViewById(R.id.turkcenet)).setText(String.format("%.2f",i.getDoubleExtra("turkcenet",0.00)));
        ((TextView)findViewById(R.id.matnet)).setText(String.format("%.2f",i.getDoubleExtra("matnet",0.00)));
        ((TextView)findViewById(R.id.fennet)).setText(String.format("%.2f",i.getDoubleExtra("fennet",0.00)));
        ((TextView)findViewById(R.id.inknet)).setText(String.format("%.2f",i.getDoubleExtra("inknet",0.00)));
        ((TextView)findViewById(R.id.ingnet)).setText(String.format("%.2f",i.getDoubleExtra("ingnet",0.00)));
        ((TextView)findViewById(R.id.dinnet)).setText(String.format("%.2f",i.getDoubleExtra("dinnet",0.00)));
        ((TextView)findViewById(R.id.puan)).setText(String.format("%.2f",i.getDoubleExtra("puan",0.00)));
    }
}
