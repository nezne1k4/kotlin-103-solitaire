/**
 * Created by Nezneika on 3/18/18.
 */

fun main(args: Array<String>) {
    logg("Kotlin 103 application to create a Solitaires deck!")

    val card = Card()
    log(card)

    logg("IRnit the deck")
    val deck = Deck()
    // list up all cards in the deck
    deck.cards.forEach { log(it) }
}

fun log(string: Any) {
    println(string)
}

fun logg(string: Any) {
    println()
    println(string)
}