package com.example.dice

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.dice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val dice1 = binding.dice1
        val dice2 = binding.dice2

        binding.diceStartBtn.setOnClickListener {

            Toast.makeText(this, "주사위 굴러가유~", Toast.LENGTH_LONG).show()

            val i = Random.nextInt(1, 7)
            val j = Random.nextInt(1, 7)

            if (i == 1) {
                dice1.setImageResource(R.drawable.dice_1)
            } else if (i == 2) {
                dice1.setImageResource(R.drawable.dice_2)
            } else if (i == 3) {
                dice1.setImageResource(R.drawable.dice_3)
            } else if (i == 4) {
                dice1.setImageResource(R.drawable.dice_4)
            } else if (i == 5) {
                dice1.setImageResource(R.drawable.dice_5)
            } else if (i == 6) {
                dice1.setImageResource(R.drawable.dice_6)
            }

            if (j == 1) {
                dice2.setImageResource(R.drawable.dice_1)
            } else if (j == 2) {
                dice2.setImageResource(R.drawable.dice_2)
            } else if (j == 3) {
                dice2.setImageResource(R.drawable.dice_3)
            } else if (j == 4) {
                dice2.setImageResource(R.drawable.dice_4)
            } else if (j == 5) {
                dice2.setImageResource(R.drawable.dice_5)
            } else if (j == 6) {
                dice2.setImageResource(R.drawable.dice_6)
            }
        }
    }
}