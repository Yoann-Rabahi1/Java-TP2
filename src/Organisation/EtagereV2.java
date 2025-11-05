/*
 * TP2 Exo 3
 * Teddy Rakotoarivelo, Stéphane Singery, Yoann Rabahi
 * 03/11/2025
 * I1-APP-BDML2
 */

package Organisation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EtagereV2 {
    private int code;
    private String domaine;
    private int capacite;
    private ArrayList<Livre> livres;

    public EtagereV2(int code, String domaine, int capacite) {
        this.code = code;
        this.domaine = domaine;
        this.capacite = capacite;
        this.livres = new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public String getDomaine() {
        return domaine;
    }

    public int getCapacite() {
        return capacite;
    }

    public ArrayList<Livre> getLivres() {
        return livres;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "EtagereV2 {" +
                "code=" + code +
                ", domaine='" + domaine + '\'' +
                ", capacite=" + capacite +
                ", nbLivres=" + livres.size() +
                '}';
    }

    public void ajouterLivre(Livre livre) {
        if (livres.size() < capacite) {
            livres.add(livre);
            System.out.println("Livre ajoute : " + livre.getTitre());
        } else {
            System.out.println("Impossible d'ajouter le livre : etagere pleine !");
        }
    }

    public void supprimerLivre(int code) {
        for (Livre l : livres) {
            if (l.getCode() == code) {
                System.out.println("Livre supprime : " + l.getTitre());
                livres.remove(l);
                return;
            }
        }
        System.out.println("Aucun livre trouve avec le code : " + code);
    }

    public int sommePages() {
        int sum = 0;
        for (Livre l : livres) {
            sum += l.getNbPages();
        }
        return sum;
    }

    public String chercherLivreParTitre(String titre) {
        for (Livre l : livres) {
            if (l.getTitre().equalsIgnoreCase(titre)) {
                return "Code du livre \"" + titre + "\" : " + l.getCode();
            }
        }
        return "Livre \"" + titre + "\" non trouve";
    }


    public void chercherPetitsLivres(int seuil) {
        System.out.println("Livres avec moins de " + seuil + " pages :");
        for (Livre l : livres) {
            if (l.getNbPages() < seuil) {
                System.out.println(l);
            }
        }
    }

    public void afficherNouveauxLivres(int anneeActuelle) {
        System.out.println("Livres edites en " + anneeActuelle + " sur l'etagere " + domaine + " :");
        for (Livre l : livres) {
            if (l.getAnneeEdition() == anneeActuelle) {
                System.out.println("Titre : " + l.getTitre() + ", Code : " + l.getCode());
            }
        }
    }

    public void changerNbPages(int code, int nbPages) {
        for (Livre l : livres) {
            if (l.getCode() == code) {
                l.setNbPages(nbPages);
                System.out.println("Nombre de pages modifie pour : " + l.getTitre());
                return;
            }
        }
        System.out.println("Livre avec code " + code + " non trouve");
    }
    
    public void afficherLivres() {
        System.out.println("Etagere " + domaine + " :");
        for (Livre l : livres) {
            System.out.println(l);
        }
    }

    public void trierLivresParPages() {
        Collections.sort(livres, Comparator.comparingInt(Livre::getNbPages));
    }

    public String[] chercherTitresParAuteur(String auteur) {
        ArrayList<String> titres = new ArrayList<>();
        for (Livre l : livres) {
            if (l.getAuteur().equalsIgnoreCase(auteur)) {
                titres.add(l.getTitre());
            }
        }
        return titres.toArray(new String[0]);
    }
}

