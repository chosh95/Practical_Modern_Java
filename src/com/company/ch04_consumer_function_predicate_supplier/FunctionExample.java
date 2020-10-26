package com.company.ch04_consumer_function_predicate_supplier;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer,Integer> multiply = (Integer i) -> i*2;
        System.out.println(multiply.apply(20));

        Function<Integer,String> toStr = (Integer i) -> i.toString();
        Function<String,Integer> toInteger = (String s) -> Integer.parseInt(s) + 10;
        System.out.println("Function의 Andthen은 첫번째 람다 표현식 결과를 두번째 람다 표현식의 입력으로 전달한다.");
        System.out.println(toStr.andThen(toInteger).apply(1000));

        System.out.println("Function의 Compose는 두번째 람다 표현식의 결과를 첫번째 람다 표현식의 입력으로 전달한다.");
        System.out.println(toInteger.andThen(toStr).apply("500"));
    }
}
