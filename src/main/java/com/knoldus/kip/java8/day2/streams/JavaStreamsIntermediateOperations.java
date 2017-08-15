package com.knoldus.kip.java8.day2.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamsIntermediateOperations {

    public static void main(String[] args) {
        /** filter() */
        System.out.println(" ------------ filter() ------------ ");
        Stream<String> s = Stream.of("java", "scala", "clojure");
        s.filter(x -> x.startsWith("j")).forEach(System.out::println);

        /** distinct() */
        System.out.println(" ------------ distinct() ------------ ");
        Stream<String> s1 = Stream.of("java", "java", "clojure", "scala", "clojure", "scala", "python");
        s1.distinct().forEach(System.out::println);

        /** skip()/limit() */
        System.out.println(" ------------ skip()/limit() ------------ ");
        Stream<Integer> s2 = Stream.iterate(1, n -> n + 1);
        s2.skip(5).limit(2).forEach(System.out::println);

        /** flatMap() */
        System.out.println(" ------------ flatMap() ------------ ");
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(l -> l.stream()).forEach(System.out::println);

        /** sorted() */
        System.out.println(" ------------ sorted() ------------ ");
        Stream<String> s3 = Stream.of("brown-", "bear-");
        s3.sorted().forEach(System.out::print); // bear-brown-

        Stream<String> s4 = Stream.of("brown bear-", "grizzly-");
        s4.sorted(Comparator.reverseOrder())
                .forEach(System.out::print);



    }
}
