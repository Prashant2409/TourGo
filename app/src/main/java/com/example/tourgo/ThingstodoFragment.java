package com.example.tourgo;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.tourgo.ThingstodoIteams.Gujarimahal;
import com.example.tourgo.ThingstodoIteams.IndianCoffeeHouse;
import com.example.tourgo.ThingstodoIteams.MelodiousMusic;
import com.example.tourgo.ThingstodoIteams.SarafaBazars;
import com.example.tourgo.ThingstodoIteams.SplashfunCity;
import com.example.tourgo.ThingstodoIteams.TigharaDam;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThingstodoFragment extends Fragment {

    public ThingstodoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // To add array of places.
        ArrayList<Place> places=new ArrayList<Place>();

        //Add places in ArrayList.
        places.add(new Place("Shop at Patnakar and Sarafa Bazaars"));
        places.add(new Place("Explore the History of Gwalior at Gujari Mahal Museum"));
        places.add(new Place("Enjoy Rides at Splash the Fun City"));
        places.add(new Place("Boating in Tighara Dam"));
        places.add(new Place("Enjoy Coffee at Indian Coffee House"));
        places.add(new Place("Enjoy Melodious Music at Tansen's Mausoleum"));

        PlaceAdapter adapter=new PlaceAdapter(getActivity(),places,R.color.category_thingstodo);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        //Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getActivity(), SarafaBazars.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(getActivity(), Gujarimahal.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(getActivity(), SplashfunCity.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(getActivity(), TigharaDam.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(getActivity(), IndianCoffeeHouse.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(getActivity(), MelodiousMusic.class);
                        startActivity(i5);


                }
            }
        });
        return rootView;
    }
}
