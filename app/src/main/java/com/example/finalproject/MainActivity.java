package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgCharging = (ImageView) findViewById(R.id.img_charging);
        ImageView imgForex = (ImageView) findViewById(R.id.img_forex);
        ImageView imgNews = (ImageView) findViewById(R.id.img_news);
        ImageView imgRecipe = (ImageView) findViewById(R.id.img_recipe);

        imgCharging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCharging();
            }
        });

        imgForex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openForex();

            }
        });
        imgNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNews();
            }
        });
        imgRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecipe();
            }
        });

    }

    private void openRecipe() {
        Intent intent = new Intent(this,recipeActivity.class);
        startActivity(intent);
    }

    private void openNews() {
        Intent intent = new Intent(this,newsActivity.class);
        startActivity(intent);
    }

    private void openForex() {
        Intent intent = new Intent(this,forexActivity.class);
        startActivity(intent);
    }

    private void openCharging() {
        Intent intent = new Intent(this,chargingActivity.class);
        startActivity(intent);
    }
}
