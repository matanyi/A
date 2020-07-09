package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun infoMe(view: View){
        val infoIntent = Intent(this, InfoActivity::class.java)
        startActivity(infoIntent)
    }
    fun controlMe(view: View){
        val controlIntent = Intent(this, CabinetListDirectorActivity::class.java)
        startActivity(controlIntent)
    }
}
