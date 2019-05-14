package com.example.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {
    private int mcolorResourceId;

    public PlaceAdapter(Context context, ArrayList<Place> objects) {
        super(context, 0, objects);
    }

    public PlaceAdapter(Context context, ArrayList<Place> objects, int colorResourceId) {
        super(context, 0, objects);
        mcolorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
// Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Place currentPlace = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID text_Miwok
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text);
        // Get the version name from the current Word object and
        // set this text on the Miwok TextView
        nameTextView.setText(currentPlace.getName());
        // Find the TextView in the list_item.xml layout with the ID text_Defult
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.paragraph_text);
        // Get the version number from the current Word object and
        // set this text on the defult TextView
        numberTextView.setText(currentPlace.getParagraph());
        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageview = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image from the current Word object and
        // set this image on the image ImageView
        imageview.setImageResource(currentPlace.getImageResourceId());

        //handle listview item


        return listItemView;


    }
}
