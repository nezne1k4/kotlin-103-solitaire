/**
 * Created by Nezneika on 3/18/18.
 */

/*
Definition
 model.Card: 1 card of any Value of Suit
 model.Deck: a collection of 52 Cards, init orderly, but can be shuffled, drawed or reset
 model.FoundationPile: a Pile which can hold 1 specific Suit, from small Value to highest value, can be added, remove, or reset
 model.GameModel: has a deck, a wastePile, an array of 4 model.FoundationPile of 4 suits

*/

object Config {
    const val CLUBS = "Club"
    const val SPADES = "Spade"
    const val HEARTS = "Heart"
    const val DIAMONDS = "Diamond"

    const val SUIT_AMOUNT = 13

    val BLACK_SUITS = arrayOf(CLUBS, SPADES)
    val RED_SUITS = arrayOf(DIAMONDS, HEARTS)

}