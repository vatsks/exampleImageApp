package com.example.exampleimageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void click(View view){

        ImageView image = (ImageView) findViewById(R.id.imageViewSmile);
        image.setImageResource(R.drawable.sedface);

        Log.i("info","log success");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}