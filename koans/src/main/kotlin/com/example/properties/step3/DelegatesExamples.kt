package com.example.properties.step3

class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}