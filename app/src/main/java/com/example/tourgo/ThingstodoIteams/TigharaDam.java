package com.example.tourgo.ThingstodoIteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourgo.R;

public class TigharaDam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteam_description);

        //Find a ImageView that will show  image to the user
        ImageView image=(ImageView) findViewById(R.id.image);
        //Set the image in imageView
        image.setImageResource(R.drawable.tighra_dam);
        //Find the textView that will show about the place to the user
        TextView About=(TextView)findViewById(R.id.about);
        About.setText("If you are under a wrong impression that Gwalior has nothing to offer other than the places of historical and religious significance, " +
                "boating experience at Tighra Dam is all you need to change your conception of Gwalior.");

        //Find the textView that wil show the location of place
        TextView Location=(TextView)findViewById(R.id.location);
        Location.setText("Sank River, 23 km from Gwalior, Madhya Pradesh 474001");
    }
}
