package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class ReverseStringTest {
    private static ReverseString rs;
    @BeforeClass
    public static void setup(){
        rs = new ReverseString();
    }

    @AfterClass
    public static void teardown(){
        rs = null;
    }

    @Test
    public void testReverseString(){
        assertFalse("reverseString does not return correct values",
                rs.reverse("srikanth"));
        assertTrue("reverseString does not return correct values",rs.reverse("Step on no pets"));

        assertTrue("reverseString does not return correct values",rs.reverse("1234554321"));
    }
}
