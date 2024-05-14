package com.stardev.famod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stardev.devmod.Dev

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Dev.launchWelcome(this,"suresh")
    }
}