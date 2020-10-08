package com.example.tourgo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    private int mColorResourceId;
    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0,places );
        mColorResourceId=colorResourceId;
    }
    public View getView(int position,  View convertView,  ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listIteamView=convertView;
      if(listIteamView==null){
          listIteamView= LayoutInflater.from(getContext()).inflate(R.layout.category_lteam_list,parent,false);
      }
// Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);
// Find the TextView in the category_item_list.xml layout with the ID version_name
        TextView placeNameTextView= (TextView) listIteamView.findViewById(R.id.place_name_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        placeNameTextView.setText(currentPlace.getPlaceName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView ratingTextView = (TextView) listIteamView.findViewById(R.id.rating_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        ratingTextView.setText(currentPlace.getRating());

        View textContainer= listIteamView.findViewById(R.id.text_container);

        int color= ContextCompat.getColor(getContext(),mColorResourceId);


        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listIteamView;

    }
}
