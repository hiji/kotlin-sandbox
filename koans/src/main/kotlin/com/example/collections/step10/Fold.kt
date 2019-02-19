package com.example.collections.step10

import com.example.collections.Product
import com.example.collections.Shop

// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val set = customers.first().orders.flatMap { it.products }.toSet()
    return customers.fold(set) { acc, e ->
        val products = e.orders.flatMap { it.products }.toSet()
        set.filter { products.contains(it) }.toSet()
    }

//    [Show answer]
//    val allProducts = customers.flatMap { it.orders.flatMap { it.products }}.toSet()
//    return customers.fold(allProducts, {
//        orderedByAll, customer ->
//        orderedByAll.intersect(customer.orders.flatMap { it.products }.toSet())
//    })
}