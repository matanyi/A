package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken

class LogAttendActivity : AppCompatActivity() {

    var t = ServerCommand()

    private lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_attend)
    }

    override fun onResume() {
        super.onResume()

        var lockId = "1"
        lockId = getIntent().getExtras()!!.get("CabinetListDirectorActivityLockId").toString()

        val jsonList = t.lockList(lockId)

        val gson = Gson()
        val arrayLogLock = object : TypeToken<ArrayList<LogLock>>() {}.type

        var devices: ArrayList<LogLock> = gson.fromJson(JsonParser().parse(jsonList).getAsJsonObject().get("log_list"), arrayLogLock)
        devices.forEachIndexed  { idx, dev -> println("> Item ${idx}:\n${dev}") }

        listView = findViewById<ListView>(R.id.LockList)

        //val adapter = ExampleDeviceAdapter(this, android.R.layout.simple_expandable_list_item_1, devices)
        listView.adapter = LogLockAdapter(this, devices)
    }

        fun controlMe(view: View){
            val controlIntent = Intent(this, CabinetListDirectorActivity::class.java)
            startActivity(controlIntent)
        }
}