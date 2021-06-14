package com.example.liskovsubstitution.animals

import com.example.liskovsubstitution.Animals

class Eagle: Animals() {

    private val colorName = "Black & White"

    override fun color(): String {
        return colorName
    }

}