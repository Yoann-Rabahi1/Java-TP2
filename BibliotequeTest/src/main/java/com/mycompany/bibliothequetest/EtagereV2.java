
/*
 * TP :    2
 * Class : Etagere
 * Name :  Stéphane SINGERY
 * Group : INGE-1-APP-BDML2
 * Date :  2025-11-01
 */

// Import packages
package com.mycompany.bibliothequetest;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;

// Declare class
public class EtagereV2 {
    
    // ----------------------------- ATTRIBUTE
    
    private int          code;      // Code unique pour identifier l'étagère.
    private String       domaine;   // Domaine des livres sur cette étagère (ex. "Littérature", "Chimie", "Informatique").
    private int          capacite;  // Nombre max de livres à mettre dans l'étagère.
    private List<Livre>  livres;    // Liste de livres placés sur l'étagère.
    
    // ----------------------------- CONSTRUCTOR
    
    public EtagereV2 (
        int         code,
        String      domaine,
        int         capacite
    ) {
        this.code     = code;
        this.domaine  = domaine;
        this.capacite = capacite;
        this.livres   = new ArrayList<>(); // Always initialize a shelf with an empty list
    } 
    
    // ----------------------------- GETTER
    
    public String getDomaine() {
        return this.domaine;
    }
    
    // ----------------------------- METHOD
    
    // Add a book to the shelf.
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
        System.out.printf(
            """
            Livre "%s" ajouté.
            """,
            livre.getTitre()
        );
    }
    
    // Remove a book from the shelf.
    public void supprimerLivre(int code) {
        
        for (int i = 0; i < livres.size(); i++) {
            if (livres.get(i).getCode() == code) {
                livres.remove(i);
                System.out.printf(
                    """
                    Livre code %s supprimé de l'étagère %s.
                    """,
                    code,
                    this.domaine
                );
            }
        }         
    }
    
    // Sum pages of all books stored on the shelf. 
    public int sommePages() {
        int sumPages = 0;
        
        for (Livre l: livres) {
            sumPages += l.getNbPages();
        }
        return sumPages;
    }
    
    // Return the code of a book given its title.
    public Object chercherLivreParTitre(String titre) {   
        for (Livre l: livres) {
            if (titre == l.getTitre()) {
                return l.getCode();
            }                  
        }
        
        System.out.println("Le livre demandé n'a pas été trouvé.");
        return null;
    }
    
    // Print details for books whose count of pages is smaller than a threshold.
    public void chercherPetitsLivres(int Seuil) {
        System.out.println("\nListe des petits livres de l'étagère "+this.domaine+" :");
        for (Livre l: livres) {
            if (l.getNbPages() < Seuil) {
                System.out.print(l.toString());
            }
        }       
    }
    
    // Print details for books published during the current year.
    public void afficherNouveauxLivres(int anneeActuelle) {
        
        int currentYear = LocalDate.now().getYear();
        
        System.out.println("\nListe des livres de l'étagère "+this.domaine+" publiés cette année :\n");
        for (Livre l: livres) {
            if (l.getAnneeEdition() == currentYear) {
                System.out.printf(
                    """
                    Titre : %s
                    Code :  %s
                    """,
                    l.getTitre(),
                    l.getCode()
                );
            }            
        }
    }
    
    // Update the count of pages of a book given its code.
    public void changerNbPages(int code, int nbPages) {
        for (Livre l: livres) {
            if (l.getCode() == code) {
                l.setNbPages(nbPages);
            }            
        }  
    }
    
    // Print details of books stored on the shelf.
    public void afficherLivres() {
        System.out.println("\nListe des livres présents sur l'étagère "+this.domaine+" :");
        for (Livre l: livres) {
            System.out.println(l.toString());
            ;
        }
    }
    
    // Sort the list of books in ascending order.
    public void trierLivres() {
        Collections.sort(
            livres, (l1, l2) -> Integer.compare(
                l1.getNbPages(), 
                (l2.getNbPages())
            )
        );
    }
    
    // 
    public List chercherTitresParAuteur(String auteur) {
        
        List authorsList = new ArrayList<String>();
        
        for (Livre l: livres) {
            if (l.getAuteur() == auteur) {
                authorsList.add(l.getTitre());
            }
        }
        
        return authorsList;
    }
    
}


