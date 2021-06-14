package com.example.liskovsubstitution


abstract class Animals {

    private val canfly = "i can fly :)"
    private val cannotfly = "sorry i cannot fly :/"


    abstract fun color(): String

    fun dimensions(size: Int) {
        when (size) {
            in 1..50 -> {}
            in 51..100 -> {}
//            else ->
        }
    }

    fun checkFly(fly: Boolean): String {
        if (fly)
            return canfly
        else
            return cannotfly
    }
}