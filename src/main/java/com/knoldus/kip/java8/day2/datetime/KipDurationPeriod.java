package com.knoldus.kip.java8.day2.datetime;

import java.time.*;

/**
 * Created by abhishek on 15/8/17.
 */
public class KipDurationPeriod {

    private static void periodsAndDurations() {

        // periods

        LocalDate firstDate = LocalDate.of(2010, 5, 17); // 2010-05-17
        LocalDate secondDate = LocalDate.of(2015, 3, 7); // 2015-03-07
        Period period = Period.between(firstDate, secondDate);


        int days = period.getDays(); // 18
        int months = period.getMonths(); // 9
        int years = period.getYears(); // 4
        boolean isNegative = period.isNegative(); // false

        Period twoMonthsAndFiveDays = Period.ofMonths(2).plusDays(5);
        LocalDate sixthOfJanuary = LocalDate.of(2014, 1, 6);

        // add two months and five days to 2014-01-06, result is 2014-03-11
        LocalDate eleventhOfMarch = sixthOfJanuary.plus(twoMonthsAndFiveDays);


        // durations

        Instant firstInstant = Instant.ofEpochSecond(1294881180); // 2011-01-13 01:13
        Instant secondInstant = Instant.ofEpochSecond(1294708260); // 2011-01-11 01:11

        Duration between = Duration.between(firstInstant, secondInstant);

        Duration duration= Duration.between(LocalDateTime.of(1991, 06, 23,17,17,23), LocalDateTime.now());


        // negative because firstInstant is after secondInstant (-172920)
        long seconds = between.getSeconds();

        // get absolute result in minutes (2882)
        long absoluteResult = between.abs().toMinutes();

        // two hours in seconds (7200)
        long twoHoursInSeconds = Duration.ofHours(2).getSeconds();

        System.out.println("periodsAndDurations: period: " + period);
        System.out.println("periodsAndDurations: days: " + days);
        System.out.println("periodsAndDurations: months: " + months);
        System.out.println("periodsAndDurations: years: " + years);
        System.out.println("periodsAndDurations: isNegative: " + isNegative);
        System.out.println("periodsAndDurations: eleventhOfMarch: " + eleventhOfMarch);
        System.out.println("periodsAndDurations: seconds: " + seconds);
        System.out.println("periodsAndDurations: absoluteResult: " + absoluteResult);
        System.out.println("periodsAndDurations: twoHoursInSeconds: " + twoHoursInSeconds);
        System.out.println("periodsAndDurations: diff: "+ duration );
        System.out.println("periodsAndDurations: twoMonthsAndFiveDays: "+ twoMonthsAndFiveDays);
    }

    public static void main(String[] args) {
        periodsAndDurations();
    }
}
