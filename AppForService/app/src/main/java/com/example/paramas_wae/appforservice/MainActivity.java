package com.example.paramas_wae.appforservice;

import android.content.Intent;
import android.net.MailTo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view){
        Intent intent  = new Intent(MainActivity.this,MyService.class);
        intent.putExtra(MyService.MESSAGE,"Button Clicked this is a service");
        startService(intent);
    }
}
