package com.app.id.presiden

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class gusdur : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biodata)

        supportActionBar?.title = "Abdurrahman Wahid"

        val img = findViewById(R.id.imgHeader) as ImageView
        val nama = findViewById(R.id.tvgetNama) as TextView
        val tgl= findViewById(R.id.tvgetLahir) as TextView
        val period = findViewById(R.id.tvgetPeriode) as TextView

        nama.setText("Abdurrahman Wahid")
        tgl.setText("Jombang, 4 Agustus 1940")
        period.setText("20 Oktober 1999 - 23 Juli 2001")
        img.setImageResource(R.drawable.gusdur)
    }
}
