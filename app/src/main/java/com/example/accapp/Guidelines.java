package com.example.accapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Guidelines extends AppCompatActivity {

    private ImageView btnBrNext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.guidelines_activity);

        btnBrNext = findViewById(R.id.btnBrNext);

        btnBrNext.setOnClickListener((v)->{
            Intent intent = new Intent(Guidelines.this, Profile.class);
            startActivity(intent);
        });

    }
}
