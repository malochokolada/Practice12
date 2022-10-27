package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var isClicked = false

    fun onRadioButtonClicked(view:View){
     val rbut1: RadioButton=findViewById<RadioButton>(R.id.radioButton1)
        val rbut2: RadioButton=findViewById<RadioButton>(R.id.radioButton2)
        val rbut3: RadioButton=findViewById<RadioButton>(R.id.radioButton3)
        val image : ImageView = findViewById<ImageView>(R.id.imageView);
        image.setImageResource(R.drawable.apple);
        image.setImageResource(R.drawable.grapes);
        image.setImageResource(R.drawable.pear);
        if(isClicked){
            rbut1
        }
    }
}