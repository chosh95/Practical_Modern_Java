package com.company.ch04_consumer_function_predicate_supplier;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 20;
        System.out.println(supplier.get());
    }
}
