package org.example;

public abstract class Contact {
    protected String name;


    public Contact() {
        System.out.println("contact");
    }

    public Contact(String name) {
        this.name = name;
    }

    abstract String getName();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;

        return getName() != null ? getName().equals(contact.getName()) : contact.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }
}
