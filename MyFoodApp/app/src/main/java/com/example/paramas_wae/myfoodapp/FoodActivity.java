package com.example.paramas_wae.myfoodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODNO = "foodno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodno = (Integer) getIntent().getExtras().get(EXTRA_FOODNO);

        Food food = Food.foods[foodno];

        TextView name = (TextView) findViewById(R.id.name);
        TextView des  = (TextView) findViewById(R.id.des);
        ImageView foodimge = (ImageView) findViewById(R.id.foodimge);

        name.setText(food.getName());
        des.setText(food.getDescription());
        foodimge.setImageResource(food.getImageID());
    }
}
