package com.example.liskovsubstitution.animals

import com.example.liskovsubstitution.Animals

open class Elephant : Animals() {

    private val colorName = "Gray"
    private val hugeAnimal = "I'm a huge animal"
    private val tinyAnimal = "I'm tiny"

    override fun color(): String {
        return colorName
    }
}