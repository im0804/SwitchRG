package com.example.switchrg;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    RadioButton rb1,rb2,rb3,rb4;
    Switch sw;
    LinearLayout LT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        sw = findViewById(R.id.sw);
        LT = findViewById(R.id.LT);
    }

    public void clicking(View view) {
        if (sw.isChecked()){
            if(rb1.isChecked()){
                LT.setBackgroundColor(Color.RED);
            }
            else{
                if(rb2.isChecked()){
                    LT.setBackgroundColor(Color.BLUE);
                }
                else{
                    if(rb3.isChecked()){
                        LT.setBackgroundColor(Color.GREEN);
                    }
                    else{
                        if(rb4.isChecked()){
                            LT.setBackgroundColor(Color.GRAY);
                        }
                    }
                }
            }
        }
    }
}