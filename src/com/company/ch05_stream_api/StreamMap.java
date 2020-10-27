package com.company.ch05_stream_api;

import java.util.ArrayList;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(10,"김민수"));
        personList.add(new Person(20,"김철수"));
        personList.add(new Person(10,"홍설"));
        personList.add(new Person(15,"이영자"));

        personList.stream().map(Person::toString).forEach(System.out::println);

        personList.stream().mapToInt(Person::getAge).forEach(System.out::println);
    }
}
