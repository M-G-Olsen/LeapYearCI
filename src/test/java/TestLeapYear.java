import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLeapYear {
    @Test
    @MethodSource("LeapYear")
    public void Test_false_if_divisible_by_100_but_not_400() {
        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(2500));
    }

    @Test
    @MethodSource("LeapYear")
    public void Test_divisible_by_400() {
        assertTrue(LeapYear.isLeapYear(3000));
        assertTrue(LeapYear.isLeapYear(4000));
    }

    @Test
    @MethodSource("LeapYear")
    public void Test_year_is_leapyear() {
        assertTrue(LeapYear.isLeapYear(2016));
        assertTrue(LeapYear.isLeapYear(1996));
        assertTrue(LeapYear.isLeapYear(3004));
        assertTrue(LeapYear.isLeapYear(1784));
    }

    @Test
    @MethodSource("LeapYear")
    public void Test_year_is_not_leapyear() {
        assertFalse(LeapYear.isLeapYear(1775));
        assertFalse(LeapYear.isLeapYear(1999));
        assertFalse(LeapYear.isLeapYear(2207));
    }

}
