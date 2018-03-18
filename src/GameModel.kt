import Config.CLUB
import Config.DIAMOND
import Config.HEART
import Config.SPADE

/**
 * Created by Nezneika on 3/18/18.
 */

class GameModel(val deck: Deck) {

    val wastePile: MutableList<Card> = mutableListOf()

    val foundationPiles = arrayOf(
            FoundationPile(DIAMOND),
            FoundationPile(HEART),
            FoundationPile(CLUB),
            FoundationPile(SPADE)
    )
}