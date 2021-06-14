package com.example.liskovsubstitution.animals.baby

import com.example.liskovsubstitution.animals.Elephant

class BabyElephant: Elephant() {

    private val colorName = "is Brown ; color isn't gray like father"

    override fun color(): String {
        return colorName
    }
}