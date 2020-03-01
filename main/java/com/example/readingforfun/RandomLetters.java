package com.example.readingforfun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class RandomLetters extends AppCompatActivity {

    ImageView ivRandom;
    Random ran;
    int ranLet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_letters);
        ivRandom = findViewById(R.id.ivRandom);

        ivRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomLetters();

            }
        });
    }

    public void randomLetters() {
        ran = new Random();
        ranLet = ran.nextInt(23);

        if (ranLet == 1) {
            ivRandom.setImageResource(R.drawable.alef);

        } else if (ranLet == 2) {
            ivRandom.setImageResource(R.drawable.bet);

        } else if (ranLet == 3) {
            ivRandom.setImageResource(R.drawable.gimel);

        } else if (ranLet == 4) {
            ivRandom.setImageResource(R.drawable.daled);

        } else if (ranLet == 5) {
            ivRandom.setImageResource(R.drawable.hei);

        } else if (ranLet == 6) {
            ivRandom.setImageResource(R.drawable.vav);
        } else if (ranLet == 7) {
            ivRandom.setImageResource(R.drawable.zain);
        } else if (ranLet == 8) {
            ivRandom.setImageResource(R.drawable.chet);
        } else if (ranLet == 9) {
            ivRandom.setImageResource(R.drawable.tet);
        } else if (ranLet == 10) {
            ivRandom.setImageResource(R.drawable.yod);
        }else if (ranLet == 11) {
            ivRandom.setImageResource(R.drawable.kaf);
        }else if (ranLet == 12) {
            ivRandom.setImageResource(R.drawable.lamed);
        }else if (ranLet == 13) {
            ivRandom.setImageResource(R.drawable.mem);
        }else if (ranLet == 14) {
            ivRandom.setImageResource(R.drawable.nun);
        }else if (ranLet == 15) {
            ivRandom.setImageResource(R.drawable.samech);
        }else if (ranLet == 16) {
            ivRandom.setImageResource(R.drawable.ain);
        }else if (ranLet == 17) {
            ivRandom.setImageResource(R.drawable.peh);
        }else if (ranLet == 18) {
            ivRandom.setImageResource(R.drawable.tzadi);
        }else if (ranLet == 19) {
            ivRandom.setImageResource(R.drawable.kuf);
        }else if (ranLet == 20) {
            ivRandom.setImageResource(R.drawable.resh);
        }else if (ranLet == 21) {
            ivRandom.setImageResource(R.drawable.shin);
        }else if (ranLet == 22) {
            ivRandom.setImageResource(R.drawable.tav);
        }
    }
}
