import model.Card
import model.Deck
import model.GameModel
import model.Suits

/**
 * Created by Nezneika on 3/18/18.
 */

fun main(args: Array<String>) {
    logg("Kotlin 103 application to create a Solitaires deck!")

    botPlaysGame()

    //testClassObject()
}

fun botPlaysGame() {

    GameModel.resetGame()
    for (j in 1..1000) {
        GamePresenter.onDeckTap()
        GamePresenter.onWasteTap()
        GameModel.tableauPiles.forEachIndexed { index, tableauPile ->
            GamePresenter.onTableauTap(index, tableauPile.cards.lastIndex)
        }
        // print deck for each step
        GameModel.debugPrint()
    }
}

fun testClassObject() {
    val card = Card(suit = Suits.CLUBS)
    log(card)

    logg("Init the deck")
    val deck = Deck()
    // list up all cards in the deck
    deck.cards.forEach { log(it) }

    logg("shuffle the deck")
    deck.shuffle().forEach { log(it) }

    logg("reset the deck")
    deck.reset().forEach { log(it) }

    GameModel.resetGame()
    GamePresenter.onDeckTap()
    GameModel.debugPrint()
}

fun log(string: Any) {
    println(string)
}

fun logg(string: Any) {
    println()
    println(string)
}