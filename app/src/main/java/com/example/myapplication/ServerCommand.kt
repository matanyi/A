package com.example.schoolscientistsexample

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ServerCommand{

    private val client = HttpClient()

    fun lockOpen() {
        GlobalScope.launch(Dispatchers.IO) {
            val data = client.get<String>("https://ms4.newtonbox.ru/lock/1/open")
            Log.i("https://ms4.newtonbox.ru/lock/1/open Simple case", data)
        }
    }
    fun lockClose() {
        GlobalScope.launch(Dispatchers.IO) {
            val data = client.get<String>("https://ms4.newtonbox.ru/lock/1/close")
            Log.i("https://ms4.newtonbox.ru/lock/1/close Simple case", data)
        }
    }
    fun lockStatus() {
        GlobalScope.launch(Dispatchers.IO) {
            val data = client.get<String>("https://ms0.newtonbox.ru/get/house/device1/lock/status")
            Log.i("https://ms0.newtonbox.ru/get/school/device1/lock/status Simple case", data)
        }
    }
    fun deviceList() {
        GlobalScope.launch(Dispatchers.IO) {
            val data = client.get<String>("https://ms0.newtonbox.ru/get/device_lock_list")
            Log.i("https://ms0.newtonbox.ru/get/device_lock_list Simple case", data)
        }
    }
}