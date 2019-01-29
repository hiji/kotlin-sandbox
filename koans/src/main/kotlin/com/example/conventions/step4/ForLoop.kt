package com.example.conventions.step4

class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var current: MyDate = start.addTimeIntervals(TimeInterval.DAY, -1)
            override fun next(): MyDate {
                current = current.nextDay()
                return current
            }
            override fun hasNext() = current.nextDay() <= end
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}