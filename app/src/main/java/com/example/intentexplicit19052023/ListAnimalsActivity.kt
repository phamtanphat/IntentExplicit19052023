package com.example.intentexplicit19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ListAnimalsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_animals)

        // Lay du lieu tu intent
        val arrayNameAnimals = intent.getStringArrayExtra("listImage")
        Log.d("BBB", arrayNameAnimals?.size.toString())
    }
}