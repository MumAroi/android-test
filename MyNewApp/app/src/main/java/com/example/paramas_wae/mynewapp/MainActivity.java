package com.example.paramas_wae.mynewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttononClick(View v){
        EditText editTextHeight = (EditText) findViewById(R.id.userHeight);
        EditText editTextWeight = (EditText) findViewById(R.id.userWeight);
        TextView textViewResult = (TextView) findViewById(R.id.userBMI);

        double height = Double.parseDouble(editTextHeight.getText().toString());
        double weight = Double.parseDouble(editTextWeight.getText().toString());

        double BMI = weight / (height * height);

        textViewResult.setText(Double.toString(BMI));
    }
}
