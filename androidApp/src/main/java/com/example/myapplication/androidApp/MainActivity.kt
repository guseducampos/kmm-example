package com.example.myapplication.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.shared.Greeting
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.shared.repo.CarsRepository

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        val cars = CarsRepository().getCarList()
        Log.d("CAR", cars[4].modelName)
        Toast.makeText(this, cars[4].modelName, Toast.LENGTH_LONG).show()
    }
}
