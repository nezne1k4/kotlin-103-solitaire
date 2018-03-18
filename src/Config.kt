/**
 * Created by Nezneika on 3/18/18.
 */

/*
Definition
 Card: 1 card of any Value of Suit
 Deck: a collection of 52 Cards, init orderly, but can be shuffled, drawed or reset
 FoundationPile: a Pile which can hold 1 specific Suit, from small Value to highest value, can be added, remove, or reset
 GameModel: has a deck, a wastePile, an array of 4 FoundationPile of 4 suits

*/

object Config {
    val CLUB = "Club"
    val DIAMOND = "Diamond"
    val HEART = "Heart"
    val SPADE = "Spade"
}