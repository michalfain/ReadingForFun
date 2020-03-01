package com.example.readingforfun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShowLetters extends AppCompatActivity {

    ImageView ivLearn;
    int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_letters);

        ivLearn = findViewById(R.id.ivLearn);

        ivLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if (counter == 1) {
                    ivLearn.setImageResource(R.drawable.alef);

                } else if (counter == 2) {
                    ivLearn.setImageResource(R.drawable.bet);

                } else if (counter == 3) {
                    ivLearn.setImageResource(R.drawable.gimel);

                } else if (counter == 4) {
                    ivLearn.setImageResource(R.drawable.daled);

                } else if (counter == 5) {
                    ivLearn.setImageResource(R.drawable.hei);

                } else if (counter == 6) {
                    ivLearn.setImageResource(R.drawable.vav);
                } else if (counter == 7) {
                    ivLearn.setImageResource(R.drawable.zain);
                } else if (counter == 8) {
                    ivLearn.setImageResource(R.drawable.chet);
                } else if (counter == 9) {
                    ivLearn.setImageResource(R.drawable.tet);
                } else if (counter == 10) {
                    ivLearn.setImageResource(R.drawable.yod);
                }else if (counter == 11) {
                    ivLearn.setImageResource(R.drawable.kaf);
                }else if (counter == 12) {
                    ivLearn.setImageResource(R.drawable.lamed);
                }else if (counter == 13) {
                    ivLearn.setImageResource(R.drawable.mem);
                }else if (counter == 14) {
                    ivLearn.setImageResource(R.drawable.nun);
                }else if (counter == 15) {
                    ivLearn.setImageResource(R.drawable.samech);
                }else if (counter == 16) {
                    ivLearn.setImageResource(R.drawable.ain);
                }else if (counter == 17) {
                    ivLearn.setImageResource(R.drawable.peh);
                }else if (counter == 18) {
                    ivLearn.setImageResource(R.drawable.tzadi);
                }else if (counter == 19) {
                    ivLearn.setImageResource(R.drawable.kuf);
                }else if (counter == 20) {
                    ivLearn.setImageResource(R.drawable.resh);
                }else if (counter == 21) {
                    ivLearn.setImageResource(R.drawable.shin);
                }else if (counter == 22) {
                    ivLearn.setImageResource(R.drawable.tav);
                } else if(counter == 23){
                    counter = 1;
                }

            }
        });
    }
}
