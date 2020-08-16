package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Chinese", "Mexican", "Japanese", "Korean")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DecideButton.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            SelectedFoodText.text = foodList[randomFood]
        }

        AddFoodButton.setOnClickListener {
            val newFood = AddFoodText.text.toString()
            foodList.add(newFood)
            AddFoodText.text.clear()
        }
    }
}