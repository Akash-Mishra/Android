package com.example.akashmishra.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toast and log in action
        Toast.makeText(this, "Can you see me?", Toast.LENGTH_SHORT).show();
        Log.i("info", "onCreate: done creating the app");
    }
}
