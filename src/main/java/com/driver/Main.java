package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        rwOnly.setName("Tanya");
        System.out.println(rwOnly.getName());
        //name has private access in com.driver.RWOnly
    }
  
}