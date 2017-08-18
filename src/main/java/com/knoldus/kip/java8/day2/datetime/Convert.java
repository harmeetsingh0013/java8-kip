package com.knoldus.kip.java8.day2.datetime;

import java.sql.Timestamp;
import java.time.*;
import java.util.Date;

/**
 * Created by abhishek on 17/8/17.
 */
public class Convert {

    public static void main(String[] args) {
        //converting java.util Date to java.time localdate
        Date date = new Date();
        System.out.println("date : " + date);
        Instant instant = date.toInstant();
        System.out.println("instant : " + instant);
        LocalDate dateTime = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("localdate : " + dateTime);

        //converting java.sql timestamp to java.time localtime
        Timestamp timestamp = new Timestamp(instant.toEpochMilli());
        LocalTime localTime = timestamp.toLocalDateTime().toLocalTime();
        System.out.println("localtime : " + localTime);


    }
}
