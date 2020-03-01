package com.example.readingforfun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class RandomNumbers extends AppCompatActivity {
    ImageView ivRandomNumbers;
    Random ran;
    int ranLet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_numbers);

        ivRandomNumbers = findViewById(R.id.ivRandomNumbers);
        ivRandomNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomNubers();
            }
        });
    }

    public void randomNubers() {
        ran = new Random();
        ranLet = ran.nextInt(12);

        if (ranLet == 1) {
            ivRandomNumbers.setImageResource(R.drawable.zero);

        } else if (ranLet == 2) {
            ivRandomNumbers.setImageResource(R.drawable.one);

        } else if (ranLet == 3) {
            ivRandomNumbers.setImageResource(R.drawable.two);

        } else if (ranLet == 4) {
            ivRandomNumbers.setImageResource(R.drawable.three);

        } else if (ranLet == 5) {
            ivRandomNumbers.setImageResource(R.drawable.four);

        } else if (ranLet == 6) {
            ivRandomNumbers.setImageResource(R.drawable.five);
        } else if (ranLet == 7) {
            ivRandomNumbers.setImageResource(R.drawable.six);
        } else if (ranLet == 8) {
            ivRandomNumbers.setImageResource(R.drawable.seven);
        } else if (ranLet == 9) {
            ivRandomNumbers.setImageResource(R.drawable.eight);
        } else if (ranLet == 10) {
            ivRandomNumbers.setImageResource(R.drawable.nine);
        } else if (ranLet == 11) {
            ivRandomNumbers.setImageResource(R.drawable.ten);
        }
    }
}
