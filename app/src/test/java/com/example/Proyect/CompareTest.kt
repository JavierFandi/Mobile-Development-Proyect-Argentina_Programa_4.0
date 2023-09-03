package com.example.Proyect

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class CompareTest
{
    lateinit var compare: Compare

    @Before
    fun setUp()
    {
        compare = Compare()
    }

    @Test
    fun compareNotNull()
    {
        assertNotNull(compare)
    }

    @Test
    fun compare()
    {
        assertEquals("Los textos son distintos", compare.compare("Hola", "ola"))
    }
}