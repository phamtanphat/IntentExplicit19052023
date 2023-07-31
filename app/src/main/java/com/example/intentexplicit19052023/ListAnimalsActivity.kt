package com.example.intentexplicit19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ListAnimalsActivity : AppCompatActivity() {

    private var listImageResources = mutableListOf<Int>()
    private var recyclerViewAnimal: RecyclerView? = null
    private var animalsAdapter: AnimalAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_animals)

        recyclerViewAnimal = findViewById(R.id.recycler_view_animals)

        // Lay du lieu tu intent
        listImageResources.clear()
        val listImageNames = intent.getStringArrayExtra("list_name_image_animals")
        listImageNames?.shuffle()
        listImageNames?.forEach {
            val imageResource = resources.getIdentifier(it, "drawable", packageName)
            listImageResources.add(imageResource)
        }

        animalsAdapter = AnimalAdapter(listImageResources)
        recyclerViewAnimal?.adapter = animalsAdapter
    }
}