package mhashim6.kotlin.arrays2d

class Iterator2D<out T>(private val items: Array<Array<T>>) : Iterator<T> {

    private val xLimit = items.size
    private val yLimit = items[0].size

    var x: Int = 0
    var y: Int = 0

    override fun next(): T {
        val next = items[x][y++]

        if (y == yLimit) {
            x++
            y = 0
        }
        return next
    }

    override fun hasNext(): Boolean = x < xLimit

}