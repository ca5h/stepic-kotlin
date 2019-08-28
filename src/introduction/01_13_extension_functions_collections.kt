package introduction

//change 1.12 to using extension function from Kotlin STL

fun getListKotlinExt(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()
}
