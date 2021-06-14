package com.example.liskovsubstitution.animals

import com.example.liskovsubstitution.Animals

class Ant: Animals() {

    private val colorName = "Black"

    override fun color(): String {
        return colorName
    }
}