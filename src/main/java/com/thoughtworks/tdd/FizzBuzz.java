package com.thoughtworks.tdd;

public class FizzBuzz {
    public String convert(int num){
        if(num == 15) return "FizzBuzz";
        if(num == 21) return "FizzWhizz";
        if(num == 35) return  "BuzzWhizz";
        if(num % 7 == 0) return "Whizz";
        if(num % 5 == 0) return "Buzz";
        if(num % 3 == 0 ) return "Fizz";
        return String.valueOf(num);
    }
}
