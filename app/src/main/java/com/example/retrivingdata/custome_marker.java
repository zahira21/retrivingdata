package com.example.retrivingdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class custome_marker implements GoogleMap.InfoWindowAdapter {
   private View nview;
   private Context ncontext;

    public custome_marker(Context ncontext) {
        this.ncontext = ncontext;
        nview= LayoutInflater.from(ncontext).inflate(R.layout.coustume, null);

    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
