package com.example.tourgo.TopSightsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class TombofTansen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user

        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.tomb_of_tansen);
        //Find the textView that will show about the place to the user

        TextView About=(TextView)findViewById(R.id.about);
        About.setText("One of the greatest musicians of India and en eminent vocalist in the courts of Akbar in the medieval period, Tansen was also among one of the nine gems of the Mughal court.\n" +
                "\n" +
                "Tansen was believed to create magic with his music and cause rains and even enchant animals by his music. He was a student of Mohammad Ghaus who taught him Hindustani classical music." +
                " He was a proponent of Dhrupad style and he developed the Gwalior Gharana style of music. ");
        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText(" Gwalior, Madhya Pradesh 474001");
    }
}
