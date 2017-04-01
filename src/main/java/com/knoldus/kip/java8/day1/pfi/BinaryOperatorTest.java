package com.knoldus.kip.java8.day1.pfi;

import java.util.function.BinaryOperator;

/**
 * Created by harmeet on 27/3/17.
 */
public class BinaryOperatorTest {

    public static int computeBinaryOperator(BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(3, 3);
    }

    public static void main(String... args) {
        BinaryOperator<Integer> binaryOperator = (x , y) -> x * y;
        int result1 = binaryOperator.apply(4, 4);
        System.out.println("Result 1: "+result1);
        int result2 = computeBinaryOperator(binaryOperator);
        System.out.println("Result 2: "+result2);
    }
}
