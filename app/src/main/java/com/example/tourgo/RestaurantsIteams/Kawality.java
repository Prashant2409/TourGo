package com.example.tourgo.RestaurantsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class Kawality extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.kawality);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("Kwality restraun is the heart of gwalior in serving the best dine in + deliveries . I lived in gwalior for 5 years and they never dissappointed me in terms of food ." +
                " Butter chicken there is damn good . Affordable to all . Family restraun . Every dish there is best in its own taste. ");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Green Garden Road, Behind SP Office, City Center, Gwalior, Madhya Pradesh 474001");
    }
}
