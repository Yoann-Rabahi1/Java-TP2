/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;
import java.util.*;
import java.time.*;
/**
 *
 * @author rabah
 */
public class Etagere {
    
    private int code;
    private String domaine;
    private List<Livre> livres;
    private int anneeActuelle = LocalDate.now().getYear();
    
    
    public Etagere(int code, String domaine, List<Livre> livres, int anneeActuelle){
        this.code = code;
        this.domaine = domaine;
        this.livres = (livres != null) ? livres : new ArrayList<>();
        this.anneeActuelle = anneeActuelle;
    }
    
    public void ajouterLivre(Livre livre){
        livres.add(livre);
    }
    
    public boolean supprimerLivre(int code){
        for (Livre l : livres){
            if(l.getCode() == code){
                livres.remove(l);
                return true;
            }
        }
        return false;
    }
    
    public int SommeLivres(){
        int somme = 0;
        for (Livre l : livres){
            somme += l.getNbPages();
        }
        return somme;
    }
    
    public int ChercherLivreParTitre(String titre) {
        for (Livre l : livres) {
            if (l.getTitre() != null && l.getTitre().equalsIgnoreCase(titre)) { // Non sensible à la casse
                return l.getCode(); // 
            }
        }
        System.out.println("Aucun livre trouvé avec le titre : " + titre);
        return -1; // ou une autre valeur spéciale pour signaler l'absence
    }
    
    public void chercherPetitLivres(int seuil) {
        for (Livre l : livres) {
            if (l.getNbPages() <= seuil) {
                System.out.println(l.toString());
            }
        }
    }
    
    public void afficherNouveauxLivres(int anneeActuelle){
        for (Livre l : livres){
            if (l.getAnneeEdition() == anneeActuelle)
                System.out.println("Titre : " + l.getTitre() + " Code : " + l.getCode());
        }
    }
    
    public void changerNbPages(int nbPages, int code){
        for (Livre l : livres){
            if (l.getCode() == code){
                l.setNbPages(nbPages);
            }
            else
                System.out.println("Le code associé n'existe pas !");
        }
    }
    
    public void AfficherLivres(){
        for (Livre l : livres){
            l.toString();
            System.out.println(l);
        }
    }
    
    public void Trie(){
       livres.sort(Comparator.comparingInt(Livre :: getNbPages));
    }
    
    public String [] ChercherTitreParAuteur(String auteur){
        List<String> titres = new ArrayList<>();
        for(Livre l : livres){
            if (l.getAuteur().equals(auteur)) {
                titres.add(l.getTitre());
            }
        }
        return titres.toArray(new String[0]);
    }
}
