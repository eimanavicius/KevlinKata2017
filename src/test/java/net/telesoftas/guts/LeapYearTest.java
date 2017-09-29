package net.telesoftas.guts;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {

    @Test
    public void not_divisible_by_4_is_not_leap_year() {
        assertFalse(Year.isLeap(2001));
    }

    @Test
    public void divisible_by_4_and_not_by_100_is_leap_year() {
        assertTrue(Year.isLeap(1996));
    }

    @Test
    public void divisible_by_100_and_not_400_is_not_leap_year() {
        assertFalse(Year.isLeap(1900));
    }

    @Test
    public void divisible_by_400_is_leap_year() {
        assertTrue(Year.isLeap(2000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void year_0_is_not_supported() {
        Year.isLeap(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void years_before_0_are_not_supported() {
        Year.isLeap(-1);
    }
}
