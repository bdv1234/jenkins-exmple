package com.devzigma;

import org.junit.jupiter.api.*;

class FizzBuzzTest {

    public FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @DisplayName("Play FizzBuz with number = 1")
    @Test
    public void testNumber() {
        String fizzBuzz = this.fizzBuzz.play(1);
        Assertions.assertEquals(fizzBuzz, "1");
    }

    @DisplayName("Play FizzBuzz with number = 3")
    @Test
    public void testFizz() {
        String fizzBuzz = this.fizzBuzz.play(3);
        Assertions.assertEquals(fizzBuzz, "Fizz");
    }

    @DisplayName("Play FizzBuzz with number = 5")
    @Test
    public void testBuzz() {
        String fizzBuzz = this.fizzBuzz.play(5);
        Assertions.assertEquals(fizzBuzz, "Buzz");
    }

    @DisplayName("Don't Play FizzBuzz with number = 0")
    @Test
    public void testZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> this.fizzBuzz.play(0));
    }

    @AfterEach
    public void tearDown() {
        this.fizzBuzz = null;
    }
}