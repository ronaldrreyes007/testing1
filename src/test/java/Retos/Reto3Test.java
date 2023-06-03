package Retos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Reto3Test {



    @Test
    public void arabicToRoman1(){
        Assert.assertEquals("CD",Reto3.arabicToRoman(400));
    }

    @Test
    public void arabicToRoman2(){
        Assert.assertEquals("CM",Reto3.arabicToRoman(900));
    }
    @Test
    public void arabicToRoman3(){
        Assert.assertEquals("XIX",Reto3.arabicToRoman(19));
    }

}