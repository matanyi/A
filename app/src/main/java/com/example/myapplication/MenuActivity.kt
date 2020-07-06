package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MenuActivity : AppCompatActivity() {

    companion object {

        const val TOTAL_COUNT = "total_count"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }
}