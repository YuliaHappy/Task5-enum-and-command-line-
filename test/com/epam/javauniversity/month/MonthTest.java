package com.epam.javauniversity.month;

import org.junit.Assert;
import org.junit.Test;

public class MonthTest {

    @Test
    public void getDaysMonthTestMonthNotFebruary() throws Exception {
        Assert.assertEquals(31, Month.DECEMBER.getDaysMonth(2015));
    }

    @Test
    public void getDaysMonthTestMonthFebruaryYearNotLeap() throws Exception {
        Assert.assertEquals(28, Month.FEBRUARY.getDaysMonth(2015));
    }

    @Test
    public void getDaysMonthTestMonthFebruaryYearLeap() throws Exception {
        Assert.assertEquals(29, Month.FEBRUARY.getDaysMonth(2016));
    }

    @Test
    public void nextMonthTestMonthNotDecember() throws Exception {
        Assert.assertEquals(Month.APRIL, Month.MARCH.nextMonth());
    }

    @Test
    public void nextMonthTestMonthDecember() throws Exception {
        Assert.assertEquals(Month.JANUARY, Month.DECEMBER.nextMonth());
    }
}