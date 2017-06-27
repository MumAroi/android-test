package com.example.paramas_wae.appforservice;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.InflateException;

public class MyService extends IntentService {
    public static final String MESSAGE = "message";
    public MyService() {
        super("MyjService");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        synchronized (this){
            try{
                wait(10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            String text = intent.getStringExtra(MESSAGE);
            showText(text);
        }
    }
    private void showText(final String text){
        Log.v("MyService",text);
    }
}
