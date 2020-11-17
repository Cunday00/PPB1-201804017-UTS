package com.example.musik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val profil: Button = findViewById(R.id.prosa)
        profil.setOnClickListener{
            startActivity(Intent( this, MainActivity3::class.java))
        }

        val lasa: Button = findViewById(R.id.lasa)
        lasa.setOnClickListener{
            startActivity(Intent( this, MainActivity4::class.java))
        }

        val web: Button = findViewById(R.id.wesa)
        web.setOnClickListener{
            startActivity(Intent( this, MainActivity5::class.java))
        }

        val kosa: Button = findViewById(R.id.kosa)
        kosa.setOnClickListener{
            startActivity(Intent( this, MainActivity6::class.java))
        }
    }
}