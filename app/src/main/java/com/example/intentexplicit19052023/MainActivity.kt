package com.example.intentexplicit19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var tvScore: TextView? = null
    private var imgRandom: ImageView? = null
    private var imgUserSelect: ImageView? = null

    private var listArrayImageNames: List<String> = mutableListOf<String>()
    private var listImageDrawables = mutableListOf<Int>()
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
        var nameImageFirst = listArrayImageNames[2]
        var drawableImageFirst = resources.getIdentifier(nameImageFirst, "drawable", packageName)

        imgRandom?.setImageResource(drawableImageFirst)


        // Step 1: Tao 1 list chua 18 drawable
        //      1.1: Tao 1 list chua ten hinh trong String resource
        //      1.2: Chuyen doi tu list ten hinh sang list drawable
        // Step 2: Thuc hien random cho kich thuoc cua list
        // Step 3: Gia tri ngau nhien nhan duoc chinh la index cua mang
    }
}