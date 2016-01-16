package com.epam.javauniversity.month;

import com.epam.javauniversity.utils.date.Date;

public enum Month {
    JANUARY(31),
    FEBRUARY(28) {
        @Override
        public int getDaysMonth(final int year) {
            if (Date.isLeapYear(year)) {
                return 29;
            }
            return super.getDaysMonth(year);
        }
    },
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    private final int daysAmount;

    Month(int amountOfDays) {
        this.daysAmount = amountOfDays;
    }

    public int getDaysMonth(final int year) {
        return daysAmount;
    }

    public Month nextMonth() {
        return values()[(ordinal() + 1) % values().length];
    }
}
