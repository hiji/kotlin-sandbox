package com.example.collections.step1

// products
val idea = Product("IntelliJ IDEA Ulitimate", 199.0)
val reSharper = Product("ReSharper", 149.0)
val dotTrace = Product("DotTrace", 159.0)
val dotMemory = Product("DotMemory", 129.0)

// customers
val lucas = "Lucas"
val cooper = "Cooper"
val nathan = "Nathan"

// cities
val canberra = City("Canberra")
val vancouver = City("Vancouver")

fun customer(name: String, city: City, vararg orders: Order) = Customer(name, city, orders.toList())

fun order(vararg products: Product, isDelivered: Boolean = true) = Order(products.toList(), isDelivered)

fun shop(name: String, vararg customers: Customer) = Shop(name, customers.toList())

val shop = shop("jb test shop",
        customer(lucas, canberra, order(reSharper), order(reSharper, dotMemory)),
        customer(cooper, canberra))

val customers: Map<String, Customer> = shop.customers.fold(hashMapOf<String, Customer>(), {
    map, customer ->
    map[customer.name] = customer
    map
})

val orderedProducts = setOf(idea, reSharper, dotTrace, dotMemory)

val sortedCustomers = listOf(cooper, nathan, lucas).map { customers[it] }

val groupedByCities = mapOf(
        canberra to listOf(lucas, cooper),
        vancouver to listOf(nathan)
).mapValues { it.value.map { name -> customers[name] } }