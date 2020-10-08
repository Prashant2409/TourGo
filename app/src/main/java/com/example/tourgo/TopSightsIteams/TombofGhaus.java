package com.example.tourgo.TopSightsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class TombofGhaus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);
        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.ghus_mohmmad);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("The tomb of a 16th century prince-turned-sufi is now situated in the town of Hazira. " +
                "This mausoleum exhibits astonishing Mughal architecture and has proven to be a famous pilgrimage for hindus and muslims alike");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText(" Gwalior, Madhya Pradesh 474001");
    }
}
