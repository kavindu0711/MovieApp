package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PaidMovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paid_movie)

        val pubutton: Button = findViewById(R.id.pubutton)

        pubutton.setOnClickListener{
            val intent = Intent(this, PurchaseConfirmationActivity::class.java)
            startActivity(intent)
        }
    }
}