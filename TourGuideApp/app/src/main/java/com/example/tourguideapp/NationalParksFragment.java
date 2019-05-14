package com.example.tourguideapp;


import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NationalParksFragment extends Fragment {


    public NationalParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);
        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.garden1), R.drawable.international_garden, getString(R.string.paragraph1)));
        places.add(new Place(getString(R.string.garden2), R.drawable.aquarium_garden, getString(R.string.paragraph2)));
        places.add(new Place(getString(R.string.garden3), R.drawable.gizera_island, getString(R.string.paragraph3)));
        places.add(new Place(getString(R.string.garden4), R.drawable.japanese_garden, getString(R.string.paragraph4)));
        places.add(new Place(getString(R.string.garden5), R.drawable.orman_garden, getString(R.string.paragraph5)));
        places.add(new Place(getString(R.string.garden6), R.drawable.family_park, getString(R.string.paragraph6)));
        places.add(new Place(getString(R.string.garden7), R.drawable.azhar_park, getString(R.string.paragraph7)));
        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.primary_dark_color);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                // Get the {@link Place} object at the given position the user clicked on
                Place place = places.get(position);
                // Creates an Intent that will load a map of park which user wants
                Uri gmmIntentUri = Uri.parse("google.navigation:q=" + place.getName() + ",+cairo+egypt");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);


            }

        });
        return rootView;


    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
