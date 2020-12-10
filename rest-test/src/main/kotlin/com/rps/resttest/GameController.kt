package com.rps.resttest

import org.springframework.web.bind.annotation.*

@RestController
class GameController {
    var rules = Rules()
    @RequestMapping("/")
    fun home(): String {
        return "Welcome players!"
    }

    @GetMapping("/playold")
    fun playold(@RequestParam(value = "handType", defaultValue = "Rock") handType: String): Hand {
        return Hand(handType)
    }

    @PostMapping("/play")
    fun play(@RequestBody hand: Hand): GameResult{
        val computerHand = generateComputerHand()
        return GameResult(rules.getResultMessage(hand.handShape, computerHand.handShape), computerHand.handShape)
    }

    fun generateComputerHand(): Hand {
        return Hand(rules.handShapes.random())
    }
}