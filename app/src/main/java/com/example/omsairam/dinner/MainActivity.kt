package com.example.omsairam.dinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
                                //0 1 2 3 index of list
    val foodList= arrayListOf("CHINESE","HAMBURGER","PIZZA","MCDONALDS")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())  //random food index
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener{
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
            println(foodList)
        }
    }
}
