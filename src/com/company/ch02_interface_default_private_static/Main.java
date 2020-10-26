package com.company.ch02_interface_default_private_static;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Truck());

        vehicleList.forEach((Vehicle s) -> {s.run();s.park();
            System.out.println(s.getInfo());
            Vehicle.rotate();
        });
    }
}
