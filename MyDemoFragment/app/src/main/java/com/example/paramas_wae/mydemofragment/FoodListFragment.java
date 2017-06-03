package com.example.paramas_wae.mydemofragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodListFragment extends ListFragment {

    static interface FoodListListener {
        void itemClicked(long id);
    }

    private  FoodListListener listener;

    @Override
    public void onAttach(Context  context ) {
        super.onAttach(context);
        Activity activity;
        if(context instanceof Activity) {
            activity = (Activity) context;
            this.listener = (FoodListListener) activity;
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if(listener != null){
            listener.itemClicked(id);
        }
        super.onListItemClick(l, v, position, id);
    }

    public FoodListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String name [] = new String[Menu.menus.length];
        for (int i = 0 ; i < name.length; i++){
            name[i] = Menu.menus[i].getName();
        }
        ArrayAdapter adapter = new ArrayAdapter(inflater.getContext(),android.R.layout.simple_expandable_list_item_1,name);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

}
