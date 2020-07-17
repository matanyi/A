package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class LogLockAdapter(var context: Context, var locks: List<LogLock>): BaseAdapter() {

    private class ViewHolder(row: View?) {
        var id: TextView
        var event: TextView
        var user: TextView
        var date_time: TextView
        init {
            this.id = row!!.findViewById(R.id.itemidTextView) as TextView
            this.event = row.findViewById(R.id.itemeventTextView) as TextView
            this.user = row.findViewById(R.id.itemuserTextView) as TextView
            this.date_time = row.findViewById(R.id.itemdate_timeTextView) as TextView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view: View?
        var viewHolder: ViewHolder
        if (convertView == null) {
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.log_list, parent, false)
            viewHolder = ViewHolder(view)
            view!!.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var book: LogLock = getItem(position) as LogLock
        viewHolder.id.text = book.getId()
        viewHolder.event.text = book.getEvent()
        viewHolder.user.text = book.getUser()
        viewHolder.date_time.text = book.getDate_time()

        return view as View
    }

    override fun getItem(position: Int): Any {
        return locks.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return locks.count()
    }
}