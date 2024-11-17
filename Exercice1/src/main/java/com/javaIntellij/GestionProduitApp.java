package com.javaIntellij;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProduitApp {
    public static void main(String[] args) {
        List<Produit> list = new ArrayList<>();
        list.add(0, new Produit(1, "Pizza", 200.0));
        list.add(1, new Produit(2, "Pizza", 300.0));
        list.add(2, new Produit(3, "Pizza", 400.0));
        list.add(3, new Produit(4, "Pizza", 500.0));
        System.out.println("----------------- Apres insertion -----------------  ");
        list.forEach(System.out::println);



        list.remove(2);
        System.out.println("----------------- Apres Suppression -----------------  ");
        list.forEach(System.out::println);

        list.set(1, new Produit(5, "Pizza", 100.0));
        System.out.println("----------------- Apres Modification ----------------- ");
        list.forEach(System.out::println);


        System.out.println("----------------- Recherche -----------------  ");
        System.out.print("Entrez le nom du produit : ");
        String nom = (new Scanner(System.in)).nextLine();
        list.stream().filter(element -> element.getNom().equalsIgnoreCase(nom)).forEach(System.out::println);

    }
}
