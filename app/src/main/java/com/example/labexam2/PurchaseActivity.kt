package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PurchaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchase)

        val purchasebutton: Button = findViewById(R.id.purchasebutton)

        purchasebutton.setOnClickListener{
            val intent = Intent(this, PurchaseConfirmationActivity::class.java)
            startActivity(intent)
        }
    }
}