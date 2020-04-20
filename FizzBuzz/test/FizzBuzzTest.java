import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("Test with 10")
    void testToString() {
        FizzBuzz fizzBuzz = new FizzBuzz(10);
        String result = fizzBuzz.toString();
        String expected = "Buzz";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test with 15")
    void testToString2() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        String result = fizzBuzz.toString();
        String expected = "FizzBuzz";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test with 9")
    void testToString3() {
        FizzBuzz fizzBuzz = new FizzBuzz(9);
        String result = fizzBuzz.toString();
        String expected = "Fizz";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test with 7")
    void testToString4() {
        FizzBuzz fizzBuzz = new FizzBuzz(7);
        String result = fizzBuzz.toString();
        String expected = "0";
        assertEquals(expected,result);
    }
}