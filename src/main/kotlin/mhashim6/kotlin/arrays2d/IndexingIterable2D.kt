package mhashim6.kotlin.arrays2d

class IndexingIterable2D<out T>(private val iteratorFactory: () -> Iterator2D<T>) : Iterable<IndexedValue2D<T>> {

    override fun iterator(): Iterator<IndexedValue2D<T>> = IndexingIterator2D(iteratorFactory.invoke())
}