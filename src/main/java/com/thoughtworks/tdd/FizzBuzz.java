package com.thoughtworks.tdd;

public class FizzBuzz {
    public String convert(int num){
        if(num == 7) return "Whizz";
        if(num % 5 == 0) return "Buzz";
        if(num % 3 == 0 ) return "Fizz";
        return String.valueOf(num);
    }
}
