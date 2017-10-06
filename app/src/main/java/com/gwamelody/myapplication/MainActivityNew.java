package com.gwamelody.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityNew extends AppCompatActivity {
TextView t ;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_new);
        Intent Page = getIntent();
        double BMI = Page.getDoubleExtra("BMI",0);
        String BMItext = Page.getStringExtra("textBMI");

        t = (TextView) findViewById(R.id.ShowmustGoOn);
        t1 = (TextView) findViewById(R.id.Show2);
        t.setText("ค่า BMI ที่ได้คือ "+String.format("%.2f",BMI));
        t1.setText(" อยู่ในเกณฑ์ :"+BMItext);
    }
}
