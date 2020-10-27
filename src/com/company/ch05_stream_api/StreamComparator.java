package com.company.ch05_stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamComparator {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(10,"김민수"));
        personList.add(new Person(20,"김철수"));
        personList.add(new Person(10,"홍설"));
        personList.add(new Person(15,"이영자"));

        System.out.println("Person 객체가 Comparable 인터페이스 상속 후 compareTo 구현");
        personList.stream().sorted().forEach(System.out::println);

        System.out.println("reverseOrder로 출력");
        personList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("Comparator의 comparing 구현");
        personList.stream().sorted(Comparator.comparing((Person::getAge))).forEach(System.out::println);

        System.out.println("Comparator 응용");
        personList.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName,Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
