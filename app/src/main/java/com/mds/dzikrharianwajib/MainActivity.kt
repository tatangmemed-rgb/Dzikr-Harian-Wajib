package com.mds.dzikrharianwajib

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var halamanSaatIni = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val teksHalaman = findViewById<TextView>(R.id.teksHalaman)
        val btnLanjut = findViewById<Button>(R.id.btnLanjut)

        tampilkanHalaman(teksHalaman)

        btnLanjut.setOnClickListener {
            halamanSaatIni++

            tampilkanHalaman(teksHalaman)

            if (halamanSaatIni >= 12) {
                btnLanjut.text = "SELESAI"
            }

            if (halamanSaatIni > 12) {
                halamanSaatIni = 1
                btnLanjut.text = "LANJUT"
                tampilkanHalaman(teksHalaman)
            }
        }
    }

    private fun tampilkanHalaman(teksHalaman: TextView) {
        when (halamanSaatIni) {

            1 -> {
                teksHalaman.text = """
                    Bismillahirrahmanirrahim

                    Selamat datang di
                    Dzikir Harian Wajib
                """.trimIndent()
            }

            2 -> {
                teksHalaman.text = """
                    Sebelum memulai dzikir,
                    mari kita luruskan niat
                    dan memohon pertolongan
                    kepada Allah SWT.
                """.trimIndent()
            }

            3 -> {
                teksHalaman.text = """
                    Halaman 3

                    Pilihan TEKS ARAB
                    dan TEKS LATIN
                    akan ditambahkan pada tahap berikutnya.
                """.trimIndent()
            }

            else -> {
                teksHalaman.text = """
                    HALAMAN $halamanSaatIni

                    Materi dzikir akan dimasukkan
                    sesuai urutan halaman yang telah ditentukan.
                """.trimIndent()
            }
        }
    }
}
