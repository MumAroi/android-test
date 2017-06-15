package com.example.paramas_wae.mydatabaseapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by paramas_wae on 6/13/2017.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "tasks.db";
    public static final String TABLE_TASKS = "tesks";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TASKNAME = "taskname";

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_TASKS + " ( " + COLUMN_ID + " INTEGER PRIMARY AUTOINCREMENT, " + COLUMN_TASKNAME + " TEXT );";
        db.execSQL(query);
    }

    public void addTasks(Tasks tasks) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_TASKNAME, tasks.get_taskname());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_TASKS, null, values);
        db.close();
    }

    public void removeTasks(int _id) {
        String query = "DELETE FROM " + TABLE_TASKS + " WHERE " + COLUMN_ID + " = " + _id + ";";
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(query);
    }

    public String databaseToString(){
        String dataString="";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM "+TABLE_TASKS+" WHERE 1";
        Cursor c = db.rawQuery(query,null);
        while(!c.isAfterLast()){
            if(c.getString(c.getColumnIndex(COLUMN_TASKNAME))!= null){
                dataString += c.getString(c.getColumnIndex(COLUMN_TASKNAME));
                dataString += "\n";
            }
            c.moveToNext();
        }
        db.close();
        return dataString;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
