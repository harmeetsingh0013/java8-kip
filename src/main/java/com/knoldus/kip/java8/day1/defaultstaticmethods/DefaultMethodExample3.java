package com.knoldus.kip.java8.day1.defaultstaticmethods;

/**
 * Created by harmeet on 1/4/17.
 */

interface Walk {
    default int getSpeed() {
        return 5;
    }
}

interface Run {
    default int getSpeed() {
        return 10;
    }
}

/*class Cat implements Walk, Run {

}

public class DefaultMethodExample3 {

    public static void main(String... args) {
        Cat cat = new Cat();
        cat.getSpeed();
    }
}*/
