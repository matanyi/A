package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SetCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_card)
    }
    fun toMenu(view: View){
        val controlIntent = Intent(this, MainActivity::class.java)
        startActivity(controlIntent)
    }
}