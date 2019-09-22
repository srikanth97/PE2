package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class FactorialTest {
    private static Factorial fa;
    @BeforeClass
    public static void setup(){
        fa = new Factorial();
    }

    @AfterClass
    public static void teardown(){
        fa = null;
    }

    @Test
    public void testFactorial(){
       assertEquals("Factorial didnot return correct value",1,fa.factorial(0));
       assertEquals("Factorial didnot return correct value",120,fa.factorial(5));
       assertEquals("Factorial didnot return correct value",479001600,fa.factorial(12));
       assertEquals("Factorial didnot return correct value",87178291200l,fa.longFactorial(14));
       assertEquals("Negative numbers cannot have factorial",-1,fa.factorial(-10));
    }
}
