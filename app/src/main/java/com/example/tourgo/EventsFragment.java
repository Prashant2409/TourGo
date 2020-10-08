package com.example.tourgo;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.tourgo.EventsIteams.GwaliorCarnival;
import com.example.tourgo.EventsIteams.GwaliorTrade;
import com.example.tourgo.EventsIteams.TansenFestival;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);
        // To add array of places.
        ArrayList<Place> places=new ArrayList<Place>();

        //Add places in ArrayList.
        places.add(new Place("Gwalior annual trade fair","4.5"));
        places.add(new Place("Tansen music festival","3.5"));
        places.add(new Place("Gwalior carnival","3.2"));

        PlaceAdapter adapter=new PlaceAdapter(getActivity(),places,R.color.category_event);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        //Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getActivity(), GwaliorTrade.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(getActivity(), TansenFestival.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(getActivity(), GwaliorCarnival.class);
                        startActivity(i2);
                        break;



                }
            }
        });
        return rootView;
    }
}
