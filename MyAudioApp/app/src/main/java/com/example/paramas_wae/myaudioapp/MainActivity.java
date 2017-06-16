package com.example.paramas_wae.myaudioapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.turkish_dance);
        mp.start(); // paly media
    }
}
