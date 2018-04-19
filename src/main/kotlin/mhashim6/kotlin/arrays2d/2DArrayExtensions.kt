package mhashim6.kotlin.arrays2d

inline fun <T> Array<Array<T>>.forEach2D(action: (T) -> Unit) {
    for (array in this)
        for (item in array)
            action(item)
}

inline fun <T> Array<Array<T>>.forEachIndexed2D(action: (i: Int, j: Int, T) -> Unit) {
    for (i in 0 until this.size)
        for (j in 0 until this[i].size)
            action(i, j, this[i][j])
}

fun <T> Array<Array<T>>.withIndex2D() = IndexingIterable2D { iterator2D() }

fun <T> Array<Array<T>>.asSequence2D() = Sequence { iterator2D() }

fun <T> Array<Array<T>>.iterator2D() = Iterator2D(this)
