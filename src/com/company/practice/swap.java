package com.company.practice;

public class swap {

     void doSwap(Integer a, Integer b){
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        swap sw = new swap();
        int a =  3, b = 4;

        sw.doSwap(a, b);
    }

}
