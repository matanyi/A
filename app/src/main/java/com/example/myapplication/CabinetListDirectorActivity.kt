package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.schoolscientistsexample.ServerCommand
import kotlinx.android.synthetic.main.activity_cabinet_list_director.*
import kotlinx.android.synthetic.main.activity_info.*


class CabinetListDirectorActivity : AppCompatActivity() {


    var t = ServerCommand()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cabinet_list_director)
    }
    fun lockOpen(view: View){
        var str =  t.lockOpen()
        textView16.text = str
        butt_op.text = "Открыто"
        butt_cl.text = "Закрыть"

    }
    fun lockClose(view: View){
        var str = t.lockClose()
        textView16.text = str
        butt_cl.text = "Закрыто"
        butt_op.text = "Открыть"
    }
    fun lockOpen2(view: View){
        var str2 =  t.lockOpen2()
        textView18.text = str2
        butt_op2.text = "Открыто"
        butt_cl2.text = "Закрыть"

    }
    fun lockClose2(view: View){
        var str2 = t.lockClose2()
        textView18.text = str2
        butt_cl2.text = "Закрыто"
        butt_op2.text = "Открыть"
    }
    fun toMenu(view: View){
        val controlIntent = Intent(this, MainActivity::class.java)
        startActivity(controlIntent)
    }
}