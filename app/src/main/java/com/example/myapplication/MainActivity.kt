package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import com.example.schoolscientistsexample.ServerCommand

class MainActivity : AppCompatActivity() {
    var t = ServerCommand()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ledOn(view: View){
        t.ledOn()
    }
    fun ledOff(view: View){
        t.ledOff()
    }
}
