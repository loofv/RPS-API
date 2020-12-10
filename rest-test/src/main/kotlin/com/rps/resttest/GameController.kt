package com.rps.resttest

import org.springframework.web.bind.annotation.*

@RestController
class GameController {
    val rules = Rules()
    val handGenerator = HandGenerator()

    @PostMapping("/play")
    fun play(@RequestBody hand: Hand): GameResult {
        val computerHand = handGenerator.generateComputerHand()
        val computerHandShape = computerHand.handShape
        return GameResult(rules.getResultMessage(hand.handShape, computerHandShape), computerHandShape)
    }

}