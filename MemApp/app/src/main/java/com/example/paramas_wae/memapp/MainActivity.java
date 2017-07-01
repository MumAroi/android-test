package com.example.paramas_wae.memapp;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    TextView topText;
    TextView botText;
    EditText editTop;
    EditText editBot;
    ImageView imageView;

    private static final int RESULT_LOAD_IMAGE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topText = (TextView) findViewById(R.id.nameTopText);
        botText = (TextView) findViewById(R.id.nameBotText);
        editTop = (EditText) findViewById(R.id.editTop);
        editBot = (EditText) findViewById(R.id.editBot);
        imageView = (ImageView) findViewById(R.id.memeImage);

    }

    public void add_image(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//      ใช้  startActivityForResult แทน startActivity เพราะ Activity  ปลายทางมีการส่งค่ากลับมาด้วย ค่าที่ส่งกลับมาจะถูกส่งมาใน function onActivityResult
//      RESULT_LOAD_IMAGE หรือ requestCode เป็นตัวเลขที่ใช้ในการระบุว่า app ใดเป็นผู้เรียกใช้
        startActivityForResult(intent, RESULT_LOAD_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();

            ImageView imageView = (ImageView) findViewById(R.id.memeImage);
            imageView.setImageBitmap(BitmapFactory.decodeFile(picturePath));
        }

    }

    public void try_meme(View view) {
        topText.setText(editTop.getText().toString());
        botText.setText(editBot.getText().toString());
        hideKeyboard(view);
    }

    public void hideKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }

    public static Bitmap getScreenshot(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }

    public void store(Bitmap bm, String fileName) {
        String dirPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).toString();
        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdir();
        }

        File file = new File(dir, fileName);
        try {
            FileOutputStream fos = null;
            fos = new FileOutputStream(file);
            bm.compress(Bitmap.CompressFormat.PNG, 100, fos);
            fos.flush();
            fos.close();
            Toast.makeText(this, "Save", Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void save_image(View view){
        View content = findViewById(R.id.lay);
        Bitmap bitmap = getScreenshot(content);
        String  fileName = "meme"+System.currentTimeMillis()+".png";
        store(bitmap,fileName);
    }
}
