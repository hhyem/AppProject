package com.example.appproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class app_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_detail)

        val btn_write = findViewById<Button>(R.id.btn_write)
        val btn_main = findViewById<Button>(R.id.btn_main)
        val btn_mypage = findViewById<Button>(R.id.btn_mypage)

        btn_write.setOnClickListener({
            val intent = Intent(this, app_write::class.java)
            startActivity(intent)
        })

        btn_main.setOnClickListener({
            val intent = Intent(this, app_main::class.java)
            startActivity(intent)
        })

        btn_mypage.setOnClickListener({
            val intent = Intent(this, app_mypage::class.java)
            startActivity(intent)
        })
    }
}