package com.knoldus.kip.java8.day1.pfi;

import java.util.function.UnaryOperator;

/**
 * Created by harmeet on 27/3/17.
 *
 * Represent an operation on a single operand that produces a result of the same type as its operand.
 */
public class UnaryOperatorTest {

    public static boolean computeUnaryOperator(UnaryOperator<Boolean> unaryOperator) {
        return unaryOperator.apply(true);
    }

    public static void main(String... args) {
        UnaryOperator<Boolean> unaryOperator = flag -> !flag;
        boolean result1 = unaryOperator.apply(false);
        System.out.println("Result 1: "+result1);
        boolean result2 = computeUnaryOperator(unaryOperator);
        System.out.println("Result 2: "+result2);
    }
}
