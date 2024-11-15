package com.colak;

public class Main {

    private int unusedField = 42; // Unused private field

    public static void main(String[] args) {
        int unusedValue = 42; // Dead Local Store: This value is never used
        System.out.println("Hello, World!");
    }

    private static void test() {

    }
}
