package com.rps.resttest

class Rules {
    private val ROCK = "ROCK"
    private val PAPER = "PAPER"
    private val SCISSORS = "SCISSORS"
    private val ERROR_INVALID_HAND_TYPE = "That doesn't look like a hand. Try again!"
    private val WIN_MESSAGE = "WIN"
    private val LOSS_MESSAGE = "LOSS"
    private val TIE_MESSAGE = "TIE"
    val handShapes = listOf<String>(ROCK, PAPER, SCISSORS)


    fun getResultMessage(playerHand: String, computerHand: String): String {
        if (!handShapes.contains(playerHand) || !handShapes.contains(computerHand)) {
            return ERROR_INVALID_HAND_TYPE
        } else if (playerHand == ROCK && computerHand == SCISSORS) {
            return WIN_MESSAGE
        } else if (playerHand == PAPER && computerHand == ROCK) {
            return WIN_MESSAGE
        } else if (playerHand == SCISSORS && computerHand == PAPER) {
            return WIN_MESSAGE
        } else if (playerHand == computerHand) {
            return TIE_MESSAGE
        } else {
            return LOSS_MESSAGE
        }
    }
}