package com.epam.javauniversity.utils.date;

import org.junit.Assert;
import org.junit.Test;

public class DateTest {

    @Test
    public void isLeapYearTestYearNotMultiplyFour() throws Exception {
        Assert.assertFalse(Date.isLeapYear(2015));
    }

    @Test
    public void isLeapYearTestYearMultiplyFour() throws Exception {
        Assert.assertTrue(Date.isLeapYear(2016));
    }

    @Test
    public void isLeapYearTestYearMultiplyHundredNotMultiplyFourHundred() throws Exception {
        Assert.assertFalse(Date.isLeapYear(1900));
    }

    @Test
    public void isLeapYearTestYearMultiplyHundredMultiplyFourHundred() throws Exception {
        Assert.assertTrue(Date.isLeapYear(2000));
    }
}