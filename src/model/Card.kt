package model

import Config.CLUBS
import Config.DIAMONDS
import Config.HEARTS
import Config.SPADES

/**
 * Created by Nezneika on 3/18/18.
 */

val cardsMap = mapOf(0 to "A", 1 to "2", 2 to "3", 3 to "4", 4 to "5", 5 to "6", 6 to "7", 7 to "8", 8 to "9", 9 to "10", 10 to "J", 11 to "Q", 12 to "K")

data class Card(val value: Int = 0, val suit: String = "", var faceUp: Boolean = false) {
//    override fun toString(): String {
//        return "${cardsMap[value]} $suit $faceUp"
//    }

    override fun toString(): String =
            if (faceUp) "${cardsMap[value]}".padEnd(2) + "${getSuitChar(suit)}" else "xxx"

    private fun getSuitChar(suit: String): String = when (suit) {
        DIAMONDS -> "\u2666"
        CLUBS -> "\u2663"
        HEARTS -> "\u2665"
        SPADES -> "\u2660"
        else -> "Unknown Suit"
    }

}

// note-1: value and suit are not changed during the game, so they are 'val, but not faceUp

// hami-todo: suit is later should be enum SUIT ? and value (~ rank) should be enum too?