package com.knoldus.kip.java8.day1.pfi;

import java.util.function.Supplier;

/**
 * Created by harmeet on 27/3/17.
 *
 * Represent a supplier of results.
 */
public class SupplierTest {

    public static String computeSupplier(Supplier<String> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello Guy's";
        System.out.println(computeSupplier(supplier));
    }
}
