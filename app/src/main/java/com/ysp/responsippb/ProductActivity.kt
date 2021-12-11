package com.ysp.responsippb

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.NumberFormat
import java.util.*
import kotlin.collections.ArrayList

class ProductActivity : AppCompatActivity() {
    private lateinit var rvProduct: RecyclerView
    private var list: ArrayList<Product> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val arrowBack = findViewById<ImageView>(R.id.btn_arrowBack)
        arrowBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        rvProduct = findViewById(R.id.rv_product)
        rvProduct.setHasFixedSize(true)

        list.addAll(DataProduct.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvProduct.layoutManager = LinearLayoutManager(this)
        val listProductAdapter2 = ListProductAdapter2(list)
        rvProduct.adapter = listProductAdapter2
    }
}