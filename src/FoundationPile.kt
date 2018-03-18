/**
 * Created by Nezneika on 3/18/18.
 */

class FoundationPile(val suit: String) {
    val cards: MutableList<Card> = mutableListOf()

    fun reset() {
        cards.clear()
    }

    fun removeCard(card: Card) {
        cards.remove(card)
    }

    fun addCard(card: Card): Boolean {
        // assume there is no card in pile yet
        val nextValue = if (cards.size > 0) cards.last().value + 1 else 0

        // check the condition a add a card to a pile
        // condition 1: same suit
        // condition 2: incoming card value = last card + 1
        if (card.suit == suit && card.value == nextValue) {
            cards.add(card)
            return true
        }
        return false
    }

}