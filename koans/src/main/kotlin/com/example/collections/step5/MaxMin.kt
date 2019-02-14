package com.example.collections.step5

import com.example.collections.Customer
import com.example.collections.Product
import com.example.collections.Shop

// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxBy { it.orders.size }

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap { it.products}.maxBy { it.price }