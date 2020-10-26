package com.company.ch03_anonymous_lambda_methodRef;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(5);
        integers.add(1);
        integers.add(4);
        integers.add(2);

        //익명 함수를 이용한 정렬
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        integers.stream().forEach(System.out::println);

        //람다식을 이용한 정렬
        integers.sort((Integer i1, Integer i2) -> i1.compareTo(i2));
        integers.stream().forEach(System.out::println);

        //메서드 참조를 이용한 정렬
        integers.sort(Integer::compareTo);
        integers.stream().forEach(System.out::println);
    }
}
