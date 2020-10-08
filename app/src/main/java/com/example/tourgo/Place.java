package com.example.tourgo;

/**
 * {@link Place} represent a Place that the user wants to known.
 * It contains a Place Name and ratings for that Place.
 */
public class Place {
     // Place name for the Place.
    private String  mPlaceName;
    // rating of  Place .
    private String mRating;

    //Constructor for which takes  value of placeName and rating and  set there value
    //in mPlaceName and mRating.
public Place(String placeName,String rating){
    mPlaceName=placeName;
    mRating=rating;
}

    //Constructor for which takes only value of placeName for thingstodo activity and set there value
    //in mPlaceName .
    public Place(String placeName){
        mPlaceName=placeName;

    }

 //Get place Name of Place.
 public String getPlaceName(){
    return mPlaceName;
 }
    //Get place rating of Place.
    public String getRating(){
    return mRating;
    }
}
