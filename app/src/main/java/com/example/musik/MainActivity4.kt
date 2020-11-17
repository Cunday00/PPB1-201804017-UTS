package com.example.musik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity4 : AppCompatActivity() {
    private lateinit var rvband: RecyclerView
    private var list : ArrayList<band> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        rvband = findViewById(R.id.rv_band)
        rvband.setHasFixedSize(true)

        list.addAll(databand.listData)
        showRecyclerViewListMode()
    }
    private fun showRecyclerViewListMode(){
        rvband.layoutManager = LinearLayoutManager(this)
        val listbandadapter = listbandadapter(list)
        rvband.adapter = listbandadapter
    }
}