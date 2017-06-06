package com.example.paramas_wae.myviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    MyPagerAdapter adapter;
    Button bnt_next;
    Button bnt_prev;
    Button bnt_request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MyPagerAdapter(getSupportFragmentManager());
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        bnt_next = (Button) findViewById(R.id.bnt_next);
        bnt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                pager.getCurrentItem() ใช้ get หน้า View Pager ปัจจุบัน
//                pager.setCurrentItem() ใช้ set หน้า View Page ปัจจุบัน
                pager.setCurrentItem(pager.getCurrentItem() + 1);
            }
        });

        bnt_prev = (Button) findViewById(R.id.bnt_prev);
        bnt_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(pager.getCurrentItem() - 1);
            }
        });

        bnt_request = (Button) findViewById(R.id.bnt_request);
        bnt_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = getActiveFragment(pager, 0);
                OneFragment oneFragment = (OneFragment) fragment;
                if(oneFragment != null){
                    String message = oneFragment.getMyText();
                    Log.i("Check : ", message);
                }

            }
        });
    }

    public Fragment getActiveFragment(ViewPager container, int position) {
        String name = "android:switcher:" + container.getId() + ":" + position;
        return getSupportFragmentManager().findFragmentByTag(name);

    }
}
