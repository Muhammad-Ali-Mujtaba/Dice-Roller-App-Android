package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_roll: Button = findViewById(R.id.btn_roll)
        button_roll.text="Roll The Dice!"
        diceImage = findViewById(R.id.image_dice)

        button_roll.setOnClickListener {
            diceRolled()
            Toast.makeText(this, "The dice has been rolled!", Toast.LENGTH_SHORT).show()
        }


    }

    fun diceRolled(){

        val randomRoll = Random.nextInt(6) + 1

        val diceImageResource = when(randomRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

        diceImage.setImageResource(diceImageResource)

    }


}