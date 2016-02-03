package com.example.aparna.myapplication;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by aparna on 2/2/16.
 */
public class InstagramPhotosAdapter extends ArrayAdapter<InstagramPhoto> {
    //what data do we need from the activity
    public InstagramPhotosAdapter(Context context, List<InstagramPhoto> objects) {
        super(context, android.R.layout.simple_list_item_1, objects);
    }
}
