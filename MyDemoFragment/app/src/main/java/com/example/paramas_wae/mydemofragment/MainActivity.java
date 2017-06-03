package com.example.paramas_wae.mydemofragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.paramas_wae.mydemofragment.R.layout.activity_main;

public class MainActivity extends AppCompatActivity implements FoodListFragment.FoodListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

//        MenuDetailFragment frag = (MenuDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
//        frag.setMenuID(1);
    }

    @Override
    public void itemClicked(long id) {
        MenuDetailFragment detail = new MenuDetailFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        detail.setMenuID(id);
        ft.replace(R.id.fragment_container,detail);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
}
