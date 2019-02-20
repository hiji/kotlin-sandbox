package com.example.collections.step11

import com.example.collections.Customer
import com.example.collections.Product
import com.example.collections.Shop

// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return orders.filter { it.isDelivered }.flatMap { it.products }.maxBy { it.price }
}

// Webサイト上では、Kotlinバージョンの不具合で、テストが通ることはないらしい
// https://github.com/Kotlin/kotlin-koans-edu/issues/13

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers.flatMap { it.orders }.flatMap { it.products }.count { product == it }
}