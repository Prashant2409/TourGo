package com.example.tourgo.RestaurantsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class Param extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.param);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("CUISINES\n" +
                "Indian, Fast food, Asian\n" +
                "SPECIAL DIETS\n" +
                "Vegetarian Friendly, Vegan Options\n" +
                "MEALS\n" +
                "Lunch, Dinner, Brunch, Breakfast\n" +
                "FEATURES\n" +
                "Takeout, Reservations, Seating, Table Service, Delivery");
        //Find the textView that wil show the location of place

        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Moti Mahal Padav, Gwalior, Madhya Pradesh 474001");
    }
}
