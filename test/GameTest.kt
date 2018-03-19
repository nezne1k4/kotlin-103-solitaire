import model.GameModel
import org.junit.Test

class GameTest {

    @Test
    fun kingInFirstFoundationPile() {
        // arrange
        var numGames = 0
        val maxGames = 10000

        // act
        for (i in 1..maxGames) {
            numGames++
            GameModel.resetGame()

            // each game has limited steps of 100 or 500 or any
            for (j in 1..500) {
                GamePresenter.onDeckTap()
                GamePresenter.onWasteTap()
                GameModel.tableauPiles.forEachIndexed { index, tableauPile ->
                    GamePresenter.onTableauTap(index, tableauPile.cards.lastIndex)
                }
            }
            if (GameModel.foundationPiles[0].cards.size == 13) {
                break
            }
        }

        // assert
        GameModel.debugPrint()
        println("# Games: $numGames")
        assert(numGames < maxGames)
    }
}