package com.example

class Introduction {
    // Hello, world!
    fun start(): String = "OK"

    // Named arguments
    fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")

    // Default arguments
    fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
            (if (toUpperCase) name.toUpperCase() else name) + number

    fun useFoo() = listOf(
            foo("a"),
            foo("b", number = 1),
            foo("c", toUpperCase = true),
            foo(name = "d", number = 2, toUpperCase = true)
    )

    // Lambdas
    fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }

    // Strings
    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

    fun getPattern(): String = """\d{2} ${month} \d{4}"""

    // Data classes
    data class Person (val name: String, val age: Int)

    fun getPeople(): List<Person> {
        return listOf(Person("Alice", 29), Person("Bob", 31))
    }

    // Nullable types
    fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
        val email = client?.personalInfo?.email
        if (email != null && message != null) {
            mailer.sendMessage(email, message)
        }
    }

    class Client (val personalInfo: PersonalInfo?)
    class PersonalInfo (val email: String?)
    interface Mailer {
        fun sendMessage(email: String, message: String)
    }

    // SmartCast
    fun eval(expr: Expr): Int =
            when (expr) {
                is Num -> expr.value
                is Sum -> eval(expr.left) + eval(expr.right)
                else -> throw IllegalArgumentException("Unknown expression")
            }

    interface Expr
    class Num(val value: Int) : Expr
    class Sum(val left: Expr, val right: Expr) : Expr
}