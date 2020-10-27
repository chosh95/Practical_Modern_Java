package com.company.ch05_stream_api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamBasic {

    public static void main(String[] args) {
        List list = Arrays.asList(1,2,3,4,5);

        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));

        for(Iterator iter = list.iterator(); iter.hasNext();)
            System.out.println(iter.next());

        for(Object x : list)
            System.out.println(x);

        list.stream().forEach(System.out::println);
    }
}
