package com.knoldus.kip.java8.day1.defaultstaticmethods;

/**
 * Created by harmeet on 1/4/17.
 */
public interface DefaultMethodExample1 {

    default void helloTeam() {
        System.out.println("Hello Friends :) :) ... ");
    }
}

class Launcher {

    public static void main(String... args) {
        DefaultMethodExample1 example1 = new DefaultMethodExample1() {};
        example1.helloTeam();
    }
}