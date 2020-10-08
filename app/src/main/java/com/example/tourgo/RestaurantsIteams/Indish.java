package com.example.tourgo.RestaurantsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class Indish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.indish);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("Indulge in international cuisine at our all-day restaurant, Indish. Sit down to a hot breakfast to begin your day. After meetings and sightseeing, you can recharge with a globally inspired lunch or dinner. " +
                "Indish also offers room service so you can enjoy a meal in the privacy of your room or suite." +
                "PRICE RANGE\n" +
                "₹ 800 - ₹ 2,000\n" +
                "CUISINES\n" +
                "Italian, Chinese, Indian, Thai, Mexican, Cafe\n" +
                "SPECIAL DIETS\n" +
                "Vegetarian Friendly\n" +
                "MEALS\n" +
                "Dinner, Breakfast, Lunch, Drinks\n" +
                "FEATURES\n" +
                "Reservations, Seating, Highchairs Available, Table Service");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Radisson Gwalior Plot No 13-14, Behind SADA Office, City Centre, Gwalior, Madhya Pradesh 474001");
    }
}
