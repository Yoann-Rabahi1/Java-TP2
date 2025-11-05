
/*
 * TP: 2
 * Class : Bibliotheque
 * Name: Stéphane SINGERY
 * Group: INGE-1-APP-BDML2
 * Date: 2025-11-01
 */

package com.mycompany.bibliotheque;
import java.util.ArrayList;
import java.util.Collections;

public class Bibliotheque {

    public static void main(String[] args) {
        // Déclaration de l'ArrayList et ajout des nombres de pages
        ArrayList<Integer> pages = new ArrayList<>();
        pages.add(120);
        pages.add(350);
        pages.add(200);
        pages.add(500);
        pages.add(175);
        pages.add(90);
        pages.add(300);
        // Affichage du contenu de la liste
        System.out.println("Nombre de pages des livres : " + pages);
        // Calcul et affichage de la somme totale des pages
        int somme = 0;
        for (int page : pages) {
            somme += page;
        }
        System.out.println("Somme totale des pages : " + somme);
        // Trouver et afficher le nombre de pages minimum
        int minPages = Collections.min(pages);
        System.out.println("Nombre de pages minimum : " + minPages);
        // Trier et afficher la liste
        Collections.sort(pages);
        System.out.println("Liste triée des nombres de pages : " + pages);
    }
}
