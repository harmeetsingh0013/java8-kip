package com.knoldus.kip.java8.day2.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by harmeet on 6/7/17.
 */
public class JavaStreams {
    public static void main(String[] args) {
        Stream<Integer> empty = Stream.empty(); //empty stream with count = 0
        Stream<Integer> single = Stream.of(1); // count = 1
        Stream<Integer> multiple = Stream.of(1, 2, 3); // count = 3

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();

        Stream<Double> randoms = Stream.generate(() -> Math.random());
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
    }
}
