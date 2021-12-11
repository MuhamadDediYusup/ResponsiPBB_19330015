package com.ysp.responsippb

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.NumberFormat
import java.util.*
import kotlin.collections.ArrayList

class TransactionActivity : AppCompatActivity() {
    private lateinit var rvProduct: RecyclerView
    private var list: ArrayList<Product> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction)

        val totalPenjualan = findViewById<TextView>(R.id.jumlah_penjualan)
        val arrowBack = findViewById<ImageView>(R.id.btn_arrowBack)
        arrowBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        //conversi int ke format uang IDR
        val format: NumberFormat = NumberFormat.getCurrencyInstance()
        format.setMaximumFractionDigits(0)
        format.setCurrency(Currency.getInstance("IDR"))
        val totalHarga = format.format(DataProduct.totalHarga)

        totalPenjualan.setText(totalHarga.toString())

        rvProduct = findViewById(R.id.rv_product)
        rvProduct.setHasFixedSize(true)

        list.addAll(DataProduct.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvProduct.layoutManager = LinearLayoutManager(this)
        val listProductAdapter = ListProductAdapter(list)
        rvProduct.adapter = listProductAdapter
    }

}