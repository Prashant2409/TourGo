package com.example.tourgo.TopSightsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class GwaliorFort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);
        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.gwalior_fort);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("Perched high at the top of a vast rocky massif, " +
                "Gwalior Fort is a place hard to miss being visible from every nook and corner of the city. " +
                "Regarded as one of most impregnable fortress of north and central India, the place is a must visit.");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Gwalior Fort, Gwalior, Madhya Pradesh 474001");


    }
}
