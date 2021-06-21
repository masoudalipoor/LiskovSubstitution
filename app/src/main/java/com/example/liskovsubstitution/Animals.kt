package com.example.liskovsubstitution


abstract class Animals {

    private val canfly = "i can fly :)"
    private val cannotfly = "sorry i cannot fly :/"
    private lateinit var resultSize: String


    abstract fun color(): String 

    fun dimensions(weight: Int): String {
        when (weight) {
            in 1..50 -> {resultSize = "i'm tiny"}
            in 51..100 -> {resultSize = "i'm a huge animal"}
        }
        return resultSize
    }

    fun checkFly(fly: Boolean): String {
        if (fly)
            return canfly
        else
            return cannotfly
    }
}