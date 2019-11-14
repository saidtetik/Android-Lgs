package com.example.lgspuanhesaplama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.util.ArrayList;

public class Calculation extends AppCompatActivity implements View.OnClickListener {

    Button calculate;
    Button clear;
    ArrayList<EditText> editTexts = new ArrayList<EditText>();
    ConstraintLayout rootLayout;
    Lesson gradeInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);
        rootLayout = (ConstraintLayout) findViewById(R.id.rootlayout);



        gradeInfo = new Lesson();
        // Edittextleri bulup arraya attık.
        for (int i=0; i<rootLayout.getChildCount(); i++){
            if(rootLayout.getChildAt(i) instanceof EditText){
                editTexts.add((EditText) rootLayout.getChildAt(i));
            }
        }


        // Butonların id siyle getirdik.
        calculate = (Button) findViewById(R.id.calculate);
        clear = (Button) findViewById(R.id.clear);

        // Butonları dinlemeye açtık.
        calculate.setOnClickListener(this);
        clear.setOnClickListener(this);
 }




    @Override
    public void onClick(View v) {
        if(v.getId()==clear.getId())
           for (int i=0; i<editTexts.size(); i++)
               editTexts.get(i).setText("");
        else{

            for (int j=0; j<editTexts.size(); j++){

                if(editTexts.get(j).getText().toString().equals(""))
                    continue;

                if(editTexts.get(j).getId()==R.id.a1)
                    gradeInfo.turkced = Integer.parseInt(editTexts.get(j).getText().toString());
                if(editTexts.get(j).getId()==R.id.a2)
                    gradeInfo.turkcey = Integer.parseInt(editTexts.get(j).getText().toString());
                if(editTexts.get(j).getId()==R.id.a3)
                    gradeInfo.matd = Integer.parseInt(editTexts.get(j).getText().toString());
                if(editTexts.get(j).getId()==R.id.a4)
                    gradeInfo.maty = Integer.parseInt(editTexts.get(j).getText().toString());
                if(editTexts.get(j).getId()==R.id.a5)
                    gradeInfo.fend = Integer.parseInt(editTexts.get(j).getText().toString());
                if(editTexts.get(j).getId()==R.id.a6)
                    gradeInfo.feny = Integer.parseInt(editTexts.get(j).getText().toString());
                if(editTexts.get(j).getId()==R.id.a7)
                    gradeInfo.inkd = Integer.parseInt(editTexts.get(j).getText().toString());
                if(editTexts.get(j).getId()==R.id.a8)
                    gradeInfo.inky = Integer.parseInt(editTexts.get(j).getText().toString());
                if(editTexts.get(j).getId()==R.id.a9)
                    gradeInfo.ingd = Integer.parseInt(editTexts.get(j).getText().toString());
                if(editTexts.get(j).getId()==R.id.a10)
                    gradeInfo.ingy = Integer.parseInt(editTexts.get(j).getText().toString());
                if(editTexts.get(j).getId()==R.id.a11)
                    gradeInfo.dind = Integer.parseInt(editTexts.get(j).getText().toString());
                if(editTexts.get(j).getId()==R.id.a12)
                    gradeInfo.diny = Integer.parseInt(editTexts.get(j).getText().toString());
            }
            // Tekrar deneyiniz konulucak.
            if(gradeInfo.control() == false){
                for (int i=0; i<editTexts.size(); i++)
                    editTexts.get(i).setText("");
                gradeInfo.sifirla();
            }
            else {
                gradeInfo.control();
                gradeInfo.hesapla();
                Intent i = new Intent(this, result.class);
                i.putExtra("turkcenet",gradeInfo.turnet);
                i.putExtra("matnet",gradeInfo.matnet);
                i.putExtra("fennet",gradeInfo.fennet);
                i.putExtra("inknet",gradeInfo.inknet);
                i.putExtra("ingnet",gradeInfo.ingnet);
                i.putExtra("dinnet",gradeInfo.dinnet);
                i.putExtra("puan",gradeInfo.puan);
                gradeInfo.sifirla();
                startActivity(i);
            }


        }



    }
}
