package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contact friend = new Friend(
                "Max",
                "0176 12345678"
        );
        Contact friend2 = new Friend(
                "Döner",
                "0176 12345678");

        List<Contact> contacts = List.of(friend, friend2);

        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S20", contacts);

        System.out.println(smartphone);
        System.out.println(smartphone.getPosition());
        boolean startRadio = smartphone.startRadio();
        System.out.println(startRadio);
        boolean stopRadio = smartphone.stopRadio();
        System.out.println(stopRadio);

    }
}
