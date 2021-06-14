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
        }
    }

    private fun setUpAnt() {
        animals = Ant()

        val fly = animals?.checkFly(false)
        val antColor = animals?.color()

        showResultFlyTextView.text = fly
        showResultColorTextView.text = antColor
    }

    private fun setUpDuck() {
        animals = Duck()

        val fly = animals?.checkFly(false)
        val duckColor = animals?.color()

        showResultFlyTextView.text = fly
        showResultColorTextView.text = duckColor
    }

    private fun setUpEagle() {
        animals = Eagle()

        val fly = animals?.checkFly(true)
        val eagleColor = animals?.color()

        showResultFlyTextView.text = fly
        showResultColorTextView.text = eagleColor
    }

    private fun setUpElephant() {
        animals = Elephant()

        val fly = animals?.checkFly(false)
        val elephantcolor = animals?.color()

        showResultFlyTextView.text = fly
        showResultColorTextView.text = elephantcolor
    }
}