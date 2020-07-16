package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LogAttend101Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_attend101)
    }
    fun controlMe(view: View){
        val controlIntent = Intent(this, CabinetListDirectorActivity::class.java)
        startActivity(controlIntent)
    }
}