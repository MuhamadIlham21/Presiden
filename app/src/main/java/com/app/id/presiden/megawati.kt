package com.app.id.presiden

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class megawati : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biodata)

        supportActionBar?.title = "Megawati"

        val img = findViewById(R.id.imgHeader) as ImageView
        val nama = findViewById(R.id.tvgetNama) as TextView
        val tgl= findViewById(R.id.tvgetLahir) as TextView
        val period = findViewById(R.id.tvgetPeriode) as TextView

        nama.setText("Megawati Soekarnoputri")
        tgl.setText("Yogyakarta, 23 Januari 1947")
        period.setText("23 Juli 2001 - 20 Oktober 2004")
        img.setImageResource(R.drawable.megawati)
    }
}
