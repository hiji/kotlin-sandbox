package com.example.collections.step6

import com.example.collections.Customer
import com.example.collections.Shop

// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> = customers.sortedBy { it.orders.size }