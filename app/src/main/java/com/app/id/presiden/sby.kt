package com.app.id.presiden

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class sby : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biodata)

        supportActionBar?.title = "Susilo Bambang Yudhoyono"

        val img = findViewById(R.id.imgHeader) as ImageView
        val nama = findViewById(R.id.tvgetNama) as TextView
        val tgl= findViewById(R.id.tvgetLahir) as TextView
        val period = findViewById(R.id.tvgetPeriode) as TextView

        nama.setText("Susilo Bambang Yudhoyono")
        tgl.setText("Pacitan, 9 September 1949")
        period.setText("20 Oktober 2004 - 20 oktober 2014")
        img.setImageResource(R.drawable.sby)
    }
}
