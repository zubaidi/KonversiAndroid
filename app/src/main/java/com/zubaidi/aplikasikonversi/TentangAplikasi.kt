package com.zubaidi.aplikasikonversi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TentangAplikasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang_aplikasi)
        this.setTitle("Tentang Aplikasi")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}