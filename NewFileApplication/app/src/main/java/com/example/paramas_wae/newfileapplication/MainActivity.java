package com.example.paramas_wae.newfileapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        //-- step 1 --//
        /*
        myRef = database.getReference("message");
        myRef.addValueEventListener(new ValueEventListener() {
                                        @Override
                                        public void onDataChange(DataSnapshot dataSnapshot) {
        //                              ataSnapshot.getValue(String.class) --> อ่านข้อมูลบน firebaseDatabase
                                            String value = dataSnapshot.getValue(String.class);
                                            TextView textView = (TextView) findViewById(R.id.textView);
                                            textView.setText(value);
                                        }

                                        @Override
                                        public void onCancelled(DatabaseError databaseError) {
                                        }
                                    }
        );
        //myRef.setValue("Hello World");
        */
        //-- end step 1 --//
    }

    public void buttonClicked(View view) {
        //-- step 1 --//
            /*
            EditText editText = (EditText) findViewById(R.id.editText);
            String message = editText.getText().toString();
            myRef.setValue(message);
            */
        //-- end step 1 --//
        //-- step 2 --//
            /*EditText editText = (EditText) findViewById(R.id.editText);
            myRef = database.getReference("User");
            myRef.child("Name").push().setValue(editText.getText().toString());
            */
        //-- end step 2 --//
        //-- step 3 --//
            /*EditText editName = (EditText) findViewById(R.id.name);
            EditText editContact = (EditText) findViewById(R.id.contact);

            String child = editName.getText().toString();
            //  .child(child) -> สร้าง key child ใหม่ขึ้นมา
            //  .getReference("User") -> เป็นการ get key data ที่มีอยู่แล้ว
            myRef = database.getReference("User").child(child);

            myRef.child("Name").setValue(editName.getText().toString());
            myRef.child("Contact").setValue(editContact.getText().toString());
            */
        //-- end step 3 --//
    }
}
