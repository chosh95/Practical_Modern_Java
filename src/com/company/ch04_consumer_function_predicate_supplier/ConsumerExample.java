package com.company.ch04_consumer_function_predicate_supplier;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer i) -> System.out.println(i);
        Consumer<Integer> consumer2 = (Integer i) -> System.out.println(i + i);
        Consumer<Integer> consumer3 = (Integer i) -> System.out.println( i * 3);

        System.out.println("기본 Consumer 예시");
        consumer.accept(10);

        //Consumer의 andThen은 동일한 입력으로 각각 따로 계산한다.
        System.out.println("\nConsumer andThen 사용");
        consumer.andThen(consumer2).accept(10);

        System.out.println("\nConsumer andThen chaining");
        consumer.andThen(consumer2).andThen(consumer3).accept(10);
    }
}
