package org.example;

import java.util.List;
import java.util.NoSuchElementException;

public class Smartphone implements GPS,Radio{

    String modelName;
    String brand;
    List<Contact> contacts;

    public Smartphone() {
    }

    public Smartphone(String modelName, String brand, List<Contact> contacts) {
        this.modelName = modelName;
        this.brand = brand;
        this.contacts = contacts;
    }

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

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public Contact getContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.name.equals(name)) {
                return contact;
            }
        }
        throw new NoSuchElementException("No Contact with name:" + name);
    }

    public void removeContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.name.equals(name)) {
                contacts.remove(contact);
                return;
            }
        }
    }

    public boolean containsAtLeast3Contacts() {
        return contacts.size() >= 3;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", brand='" + brand + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
