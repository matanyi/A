package com.example.myapplication

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


class ServerCommand{

    private val client = HttpClient()

    private suspend fun lockOpenBody(lockId: String) : String {
        try {
            var request = "https://ms4.newtonbox.ru/lock/" + lockId + "/open"
            val res = client.get<String>(request)
            Log.i(request + " Simple case", res)
            return res
        } catch (th: Throwable) {
            return "ОШИБКА"
        }
    }

    fun lockOpen(lockId: String) : String {
        return runBlocking { lockOpenBody(lockId) }
    }

    private suspend fun lockCloseBody(lockId: String) : String {
        try {
            var request = "https://ms4.newtonbox.ru/lock/" + lockId + "/close"
            val res = client.get<String>(request)
            Log.i(request + " Simple case", res)
            return res
        } catch (th: Throwable) {
            return "ОШИБКА"
        }
    }

    fun lockClose(lockId: String) : String {
        return runBlocking { lockCloseBody(lockId) }
    }

    fun lockStatus() {
        GlobalScope.launch(Dispatchers.IO) {
            val data = client.get<String>("https://ms4.newtonbox.ru/lock/1/status")
            Log.i("https://ms4.newtonbox.ru/lock/1/status Simple case", data)
        }
    }

    private suspend fun lockListBody(lockId: String): String{
        try{
            var query = "https://ms4.newtonbox.ru/history/" + lockId
            val res = client.get<String>(query)
            Log.i(query + " Simple case ", res)
            return res
        }
        catch (th : Throwable) {
            return "ОШИБКА"
        }
    }

    fun lockList(lockId: String): String{
        return runBlocking { lockListBody(lockId) }
    }
}