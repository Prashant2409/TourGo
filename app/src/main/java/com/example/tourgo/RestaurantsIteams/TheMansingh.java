package com.example.tourgo.RestaurantsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class TheMansingh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.maan_singh);

        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("CUISINES\n" +
                "Indian, Asian\n" +
                "SPECIAL DIETS\n" +
                "Vegetarian Friendly, Halal\n" +
                "MEALS\n" +
                "Dinner, Lunch\n" +
                "FEATURES\n" +
                "Reservations, Seating, Takeout, Wheelchair Accessible, Table Service");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Deendayal Mall, Gwalior, Madhya Pradesh 474001");
    }
}
