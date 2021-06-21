package com.example.exampleimageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public int k=0;

    public void click(View view){

        ImageView image = (ImageView) findViewById(R.id.imageViewSmile);
        if (k%2==0){
        image.setImageResource(R.drawable.sedface);
        }
        else {
            image.setImageResource(R.drawable.smilingface);
        }
        k++;

        Log.i("info","log success");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}