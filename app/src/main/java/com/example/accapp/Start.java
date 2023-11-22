package com.example.accapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

public class Start extends AppCompatActivity {
    private AppCompatButton btnSimulan;  // Change the type to AppCompatButton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.start_activity);

        btnSimulan = findViewById(R.id.btnSimulan);

        btnSimulan.setOnClickListener((v)->{
            Intent intent = new Intent(Start.this, Guidelines.class);
            startActivity(intent);
        });

        }
}
