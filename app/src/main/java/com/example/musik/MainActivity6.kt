package com.example.musik

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val noha : EditText = findViewById(R.id.noha)
        val hub : Button = findViewById(R.id.hub)

        hub.setOnClickListener{
            val pang = noha.text.toString()
            val gil = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$pang"))
            startActivity(gil)
        }
    }
}