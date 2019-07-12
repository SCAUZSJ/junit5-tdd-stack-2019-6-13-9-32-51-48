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

}
