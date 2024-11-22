package com.example.proekt

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            startActivity(Intent(this@MainActivity, FavoritesActivity::class.java))
        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            startActivity(Intent(this@MainActivity, RecipesActivity::class.java))
        }
    }
}