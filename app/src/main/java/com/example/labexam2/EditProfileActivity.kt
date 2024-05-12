package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val editProfileButton1: Button = findViewById(R.id.editProfileButton1)

        editProfileButton1.setOnClickListener{
            val intent = Intent(this, profileActivity::class.java)
            startActivity(intent)
        }
    }
}