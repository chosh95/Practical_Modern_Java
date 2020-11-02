package com.company.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Generic <T> {
    private T data;

    public T getData(){
        return data;
    }

    public void setData(T d){
        data = d;
    }

    public static void main(String[] args) {
        Generic raw = new Generic(); //Raw 타입
        raw.setData(123); // int 값 삽입
        String a = (String)raw.getData(); // String 추출시 ClassCastException 발생

        List list = new ArrayList<>();
        list.add(123);
        String ab = (String) list.get(0);
    }
}
