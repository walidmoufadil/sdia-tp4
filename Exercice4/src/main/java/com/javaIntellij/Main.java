package com.javaIntellij;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("john","Doe","Maria","Cartner");
        System.out.println("----------------------- Affichage ----------------------");
        list.forEach(System.out::println);

        System.out.println("----------------------- Q1 ----------------------");
        list.stream()
                .filter(element -> element.contains("a"))
                    .forEach(System.out::println);
        System.out.println("----------------------- Q2 ----------------------");
        list.stream()
                .filter(element -> element.length()>3)
                    .map(element -> new StringBuilder(element).reverse().toString())
                        .toList().forEach(System.out::println);
        System.out.println("----------------------- Q3 ----------------------");
        System.out.println(list.stream()
                                    .filter(element -> element.contains("e"))
                                        .map(e -> Arrays.stream(e.split("")).toList())
                                            .toList());
        System.out.println("----------------------- Q4 ----------------------");
        list.stream()
                .map(String::toUpperCase)
                    .forEach(System.out::println);
        System.out.println("----------------------- Q5 ----------------------");
        list.stream()
                    .map(String::length)
                        .forEach(System.out::println);
        System.out.println("----------------------- Q6 ----------------------");

        System.out.println(list.stream()
                                    .flatMap(e -> Arrays.stream(e.split("")))
                                        .toList());
        System.out.println("----------------------- Q7 ----------------------");
        list.stream()
                .map(e -> e + " - " + list.indexOf(e))
                    .forEach(System.out::println);




    }
}