package com.company.practice;

public class ConstantPool {

    public static void main(String[] args) {
        int a = 1, b = 1;
        System.out.println(a==b); //true

        Integer c = 1, d = new Integer(1);
        System.out.println(c==d); //false
        System.out.println(c.equals(d)); //true

        String str1 = "abc", str2 = "abc";
        System.out.println(str1 == str2); //true
        System.out.println(str1.equals(str2) + " " + str1.compareTo(str2) + " " + str1.hashCode() + " " + str2.hashCode());
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3==str4); //true
        System.out.println(str3.equals(str4));
        System.out.println(str3.compareTo(str4));
    }
}


