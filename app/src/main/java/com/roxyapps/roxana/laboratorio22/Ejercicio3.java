package com.roxyapps.roxana.laboratorio22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Ejercicio3 extends AppCompatActivity {

    private LinearLayout panel1;
    private LinearLayout panel2;
    private LinearLayout panel3;

    private int[] ColoresP1 = new int[]{R.color.color1P1, R.color.color2P1, R.color.color3P1, R.color.color4P1, R.color.color5P1, R.color.color6P1, R.color.color7P1};
    private int[] ColoresP2 = new int[]{R.color.color1P2, R.color.color2P2, R.color.color3P2, R.color.color4P2, R.color.color5P2, R.color.color6P2, R.color.color7P2};
    private int[] ColoresP3 = new int[]{R.color.color1P3, R.color.color2P3, R.color.color3P3, R.color.color4P3, R.color.color5P3, R.color.color6P3, R.color.color7P3};

    private View.OnClickListener clicklistener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.ll_panel1: panel1.setBackgroundColor(getResources().getColor(ColoresP1[(int) (Math.random()*ColoresP1.length)]));
                break;
                case R.id.ll_panel2: panel2.setBackgroundColor(getResources().getColor(ColoresP2[(int) (Math.random()*ColoresP2.length)]));
                break;
                case R.id.ll_panel3: panel3.setBackgroundColor(getResources().getColor(ColoresP3[(int) (Math.random()*ColoresP3.length)]));
                break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        panel1 = findViewById(R.id.ll_panel1);
        panel1.setOnClickListener(clicklistener);

        panel2 = findViewById(R.id.ll_panel2);
        panel2.setOnClickListener(clicklistener);

        panel3 = findViewById(R.id.ll_panel3);
        panel3.setOnClickListener(clicklistener);
    }
}
