package br.com.cotemig.aulalistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var m = ArrayList<String>()
        m.add("Oi, como você ta?")
        m.add("Eu to bem e você?")
        m.add("To bem também")
        m.add("Ta fazendo a aula de mobile do dirceu? Ele acha que o méxico fica na europa. muito doidão da cabeça")
        m.add("Me IGNORA NÃO")
        m.add("Você foi bloqueado")


        var listView = findViewById<ListView>(R.id.listview)
        listView.adapter = MessageAdapter(this, m)




    }
}