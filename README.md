
# Kotlin2DArrays
First-class support for 2D-Arrays in Kotlin
## Usage:
examples from [2048-OOP Game](https://github.com/mhashim6/2048-OOP):

 - Array<Array<*>>#asSequence2D:
```kotlin
private val filledPositions: MutableList<Position>  
    get() = gridOfTiles.asSequence2D()  
            .filter { it != null }  
            .map { it!!.position }  
            .toMutableList()
```
 - Array<Array<*>>#withIndex2D:
```kotlin
private val emptySpaces: List<Position>  
    get() = gridOfTiles.withIndex2D()  
            .asSequence()  
            .filter { it.value == null }  
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

