package com.example.mapcheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Maps"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        var intentObjct : Intent? = intent

        if (intentObjct != null) {
            if(  intentObjct.getStringExtra("key1")==("Tajmahal")) {
                val tajmal = LatLng(27.175015, 78.042155)
                mMap.addMarker(MarkerOptions().position(tajmal).title("It's Tajmahal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)))
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tajmal, 16F))

            }
            else  if(intentObjct.getStringExtra("key2")==("colosseum")){
                val colosseum = LatLng(41.890251, 12.492373)
                mMap.addMarker(MarkerOptions().position(colosseum).title("It's Colosseum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)))
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(colosseum,16F))

            }  else if(intentObjct.getStringExtra("key2")==("ChichenItaz")){
                val mexico = LatLng(20.66667,-88.56667)
                mMap.addMarker(MarkerOptions().position(mexico).title("It's ChichenItaz").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)))
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mexico,16F))
            }
            else  if(intentObjct.getStringExtra("key4")==("machu")){
                val machuPichu = LatLng(-13.163068, -72.545128)
                mMap.addMarker(MarkerOptions().position(machuPichu).title("It's Machu Pichu").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)))
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(machuPichu,16F))


            } else  if(intentObjct.getStringExtra("key5")==("redeemer")){
                val christRedeemer = LatLng(29.943031, -95.629941)
                mMap.addMarker(MarkerOptions().position(christRedeemer).title("It's Christ the Redeemer").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)))
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(christRedeemer,16F))
            }
            else  if(intentObjct.getStringExtra("key6")==("petra")){
                val Petra = LatLng(30.328960, 35.444832)
                mMap.addMarker(MarkerOptions().position(Petra).title("It's Petra").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)))
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Petra,16F))

            } else  if(intentObjct.getStringExtra("key7")==("greatwall")){
                val Greatwall = LatLng(40.4319077, 116.5681862)
                mMap.addMarker(MarkerOptions().position(Greatwall).title("It's Great wall of China").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)))
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Greatwall,16F))

            }
            }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.normal -> mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL)

            R.id.satellite -> mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE)

            R.id.terrain -> mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN)

            R.id.hybrid -> mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID)

        }
        return super.onOptionsItemSelected(item)
    }
}