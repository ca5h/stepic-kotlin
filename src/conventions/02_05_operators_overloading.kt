package conventions

//Implement a kind of date arithmetic. Support adding years, weeks and days to a date.
// You could be able to write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.

import conventions.TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval) = addTimeIntervals(timeInterval, 1)
//fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
//
//}

class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)
operator fun TimeInterval.times(i: Int): TimeInterval =  RepeatedTimeInterval(this, number)
operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)


fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}



