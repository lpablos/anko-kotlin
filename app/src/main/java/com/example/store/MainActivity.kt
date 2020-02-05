package com.example.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rcView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val item = arrayListOf<ItemListPOJO>()
        (0..10).map {
            item.add(ItemListPOJO("Titulo $it","Descripción $it", "$ ${it*12}"))
        }
        rcView.adapter = AdaptadorCarrito(item)
    }
}
