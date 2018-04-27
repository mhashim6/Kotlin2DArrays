package mhashim6.kotlin.arrays2d

data class IndexedValue2D<out T>(var x: Int, var y: Int, val value: T)

class IndexingIterable2D<out T>(private val iteratorFactory: () -> Iterator2D<T>) : Iterable<IndexedValue2D<T>> {

    override fun iterator(): Iterator<IndexedValue2D<T>> = IndexingIterator2D(iteratorFactory.invoke())
}

class IndexingIterator2D<out T>(private val iterator: Iterator2D<T>) : Iterator<IndexedValue2D<T>> {

    override fun hasNext() = iterator.hasNext()
    override fun next() = IndexedValue2D(iterator.x, iterator.y, iterator.next())
}