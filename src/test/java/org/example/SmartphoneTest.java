package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone testSmartphone() {
        List<Contact> contacts = List.of(
                new Friend("Max", "0176 12345678"),
                new Friend("Döner", "0176 12345678")
        );
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
        String expected = "Bochum";

        // WHEN / THEN
        String actual = smartphone.getPosition();
        assertEquals(expected, actual);
    }

}