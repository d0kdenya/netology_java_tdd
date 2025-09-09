package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
