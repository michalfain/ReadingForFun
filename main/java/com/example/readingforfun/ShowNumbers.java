package com.example.readingforfun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShowNumbers extends AppCompatActivity {
    ImageView ivLearnNumbers;
    int counter = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_numbers);

        ivLearnNumbers = findViewById(R.id.ivLearnNumbers);

        ivLearnNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if (counter == 1) {
                    ivLearnNumbers.setImageResource(R.drawable.zero);

                } else if (counter == 2) {
                    ivLearnNumbers.setImageResource(R.drawable.one);

                } else if (counter == 3) {
                    ivLearnNumbers.setImageResource(R.drawable.two);

                } else if (counter == 4) {
                    ivLearnNumbers.setImageResource(R.drawable.three);

                } else if (counter == 5) {
                    ivLearnNumbers.setImageResource(R.drawable.four);

                } else if (counter == 6) {
                    ivLearnNumbers.setImageResource(R.drawable.five);
                } else if (counter == 7) {
                    ivLearnNumbers.setImageResource(R.drawable.six);
                } else if (counter == 8) {
                    ivLearnNumbers.setImageResource(R.drawable.seven);
                } else if (counter == 9) {
                    ivLearnNumbers.setImageResource(R.drawable.eight);
                } else if (counter == 10) {
                    ivLearnNumbers.setImageResource(R.drawable.nine);
                }else if (counter == 11) {
                    ivLearnNumbers.setImageResource(R.drawable.ten);
                } else if(counter == 12){
                    counter = 1;
                }

            }
        });
    }
}
