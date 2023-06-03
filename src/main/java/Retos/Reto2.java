package Retos;

public class Reto2 {

    public static String fizzBuzz(int n) {

        if(n % 3 == 0 && n % 5 ==0){
            return "FizzBuzz";
        }
        if(n % 3 == 0 || n % 6 == 0){
            return "Fizz";
        }
        if(n % 5 == 0 || n % 10 ==0){
            return "Buzz";
        }
     return   String.valueOf(n);
    }
}
