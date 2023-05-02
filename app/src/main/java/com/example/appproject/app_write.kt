package com.example.appproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class app_write : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_write)

        val btn_back = findViewById<Button>(R.id.btn_back)

        btn_back.setOnClickListener({
            val intent = Intent(this, app_main::class.java)
            startActivity(intent)
        })

    }
}