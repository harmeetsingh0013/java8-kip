package com.knoldus.kip.java8.day1.defaultstaticmethods;

/**
 * Created by harmeet on 1/4/17.
 */
interface StaticKiller {
    static void killer() {
        System.out.println("I am a static killer... I kill you");
    }
}

public class StaticMethodExample1 {

    public static void main(String... args) {
        StaticKiller.killer();
    }
}
