package com.hotel.java8;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Java8InbuiltFunctionalInterfaces {

    public static void main(String[] args) {


        String name = "Raj";

        Optional.ofNullable(name)
                .ifPresentOrElse(print(), printNo());

        Supplier<Integer> length = () -> name.length();

        System.out.println(length.get());


        Function<Integer, Character> func = (i) -> name.charAt(i);

        System.out.println(func.apply(1));
        func.apply(2);
        func.apply(0);

    }

    private static Runnable printNo() {
        return Java8InbuiltFunctionalInterfaces::printNoName;
    }

    private static Consumer<String> print() {
        return Java8InbuiltFunctionalInterfaces::printName;
    }

    //Runnable
    static void printNoName() {
        System.out.println("No name available");
    }

    //Consumer
    static void printName(String name) {
        System.out.println(name);
    }



}
