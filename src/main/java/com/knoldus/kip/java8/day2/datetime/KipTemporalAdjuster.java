package com.knoldus.kip.java8.day2.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by abhishek on 15/8/17.
 */
public class KipTemporalAdjuster {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println("Current date is : " + localDate);

        System.out.println("Next Sunday is : " + localDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));

        System.out.println("Previous Sunday is : " + localDate.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)));

        System.out.println("First Monday of month is : " + localDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

        System.out.println("First day of Month: " + localDate.with(TemporalAdjusters.firstDayOfMonth()));

        System.out.println("Last day of Month: " + localDate.with(TemporalAdjusters.lastDayOfMonth()));

        System.out.println("First day of next Month: " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println("First day of next Year: " + localDate.with(TemporalAdjusters.firstDayOfNextYear()));

        System.out.println("First day of Year: " + localDate.with(TemporalAdjusters.firstDayOfYear()));

        System.out.println("Next or same Friday: " + localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)));

        System.out.println("Previous or same Thursday: " + localDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY)));
    }
}
