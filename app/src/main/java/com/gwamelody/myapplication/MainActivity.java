package com.gwamelody.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText height1;
    EditText weight1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.calcaulate);
        height1 = (EditText) findViewById(R.id.height);
        weight1 = (EditText) findViewById(R.id.weight);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Height = Double.valueOf(height1.getText().toString());
                double Weight = Double.valueOf(weight1.getText().toString());
                double result = Weight /( (Height / 100) * (Height / 100));
                String BMItext="";
                if (result < 18.5) {
                    BMItext = "น้ำหนักน้อยกว่าปกติ";
                }else if(result<25) {
                    BMItext ="น้ำหนักปกติ";

                }else if(result < 30){
                    BMItext = "น้ำหนักมากกว่าปกติ(ท้วม)";
                }else {

                    BMItext = "น้ำหนักมากกว่าปกติมาก(อ้วน)";
                }

                Intent NewPage = new Intent(MainActivity.this,MainActivityNew.class);
                NewPage.putExtra("BMI",result);
                NewPage.putExtra("textBMI",BMItext);
                startActivity(NewPage);


            }
        });

    }
}
