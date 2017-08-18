package com.knoldus.kip.java8.day2.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class KipLocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12, 23, 34);
        int hour = time.getHour();  //12
        System.out.println("hour---->" + hour);
        int min = time.getMinute(); //23
        System.out.println("min---->" + min);
        int sec = time.getSecond(); //34
        System.out.println("sec---->" + sec);

        LocalDate localDate = LocalDate.of(2016, 8, 1);

        LocalTime now = LocalTime.now();
        System.out.println("now---->" + now);
        LocalDateTime localDateTime = now.atDate(localDate);
        System.out.println("localDateTime---->" + localDateTime);
        LocalTime newTime = now.plusHours(2);
        System.out.println("newTime---->" + newTime);
        LocalTime hoursBack = now.minus(6, ChronoUnit.HOURS);
        System.out.println("previousYear---->" + hoursBack);


    }

}
