package com.example.tourgo;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.tourgo.RestaurantsIteams.Indish;
import com.example.tourgo.RestaurantsIteams.Kawality;
import com.example.tourgo.RestaurantsIteams.MotiMahal;
import com.example.tourgo.RestaurantsIteams.Panchavati;
import com.example.tourgo.RestaurantsIteams.Param;
import com.example.tourgo.RestaurantsIteams.Rajbhog;
import com.example.tourgo.RestaurantsIteams.SilverSaloon;
import com.example.tourgo.RestaurantsIteams.TheMansingh;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        // To add array of places.
        ArrayList<Place> places=new ArrayList<Place>();

        //Add places in ArrayList.
        places.add(new Place("Kwality Restaurant","4.6"));
        places.add(new Place("Panchavati Gaurav Gwalior","4.5"));
        places.add(new Place("Param Food Complex","4.5"));
        places.add(new Place(" Indish","4.2"));
        places.add(new Place(" Silver Saloon","3.8"));
        places.add(new Place(" Moti Mahal Delux","3.5"));
        places.add(new Place("The Mansingh","3.5"));
        places.add(new Place(" Rajbhog Restaurant","3.2"));
        PlaceAdapter adapter=new PlaceAdapter(getActivity(),places,R.color.category_restaurant);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        //Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getActivity(), Kawality.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(getActivity(), Panchavati.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(getActivity(), Param.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(getActivity(), Indish.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(getActivity(), SilverSaloon.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(getActivity(), MotiMahal.class);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(getActivity(), TheMansingh.class);
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(getActivity(), Rajbhog.class);
                        startActivity(i7);
                        break;


                }
            }
        });
        return rootView;
    }
}
