package com.ysp.responsippb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import java.text.NumberFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val developer = findViewById<ImageView>(R.id.btn_dev)
        val btn_transactionHistory = findViewById<LinearLayout>(R.id.btn_riwayatTransaksi)
        val tv_transactionHistory = findViewById<TextView>(R.id.tv_riwayatTransaksi)
        val btn_kelolaProduct = findViewById<LinearLayout>(R.id.btn_kelolaProduk)
        val total_penjualan = findViewById<TextView>(R.id.total_penjualan)
        val transaksi = findViewById<TextView>(R.id.jmltransaksi)
        val btn_penjualan = findViewById<LinearLayout>(R.id.btn_jualan)
        val btn_start_sale = findViewById<Button>(R.id.btn_start_sale)
        val btn_pelangan = findViewById<LinearLayout>(R.id.btn_kelolaPelangan)

        val format: NumberFormat = NumberFormat.getCurrencyInstance()
        format.setMaximumFractionDigits(0)
        format.setCurrency(Currency.getInstance("IDR"))
        val totalHarga = format.format(DataProduct.totalHarga)
        total_penjualan.setText(totalHarga.toString())

        developer.setOnClickListener {
            startActivity(Intent(this, DevActivity::class.java))
        }

        btn_transactionHistory.setOnClickListener {
            startActivity(Intent(this, TransactionActivity::class.java))
        }

        tv_transactionHistory.setOnClickListener {
            startActivity(Intent(this, TransactionActivity::class.java))
        }

        btn_kelolaProduct.setOnClickListener {
            startActivity(Intent(this, ProductActivity::class.java))
        }

        transaksi.setText(DataProduct.jumlahTransaksi.toString() + " Transaksi")

        btn_penjualan.setOnClickListener {
            startActivity(Intent(this, PenjualanActivity::class.java))
        }

        btn_start_sale.setOnClickListener {
            startActivity(Intent(this, ProductActivity::class.java))
        }

        btn_pelangan.setOnClickListener {
            startActivity(Intent(this, PelanganActivity::class.java))
        }
    }
}