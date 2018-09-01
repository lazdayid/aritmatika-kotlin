package com.lazday.aritmatikakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener { v ->
            var alas = edtAlas.text
            var tinggi = edtTinggi.text

            if (alas.isNullOrBlank() || tinggi.isNullOrBlank())
                Toast.makeText(this, "Isi data dengan benar",
                        Toast.LENGTH_SHORT).show()
             else
                hitungLuas(alas.toString().toInt(), tinggi.toString().toInt())
        }
    }

    fun hitungLuas(alas:Int, tinggi:Int){
        var hasil = alas * tinggi

        Log.e("_logHasil", hasil.toString())
        txtHasil.text = hasil.toString()
    }
}
