package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

import java.security.PrivilegedActionException;

public class StringUtilTest {
    //cUANDO HACEMOS TEST NO ES NECESARIO EL MAIN
    //public static void main(String[] args) {
    @Test
    public void testRepeatStringOnce(){
        Assert.assertEquals("hola",StringUtil.repeat("hola", 1) );
    }
    @Test
    public void testRepeatStringMultipleTimes(){
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola", 3) );
    }
    @Test
    public void testRepeatStringZeroTimes(){
        Assert.assertEquals("",StringUtil.repeat("hola", 0) );
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRepeatStringNegativeTimes(){
      StringUtil.repeat("hola", -1) ;
    }

    //Borramos por que ya vienen incluidas en las librerias de Junit
    /*private static void assertEquals(String actual, String expected) {

        if (!actual.equals(expected)) {
            throw new RuntimeException(actual + " is not equal to expected p" + expected);
        }
    }*/
}