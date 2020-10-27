package com.company.ch05_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sumRes = 0;
        for(int i=0;i<list.size();i++)
            sumRes += list.get(i);
        System.out.printf("for문 활용 : %d\n", sumRes);

        int sum[] = {0};
        list.stream().forEach(value -> sum[0] += value);
        System.out.println("Intstream 활용 " + sum[0]);

        Integer collect = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Stream Collect 활용 " + collect);

        Integer reduce = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(reduce);

    }
}
