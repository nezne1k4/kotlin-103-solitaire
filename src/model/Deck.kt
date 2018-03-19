package model

import Config.CLUBS
import Config.DIAMONDS
import Config.HEARTS
import Config.SPADES
import Config.SUIT_AMOUNT

/**
 * Created by Nezneika on 3/18/18.
 */

// model.Deck is a collection of 52 specific cards

class Deck {

    // define the cards with lambda expression
    val cards: Array<Card> = Array(52, { Card(it % SUIT_AMOUNT, getSuit(it)) })

    private fun getSuit(i: Int) = when (i / SUIT_AMOUNT) {
        0 -> CLUBS
        1 -> DIAMONDS
        2 -> HEARTS
        else -> SPADES
    }

    // card left in deck which will be draw out
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    /**
     * Remove a model.Card from model.Deck and throw it to User / model.TableauPile
     */
    fun drawCard(): Card = cardsInDeck.removeAt(0)

    /**
     * reset the deck with 52 cards and shuffle for ready to play
     */
    fun reset(): MutableList<Card> {
        cardsInDeck = cards.toMutableList()
        cardsInDeck.forEach { it.faceUp = false }
        return shuffle()
    }

    /**
     * Shuffle the collection for random order
     */
    fun shuffle(): MutableList<Card> {
        cardsInDeck.shuffle()
        return cardsInDeck
    }


//    val cards: Array<model.Card> = Array(52,
//            // use anonymous function
//            fun(i: Int): model.Card {
//                val value = i % suitValue
//                val suit = when(i/suitValue) {
//                    0 -> "Club"
//                    1 -> "Diamond"
//                    2 -> "Heart"
//                    else -> "Spade"
//                }
//                return model.Card(value, suit)
//            }
//    )
}