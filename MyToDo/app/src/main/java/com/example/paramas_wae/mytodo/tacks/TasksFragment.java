package com.example.paramas_wae.mytodo.tacks;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paramas_wae.mytodo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TasksFragment extends Fragment {

    private TextView noTasksMainView;
    private TextView noTasksAddView;
    private TextView filteringLabelView;
    private ImageView noTasksIcon;

    public static TasksFragment newInstance() {
        return new TasksFragment();
    }

    public TasksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tasks_fragment, container, false);
    }

    private static class TasksAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
}


