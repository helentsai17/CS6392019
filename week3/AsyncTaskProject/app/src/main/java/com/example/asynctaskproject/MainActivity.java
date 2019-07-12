package com.example.asynctaskproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageView im1;
    Bitmap bit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hsinchu");
        im1 = (ImageView) findViewById(R.id.hsinchu);
        new AyImage().execute();

    }

    public class AyImage extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            try {
                bit = BitmapFactory.decodeStream((InputStream) new URL("https://tourism.hccg.org.tw/english/images/about_01_pic06.jpg").getContent());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        im1.setImageBitmap(bit);
        }
    }
}
