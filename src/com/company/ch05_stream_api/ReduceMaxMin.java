package com.company.ch05_stream_api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceMaxMin {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int max = list.stream().reduce(0, Integer::max);
        System.out.println("list의 최대값 : " + max);

        int min = list.stream().reduce(100,Integer::min);
        System.out.println("list의 최소값 : " + min);
    }
}
