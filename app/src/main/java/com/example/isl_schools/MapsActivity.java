package com.example.isl_schools;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng escolaLuz = new LatLng(-2.5505596, -44.2687359);
        LatLng cmcb = new LatLng(-2.546482, -44.254032);
        LatLng cintra = new LatLng(-2.545072, -44.237487);
        LatLng colun = new LatLng(-2.558138, -44.311083);
        LatLng lrego = new LatLng(-2.598068, -44.248763);
        LatLng crfeliz = new LatLng(-2.504293, -44.308946);
        LatLng amaRapos = new LatLng(-2.692531, -44.307271);
        LatLng ifma = new LatLng(-2.608962, -44.267298);


        mMap.addMarker(new MarkerOptions().position(escolaLuz).title("Escola Luz do Saber  |5,2|"));
        mMap.addMarker(new MarkerOptions().position(cmcb).title("Colegio Militar 2 de Julho  |7,2|"));
        mMap.addMarker(new MarkerOptions().position(cintra).title("Cintra  |5,2|"));
        mMap.addMarker(new MarkerOptions().position(colun).title("Colegio Universitário  |7,9|"));
        mMap.addMarker(new MarkerOptions().position(lrego).title("UEB Luis Rego  |3,9|"));
        mMap.addMarker(new MarkerOptions().position(crfeliz).title("UEB Crinça Feliz  |  |"));
        mMap.addMarker(new MarkerOptions().position(amaRapos).title("UEB Amaral Raposo |4,3|"));
        mMap.addMarker(new MarkerOptions().position(ifma).title("IFMA Maracana |8,3|"));



        mMap.moveCamera(CameraUpdateFactory.newLatLng(escolaLuz));
    }
}
