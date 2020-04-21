import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("Test with 28-2-2020")
    void nextDayOf28_2_2020() {
        int day = 28;
        int month = 2;
        int year = 2020;
        int expectedDay = 29;
        int expectedMonth = 2;
        int expectedYear = 2020;
        NextDayCalculator.nextDay(day,month,year);
        assertEquals(expectedDay,NextDayCalculator.getDay());
        assertEquals(expectedMonth,NextDayCalculator.getMonth());
        assertEquals(expectedYear,NextDayCalculator.getYear());
    }
    @Test
    @DisplayName("Test with 29-2-2020")
    void nextDayOf29_2_2020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        int expectedDay = 1;
        int expectedMonth = 3;
        int expectedYear = 2020;
        NextDayCalculator.nextDay(day,month,year);
        assertEquals(expectedDay,NextDayCalculator.getDay());
        assertEquals(expectedMonth,NextDayCalculator.getMonth());
        assertEquals(expectedYear,NextDayCalculator.getYear());
    }
    @Test
    @DisplayName("Test with 28-2-2018")
    void nextDayOf28_2_2018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 3;
        int expectedYear = 2018;
        NextDayCalculator.nextDay(day,month,year);
        assertEquals(expectedDay,NextDayCalculator.getDay());
        assertEquals(expectedMonth,NextDayCalculator.getMonth());
        assertEquals(expectedYear,NextDayCalculator.getYear());
    }
    @Test
    @DisplayName("Test with 30-4-2018")
    void nextDayOf30_4_2018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 5;
        int expectedYear = 2018;
        NextDayCalculator.nextDay(day,month,year);
        assertEquals(expectedDay,NextDayCalculator.getDay());
        assertEquals(expectedMonth,NextDayCalculator.getMonth());
        assertEquals(expectedYear,NextDayCalculator.getYear());
    }
    @Test
    @DisplayName("Test with 31-12-2018")
    void nextDayOf31_12_2018() {
        int day = 31;
        int month = 12;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 1;
        int expectedYear = 2019;
        NextDayCalculator.nextDay(day,month,year);
        assertEquals(expectedDay,NextDayCalculator.getDay());
        assertEquals(expectedMonth,NextDayCalculator.getMonth());
        assertEquals(expectedYear,NextDayCalculator.getYear());
    }
    @Test
    @DisplayName("Test with 31-1-2018")
    void nextDayOf31_1_2018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 2;
        int expectedYear = 2018;
        NextDayCalculator.nextDay(day,month,year);
        assertEquals(expectedDay,NextDayCalculator.getDay());
        assertEquals(expectedMonth,NextDayCalculator.getMonth());
        assertEquals(expectedYear,NextDayCalculator.getYear());
    }
}