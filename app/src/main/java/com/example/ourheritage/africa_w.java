package com.example.ourheritage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class africa_w extends AppCompatActivity {

    private Button mButtonA;
    private Button mButtonAB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa_w);

        mButtonA = findViewById(R.id.btn_a);
        mButtonAB = findViewById(R.id.btn_ab);

        mButtonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(africa_w.this, ImageViewer.class);
                startActivity(intent);

            }
        });

        mButtonAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(africa_w.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}