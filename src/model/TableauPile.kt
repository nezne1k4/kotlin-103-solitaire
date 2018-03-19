package model

import Config.BLACK_SUITS
import Config.RED_SUITS

/**
 * Created by Nezneika on 3/18/18.
 */

class TableauPile(var cards: MutableList<Card> = mutableListOf()) {

    init {
        // all last card in a model.TableauPile is faceUp
        if (cards.size > 0)
            cards.last().faceUp = true
    }

    /**
     * Move card from another model.TableauPile to this model.TableauPile
     */
    fun addCards(newCards: MutableList<Card>): Boolean {
        if (cards.size > 0) {
            if (newCards.first().value == cards.last().value - 1 &&
                    suitCheck(newCards.first(), cards.last())) {
                cards.addAll(newCards)
                return true
            }
        } else if (newCards.first().value == 12) {
            // If card is K, then auto move in
            cards.addAll(newCards)
            return true
        }
        return false
    }

    fun removeCards(tappedIndex: Int) {
        // remove a list of cards in the model.TableauPile
        // of course, the condition for tappedIndex is that the faceUp = true, needed check before calling removeCards()
        for (i in tappedIndex..cards.lastIndex) {
            //cards.removeAt(i)
            cards.removeAt(tappedIndex)
        }
        // last card auto turn the face up
        if (cards.size > 0) {
            cards.last().faceUp = true
        }
    }

    /**
     * Check suit of 2 cards, if 2 cards in different red suits or black suits then they are OK to match
     */
    private fun suitCheck(c1: Card, c2: Card): Boolean {
        return (RED_SUITS.contains(c1.suit) && BLACK_SUITS.contains(c2.suit)) ||
                (RED_SUITS.contains(c2.suit) && BLACK_SUITS.contains(c1.suit))
    }

}