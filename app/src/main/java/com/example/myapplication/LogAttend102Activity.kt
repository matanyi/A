package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LogAttend102Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_attend102)
    }
    fun controlMe(view: View){
        val controlIntent = Intent(this, CabinetListDirectorActivity::class.java)
        startActivity(controlIntent)
    }
}