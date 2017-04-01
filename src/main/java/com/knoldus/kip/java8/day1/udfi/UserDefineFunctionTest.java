package com.knoldus.kip.java8.day1.udfi;

import java.util.Arrays;
import java.util.List;

/**
 * Created by harmeet on 27/3/17.
 */
public class UserDefineFunctionTest {

    public static void main(String... args) {
        CustomFunctionalInterface<String> customFunctionalInterface = value -> Arrays.asList(value.split("\\s+"));

        List<String> values = customFunctionalInterface.action("Hello Guy's, Look into Custom Function Interface");
        values.forEach(System.out::println);

    }
}
