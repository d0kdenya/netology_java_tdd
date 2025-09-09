package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int size = phoneBook.add("Alice", "12345");
        assertEquals(1, size);

        size = phoneBook.add("Bob", "67890");
        assertEquals(2, size);

        size = phoneBook.add("Alice", "99999");
        assertEquals(2, size);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        phoneBook.add("Bob", "67890");

        assertEquals("Alice", phoneBook.findByNumber("12345"));
        assertEquals("Bob", phoneBook.findByNumber("67890"));
        assertNull(phoneBook.findByNumber("00000"));
    }

}
