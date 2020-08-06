package com.example.apptutorialdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) throws InterruptedException {

        ImageView image = findViewById(R.id.mickey);

        ImageView image2 = findViewById(R.id.imageView2);

        image.animate().alpha(0.0f).setDuration(2000);

        image2.animate().alpha(1.0f).setDuration(2000);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
