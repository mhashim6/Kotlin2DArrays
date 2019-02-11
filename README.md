
# Kotlin2DArrays
First-class support for operations on 2D-Arrays in Kotlin

## ~~Update:~~
~~I just noticed that `flatMap` is a far more flexible and powerful solution, it makes this library completely redundant. in fact, don't even continue reading this file, head over to `flatMap`'s [documentation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/flat-map.html) instead.~~

---

[![](https://jitpack.io/v/mhashim6/Kotlin2DArrays.svg)](https://jitpack.io/#mhashim6/Kotlin2DArrays)

## Usage:
examples from [2048-OOP Game](https://github.com/mhashim6/2048-OOP):

 - matrix(row: Int, col: Int, itemFactory: (i: Int, j: Int) -> T): Array<Array<T>>
```kotlin
val emptyMatrix = matrix<Tile>(4, 4) { i, j ->
    EmptyTile.apply { position = Position(i, j) }
    }
```
 - Array<Array<*>>#asSequence2D:
```kotlin
private val filledPositions: MutableList<Position>
    get() = grid.asSequence2D()
            .filter { it !== EmptyTile }
            .map { it.position }
            .toMutableList()
```
 - Array<Array<*>>#withIndex2D:
```kotlin
private val emptySpaces: List<Position>
    get() = grid.withIndex2D()
            .asSequence()
            .filter { it.value === EmptyTile }
            .map { Position(it.x, it.y) }
            .toList()
```
 - Other supported operations/functions:
```kotlin
 - forEach2D(action: (T) -> Unit)
 - forEachIndexed2D(action: (i: Int, j: Int, T) -> Unit)
 ```

## Dependency:
Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
    repositories {
    ...
    maven { url 'https://jitpack.io' }
    }
}
```
Add the dependency:
```groovy
dependencies {
    implementation 'com.github.mhashim6:Kotlin2DArrays:1.0.1'
}
```
