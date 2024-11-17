package com.javaIntellij;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Set<String> group1 = new HashSet<>();
        Set<String> group2 = new HashSet<>();
        group1.add("John");
        group1.add("Jane");
        group1.add("Joe");

        group2.add("Maria");
        group2.add("John");
        group2.add("Mikel");


        System.out.println(" ------------------ Intersection ---------------------- ");

        for (String group : group1) {
            if(group2.contains(group))
                System.out.println(group);
        }

        System.out.println(" --------------------------- Union ------------------------ ");

        for (String group : group1) {
            System.out.println(group);
        }
        for (String group : group2) {
            if(!group1.contains(group))
                System.out.println(group);
        }
    }
}