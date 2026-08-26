package com.mds.dzikrharianwajib

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var halamanSaatIni = 1

    private lateinit var teksHalaman: TextView
    private lateinit var btnKembali: Button
    private lateinit var btnLanjut: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_FULLSCREEN or
            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION

        setContentView(R.layout.activity_main)

        teksHalaman = findViewById(R.id.teksHalaman)
        btnKembali = findViewById(R.id.btnKembali)
        btnLanjut = findViewById(R.id.btnLanjut)

        tampilkanHalaman()

        btnLanjut.setOnClickListener {
            if (halamanSaatIni < 12) {
                halamanSaatIni++
                tampilkanHalaman()
            } else {
                finish()
            }
        }

        btnKembali.setOnClickListener {
            if (halamanSaatIni > 1) {
                halamanSaatIni--
                tampilkanHalaman()
            }
        }
    }

    private fun tampilkanHalaman() {

        when (halamanSaatIni) {

            1 -> {
                teksHalaman.text = "HALAMAN 1"
                btnKembali.visibility = View.INVISIBLE
                btnLanjut.text = "LANJUT"
            }

            2 -> {
                teksHalaman.text = "HALAMAN 2"
                btnKembali.visibility = View.VISIBLE
                btnLanjut.text = "LANJUT"
            }

            3 -> {
                teksHalaman.text = "HALAMAN 3"
                btnKembali.visibility = View.VISIBLE
                btnLanjut.text = "LANJUT"
            }

            4 -> {
                teksHalaman.text = "HALAMAN 4"
                btnKembali.visibility = View.VISIBLE
                btnLanjut.text = "LANJUT"
            }

            5 -> {
                teksHalaman.text = "HALAMAN 5"
                btnKembali.visibility = View.VISIBLE
                btnLanjut.text = "LANJUT"
            }

            6 -> {
                teksHalaman.text = "HALAMAN 6"
                btnKembali.visibility = View.VISIBLE
                btnLanjut.text = "LANJUT"
            }

            7 -> {
                teksHalaman.text = "HALAMAN 7"
                btnKembali.visibility = View.VISIBLE
                btnLanjut.text = "LANJUT"
            }

            8 -> {
                teksHalaman.text = "HALAMAN 8"
                btnKembali.visibility = View.VISIBLE
                btnLanjut.text = "LANJUT"
            }

            9 -> {
                teksHalaman.text = "HALAMAN 9"
                btnKembali.visibility = View.VISIBLE
                btnLanjut.text = "LANJUT"
            }

            10 -> {
                teksHalaman.text = "HALAMAN 10"
                btnKembali.visibility = View.VISIBLE
                btnLanjut.text = "LANJUT"
            }

            11 -> {
                teksHalaman.text = "HALAMAN 11"
                btnKembali.visibility = View.VISIBLE
                btnLanjut.text = "LANJUT"
            }

            12 -> {
                teksHalaman.text = "HALAMAN 12"
                btnKembali.visibility = View.VISIBLE
                btnLanjut.text = "SELESAI"
            }
        }
    }
}
