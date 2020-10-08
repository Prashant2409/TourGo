package com.example.tourgo.ThingstodoIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class Gujarimahal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.gujar_mahal);

        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("Gwalior possesses a number of explored as well as hidden gems for history lovers in the form of places of historical significance like palaces, forts and ancient temples. Gujari Mahal is another historical site in Gwalior treating its visitors with its unmatched beauty. " +
                "The building has exceptionally beautiful exteriors and equally captivating interiors.");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Lohamandi, Gwalior, Madhya Pradesh 474001");
    }
}
