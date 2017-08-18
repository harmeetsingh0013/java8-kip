package com.knoldus.kip.java8.day2.datetime;

import java.time.Instant;

/**
 * Created by abhishek on 16/7/17.
 */
public class KipInstants {
    public static void main(String[] args) {
        // current time
        Instant now = Instant.now();
// from unix timestamp, 2010-01-01 12:00:00
        Instant fromUnixTimestamp = Instant.ofEpochSecond(1262347200);
// same time in millis
        Instant fromEpochMilli = Instant.ofEpochMilli(1262347200000l);
// parsing from ISO 8601
        Instant fromIso8601 = Instant.parse("2010-01-01T12:00:00Z");
// toString() returns ISO 8601 format, e.g. 2014-02-15T01:02:03Z
        String toIso8601 = now.toString();
// as unix timestamp
        long toUnixTimestamp = now.getEpochSecond();
// in millis
        long toEpochMillis = now.toEpochMilli();
// plus/minus methods are available too
        Instant nowPlusTenSeconds = now.plusSeconds(10);

        System.out.println("now : " + now);
        System.out.println("fromUnixTimestamp : " + fromUnixTimestamp);
        System.out.println("fromEpochMilli : " + fromEpochMilli);
        System.out.println("fromIso8601 : " + fromIso8601);
        System.out.println("toIso8601 : " + toIso8601);
        System.out.println("toUnixTimestamp : " + toUnixTimestamp);
        System.out.println("toEpochMillis : " + toEpochMillis);
        System.out.println("nowPlusTenSeconds : " + nowPlusTenSeconds);


    }
}
