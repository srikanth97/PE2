package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class PowerOf4Test {
    private static PowerOf4 po;
    @BeforeClass
    public static void setup(){
        po = new PowerOf4();
    }

    @AfterClass
    public static void teardown(){
        po = null;
    }

    @Test
    public void testReverse(){
        assertFalse("reverse does not return correct values",po.power4(96));
        assertFalse("reverse does not return correct values",po.power4(1028));
        assertTrue("reverse does not return correct values",po.power4(256));
        assertFalse("reverse does not return correct values",po.power4(72));
        assertFalse("reverse does not return correct values",po.power4(0));
        assertFalse("reverse does not return correct values",po.power4(-16));
        assertFalse("reverse does not return correct values",po.power4(1));
    }
}
