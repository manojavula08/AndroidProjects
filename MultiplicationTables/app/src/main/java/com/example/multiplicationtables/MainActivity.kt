package com.example.multiplicationtables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var editText:EditText?=null
    var button:Button?=null
    var textView:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.et)
        button = findViewById(R.id.btn)
        textView = findViewById(R.id.tv)

        button?.setOnClickListener{
            var temp:String = editText?.text.toString()
            var number:Int = temp.toInt()
            multiplication(number)
        }
    }

    fun multiplication(number:Int)
    {
        textView?.text=" "
        for(i in 1..10)
        {
            textView?.append("$number * $i = "+(number*i)+"\n")
        }
    }




}