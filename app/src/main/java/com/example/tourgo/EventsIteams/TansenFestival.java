package com.example.tourgo.EventsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class TansenFestival extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);
        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.tansen_music);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("Set in the humble village of Behat in Gwalior, the Tansen Music Festival or the Tansen Sangeet Sammelan/ Tansen Utsav is an alluring display of the art of music. The Tansen Music Festival, is a unique four-five day festival, dedicated to the pillar of Indian music, the great Tansen," +
                " and it is held at his tomb in Gwalior every year. ");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Near the ancient Mughal-styled carved tomb , Gwalior, Madhya Pradesh 474001");
    }
}
