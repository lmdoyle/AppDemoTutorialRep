package com.example.apptutorialdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){


        EditText nameText = findViewById(R.id.nameText);

        Log.i("Username", nameText.getText().toString());

        Toast.makeText(MainActivity.this, "Hi There, "+ nameText.getText().toString(), Toast.LENGTH_LONG).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
