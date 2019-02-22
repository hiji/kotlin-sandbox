package com.example.properties.step2

class LazyProperty(val initializer: () -> Int, lazy: Int) {

    var value: Int? = null

    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }
            return value!!
        }
}