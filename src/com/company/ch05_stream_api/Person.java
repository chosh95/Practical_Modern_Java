package com.company.ch05_stream_api;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    int age;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        if(age<p.getAge()) return -1;
        if(age==p.getAge()){
            return p.getName().compareTo(name);
        }
        return 1;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
