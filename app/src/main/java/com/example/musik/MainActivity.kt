package com.example.musik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val masuk: Button = findViewById(R.id.login)

        masuk.setOnClickListener{
            startActivity(Intent( this, MainActivity2::class.java))
        }
    }
}