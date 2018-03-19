import Config.CLUBS
import Config.DIAMONDS
import Config.HEARTS
import Config.SPADES

/**
 * Created by Nezneika on 3/18/18.
 */

class GameModel(val deck: Deck) {

    val wastePile: MutableList<Card> = mutableListOf()

    val foundationPiles = arrayOf(
            FoundationPile(DIAMONDS),
            FoundationPile(HEARTS),
            FoundationPile(CLUBS),
            FoundationPile(SPADES)
    )

    val tableauPiles = Array(7, { TableauPile() })

}