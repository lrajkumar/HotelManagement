package com.hotel.java8;

import java.util.Optional;

public class JavaOptionalExample {

    public static void main(String[] args) {

        //print(getValueWithoutOptional());

        Optional<String> value = getValue();

        value.ifPresent(v -> print(v));


    }

    private static void print(String name) {
        System.out.println(name.toUpperCase());
    }

    private static String getValueWithoutOptional() {
        return null;
    }

    private static Optional<String> getValue() {
        return Optional.ofNullable(null);
    }
}
