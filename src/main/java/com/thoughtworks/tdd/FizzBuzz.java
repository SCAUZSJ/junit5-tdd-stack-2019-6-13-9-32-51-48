package com.thoughtworks.tdd;

public class FizzBuzz {
    public String convert(int num){
        if(num % 3 == 2 ) return "Fizz";
        return String.valueOf(num);
    }
}
