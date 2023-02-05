package com.hotel.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorter {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Raj");
        s1.setAge(25);

        Student s2 = new Student();
        s2.setName("Abi");
        s2.setAge(30);


        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        Collections.sort(students);
        System.out.println(students);


        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                }

                return -1;
            }
        });

        System.out.println(students);


        //Comparable
        students.stream()
                .sorted()
                .forEach(System.out::println);

        //Custom comparator
        students.stream()
                .sorted(Comparator.comparing(student -> student.getAge()))
                .forEach(System.out::println);


    }

}
