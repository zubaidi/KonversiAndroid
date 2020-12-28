package com.zubaidi.aplikasikonversi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_konversi_waktu.*

class KonversiWaktu : AppCompatActivity() {

    private lateinit var comboAwal: Spinner
    private lateinit var comboHasil: Spinner
    private lateinit var inputAwal: EditText
    private lateinit var hasil: EditText
    private lateinit var konvertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_waktu)
        this.setTitle("Konversi Waktu")
        comboAwal = findViewById(R.id.spWaktu)
        comboHasil = findViewById(R.id.spWaktuHasil)
        inputAwal = findViewById(R.id.editInput)
        hasil = findViewById(R.id.editHasil)
        konvertButton = findViewById(R.id.btnKonvertWaktu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        this.konvertWaktu()
    }

    fun konvertWaktu(){
        konvertButton.setOnClickListener {
            var nilaiAwal = inputAwal.text.toString()
            val hariJam = 24
            val jamMenit = 60
            val menitDetik = 60
            val jamDetik = 3600

            if(inputAwal.text.toString().isNullOrEmpty()){
                inputAwal.setError("Nilai awal harus diisi")
            }else if (comboAwal.selectedItemPosition == 0 && comboHasil.selectedItemPosition == 0){
                hasil.text = inputAwal.text
            }else if(comboAwal.selectedItemPosition == 0 && comboHasil.selectedItemPosition == 1){
                // hari -> jam
                val total = nilaiAwal.toInt() * hariJam
                hasil.setText(total.toString())
            }else if(comboAwal.selectedItemPosition == 0 && comboHasil.selectedItemPosition == 2){
                // hari -> menit
                val total = nilaiAwal.toInt() * hariJam * jamMenit
                hasil.setText(total.toString())
            }else if(comboAwal.selectedItemPosition == 0 && comboHasil.selectedItemPosition == 3){
                // hari -> detik
                val total = nilaiAwal.toInt() * hariJam * jamMenit * menitDetik
                hasil.setText(total.toString())
            }else if(comboAwal.selectedItemPosition == 1 && comboHasil.selectedItemPosition == 1){
                hasil.text = inputAwal.text
            }else if(comboAwal.selectedItemPosition == 1 && comboHasil.selectedItemPosition == 2){
                // jam -> menit
                val total = nilaiAwal.toInt() * jamMenit
                hasil.setText(total.toString())
            }else if(comboAwal.selectedItemPosition == 1 && comboHasil.selectedItemPosition == 3){
                // jam -> detik
                val total = nilaiAwal.toInt() * jamDetik
                hasil.setText(total.toString())
            }else if(comboAwal.selectedItemPosition == 2 && comboHasil.selectedItemPosition == 2){
                hasil.setText(nilaiAwal.toString())
            }else if(comboAwal.selectedItemPosition == 2 && comboHasil.selectedItemPosition == 3){
                // menit -> detik
                val total = nilaiAwal.toInt() * menitDetik
                hasil.setText(total.toString())
            }else if(comboAwal.selectedItemPosition == 3 && comboHasil.selectedItemPosition == 3){
                hasil.text = inputAwal.text
            }else{
                Toast.makeText(this, "Input Nilai", Toast.LENGTH_SHORT)
            }
        }
    }

}