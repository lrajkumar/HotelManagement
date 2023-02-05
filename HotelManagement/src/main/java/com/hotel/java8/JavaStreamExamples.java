package com.hotel.java8;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExamples {

    public static void main(String[] args) {

        List<String> names = List.of("Raja", "Kumar", "Saran", "Raja");
        List<String> names2 = List.of("Abi", "Saran1", "Kumar1", "Zara");


        Stream.of(names, names2)
                .flatMap(list -> list.stream())
                .sorted()
                .forEach(System.out:: println);


        System.out.println("----------------------------------------");

        getStream(names)
                .forEach(name -> System.out.println(name));

        names.stream()
                .distinct()
                .forEach(name -> System.out.println(name));

        System.out.println("----------------------------------------");

        Set<String> strings = names.stream()
                .collect(Collectors.toSet());

        strings.forEach(System.out::println);


        Map<String, Integer> map = names.stream()
                .collect(Collectors.toMap(name -> name, name -> name.length(), (v1, v2) -> v1 + v2));

        System.out.println(map);

    }

    private static Stream<String> getStream(List<String> names) {

        return names.stream()
                .map(name -> name.toUpperCase())
                .map(name -> {
                    System.out.println("upper case name " + name);
                    return name;
                });

    }
}
