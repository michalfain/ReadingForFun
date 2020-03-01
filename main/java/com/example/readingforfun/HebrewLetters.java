package com.example.readingforfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class HebrewLetters extends AppCompatActivity {

    Button btnAll, btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hebrew_letters);

        btnAll = findViewById(R.id.btnAll);
        btnTest = findViewById(R.id.btnTest);

        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HebrewLetters.this, ShowLetters.class);
                startActivity(intent);
            }
        });
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HebrewLetters.this, RandomLetters.class);
                startActivity(intent);
            }
        });

    }

}
