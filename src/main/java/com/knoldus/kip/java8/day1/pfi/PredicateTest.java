package com.knoldus.kip.java8.day1.pfi;

import java.util.function.Predicate;

/**
 * Created by harmeet on 27/3/17.
 *
 * Represents a predicate (boolean-value-function) of one argument.
 */
public class PredicateTest {

    public static boolean computePredicate(Predicate<Integer> predicate) {
        return predicate.test(9);
    }

    public static void main(String... args) {
        Predicate<Integer> predicate = x -> x > 5;
        boolean result1 = predicate.test(4);
        System.out.println("Result 1: "+result1);
        boolean result2 = computePredicate(predicate);
        System.out.println("Result 2: "+result2);
    }
}
