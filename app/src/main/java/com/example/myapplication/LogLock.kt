package com.example.myapplication

class LogLock(
    private var lock : String,
    private var id: String,
    private var event: String,
    private var user: String,
    private var date_time: String) {
    override fun toString(): String {
        return "Category [id: ${this.id}, event: ${this.event}, user: ${this.user}, date_time: ${this.date_time}]"
    }

    fun getId() :String{
        return id
    }
    fun getEvent() :String{
        return event
    }
    fun getUser() :String{
        return user
    }
    fun getDate_time() :String{
        return date_time
    }
}