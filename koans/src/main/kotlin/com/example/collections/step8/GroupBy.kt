package com.example.collections.step8

import com.example.collections.City
import com.example.collections.Customer
import com.example.collections.Shop

// Return a map of the customers living in each city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy { it.city }