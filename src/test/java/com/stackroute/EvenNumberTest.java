package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {
    private static EvenNumber en;

    @BeforeClass
    public static void setup(){
        en= new EvenNumber();
    }

    @AfterClass
    public static void teardown(){
        en = null;
    }

    @Test
    public void testMemberClass(){
        assertTrue("Please check your logic",en.isEven(24));
        assertTrue("Please check your logic",en.isEven(-24));
        assertFalse("Please check your logic",en.isEven(-27));
        assertFalse("Please Check your logic",en.isEven(33));
        assertTrue("Please  check your logic",en.isEven(0));
    }
}
