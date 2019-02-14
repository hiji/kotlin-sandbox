package com.example.collections.step4

import com.example.collections.Customer
import com.example.collections.Product
import com.example.collections.Shop

// Return all products this customer has ordered
val Customer.orderedProducts: Set<Product> get() {
    return orders.flatMap { it.products }.toSet()
}

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product> get() {
    return customers.flatMap { it.orderedProducts}.toSet()
}