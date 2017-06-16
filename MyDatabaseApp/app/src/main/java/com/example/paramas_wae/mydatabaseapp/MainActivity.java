package com.example.paramas_wae.mydatabaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextTask;
    TextView textViewAddTask;
    MyDatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTask = (EditText) findViewById(R.id.editTextTask);
        textViewAddTask = (TextView) findViewById(R.id.textViewAddTask);
        databaseHelper  = new MyDatabaseHelper(this,null,null,1);
        printDB();
    }

    public void addButtOnClicked(View view) {
        Tasks tasks = new Tasks(editTextTask.getText().toString());
        databaseHelper.addTasks(tasks);
        printDB();
    }

    public void removeButtonOnClick(View view){
        String input = editTextTask.getText().toString();
        databaseHelper.removeTasks(input);
        printDB();
    }

    public void printDB(){
        String dbString = databaseHelper.databaseToString();
        textViewAddTask.setText(dbString);
    }
}
