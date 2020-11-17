package com.example.musik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val web: WebView = findViewById(R.id.web)
        web.settings.javaScriptEnabled = true
        web.loadUrl("file:///android_asset/web/home.html")

    }
}