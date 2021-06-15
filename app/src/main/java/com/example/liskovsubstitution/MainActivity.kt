package com.example.liskovsubstitution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import com.example.liskovsubstitution.animals.Ant
import com.example.liskovsubstitution.animals.Duck
import com.example.liskovsubstitution.animals.Eagle
import com.example.liskovsubstitution.animals.Elephant
import com.example.liskovsubstitution.animals.baby.BabyElephant
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var animals: Animals? = null
    var fly: String? = null
    var animalsColor: String? = null
    var animalsDimensions: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        antButton.setOnClickListener(this)
        duckButton.setOnClickListener(this)
        eagleButton.setOnClickListener(this)
        elephantButton.setOnClickListener(this)
        babyElephantButton.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.antButton -> {
                setUpAnt()
            }

            R.id.duckButton -> {
                setUpDuck()
            }

            R.id.eagleButton -> {
                setUpEagle()
            }

            R.id.elephantButton -> {
                setUpElephant()
            }

            R.id.babyElephantButton -> {
                setUpBabyElephant()
            }
        }
    }

    private fun setUpAnt() {
        animals = Ant()

        fly = animals?.checkFly(false)
        animalsColor = animals?.color()
        animalsDimensions = animals?.dimensions(50)

        showResultFlyTextView.text = fly
        showResultColorTextView.text = animalsColor
        Toast.makeText(this, animalsDimensions, Toast.LENGTH_LONG).show()
    }

    private fun setUpDuck() {
        animals = Duck()

        fly = animals?.checkFly(false)
        animalsColor = animals?.color()
        animalsDimensions = animals?.dimensions(50)


        showResultFlyTextView.text = fly
        showResultColorTextView.text = animalsColor
        Toast.makeText(this, animalsDimensions, Toast.LENGTH_LONG).show()
    }

    private fun setUpEagle() {
        animals = Eagle()

        fly = animals?.checkFly(true)
        animalsColor = animals?.color()
        animalsDimensions = animals?.dimensions(100)

        showResultFlyTextView.text = fly
        showResultColorTextView.text = animalsColor
        Toast.makeText(this, animalsDimensions, Toast.LENGTH_LONG).show()
    }

    private fun setUpElephant() {
        animals = Elephant()

        fly = animals?.checkFly(false)
        animalsColor = animals?.color()
        animalsDimensions = animals?.dimensions(51)

        showResultFlyTextView.text = fly
        showResultColorTextView.text = animalsColor
        Toast.makeText(this, animalsDimensions, Toast.LENGTH_LONG).show()
    }

    fun setUpBabyElephant() {
        animals = BabyElephant()

        fly = animals?.checkFly(false)
        animalsColor = animals?.color()
        animalsDimensions = animals?.dimensions(51)

        showResultFlyTextView.text = fly
        showResultColorTextView.text = animalsColor
        Toast.makeText(this, animalsDimensions, Toast.LENGTH_LONG).show()

    }
}