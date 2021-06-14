package com.example.liskovsubstitution.animals

import com.example.liskovsubstitution.Animals

class Duck: Animals() {

    private val colorName = "Yellow"

    override fun color(): String {
    return colorName
    }
}