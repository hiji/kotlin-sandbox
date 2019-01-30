package com.example.conventions.step5

import com.example.conventions.step5.TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

data class MyTimeInterval(val interval: TimeInterval, val number: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeInterval: MyTimeInterval): MyDate = this.addTimeIntervals(timeInterval.interval, timeInterval.number)

operator fun TimeInterval.times(number: Int) = MyTimeInterval(this, number)

fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}