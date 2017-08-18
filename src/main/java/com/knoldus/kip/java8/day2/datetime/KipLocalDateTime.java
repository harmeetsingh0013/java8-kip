package com.knoldus.kip.java8.day2.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by abhishek on 16/8/17.
 */
public class KipLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("current datetime : " + rightNow);

        LocalDateTime aDateTime = LocalDateTime.of(2016, Month.JUNE, 23, 19, 30, 40);
        System.out.println("some datetime : " + aDateTime);

        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime fromDateAndTime = LocalDateTime.of(currentDate, currentTime);
        System.out.println("LocalDateTime created by combining LocalDate" + " and LocalTime" + fromDateAndTime);

        LocalDate retrievedDate = fromDateAndTime.toLocalDate();
        LocalTime retrievedTime = fromDateAndTime.toLocalTime();
        System.out.println("retrieved LocalDate : " + retrievedDate);
        System.out.println("retrieved LocalTime : " + retrievedTime);


    }
}
