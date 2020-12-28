package com.zubaidi.aplikasikonversi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var konWaktu: CardView

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setTitle("Konversi Yuk!")
        konWaktu = findViewById(R.id.spWaktu)
        panggilWaktu()
    }

    /*
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuBar: MenuInflater = menuInflater
        menuBar.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if(id == R.id.menuTentang){
            val panggil = Intent(this, TentangAplikasi::class.java)
            startActivity(panggil)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    */

    fun panggilWaktu(){
        konWaktu.setOnClickListener {
            val panggil = Intent(this, KonversiWaktu::class.java)
            startActivity(panggil)
        }
    }
}