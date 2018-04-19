package mhashim6.kotlin.arrays2d

class IndexingIterator2D<out T>(private val iterator: Iterator2D<T>) : Iterator<IndexedValue2D<T>> {

    override fun hasNext() = iterator.hasNext()
    override fun next() = IndexedValue2D(iterator.x, iterator.y, iterator.next())
}