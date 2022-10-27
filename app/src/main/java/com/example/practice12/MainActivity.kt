package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun radioButton_Apple(view: View){
        val imageView: ImageView=findViewById(R.id.imageView)
        imageView.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.apple))
        val radioButton: RadioButton=findViewById(R.id.radioButton1)
    }

    fun radioButton_Pear(view:View){
        val imageView: ImageView=findViewById(R.id.imageView)
        imageView.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.pear))
    }

   fun radioButton_Grape(view: View){
       val imageView: ImageView=findViewById(R.id.imageView)
       imageView.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.grapes))
    }

    fun checkBox_Apple(view: View){
        val imageViewApple: ImageView=findViewById(R.id.imageView2)
        imageViewApple.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.apple))
        val checkBoxApple: CheckBox=findViewById(R.id.checkBox1)
        if (checkBoxApple.isChecked==false)
            imageViewApple.setImageDrawable(null)
    }

    fun checkBox_Pear(view: View){
        val imageViewPear: ImageView=findViewById(R.id.imageView3)
        imageViewPear.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.pear))
        val checkBoxPear: CheckBox=findViewById(R.id.checkBox2)
        if (checkBoxPear.isChecked==false)
            imageViewPear.setImageDrawable(null)
    }

    fun checkBox_Grape(view: View){
        val imageViewGrape: ImageView=findViewById(R.id.imageView4)
        imageViewGrape.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.grapes))
        val checkBoxGrape: CheckBox=findViewById(R.id.checkBox3)
        if (checkBoxGrape.isChecked==false)
            imageViewGrape.setImageDrawable(null)
    }

}