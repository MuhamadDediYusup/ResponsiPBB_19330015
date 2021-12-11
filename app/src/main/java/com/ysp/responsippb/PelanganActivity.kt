package com.ysp.responsippb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class PelanganActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelangan)

        val arrowBack = findViewById<ImageView>(R.id.btn_arrowBack)
        val buttonBack = findViewById<Button>(R.id.button_back)
        arrowBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        buttonBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}