package com.rps.resttest

class HandGenerator {
    fun generateComputerHand(): Hand {
        val rules = Rules()
        return Hand(rules.handShapes.random())
    }
}