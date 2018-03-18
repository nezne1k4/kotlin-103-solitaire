/**
 * Created by Nezneika on 3/18/18.
 */

data class Card(val value: Int = 0, val suit: String = "", var faceUp: Boolean = false)

// note-1: value and suit are not changed during the game, so they are 'val, but not faceUp

// hami-todo: suit is later should be enum SUIT ? and value (~ rank) should be enum too?