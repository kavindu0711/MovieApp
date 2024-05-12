package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val profilebutton1: Button = findViewById(R.id.profilebutton1)

        profilebutton1.setOnClickListener{
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

        val profilebutton2: Button = findViewById(R.id.profilebutton2)

        profilebutton2.setOnClickListener{
            val intent = Intent(this, AvatarActivity::class.java)
            startActivity(intent)
        }
    }
}