

# Kotlin2DArrays
First-class support for operations on 2D-Arrays in Kotlin

[![](https://jitpack.io/v/mhashim6/Kotlin2DArrays.svg)](https://jitpack.io/#mhashim6/Kotlin2DArrays)

## Usage:
examples from [2048-OOP Game](https://github.com/mhashim6/2048-OOP):

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
 - Other supported operations:
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
    implementation 'com.github.mhashim6:Kotlin2DArrays:1.0.0'
}
```