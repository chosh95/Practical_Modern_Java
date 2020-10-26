package com.company.ch02_interface_default_private_static;

public class Truck implements Vehicle{

    @Override
    public void run() {
        System.out.println("Truck Run");
    }

    @Override
    public void park() {
        System.out.println("Truck Park");
    }
}
