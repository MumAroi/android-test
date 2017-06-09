package com.example.paramas_wae.mytodo.tacks;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.paramas_wae.mytodo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TasksFragment extends Fragment {

    public static TasksFragment newInstance() { return new TasksFragment(); }
    public TasksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tasks, container, false);
    }

}
