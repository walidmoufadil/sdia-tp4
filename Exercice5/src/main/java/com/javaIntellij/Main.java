package com.javaIntellij;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Employe> list = new ArrayList<Employe>();
        list.add(new Employe("Jack", "Bauer", 10000.00));
        list.add(new Employe("John", "Bauer", 25000.00));
        list.add(new Employe("Mikel", "Bauer", 18000.00));
        list.add(new Employe("Fred", "Bauer", 15000.00));

        System.out.println("----------------------- Affichage ----------------------");
        list.forEach(System.out::println);

        System.out.println("----------------------- Q1 ----------------------");
        System.out.print("SUM : ");
        list.stream()
                .mapToDouble(Employe::getSalaire)
                .reduce(Double::sum)
                .ifPresent(System.out::println);
        System.out.println("----------------------- Q2 ----------------------");
        System.out.println("List Triée : ");
        list.stream()
                .sorted((a,b)-> a.getNom().compareTo(b.getNom()))
                .forEach(System.out::println);
        System.out.println("----------------------- Q3 ----------------------");
        System.out.print("Employé avec salaire MIN : ");
        list.stream()
                .min((a,b)->Double.compare(a.getSalaire(),b.getSalaire()))
                .ifPresent(System.out::println);
        System.out.println("----------------------- Q4 ----------------------");
        System.out.println("Recherche : ");
        double sal = new Scanner(System.in).nextDouble();
        list.stream()
                .filter(e -> e.getSalaire() > sal)
                .forEach(System.out::println);
        System.out.println("----------------------- Q5 ----------------------");
        System.out.print("MAX : ");
        list.stream()
                .mapToDouble(Employe::getSalaire)
                .max()
                .ifPresent(System.out::println);
        System.out.println("----------------------- Q6 ----------------------");
        System.out.println("Nom Concatenés : " + list.stream()
                                                        .map(Employe::getNom)
                                                            .reduce("",String::concat));

    }
}

