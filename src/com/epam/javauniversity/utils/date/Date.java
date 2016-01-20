package com.epam.javauniversity.utils.date;

public final class Date {
    public static boolean isLeapYear(final int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
