package org.example;

import java.util.List;

public class Smartphone implements GPS,Radio{

    String modelName;
    String brand;
    List<Contact> contacts;

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started...");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped...");
        return false;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", brand='" + brand + '\'' +
                ", contacts=" + contacts +
                '}';
    }

    public Smartphone(String modelName, String brand, List<Contact> contacts) {
        this.modelName = modelName;
        this.brand = brand;
        this.contacts = contacts;
    }

}
