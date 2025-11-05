
/*
 * TP: 2
 * Class : BibliothequeTest
 * Name: Stéphane SINGERY
 * Group: INGE-1-APP-BDML2
 * Date: 2025-11-01
 */

package com.mycompany.bibliothequetest;


public class BibliothequeTest {

    public static void main(String[] args) {
        
        // ----------------------------- ETAGERE CHIMIE
        
        // Create a shelf.
        Etagere Etagere1 = new Etagere (
            002,
            "Chimie",
            20
        );
        System.out.printf(
            """
            Etagère "%s" ajoutée.\n
            """,
            Etagere1.getDomaine()
        );
                
        
        // Create books
        Livre Livre1 = new Livre (
            "La chimie organique",
            201,
            "John McMurry",
            1200,
            2019
        );
        Livre Livre2 = new Livre (
            "Introduction à la chimie analytique",
            202,
            "Daniel C. Harris",
            800,
            2021
        );
        Livre Livre3 = new Livre (
            "Chimie générale",
            203,
            "Raymond Chang",
            1000,
            2018
        );
        
        // Add books to the shelf.
        Etagere1.ajouterLivre(Livre1);
        Etagere1.ajouterLivre(Livre2);
        Etagere1.ajouterLivre(Livre3);
        
        // Print details of books stored on the shelf.
        Etagere1.afficherLivres();
        
        // Sum pages of all books stored on the shelf. 
        System.out.printf(
            """
            Nombre total de pages sur l'étagère %s : %s.\n
            """,
            Etagere1.getDomaine(),
            Etagere1.sommePages()
        );
        
        // Return the code of a book given its title.
        System.out.printf(
            """
            Livre :              %s
            Code correspondant : %s\n
            """,
            Livre2.getTitre(),
            Etagere1.chercherLivreParTitre(Livre2.getTitre())
        );
        
        // Print details for books whose count of pages is smaller than a threshold.
        Etagere1.chercherPetitsLivres(1000);
        
        // Print details for books published during the current year.
        Etagere1.afficherNouveauxLivres(2025);
        
        // Update the count of pages of a book given its code.
        Etagere1.changerNbPages(201, 2000);
        
        // Remove a book from the shelf.
        Etagere1.supprimerLivre(203);
        
        // Print details of books stored on the shelf.
        Etagere1.afficherLivres();
        
        // ----------------------------- ETAGERE INFORMATIQUE
        
        // Create a shelf.
        Etagere Etagere2 = new Etagere (
            003,
            "Informatique",
            20
        );
        System.out.printf(
            """
            Etagère "%s" ajoutée.\n
            """,
            Etagere2.getDomaine()
        );
        
        // Create books
        Livre Livre4 = new Livre (
            "Introduction aux algorithmes",
            301,
            "Thomas H. Cormen",
            1300,
            2020
        );
        Livre Livre5 = new Livre (
            "Design Patterns",
            302,
            "Erich Gamma",
            400,
            1994
        );
        Livre Livre6 = new Livre (
            "Java pour les débutants",
            303,
            "Herbert Schildt",
            700,
            2019
        );
        
        // Add books to the shelf.
        Etagere2.ajouterLivre(Livre4);
        Etagere2.ajouterLivre(Livre5);
        Etagere2.ajouterLivre(Livre6);
        
        // Print details of books stored on the shelf.
        Etagere2.afficherLivres();
        
        // Sum pages of all books stored on the shelf. 
        System.out.printf(
            """
            Nombre total de pages sur l'étagère %s : %s.\n
            """,
            Etagere2.getDomaine(),
            Etagere2.sommePages()
        );
        
        // Return the code of a book given its title.
        System.out.printf(
            """
            Livre :              %s
            Code correspondant : %s\n
            """,
            Livre6.getTitre(),
            Etagere2.chercherLivreParTitre(Livre6.getTitre())
        );
        
        // Print details for books whose count of pages is smaller than a threshold.
        Etagere2.chercherPetitsLivres(500);   
        
        // Print details for books published during the current year.
        Etagere2.afficherNouveauxLivres(2025);
        
        // Update the count of pages of a book given its code.
        Etagere2.changerNbPages(301, 1400);
        
        // Remove a book from the shelf.
        Etagere2.supprimerLivre(303);
        
        // Print details of books stored on the shelf.
        Etagere2.afficherLivres();
    }
}
