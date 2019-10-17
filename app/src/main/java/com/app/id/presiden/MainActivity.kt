package com.app.id.presiden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.app.id.presiden.Adapter.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val presiden = arrayOf<String>("Soekarno", "Soeharto", "Habibie", "GusDur", "Megawati", "Susilo Bambang Yudhoyono", "Jokowi")
    val deskripsi = arrayOf<String>(
        "17 Agustus 1945 - 12 Maret 1967",
        "12 Maret 1967 - 21 Mei 1998",
        "21 Mei 1998 - 20 Oktober 1999",
        "20 Oktober 1999 - 23 Juli 2001",
        "23 Juli 2001 - 20 Oktober 2004",
        "20 Oktober 2004 - 20 oktober 2014",
        "20 oktober 2014 - sekarang "
    )

    val imageId = arrayOf<Int>(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = Adapter(this,presiden,deskripsi,imageId)
        lvPresiden.adapter = myListAdapter

        lvPresiden.setOnItemClickListener { parent, v, position, id ->
            if (position == 0){
                startActivity(Intent(this@MainActivity, soekarno::class.java))
            }else if (position == 1){
                startActivity(Intent(this@MainActivity, soeharto::class.java))
            }else if (position == 2){
                startActivity(Intent(this@MainActivity, habibie::class.java))
            }else if (position == 3){
                startActivity(Intent(this@MainActivity, gusdur::class.java))
            }else if (position == 4){
                startActivity(Intent(this@MainActivity, megawati::class.java))
            }else if (position == 5){
                startActivity(Intent(this@MainActivity, sby::class.java))
            }else if (position == 6){
                startActivity(Intent(this@MainActivity, jokowi::class.java))
            }
        }
    }
}
