package conventions

//Add a method fun contains(d: MyDate) to the class DateRange to allow in checks with a range of dates.

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(item: MyDate): Boolean = item in start..endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}