package com.example.tourgo.RestaurantsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class MotiMahal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.moti_mahal);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("A franchise of the Original Moti Mahal Deluxe established in 1920 and since then providing all its guests an authentic and extravagant menu of Mughlai cuisine as well as choice of chinese and thai cuisine with 93 years of excellence." +
                "Come join us for a wonderful dinner at Moti Mahal...!!" +
                "PRICE RANGE\n" +
                "₹ 450 - ₹ 1,000\n" +
                "CUISINES\n" +
                "Indian, Chinese\n" +
                "SPECIAL DIETS\n" +
                "Vegetarian Friendly, Vegan Options\n" +
                "MEALS\n" +
                "Lunch, Dinner\n" +
                "FEATURES\n" +
                "Reservations, Seating, Takeout, Table Service");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("New Bus Stand, Link Road Beside Hotel Regency, Gwalior, Madhya Pradesh 474001");
    }
}
