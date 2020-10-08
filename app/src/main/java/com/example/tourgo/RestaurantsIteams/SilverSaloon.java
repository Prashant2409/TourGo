package com.example.tourgo.RestaurantsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class SilverSaloon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.silver_saloon);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("CUISINES\n" +
                "Indian, Asian\n" +
                "SPECIAL DIETS\n" +
                "Vegetarian Friendly, Vegan Options, Gluten Free Options\n" +
                "MEALS\n" +
                "Breakfast, Lunch, Dinner\n" +
                "FEATURES\n" +
                "Reservations, Seating, Parking Available, Validated Parking, Wheelchair Accessible, Table Service, Live Music");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Usha Kiran Palace, Lashkar, Gwalior, Madhya Pradesh 474001");

    }
}
