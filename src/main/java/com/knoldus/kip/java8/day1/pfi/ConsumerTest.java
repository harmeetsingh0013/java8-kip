package com.knoldus.kip.java8.day1.pfi;

import java.util.function.Consumer;

/**
 * Created by harmeet on 27/3/17.
 *
 * Represents an operation that accept a single input argument and return no result.
 */
public class ConsumerTest {

    public static void computeConsumer(Consumer<String> consumer) {
        consumer.accept("Hello Guy's");
    }

    public static void main(String... args) {
        Consumer<String> consumer = message -> System.out.println(message);
        computeConsumer(consumer);
        consumer.accept("Welcome to Java Lambdas ... ");
    }
}
