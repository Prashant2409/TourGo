package com.example.tourgo.ThingstodoIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class SarafaBazars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.iteam_description);
        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.sarafa_bazaar);

        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("Among the places in Gwalior that are loved by locals and tourists alike are Patankar and Sarafa Bazars. These lively markets, clad in a thousand different shades of joy are unmissable spots while you are in Gwalior. Owing to the great range of handicrafts,\" \n" +
                "  \" jewellery and textiles that you can find here, Patankar and Sarafa are a shopaholic’s paradise.");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Daulat Gan, Gwalior, Madhya Pradesh 474001");
    }
}
