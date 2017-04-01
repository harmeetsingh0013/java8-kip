package com.knoldus.kip.java8.day1.pfi;

import java.util.function.Function;

/**
 * Created by harmeet on 27/3/17.
 *
 * Represent a function that accept a one argument and produce a result.
 */

public class FunctionTest {

    public static Integer computeFunction(Function<String, Integer> function) {
        return function.apply("05041989");
    }

    public static void main(String... args) {
        Function<String, Integer> function = value -> Integer.parseInt(value);
        Integer value1 = function.apply("13913");
        System.out.println("Value 1: "+value1);
        Integer value2 = computeFunction(function);
        System.out.println("Value 2: "+value2);
    }
}
