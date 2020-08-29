package com.sawbeen.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView animeCard, funnyCard, cosplayCard, quoteCard;
    public  View view;
    CardView cardOne, cardTwo, cardThree, cardFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollinglayout);

        animeCard = (CardView)findViewById(R.id.anime_card);
        funnyCard = (CardView)findViewById(R.id.funny_card);
        cosplayCard = (CardView)findViewById(R.id.cosplay_card);
        quoteCard = (CardView)findViewById(R.id.quote_card);

        animeCard.setOnClickListener(this);
        funnyCard.setOnClickListener(this);
        cosplayCard.setOnClickListener(this);
        quoteCard.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

        Intent i ;

        switch (view.getId()){
            case R.id.anime_card:
                i = new Intent(getApplicationContext(), GalleryActivity.class);
                startActivity(i);
                break;
            case R.id.funny_card:
                i = new Intent(getApplicationContext(), GalleryActivity.class);
                startActivity(i);
                break;
            case R.id.cosplay_card:
                i = new Intent(getApplicationContext(), GalleryActivity.class);
                startActivity(i);
                break;
            case R.id.quote_card:
                i = new Intent(getApplicationContext(), GalleryActivity.class);
                startActivity(i);
                break;

            default: break;
        }
    }
}