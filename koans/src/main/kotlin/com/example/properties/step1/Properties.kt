package com.example.properties.step1

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(v: Int?) {
            field = v
            counter++
        }
}