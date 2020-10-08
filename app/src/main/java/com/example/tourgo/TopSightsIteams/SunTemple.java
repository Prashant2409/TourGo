package com.example.tourgo.TopSightsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class SunTemple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);
        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.sun_temple);
        //Find the textView that will show about the place to the user

        TextView About=(TextView)findViewById(R.id.about);
        About.setText("Surya Mandir or Sun Temple located near Residency at Morar is one of the important religious centers in the historic city of Gwalior. " +
                "Although not constructed long ago, it is among the most revered shrines in the ancient city.");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText(" Gwalior, Madhya Pradesh 474001");
    }
}
