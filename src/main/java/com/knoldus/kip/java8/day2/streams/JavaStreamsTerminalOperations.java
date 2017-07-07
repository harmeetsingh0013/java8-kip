package com.knoldus.kip.java8.day2.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by harmeet on 6/7/17.
 */
public class JavaStreamsTerminalOperations {

    public static void main(String[] args) {
        /** count() */
        System.out.println(" ------------ count() ------------ ");
        Stream<String> s = Stream.of("java", "scala", "clojure");
        System.out.println(s.count()); // count = 3

        /*Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2); // Infinite Streams
        System.out.println(oddNumbers.count()); // never terminates*/

        /** min()/max() */
        System.out.println(" ------------ min()/max() ------------ ");
        Stream<String> s1 = Stream.of("java", "scala", "clojure");
        Optional<String> min = s1.min(Comparator.comparingInt(String::length));
        min.ifPresent(value -> System.out.println(value));

        /** findAny() & findFirst() */
        System.out.println(" ------------ findAny() & findFirst() ------------ ");
        Stream<String> s2 = Stream.of("java", "scala", "clojure");
        Stream<Integer> infinite = Stream.iterate(1, n -> n + 2); // Infinite Streams
        s2.findAny().ifPresent(value -> System.out.println(value));  // ???
        infinite.findAny().ifPresent(value -> System.out.println(value)); // terminate or not ???

        /** allMatch(). anyMatch() and noneMatch() */
        System.out.println(" ------------ allMatch(). anyMatch() and noneMatch() ------------ ");
        List<String> list = Arrays.asList("java", "2", "clojure");
        Stream<String> infinite1 = Stream.generate(() -> "Haskel");
        Predicate<String> pred = x -> Character.isAlphabetic(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred));
        System.out.println(list.stream().allMatch(pred));
        System.out.println(list.stream().noneMatch(pred));
        System.out.println(infinite1.anyMatch(pred));

        /** reduce() */
        System.out.println(" ------------ reduce() ------------ ");
        Stream<String> s3 = Stream.of("J", "A", "M", "E", "S");
        System.out.println(s3.reduce("", (sa, sb) -> sa + sb)); // with Identity value

        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(9);
        Stream<Integer> threeElements = Stream.of(3 ,9, 7);
        BinaryOperator<Integer> op = (a, b) -> a * b;

        empty.reduce(op).ifPresent(value -> System.out.println(value));     // without Identity value
        oneElement.reduce(op).ifPresent(value -> System.out.println(value));
        threeElements.reduce(op).ifPresent(value -> System.out.println(value));

        /** collect() */
        System.out.println(" ------------ collect() ------------ ");
        Stream<String> s4 = Stream.of("J", "A", "M", "E", "S");
        StringBuilder name = s4.collect(() -> new StringBuilder(), (builder, value) -> builder.append(value),
                (builder, value) -> builder.append(value));
        System.out.println(name);
    }
}
