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
            val alas = edtAlas.text
            val tinggi = edtTinggi.text

//            Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
//            if (alas.isNullOrBlank() || tinggi.isNullOrBlank()) {

            if (alas.isNullOrBlank()) {
                edtAlas.error = "Alas tidak boleh kosong"
                edtAlas.requestFocus()
            } else if (tinggi.isNullOrBlank()){
                edtTinggi.error = "Tinggi tidak boleh kosong"
                edtTinggi.requestFocus()
            } else {
                hitungLuas(alas.toString().toInt(), tinggi.toString().toInt())
            }
        }
    }

    fun hitungLuas(alas:Int, tinggi:Int){
        val hasil = alas * tinggi

        Log.e("_logHasil", hasil.toString())
        txtHasil.text = hasil.toString()

        scrollView.smoothScrollBy(0, scrollView.bottom)
    }
}
