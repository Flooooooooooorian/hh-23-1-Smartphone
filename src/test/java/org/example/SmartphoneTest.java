package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone testSmartphone() {
        List<Contact> contacts = new ArrayList<>(List.of(
                new Friend("Max", "0176 12345678"),
                new Friend("Döner", "0176 12345678")
        ));
        return new Smartphone("S11", "Samsung", contacts);
    }

    @Test
    void testThatSmartphoneCanBeCreated() {
        Smartphone smartphone =  testSmartphone();
        assertNotNull(smartphone);
    }

    @Test
    void stopRadio_returnsFalse() {
        // GIVEN
        Smartphone smartphone = testSmartphone();

        // WHEN / THEN
        assertFalse(smartphone.stopRadio());
    }

    @Test
    void startRadio_returnsTrue() {
        // GIVEN
        Smartphone smartphone = testSmartphone();

        // WHEN / THEN
        assertTrue(smartphone.startRadio());
    }

    @Test
    void calculatePosition_returnsKoeln() {
        // GIVEN
        Smartphone smartphone = testSmartphone();
        String expected = "Köln";

        // WHEN / THEN
        String actual = smartphone.getPosition();
        assertEquals(expected, actual);
    }

    @Test
    void addContact() {
        //GIVEN
        Smartphone smartphone = testSmartphone();
        Contact newContact = new Friend("TestName","1941345651");

        //WHEN
        smartphone.addContact(newContact);

        //THEN
        assertTrue(smartphone.getContacts().contains(newContact));
    }

    @Test
    void getContact() {
        //GIVEN
        Smartphone smartphone = testSmartphone();

        //WHEN
        Contact actual = smartphone.getContact(0);

        //THEN
        Contact expected = new Friend("Max", "0176 12345678");
        assertEquals(expected, actual);
    }

    @Test
    void getContactByName_whenContactExists_returnContact() {
        //GIVEN
        Smartphone smartphone = testSmartphone();

        //WHEN
        Contact actual = smartphone.getContactByName("Max");

        //THEN
        Contact expected = new Friend("Max", "0176 12345678");
        assertEquals(expected, actual);
    }

    @Test
    void getContactByName_whenContactNotFound_throwException() {
        //GIVEN
        Smartphone smartphone = testSmartphone();

        //WHEN
        try {
            smartphone.getContactByName("DiesenNamenGibtEsNicht");

            //THEN
            fail();
        }
        catch (NoSuchElementException e) {

        }
    }

    @Test
    void removeContactByName() {
        //GIVEN
        Smartphone smartphone = testSmartphone();

        //WHEN
        smartphone.removeContactByName("Max");

        //THEN
        assertFalse(smartphone.getContacts().contains(new Friend("Max", "0176 12345678")));
    }

    @Test
    void removeContactByName_onlyRemovesFirst() {
        //GIVEN
        Smartphone smartphone = testSmartphone();
        smartphone.addContact(new Friend("Max", "69798419464"));

        //WHEN
        smartphone.removeContactByName("Max");

        //THEN
        assertFalse(smartphone.getContacts().contains(new Friend("Max", "0176 12345678")));
        assertTrue(smartphone.getContacts().contains(new Friend("Max", "69798419464")));
    }
}
