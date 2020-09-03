package com.example.mapcheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SevenWonders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven_wonders)

        var wonderOne : Button = findViewById(R.id.tajmahal)
        var wonderTwo : Button = findViewById(R.id.colosseum)
        var wonderThree : Button = findViewById(R.id.Chichen)
        var wonderFour : Button = findViewById(R.id.machu)
        var wonderFive : Button = findViewById(R.id.redeemer)
        var wonderSix : Button = findViewById(R.id.petra)
        var wonderSeven : Button = findViewById(R.id.greatwall)

        wonderOne.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapsActivity::class.java)
            val india : String = "Tajmahal"
            intent.putExtra("key1", india)
            startActivity(intent)
        }
        wonderTwo.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapsActivity::class.java)
            val italy : String = "colosseum"
            intent.putExtra("key2", italy)
            startActivity(intent)
        }

        wonderFour.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapsActivity::class.java)
            val peru : String = "machu"
            intent.putExtra("key4", peru)
            startActivity(intent)
        }

          wonderThree.setOnClickListener {
              val intent : Intent = Intent(applicationContext,MapsActivity::class.java)
              val mexico : String = "chichuItaz"
              intent.putExtra("key3", mexico)
              startActivity(intent)
          }
        wonderFive.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapsActivity::class.java)
            val brazil : String = "redeemer"
            intent.putExtra("key5", brazil)
            startActivity(intent)
        }
        wonderSix.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapsActivity::class.java)
            val jordan : String = "petra"
            intent.putExtra("key6", jordan)
            startActivity(intent)
        }
        wonderSeven.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapsActivity::class.java)
            val china : String = "greatwall"
            intent.putExtra("key7", china)
            startActivity(intent)
        }
    }
}