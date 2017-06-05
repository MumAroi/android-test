package com.example.paramas_wae.myfragmenttest;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bntAddFragment;
    Button bntRemoeFragment;
    private Button button;
    private static final String TAG_FRAGMENT = "tag_fragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.layout_fragment_container, MyFragment.newInstance(), TAG_FRAGMENT)
                    .commit();
        }

        bntAddFragment = (Button) findViewById(R.id.btn_add_fragment);
        bntRemoeFragment = (Button) findViewById(R.id.btn_remove_fragment);

        bntAddFragment.setOnClickListener(onAddFragmentClickListener);
        bntRemoeFragment.setOnClickListener(onRemoveFragmentClickListener);

    }

    private View.OnClickListener onAddFragmentClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Fragment fragment = getSupportFragmentManager().findFragmentByTag(TAG_FRAGMENT);
            if (fragment == null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.layout_fragment_container, MyFragment.newInstance(), TAG_FRAGMENT)
                        .commit();
            }
        }
    };

    private View.OnClickListener onRemoveFragmentClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Fragment fragment = getSupportFragmentManager().findFragmentByTag(TAG_FRAGMENT);
            if (fragment != null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .remove(fragment)
                        .commit();
            }
        }
    };
}
