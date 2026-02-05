package com.example.techgyaan

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class secondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_screen)
        val appBtn = findViewById<CardView>(R.id.app)
        val cyberBtn = findViewById<CardView>(R.id.cyber)

        appBtn.setOnClickListener {
            intent = Intent(this , appDev::class.java)
            startActivity(intent)
        }
        cyberBtn.setOnClickListener {
            intent = Intent(this , blockchain::class.java)
            startActivity(intent)
        }

    }
}