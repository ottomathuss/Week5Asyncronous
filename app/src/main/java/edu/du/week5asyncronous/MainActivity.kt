package edu.du.week5asyncronous

import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock.sleep
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.util.*
import kotlin.random.Random.Default.nextDouble

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val textview: TextView = findViewById(R.id.textLocation)

        button1.setOnClickListener() {
            val displayText: String = doNothing()
            textview.append("Button 1 - " + displayText)
        }
        button2.setOnClickListener() {
            val displayText: String = doNothing()
            textview.append("Button 2 - " + displayText)
        }
    }


    fun doNothing(): String {

        val s = java.text.SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
        sleep((nextDouble()*8000).toLong() + 2000)
        val format: String = s.format(Date()) + "\n"
        return format
    }

}