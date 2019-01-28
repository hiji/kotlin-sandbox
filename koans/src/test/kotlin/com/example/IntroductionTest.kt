package com.example

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IntroductionTest {

    @Test
    fun startTest() {
        assertEquals("OK", Introduction().start())
    }

    @Test
    fun joinOptionsTest() {
        assertEquals("[a, b, c]", Introduction().joinOptions(listOf("a", "b", "c")))
    }

    @Test
    fun useFooTest() {
        assertEquals(listOf("a42", "b1", "C42", "D2"), Introduction().useFoo())
    }

    @Test
    fun containsEvenTest() {
        assertTrue(Introduction().containsEven(listOf(1, 2, 3)))
        assertFalse(Introduction().containsEven(listOf(1, 3)))
    }

    @Test
    fun getPeopleTest() {
        val actual = Introduction().getPeople()
        assertEquals("Alice", actual[0].name)
        assertEquals(29, actual[0].age)
    }
}