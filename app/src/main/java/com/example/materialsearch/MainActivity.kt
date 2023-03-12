package com.example.materialsearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NavigationBarView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.alarms -> {
                    // Respond to alarm navigation item click
                    true
                }
                R.id.schedule -> {
                    // Respond to schedule navigation item click
                    true
                }
                else -> false
            }
        }
    }
}