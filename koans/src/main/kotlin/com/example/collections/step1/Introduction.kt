package com.example.collections.step1

import com.example.collections.Customer
import com.example.collections.Shop

fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet()