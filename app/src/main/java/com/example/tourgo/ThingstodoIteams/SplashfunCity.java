package com.example.tourgo.ThingstodoIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class SplashfunCity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);
        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.splash_suncity);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("Gwalior is replete with fun places which will not let boredom enter your life for a moment. Apart from varied historical and religious places, " +
                "Gwalior also has a number of places of amusement within its ambit that provide the much-needed relief to the residents of this city from the daily grind of urban life.");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Race Course Road, Gwalior, Madhya Pradesh 474001");
    }
}
