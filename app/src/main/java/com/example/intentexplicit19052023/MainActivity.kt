package com.example.intentexplicit19052023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var tvScore: TextView? = null
    private var imgRandom: ImageView? = null
    private var imgUserSelect: ImageView? = null

    private var listArrayImageNames: List<String> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Random image

        // Input: 18 drawable
        // Output : 1 drawable shuffle

        tvScore = findViewById(R.id.text_view_score)
        imgRandom = findViewById(R.id.image_view_random)
        imgUserSelect = findViewById(R.id.image_view_user_select)

        listArrayImageNames = resources.getStringArray(R.array.string_array_images_animal).toList()
        makeImageRandom()
        imgUserSelect?.setOnClickListener {
            val intent = Intent(this@MainActivity, ListAnimalsActivity::class.java)
            intent.putExtra("listImage", listArrayImageNames.toTypedArray())
            startActivity(intent)
        }
    }

    private fun makeImageRandom() {
        // Step 1: Tao 1 list chua 18 drawable
        //      1.1: Tao 1 list chua ten hinh trong String resource
        //      1.2: Chuyen doi tu list ten hinh sang list drawable
        // Step 2: Thuc hien random cho kich thuoc cua list
        // Step 3: Gia tri ngau nhien nhan duoc chinh la index cua mang
        val indexRandom = Random.nextInt(listArrayImageNames.size)
        val imageNameRandom = listArrayImageNames[indexRandom]
        val drawableImageFirst = resources.getIdentifier(imageNameRandom, "drawable", packageName)
        imgRandom?.setImageResource(drawableImageFirst)
    }
}