package com.example.liskovsubstitution.animals

import com.example.liskovsubstitution.Animals

class Elephant : Animals() {

    private val colorName = "Gray"

    override fun color(): String {
        return colorName
    }

}