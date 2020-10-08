package com.example.tourgo.EventsIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class GwaliorTrade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.trade_fair);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("One of the largest fairs of Madhya Pradesh, this trade fair was started in 1905 by Maharaj Madhav Rao Scindia, the king of Gwalior. A unique blend of art and business the Gwalior Trade Fair has behind it a history of 110 years. Spread over an area of 104 acres, the fair is held at the Mela Ground at the Race Course Road. " +
                "The items sold range from clothes, electric appliances, pottery to cattle.The Mela is usually held midway through December and lasts for a month, spilling over into the new year, giving attendees the perfect avenue to do all that holiday shopping.");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("10 km outside of Gwalior city centre, Gwalior, Madhya Pradesh 474001");
    }
}
