package com.company.practice;

public class DefaultChild extends DefaultInheritance{

    public void print(){
        System.out.println(this.data);
    }

    public static void main(String[] args) {
        DefaultInheritance inheritance = new DefaultInheritance();
        DefaultChild child = new DefaultChild();
        child.print();
        inheritance.data = 123;
        System.out.println(inheritance.data);
    }
}