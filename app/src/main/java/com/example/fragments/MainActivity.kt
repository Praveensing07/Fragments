package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1=findViewById<Button>(R.id.button1)
        val button2=findViewById<Button>(R.id.button2)
        button1.setOnClickListener {
                val fragmentm = BlankFragment()
                val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.Linearlayout,fragmentm)
                    transaction.commit()
        }
        button2.setOnClickListener {
                val fragment=BlankFragment2()
                val transaction=supportFragmentManager.beginTransaction()
                transaction.replace(R.id.Linearlayout,fragment)
                transaction.commit()
        }
    }
}