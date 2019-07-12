package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void return_1_when_num_is_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 1;
        //when
        String result = fizzBuzz.convert(num);
        //then
        Assertions.assertEquals("1",result);
    }
    @Test
    public void return_2_when_num_is_2() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 2;
        //when
        String result = fizzBuzz.convert(num);
        //then
        Assertions.assertEquals("2",result);
    }

    @Test
    public void return_fizz_when_num_is_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 3;
        //when
        String result = fizzBuzz.convert(num);
        //then
        Assertions.assertEquals("Fizz",result);
    }

    @Test
    public void return_fizz_when_num_is_6() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 6;
        //when
        String result = fizzBuzz.convert(num);
        //then
        Assertions.assertEquals("Fizz",result);
    }

    @Test
    public void return_buzz_when_num_is_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 5;
        //when
        String result = fizzBuzz.convert(num);
        //then
        Assertions.assertEquals("Buzz",result);
    }

    @Test
    public void return_buzz_when_num_is_10() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 10;
        //when
        String result = fizzBuzz.convert(num);
        //then
        Assertions.assertEquals("Buzz",result);
    }

    @Test
    public void return_whizz_when_num_is_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 7;
        //when
        String result = fizzBuzz.convert(num);
        //then
        Assertions.assertEquals("Whizz",result);
    }

    @Test
    public void return_whizz_when_num_is_14() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 14;
        //when
        String result = fizzBuzz.convert(num);
        //then
        Assertions.assertEquals("Whizz",result);
    }

    @Test
    public void return_whizz_when_num_is_15() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 15;
        //when
        String result = fizzBuzz.convert(num);
        //then
        Assertions.assertEquals("FizzBuzz",result);
    }

    @Test
    public void return_whizz_when_num_is_21() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 21;
        //when
        String result = fizzBuzz.convert(num);
        //then
        Assertions.assertEquals("FizzWhizz",result);
    }
}
