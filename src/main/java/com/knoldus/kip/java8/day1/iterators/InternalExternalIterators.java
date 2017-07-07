package com.knoldus.kip.java8.day1.iterators;

import java.util.Arrays;
import java.util.List;

/**
 * Created by harmeet on 29/6/17.
 */
public class InternalExternalIterators {

    public static void main(String... args) {
        List<String> languages = Arrays.asList("Java", "Scala", "Clojure", "Groovy", "Jython");

        System.out.println("External Iterators: ");
        for (String lang: languages) {
            System.out.println(lang);
        }

        System.out.println();
        System.out.println("Internal Iterators: ");
        languages.stream().forEach(System.out::println);
    }
}
