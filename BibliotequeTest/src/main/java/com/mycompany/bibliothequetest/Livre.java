
/*
 * TP: 2
 * Class : Livre
 * Name: Stéphane SINGERY
 * Group: INGE-1-APP-BDML2
 * Date: 2025-11-01
 */

// Import packages
package com.mycompany.bibliothequetest;

public class Livre {
    
    // ----------------------------- ATTRIBUTE
    
    private String titre;         // Titre du livre. 
    private int    code;          // Code unique du livre.
    private String auteur;        // Auteur du livre.
    private int    nbPages;       // Nombre de pages du livre.
    private int    anneeEdition;  // Année d'édition du livre.
        
    // ----------------------------- CONSTRUCTOR
    
    public Livre (
        String titre,
        int    code,
        String auteur,
        int    nbPages,
        int    anneeEdition
    ) {
        this.titre        = titre;
        this.code         = code;
        this.auteur       = auteur;
        this.nbPages      = nbPages;
        this.anneeEdition = anneeEdition;  
    }   
    
    // ----------------------------- GETTER
    
    public String getTitre() {
        return this.titre;
    }
    public int    getCode() {
        return this.code;
    }
    public String getAuteur() {
        return this.auteur;
    }
    public int    getNbPages() {
        return this.nbPages;
    }
    public int    getAnneeEdition() {
        return this.anneeEdition;
    }
    
    // ----------------------------- SETTER
       
    public void   setTitre(String titre) {
        this.titre        = titre;
    }
    public void   setCode(int code) {
        this.code         = code;
    }
    public void   setAuteur(String auteur) {
        this.auteur       = auteur;
    }
    public void   setNbPages(int nbPages) {
        this.nbPages      = nbPages;
    }
    public void   setAnneeEdition(int anneeEdition) {
        this.anneeEdition = anneeEdition;
    }
    
    // ----------------------------- METHOD
    
    // Print information related to a book.
    @Override
    public String toString() {
        return String.format(
            """
            Titre :           %s
            Code :            %s
            Auteur :          %s
            Nombre de pages : %s
            Année d'édition : %s\n
            """,
            titre,
            code,
            auteur,
            nbPages,
            anneeEdition
        );       
    }   
}
