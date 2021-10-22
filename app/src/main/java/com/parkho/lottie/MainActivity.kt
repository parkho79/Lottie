package com.parkho.lottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_show).setOnClickListener {
            val layoutBuilder = LayoutInflater.from(this).inflate(R.layout.progress, null)
            val builder = AlertDialog.Builder(this).setView(layoutBuilder)
            builder.show()
        }
    }

}