package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cabinet_list_director.*


class CabinetListDirectorActivity : AppCompatActivity() {

    var t = ServerCommand()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cabinet_list_director)
    }

    fun lockOpen(view: View){
        var str =  t.lockOpen("1")
        butt_op.text = "Открыто"
        butt_cl.text = "Закрыть"

    }

    fun lockClose(view: View){
        var str = t.lockClose("1")
        butt_cl.text = "Закрыто"
        butt_op.text = "Открыть"
    }

    fun lockOpen2(view: View){
        var str2 =  t.lockOpen("2")
        butt_op2.text = "Открыто"
        butt_cl2.text = "Закрыть"

    }

    fun lockClose2(view: View){
        var str2 = t.lockClose("2")
        butt_cl2.text = "Закрыто"
        butt_op2.text = "Открыть"
    }

    fun log101(view: View){
        val logIntent = Intent(this, LogAttendActivity::class.java)
        logIntent.putExtra("CabinetListDirectorActivityLockId", "1")
        startActivity(logIntent)
    }

    fun log102(view: View){
        val logIntent = Intent(this, LogAttendActivity::class.java)
        logIntent.putExtra("CabinetListDirectorActivityLockId", "2")
        startActivity(logIntent)
    }

    fun toMenu(view: View){
        val controlIntent = Intent(this, MainActivity::class.java)
        startActivity(controlIntent)
    }
}