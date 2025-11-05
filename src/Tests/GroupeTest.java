/*
 * TP2 Exo 3
 * Teddy Rakotoarivelo, Stéphane Singery, Yoann Rabahi
 * 03/11/2025
 * I1-APP-BDML2
 */
package Tests;

import Organisation.Etudiant;
import Organisation.Groupe;

public class GroupeTest {
    public static void main(String[] args) {
        Groupe g1 = new Groupe();

        g1.ajouterEtudiant(new Etudiant(1, "Chef", "Teddy", 20, "Info", 14.5));
        g1.ajouterEtudiant(new Etudiant(2, "Chef", "Stephane", 22, "Maths", 16.2));
        g1.ajouterEtudiant(new Etudiant(3, "Chef", "Yoann", 20, "Proba", 16.0));

       System.out.println("");
        g1.afficherEtudiants();
        
        System.out.println("");
        g1.trierParAge();
        g1.afficherEtudiants();

        System.out.println("");
        System.out.println(g1.rechercherSpecialite(2));

        g1.afficherPrenomsParAge(20);
    }
}

