package com.knoldus.kip.java8.day2.datetime;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by abhishek on 16/7/17.
 */
public class KipLocalDate {
    public static void main(String[] args) {
        // the current date
        LocalDate currentDate = LocalDate.now();
        // 2017-02-10
        LocalDate tenthFeb2017 = LocalDate.of(2017, Month.FEBRUARY, 10);
        // months values start at 1 (2014-08-01)
        LocalDate firstAug2017 = LocalDate.of(2017, 8, 1);
        // the 65th day of 2017
        LocalDate sixtyFifthDayOf2017 = LocalDate.ofYearDay(2017, 65);
        LocalDate date = LocalDate.of(2011, 06, 23);
        int year = date.getYear(); //2014
        int dayOfYear = date.getDayOfYear(); //174
        String dayOfWeek = date.getDayOfWeek().name(); //THURSDAY
        int dayOfMonth = date.getDayOfMonth(); //23
        Month month = date.getMonth(); //JUNE
        int lengthOfMonth = date.lengthOfMonth(); //30
        boolean leap = date.isLeapYear(); //false

        System.out.println("Now---->" + currentDate);
        System.out.println("tenthFeb2017---->" + tenthFeb2017);
        System.out.println("firstAug2017---->" + firstAug2017);
        System.out.println("sixtyFifthDayOf2017---->" + sixtyFifthDayOf2017);
        System.out.println("year---->" + year);
        System.out.println("dayOfYear---->" + dayOfYear);
        System.out.println("dayOfWeek---->" + dayOfWeek);
        System.out.println("dayOfMonth---->" + dayOfMonth);
        System.out.println("month---->" + month);
        System.out.println("lengthOfMonth---->" + lengthOfMonth);
        System.out.println("leap---->" + leap);


    }
}
