package com.example.tourgo.ThingstodoIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class IndianCoffeeHouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.indian_coffee_house);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("Though Gwalior has no dearth of excellent cafes and restaurants serving toothsome delicacies and rich coffee, Indian Coffee House holds a special spot for coffee lovers in the city. Located outside the railway station of Gwalior, Indian Coffee House, owing to its simple ambiance and excellent food quality," +
                " enjoys a great reputation among the residents of Gwalior.");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Indian Coffee House, Near Gwalior Railway Station, Gwalior, Madhya Pradesh 474001");
    }
}
