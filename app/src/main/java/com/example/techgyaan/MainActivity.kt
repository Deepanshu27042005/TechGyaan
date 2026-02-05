package com.example.techgyaan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnIntent = findViewById<Button>(R.id.button)
        btnIntent.setOnClickListener {
            intent = Intent(this , secondScreen::class.java)
            startActivity(intent)
        }
    }
}
