package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.schoolscientistsexample.ServerCommand

class CabinetListDirectorActivity : AppCompatActivity() {

    var t = ServerCommand()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cabinet_list_director)
    }
    fun lockOpen(view: View){
        t.lockOpen()
    }
    fun lockClose(view: View){
        t.lockClose()
    }
}