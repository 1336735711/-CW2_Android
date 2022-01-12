package com.example.cw2;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private final static String TAG = "MapsActivity";
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

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
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



//        mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
//        mMap.setMyLocationEnabled(true); // 右上角的定位功能；這行會出現紅色底線，不過仍可正常編譯執行
//        mMap.getUiSettings().setZoomControlsEnabled(true);  // 右下角的放大縮小功能
//        mMap.getUiSettings().setCompassEnabled(true);       // 左上角的指南針，要兩指旋轉才會出現
//        mMap.getUiSettings().setMapToolbarEnabled(true);    // 右下角的導覽及開啟 Google Map功能
//
//        Log.d(TAG, "最高放大層級："+mMap.getMaxZoomLevel());
//        Log.d(TAG, "最低放大層級："+mMap.getMinZoomLevel());
//
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(ss));
//        mMap.animateCamera(CameraUpdateFactory.zoomTo(16));     // 放大地圖到 16 倍大
//    }
}}