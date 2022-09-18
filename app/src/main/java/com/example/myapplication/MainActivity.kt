package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

private lateinit var textView : TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
    }

    fun onButtonClick(view: View) {
        System.out.println("onButtonClick");
        textView.text = "BOOM!"
    }

    fun onSecondButtonClick(view: View) {
        System.out.println("onSecondButtonClick");
        textView.setTextColor(Color.RED);
    }
}