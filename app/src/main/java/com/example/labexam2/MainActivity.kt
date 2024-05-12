package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainimageView1: ImageView = findViewById(R.id.mainimageView1)

        mainimageView1.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            startActivity(intent)
        }

        val mainimageView2: ImageView = findViewById(R.id.mainimageview2)

        mainimageView2.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            startActivity(intent)
        }

        val mainimageView4: ImageView = findViewById(R.id.mainimageView4)

        mainimageView4.setOnClickListener {
            val intent = Intent(this, FavouritemovieActivity::class.java)
            startActivity(intent)
        }

//        val mainimageView5: ImageView = findViewById(R.id.mainimageView5)
//
//        mainimageView5.setOnClickListener {
//            val intent = Intent(this, FavouritemovieActivity::class.java)
//            startActivity(intent)
//        }

        val imageView6: ImageView = findViewById(R.id.imageView6)

        imageView6.setOnClickListener {
            val intent = Intent(this, PaidMovieActivity::class.java)
            startActivity(intent)
        }

        val mainimageView7: ImageView = findViewById(R.id.mainimageView7)

        mainimageView7.setOnClickListener {
            val intent = Intent(this, profileActivity::class.java)
            startActivity(intent)
        }
    }
}
