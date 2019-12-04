package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.Location;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements LocationListener {
    Button but, loca;
    EditText inp, em;
    DatabaseReference db;
    member mem;
    private Location loc;
    private LocationListener loclis;
    private LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = (Button) findViewById(R.id.button);
        loca = findViewById(R.id.lobut);
        inp = findViewById(R.id.info);
        em = findViewById(R.id.emailinfo);
        db = FirebaseDatabase.getInstance().getReference().child("member");





        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=inp.getText().toString();
                String email=em.getText().toString();
                locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    Activity#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for Activity#requestPermissions for more details.
                        return;
                    }
                }
                loc = locationManager.getLastKnownLocation(locationManager.GPS_PROVIDER);
                Double lat= loc.getLatitude();
                Double longitude=loc.getLongitude();
                mem = new member(lat,longitude);

                mem.setInfomation(name);
                mem.setEmailid(email);
                db.push().setValue(mem);
                Toast.makeText(MainActivity.this, "done",Toast.LENGTH_LONG ).show();
            }
        });


    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
