package com.example.paramas_wae.myfoodapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    @Override
    protected void onListItemClick(ListView listView, View itenView, int position, long id) {
        super.onListItemClick(listView, itenView, position, id);
        Intent intent = new Intent(foodCategoryActivity.this, FoodActivity.class);
        intent.putExtra(FoodActivity.EXTRA_FOODNO,(int) id);
        startActivity(intent);
    }
}
