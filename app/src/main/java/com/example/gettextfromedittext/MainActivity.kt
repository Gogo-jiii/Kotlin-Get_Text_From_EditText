package com.example.gettextfromedittext

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClick.setOnClickListener {
            val name = edName.text.toString()
            Toast.makeText(this@MainActivity, "Name: $name", Toast.LENGTH_LONG).show()
        }
    }
}