package org.example;

public abstract class Contact {
    String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract String getName();
}
