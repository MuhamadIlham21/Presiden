package com.app.id.presiden

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class jokowi : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biodata)

        supportActionBar?.title = "Joko Widodo"

        val img = findViewById(R.id.imgHeader) as ImageView
        val nama = findViewById(R.id.tvgetNama) as TextView
        val tgl= findViewById(R.id.tvgetLahir) as TextView
        val period = findViewById(R.id.tvgetPeriode) as TextView

        nama.setText("Joko Widodo")
        tgl.setText("Surakarta, Rabu 21 Juni 1961")
        period.setText("20 oktober 2014 - sekarang")
        img.setImageResource(R.drawable.jokowi)
    }
}
