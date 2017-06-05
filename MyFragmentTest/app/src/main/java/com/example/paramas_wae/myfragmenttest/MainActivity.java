package com.example.paramas_wae.myfragmenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyFragment myFragment = MyFragment.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.layout.activity_main, myFragment).commit();
    }
}
