package com.company.ch02_interface_default_private_static;

public class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("Car Run");
    }

    @Override
    public void park() {
        System.out.println("Car Park");
    }

    @Override
    public String getInfo(){
        return Vehicle.super.getInfo() + " Car";
    }

    public void rotate(){
        Vehicle.rotate();
    }
}
