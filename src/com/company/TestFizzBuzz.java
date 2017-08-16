package com.company;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by User on 13/8/2560.
 */
public class TestFizzBuzz {
    @Test
    public void shouldNumberMin() {
        FizzBuzz fizzbuzz = new FizzBuzz(1);
        String checkumber = fizzbuzz.checkNumber();
        assertEquals("1", checkumber);
    }

    @Test
    public void shouldNumberMix() {
        FizzBuzz fizzbuzz = new FizzBuzz(100);
        String checknumber = fizzbuzz.checkNumber();
        assertEquals("Buzz", checknumber);
    }

    @Test
    public void shouldNumberMid() {
        FizzBuzz fizzbuzz = new FizzBuzz(50);
        String checknumber = fizzbuzz.checkNumber();
        assertEquals("Buzz", checknumber);
    }

    @Test
    public void shouldBeFIZZ() {
        FizzBuzz fizzbuzz = new FizzBuzz(3);
        String checknumber = fizzbuzz.checkNumber();
        assertEquals("Fizz", checknumber);
    }

    @Test
    public void shouldBeBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        String checknumber = fizzBuzz.checkNumber();
        assertEquals("Buzz", checknumber);
    }

    @Test
    public void shouldBeSIX() {
        FizzBuzz fizzBuzz = new FizzBuzz(6);
        String checknumber = fizzBuzz.checkNumber();
        assertEquals("Fizz", checknumber);
    }

    @Test
    public void shouldBeTEN() {
        FizzBuzz fizzBuzz = new FizzBuzz(10);
        String checknumber = fizzBuzz.checkNumber();
        assertEquals("Buzz", checknumber);
    }

    @Test
    public void shouldFIZZBUZZ() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        String checknumber = fizzBuzz.checkNumber();
        assertEquals("FizzBuzz",checknumber);
    }
}
