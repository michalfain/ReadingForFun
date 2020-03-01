package com.example.readingforfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Numbers extends AppCompatActivity {

    Button btnAllNumbers, btnTestMunbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        btnAllNumbers = findViewById(R.id.btnAllNumbers);
        btnTestMunbers = findViewById(R.id.btnTestNumbers);

        btnAllNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Numbers.this, ShowNumbers.class);
                startActivity(intent);
            }
        });

        btnTestMunbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Numbers.this, RandomNumbers.class);
                startActivity(intent);
            }
        });
    }
}
