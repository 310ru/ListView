package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array = arrayOf(
            "あああああああああああああああい",
            "ああああああああああああああああああああああああえああああああああああい",
            "うううううううううううう"
        )

        val listView = findViewById<ListView>(R.id.listView)

        val adapter = ArrayAdapter(this,R.layout.list_item,array)

        listView.adapter = adapter
    }
}