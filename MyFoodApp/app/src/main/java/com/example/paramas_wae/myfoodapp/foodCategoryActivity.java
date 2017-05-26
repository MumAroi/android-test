package com.example.paramas_wae.myfoodapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class foodCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ListView listfoods = getListView();

        ArrayAdapter<Food> lisAdapter = new ArrayAdapter<Food>(this,android.R.layout.simple_expandable_list_item_1,Food.foods);
        listfoods.setAdapter(lisAdapter);
    }
}
