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

        val fly = animals?.checkFly(false)
        val antColor = animals?.color()
        val antDimensions = animals?.dimensions(50)

        showResultFlyTextView.text = fly
        showResultColorTextView.text = antColor
        Toast.makeText(this, antDimensions, Toast.LENGTH_LONG).show()
    }

    private fun setUpDuck() {
        animals = Duck()

        val fly = animals?.checkFly(false)
        val duckColor = animals?.color()
        val duckDimensions = animals?.dimensions(50)


        showResultFlyTextView.text = fly
        showResultColorTextView.text = duckColor
        Toast.makeText(this, duckDimensions, Toast.LENGTH_LONG).show()
    }

    private fun setUpEagle() {
        animals = Eagle()

        val fly = animals?.checkFly(true)
        val eagleColor = animals?.color()
        val eagleDimensions = animals?.dimensions(100)

        showResultFlyTextView.text = fly
        showResultColorTextView.text = eagleColor
        Toast.makeText(this, eagleDimensions, Toast.LENGTH_LONG).show()
    }

    private fun setUpElephant() {
        animals = Elephant()

        val fly = animals?.checkFly(false)
        val elephantcolor = animals?.color()
        val elephantDimensions = animals?.dimensions(51)

        showResultFlyTextView.text = fly
        showResultColorTextView.text = elephantcolor
        Toast.makeText(this, elephantDimensions, Toast.LENGTH_LONG).show()
    }

    fun setUpBabyElephant() {
        animals = BabyElephant()

        val fly = animals?.checkFly(false)
        val elephantcolor = animals?.color()
        val elephantDimensions = animals?.dimensions(51)

        showResultFlyTextView.text = fly
        showResultColorTextView.text = elephantcolor
        Toast.makeText(this, elephantDimensions, Toast.LENGTH_LONG).show()

    }
}