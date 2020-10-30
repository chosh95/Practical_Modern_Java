package com.company.practice;

import java.awt.*;

public class Generic <T> {
    private T data;

    public Object getData(){
        return data;
    }

    public void setDate(T d){
        data = d;
    }

    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>();
        generic.setDate(1);
        String data = (String) generic.getData(); // 런타임 오류 발생 ClassCastException
        System.out.println(data);

        Generic generic1 = new Generic();
        System.out.println(generic1.getData());
    }
}
