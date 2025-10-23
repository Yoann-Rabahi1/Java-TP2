/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;
import java.util.*;
/**
 *
 * @author rabah
 */
public class BibliothequeTest {
    public static void main(String[] args) {
        Etagere etagere_chimie = new Etagere(1, "Chimie", new ArrayList<>(), 2025);
        Etagere etagere_informatique = new Etagere(2, "Informatique", new ArrayList<>(), 2025);

        Livre livre1_chimie = new Livre("La chimie organique", 201, "John McMurry", 1200, 2019);
        Livre livre2_chimie = new Livre("Intoduction à la chimie analystique", 202, "Daniel C. Harris", 800, 2021);
        Livre livre3_chimie = new Livre("Chimie générale", 203, "Raymond Chang", 1000, 2018);
        
        etagere_chimie.ajouterLivre(livre1_chimie);
        etagere_chimie.ajouterLivre(livre2_chimie);
        etagere_chimie.ajouterLivre(livre3_chimie);
        
        System.out.println("Etagère des livres de chimie : ");
        System.out.println("");
        etagere_chimie.AfficherLivres(); 
        
        Livre livre1_info = new Livre("Introduction aux algorithmes", 301, "Thomas H. Cormen", 1300, 2020);
        Livre livre2_info = new Livre("Design Patterns", 302, "Erich Gamma", 400, 1994);
        Livre livre3_info = new Livre("Java pour les débutants", 303, "Herbert Schildt", 700, 2019);
        
        etagere_informatique.ajouterLivre(livre1_info);
        etagere_informatique.ajouterLivre(livre2_info);
        etagere_informatique.ajouterLivre(livre3_info);
        
        System.out.println("");
        System.out.println("Etagère des livres d'informatique : ");
        System.out.println("");
        etagere_informatique.AfficherLivres();
        
        
        
        
    }
}
