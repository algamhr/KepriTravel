package com.example.kepritravel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    // Respond to navigation item 1 click
                    true
                }
                R.id.search -> {
                    // Respond to navigation item 2 click
                    true
                }
                R.id.favorite -> {
                    // Respond to navigation item 2 click
                    true
                }
                R.id.profile -> {
                    // Respond to navigation item 2 click
                    true
                }
                else -> false
            }
        }
    }
}