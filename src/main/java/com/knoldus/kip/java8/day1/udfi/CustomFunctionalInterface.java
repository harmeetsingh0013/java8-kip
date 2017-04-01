package com.knoldus.kip.java8.day1.udfi;

import java.util.List;

/**
 * Created by harmeet on 27/3/17.
 */

@FunctionalInterface
public interface CustomFunctionalInterface<T> {

    List<T> action(String value);
}
