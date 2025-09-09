package ru.netology;

import java.util.*;

public class PhoneBook {
    private final Map<String, String> nameToNumber = new HashMap<>();

    public int add(String name, String number) {
        nameToNumber.putIfAbsent(name, number);
        return nameToNumber.size();
    }

    public String findByNumber(String number) {
        return null;
    }
}