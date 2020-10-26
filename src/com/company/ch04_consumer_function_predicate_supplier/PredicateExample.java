package com.company.ch04_consumer_function_predicate_supplier;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (Integer i) -> i>10;
        Predicate<Integer> predicate2 = (Integer i) -> i%2==0;
        Predicate<Integer> predicate3 = (Integer i) -> i%3==0;

        System.out.println("predicate 기본 예제");
        System.out.println(predicate.test(15));

        System.out.println("predicate And 사용");
        System.out.println(predicate.and(predicate2).test(13));

        System.out.println("predicate Or And 사용");
        System.out.println(predicate.or(predicate2).and(predicate3).test(13));

    }
}
