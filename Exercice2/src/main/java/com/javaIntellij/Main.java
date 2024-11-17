package com.javaIntellij;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        Map <String, Double> qde = new HashMap<>();

        qde.put("Doe",17.75);
        qde.put("Jane",15.5);
        qde.put("Jack",12.25);
        System.out.println("-------------------- Apres Insertion -------------------");
        qde.values().forEach(System.out::println);

        qde.put("Jane",20.0);
        System.out.println("--------------------- Apres modification ----------------");
        qde.values().forEach(System.out::println);

        qde.remove("Doe");
        System.out.println("--------------------- Apres Suppression -----------------");
        qde.values().forEach(System.out::println);

        System.out.println("Size : " + qde.size());


        System.out.println("AVG : "+(qde.values().stream().mapToDouble(e->(Double)e).average()).getAsDouble());

        System.out.println("MAX : "+qde.values().stream()
                .max(Double::compare)
                .get());


        System.out.println("MIN : "+ qde.values().stream()
                .min(Double::compare)
                .get());

        System.out.println(qde.containsValue(20.0)?"Il Contient la valeur 20 " : "Il ne Contient pas la valeur 20 ");

    }
}