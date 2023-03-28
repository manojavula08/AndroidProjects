package com.example.yearcalculater

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {
    var submit:Button?=null
    var textInput:EditText?=null
    var textOutput:TextView?=null

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit=findViewById(R.id.submit)
        textInput=findViewById(R.id.input)
        textOutput=findViewById(R.id.output)

        submit?.setOnClickListener{
            var temp:String=textInput?.text.toString()
            var number:Int=temp.toInt()

            var num:Int=2022-number1999
            textOutput?.setText("Yourage is"+num)
        }
    }
}