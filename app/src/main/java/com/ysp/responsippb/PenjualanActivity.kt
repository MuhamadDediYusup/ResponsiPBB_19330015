package com.ysp.responsippb

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PenjualanActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penjualan)

        var btn_home = findViewById<ImageView>(R.id.btn_arrowBack)
        val btn_transaksi = findViewById<LinearLayout>(R.id.btn_transaksi)
        val btn_pengiriman = findViewById<LinearLayout>(R.id.btn_pengiriman)
        val btn_pelangan = findViewById<LinearLayout>(R.id.btn_jmlhPelangan)
        val btn_tokoCabang = findViewById<LinearLayout>(R.id.btn_tokoCabang)

        btn_home.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btn_pengiriman.setOnClickListener {
            Toast.makeText(this, "Kamu Memilih Jumlah Pengiriman", Toast.LENGTH_SHORT).show()
        }

        btn_transaksi.setOnClickListener {
            Toast.makeText(this, "Kamu Memilih Jumlah Transaksi", Toast.LENGTH_SHORT).show()
        }

        btn_pengiriman.setOnClickListener {
            Toast.makeText(this, "Kamu Memilih Jumlah Pengiriman", Toast.LENGTH_SHORT).show()
        }

        btn_pelangan.setOnClickListener {
            Toast.makeText(this, "Kamu Memilih Jumlah Pelangan", Toast.LENGTH_SHORT).show()
        }

        btn_tokoCabang.setOnClickListener {
            Toast.makeText(this, "Kamu Memilih Jumlah Toko Cabang", Toast.LENGTH_SHORT).show()
        }
    }
}