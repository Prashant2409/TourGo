package com.example.tourgo.TopSightsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class JaiVialls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);
        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.jai_villas);

        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("The Jai Vilas Palace also known as the Jai Vilas Mahal, is a nineteenth-century palace placed in Gwalior Madhya Pradesh, India. It was established in 1874 by Jayajirao Scindia," +
                " the Maharaja of Gwalior and is still the residence of his descendants, the former royal Maratha Scindia dynasty. ");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText(" Gwalior, Madhya Pradesh 474001");
    }
}
