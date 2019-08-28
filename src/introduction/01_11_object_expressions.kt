package introduction

//Add an object expression that provides a comparator to sort a list
//in a descending order using java.util.Collections class.

import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, Comparator<Int>(Int::compareTo).reversed())
    return arrayList
}