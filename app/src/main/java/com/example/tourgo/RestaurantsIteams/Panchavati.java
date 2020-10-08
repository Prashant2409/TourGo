package com.example.tourgo.RestaurantsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class Panchavati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.panchavati);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("Panchavati Gaurav is a leading chain of Thali restaurants with a unique blend of Traditional Hospitality and Fine Dining!" +
                "\n" +
                "Panchavati Gaurav is a leading chain of Thali restaurants with a unique blend of Traditional Hospitality and Fine Dining!\n" +
                "PRICE RANGE\n" +
                "₹ 210 - ₹ 250\n" +
                "CUISINES\n" +
                "Indian, Asian\n" +
                "SPECIAL DIETS\n" +
                "Vegetarian Friendly, Vegan Options\n" +
                "MEALS\n" +
                "Lunch, Dinner, Brunch\n" +
                "FEATURES\n" +
                "Seating, Delivery, Takeout, Reservations, Buffet, Parking Available, Street Parking, Accepts Mastercard, Accepts Visa, Digital Payments, Cash Only, Table Service, Television");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Madhav Rao Scindia Marg Fortune Plaza, City Center, Patel Nagar, Gwalior, Madhya Pradesh 474001");
    }
}
