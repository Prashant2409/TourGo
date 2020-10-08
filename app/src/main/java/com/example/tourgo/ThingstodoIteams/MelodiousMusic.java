package com.example.tourgo.ThingstodoIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class MelodiousMusic extends AppCompatActivity {

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
        About.setText("Gwalior possesses some great sites that are prominent in the history of this place – Tansen’s Mausoleum is one of them." +
                " Tansen is hailed as one of the most prominent figures of Hindustani classical music and was one of the nine jewels of Akbar’s court.");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Tansen Nagar, Gwalior, Madhya Pradesh 474001");
    }
}
