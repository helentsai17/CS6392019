package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {


    //The lateinit keyword promises the Kotlin compiler that the variable will be initialized before the code calls any operations on it.
    lateinit var diceImage : ImageView
    lateinit var diecImage2 :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val clearItem : Button = findViewById(R.id.countup_button)
        clearItem.setOnClickListener { clearButton() }

        diceImage = findViewById(R.id.dice_image)
        diecImage2 = findViewById(R.id.dice_image2)

//        val countButton: Button = findViewById(R.id.countup_button)
//        countButton.setOnClickListener { countUp() }



    }

    private fun rollDice() {

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val randomInt = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
//        val diceImage: ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diecImage2.setImageResource(drawableResource2)

    }
    private fun clearButton(){
        diceImage.setImageResource(R.drawable.empty_dice)
        diecImage2.setImageResource(R.drawable.empty_dice)
    }

//    private fun countUp() {
//
//
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        if (resultText.text == "Hello World!") {
//            resultText.text = "1"
//        } else {
//            var resultInt = resultText.text.toString().toInt()
//            if (resultInt < 6) {
//                resultInt++
//                resultText.text = resultInt.toString()
//            }
//
//        }
//    }
}
