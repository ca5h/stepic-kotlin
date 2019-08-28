package introduction

//change object expression from 1.11 to lambda
import java.util.*

fun getListSam(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y.compareTo(x) })
    return arrayList
}