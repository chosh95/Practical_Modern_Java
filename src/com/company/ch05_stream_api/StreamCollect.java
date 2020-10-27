package com.company.ch05_stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(10,"김민수"));
        personList.add(new Person(20,"김철수"));
        personList.add(new Person(10,"홍설"));
        personList.add(new Person(15,"이영자"));

        Set<Person> collect = personList.stream().sorted().collect(Collectors.toCollection(TreeSet::new));
        collect.stream().forEach(System.out::println);
    }
}
