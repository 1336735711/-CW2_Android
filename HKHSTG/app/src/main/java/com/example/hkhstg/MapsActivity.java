package com.example.hkhstg;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    //private final static String TAG = "MapsActivity";
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng f_sss = new LatLng(22.501487962452135, 114.12799291314909);
        LatLng s1_hksah = new LatLng(22.509554014683452, 114.10786739750866);
        LatLng s2_syr = new LatLng(22.511119,114.111783);
        LatLng s3_lv = new LatLng(22.509635979676624, 114.11307630895878);
        LatLng s4_lwm = new LatLng(22.5157906495862, 114.11613589170472);
        LatLng s5_dbcb = new LatLng(22.511663175793018, 114.1105069767066);
        mMap.addMarker(new MarkerOptions().position(f_sss).title("First:Sheung Shui Station"));
        mMap.addMarker(new MarkerOptions().position(s1_hksah).title("Stand1:Hau Ku Shek Ancestral Hall"));
        mMap.addMarker(new MarkerOptions().position(s2_syr).title("Stand2:Sheung Yue River"));
        mMap.addMarker(new MarkerOptions().position(s3_lv).title("Stand3:Long Valley"));
        mMap.addMarker(new MarkerOptions().position(s4_lwm).title("Stand4:Large water mains (sewage treatment plants)"));
        mMap.addMarker(new MarkerOptions().position(s5_dbcb).title("Stand5:豆美味豆花團(Delicious bean curd balls)"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(f_sss));
    }
}