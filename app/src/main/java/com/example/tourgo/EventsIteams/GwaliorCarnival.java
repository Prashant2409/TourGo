package com.example.tourgo.EventsIteams;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tourgo.R;

public class GwaliorCarnival extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

       //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.gwalior_carnival);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        //Set the text
        About.setText("The Gwalior carnival is hosted by the MP tourism department to feature the rich local culture. " +
                "It is held in the month of December every year and is a great way to indulge in the traditional cuisine, dance, music, and history.");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);

        Location.setText("Gwalior, Madhya Pradesh 474001");
    }
}
