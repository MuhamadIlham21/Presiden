package com.app.id.presiden

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class soeharto : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biodata)

        supportActionBar?.title = "Soeharto"

        val img = findViewById(R.id.imgHeader) as ImageView
        val nama = findViewById(R.id.tvgetNama) as TextView
        val tgl= findViewById(R.id.tvgetLahir) as TextView
        val period = findViewById(R.id.tvgetPeriode) as TextView

        nama.setText("Soeharto")
        tgl.setText("Yogyakarta, 8 Juni 1921")
        period.setText("12 Maret 1967 - 21 Mei 1998")
        img.setImageResource(R.drawable.soeharto)
    }
}
