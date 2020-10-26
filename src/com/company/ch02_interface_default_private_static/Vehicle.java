package com.company.ch02_interface_default_private_static;

public interface Vehicle {
    public static final String info = "Vehicle";

    public void run();

    public void park();

    // 디폴트로 선언가능. 새로 정의할 필요가 없이 실행 가능하다.
    default public String getInfo(){
        return this.getDefaultInfo();
    }

    // pricate 선언 가능.
    private String getDefaultInfo(){
        return Vehicle.info;
    }

    // static 선언 가능
    public static void rotate(){
        System.out.println("Vehicle Rotate");
    }

}
