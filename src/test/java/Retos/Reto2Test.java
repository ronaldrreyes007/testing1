package Retos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Reto2Test {

    @Test
    public void if_number_is_divisible_by_3(){
        Assert.assertEquals("Fizz",Reto2.fizzBuzz(3));
    }
    @Test
    public void if_number_is_divisible_by_6(){
        Assert.assertEquals("Fizz",Reto2.fizzBuzz(6));
    }
    @Test
    public void if_number_is_divisible_by_5(){
        Assert.assertEquals("Buzz",Reto2.fizzBuzz(5));
    }
    @Test
    public void if_number_is_divisible_by_10(){
        Assert.assertEquals("Buzz",Reto2.fizzBuzz(10));
    }
    @Test
    public void if_number_is_divisible_by_3_and_5(){
        Assert.assertEquals("FizzBuzz",Reto2.fizzBuzz(30));
    }

    @Test
    public void other_case_return_same_number(){
        Assert.assertEquals("31",Reto2.fizzBuzz(31));
    }

}