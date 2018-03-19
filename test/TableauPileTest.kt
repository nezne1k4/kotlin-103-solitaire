import model.Suits.CLUBS
import model.Suits.SPADES
import model.Suits.HEARTS
import model.Card
import model.TableauPile
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Nezneika on 3/19/18.
 */
class TableauPileTest {
    @Test
    fun addCards_addable() {
        // arrange
        val tableauPile = TableauPile(mutableListOf(Card(12, SPADES)))
        val cards = mutableListOf(Card(11, HEARTS))

        // act
        tableauPile.addCards(cards)

        // assert
        assertEquals(2, tableauPile.cards.size)
    }

    @Test
    fun addCards_notAddable() {
        // arrange
        val tableauPile = TableauPile(mutableListOf(Card(12, SPADES)))
        val cards = mutableListOf(Card(11, CLUBS))

        // act
        tableauPile.addCards(cards)

        // assert
        assertEquals(1, tableauPile.cards.size)
    }

    @Test
    fun removeCards() {
    }

}