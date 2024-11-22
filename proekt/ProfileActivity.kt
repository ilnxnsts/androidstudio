package com.example.proekt

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.CalendarView
import android.widget.Button
import com.example.proekt.MainActivity

class ProfileActivity : AppCompatActivity() {
    private lateinit var calendarView: CalendarView
    private lateinit var textInput: EditText
    private lateinit var textInput2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        textInput = findViewById(R.id.text1)
        textInput2 = findViewById(R.id.text2)
        calendarView = findViewById(R.id.calendarView)
        val button: Button = findViewById(R.id.button4)
        button.setOnClickListener {
            startActivity(Intent(this@ProfileActivity, MainActivity::class.java))
        }
    }
}