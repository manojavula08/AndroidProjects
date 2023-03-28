package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //var btn: Button?=null
    var imageView:ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btn=findViewById(R.id.button)
        imageView=findViewById(R.id.imageView)
        imageView!!.setOnClickListener {

           var roll=Dice()
            var rollDice=roll.diceRoll(6)
           var dec= when(rollDice)
            {
                1->R.drawable.dice_1
               2->R.drawable.dice_2
               3->R.drawable.dice_3
               4->R.drawable.dice_4
               5->R.drawable.dice_5
               else->R.drawable.dice_6
            }
            imageView!!.setImageResource(dec)
            imageView!!.contentDescription=rollDice.toString()
        }
    }


}

class Dice() {
      fun diceRoll(number: Int):Int
      {
          var roll = 1..number
          return roll.random()

      }
}
