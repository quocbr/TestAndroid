package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextHeight, editTextWeight;
    Button buttonOk;
    TextView textViewKq, textViewBMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitWidgets();
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(editTextWeight.getText().toString());
                double height = Double.parseDouble(editTextHeight.getText().toString());
                double BMI = weight/(height*height);
                //DecimalFormat df = new DecimalFormat("#.#");
                //double BMI1 = Double.parseDouble(df.format(weight/(height*height)));
                textViewBMI.setText(String.valueOf(BMI)); // Double.toString(BMI)
                String kq;
                if (BMI < 15){
                    kq = "Suy dinh duong";
                }
                else if (BMI < 16){
                    kq = "Rat gay";
                }
                else if (BMI < 18.5){
                    kq = "Gay";
                }
                else if (BMI < 25){
                    kq = "Binh thuong";
                }
                else if (BMI < 30){
                    kq = "Thua can";
                }
                else if (BMI < 35){
                    kq = "Beo phi do 1";
                }
                else if (BMI < 40){
                    kq = "Beo phi do 2";
                }
                else kq = "Beo phi do 3";
                textViewKq.setText(kq);
            }
        });
    }

    private void InitWidgets() {
        // anh xa
        editTextHeight = (EditText) findViewById(R.id.editTextTextHight);
        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        buttonOk = (Button) findViewById(R.id.buttonOk);
        textViewBMI = (TextView) findViewById(R.id.textViewBMI);
        textViewKq = (TextView) findViewById(R.id.textViewKq);
    }
}