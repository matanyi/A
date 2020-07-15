package com.example.schoolscientistsexample

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.features.logging.LogLevel
import io.ktor.client.features.logging.Logging
import io.ktor.client.request.get
import io.ktor.http.renderSetCookieHeader
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


class ServerCommand{

    private val client = HttpClient()


    private suspend fun lockOpenBody() : String {
        try {
            val res = client.get<String>("https://ms4.newtonbox.ru/lock/1/open")
            Log.i("https://ms4.newtonbox.ru/lock/1/open Simple case", res)
            return res
        } catch (th: Throwable) {
            return "ОШИБКА"
        }
    }
    fun lockOpen() : String {
        return runBlocking { lockOpenBody() }
    }
    private suspend fun lockCloseBody() : String {
        try {
            val res = client.get<String>("https://ms4.newtonbox.ru/lock/1/close")
            Log.i("https://ms4.newtonbox.ru/lock/1/close Simple case", res)
            return res
        } catch (th: Throwable) {
            return "ОШИБКА"
        }
    }

    fun lockClose() : String {
        return runBlocking { lockCloseBody() }
    }
    fun lockStatus() {
        GlobalScope.launch(Dispatchers.IO) {
            val data = client.get<String>("https://ms4.newtonbox.ru/lock/1/status")
            Log.i("https://ms4.newtonbox.ru/lock/1/status Simple case", data)
        }
    }
    private suspend fun lockClose2Body() : String {
        try {
            val res2 = client.get<String>("https://ms4.newtonbox.ru/lock/2/close")
            Log.i("https://ms4.newtonbox.ru/lock/2/close Simple case", res2)
            return res2
        } catch (th: Throwable) {
            return "ОШИБКА"
        }
    }

    fun lockClose2() : String {
        return runBlocking { lockClose2Body() }
    }
    private suspend fun lockOpen2Body() : String {
        try {
            val res2 = client.get<String>("https://ms4.newtonbox.ru/lock/2/open")
            Log.i("https://ms4.newtonbox.ru/lock/2/open Simple case", res2)
            return res2
        } catch (th: Throwable) {
            return "ОШИБКА"
        }
    }

    fun lockOpen2() : String {
        return runBlocking { lockOpen2Body() }
    }

    fun deviceList() {
        GlobalScope.launch(Dispatchers.IO) {
            val data = client.get<String>("https://ms0.newtonbox.ru/get/device_lock_list")
            Log.i("https://ms0.newtonbox.ru/get/device_lock_list Simple case", data)
        }
    }
}