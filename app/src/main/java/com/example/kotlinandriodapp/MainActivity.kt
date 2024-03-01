package com.example.kotlinandriodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val inputDisplay : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridLayout: GridLayout = findViewById(R.id.btnLayout);
        val childView: View = gridLayout.getChildAt(0) // Example: getting the first child
        gridLayout.post {
            val childWidth = childView.width
            val childHeight = childView.height

            // Use childWidth and childHeight assuming uniform cell size
        }
    }
}