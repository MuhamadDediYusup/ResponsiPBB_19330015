package com.ysp.responsippb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DevActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dev)

        var btn_home = findViewById<Button>(R.id.btn_home)
        var btn_home2 = findViewById<ImageView>(R.id.btn_home2)

        btn_home.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btn_home2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}