package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void hello_world_test() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 1;
        //when
        String result = fizzBuzz.convert(1);
        //then
        Assertions.assertEquals("1",result);

    }
}
