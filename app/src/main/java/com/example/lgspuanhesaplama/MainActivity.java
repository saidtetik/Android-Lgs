package com.example.lgspuanhesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView changeover;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeover = (TextView) findViewById(R.id.textView3);
        changeover.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, Calculation.class);
        startActivity(i);

    }
}
