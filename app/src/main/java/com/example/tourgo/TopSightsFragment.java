package com.example.tourgo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.tourgo.TopSightsIteams.GwaliorFort;
import com.example.tourgo.TopSightsIteams.GwaliorZoo;
import com.example.tourgo.TopSightsIteams.JaiVialls;
import com.example.tourgo.TopSightsIteams.ScindiaMuesum;
import com.example.tourgo.TopSightsIteams.SunTemple;
import com.example.tourgo.TopSightsIteams.TelikaMandir;
import com.example.tourgo.TopSightsIteams.TombofGhaus;
import com.example.tourgo.TopSightsIteams.TombofTansen;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopSightsFragment extends Fragment {

    public TopSightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);



        // To add array of places.
        ArrayList<Place> places=new ArrayList<Place>();

        //Add places in ArrayList.
        places.add(new Place("Gwalior Fort","4.5"));
        places.add(new Place("Jai Villas Palace","4.2"));
        places.add(new Place("Sun Temple","3.7"));
        places.add(new Place("Tomb of Tansen","3.5"));
        places.add(new Place("Teli ka Mandir","3.5"));
        places.add(new Place("Scindia Museum","3.5"));
        places.add(new Place("Tomb of Ghaus Mohammed","3.5"));
        places.add(new Place("Gwalior Zoo","3.2"));

        PlaceAdapter adapter=new PlaceAdapter(getActivity(),places,R.color.category_topsight);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        //Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getActivity(), GwaliorFort.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(getActivity(), JaiVialls.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(getActivity(), SunTemple.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(getActivity(), TombofTansen.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(getActivity(), TelikaMandir.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(getActivity(), ScindiaMuesum.class);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(getActivity(), TombofGhaus.class);
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(getActivity(), GwaliorZoo.class);
                        startActivity(i7);
                        break;


                }
            }
        });
        return rootView;
    }
}
