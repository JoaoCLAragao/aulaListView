package br.com.cotemig.aulalistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MessageAdapter (var context : Context, var messages: List<String>) : BaseAdapter(){

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_mensage, null)
        var message = view.findViewById<TextView>(R.id.message)
        message.text = messages[p0]
        return view
    }

    override fun getItem(p0: Int): Any {
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int { //Serve pra saber quantos itens tem na lista.
        return messages.size
    }
}