package com.example.tourgo.TopSightsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class GwaliorZoo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);
        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.gwalior_zoo);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("Families and Wildlife enthusiasts can visit the Gwalior zoo which has a good collection of animals including a white tiger." +
                " The zoo is a part of a huge garden known as Phool Bagh which was built by Madhao Rao Scindia and inaugurated by Prince of Wales in 1922.");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText(" Gwalior, Madhya Pradesh 474001");
    }
}
