/*
 * TP2 Exo 3
 * Teddy Rakotoarivelo
 * 03/11/2025
 * I1-APP-BDML2
 */

package Organisation;

import java.util.ArrayList;

/**
 *
 * @author Teddy.R
 */
public class Etagere {
    private int code;
    private String domaine;
    private int capacite;
    private Livre[] livres;
    
    public Etagere(int code, String domaine, int capacite){
        this.code=code;
        this.domaine=domaine;
        this.capacite=capacite;
        this.livres=new Livre[capacite];
    }
    
    // --- Getters ---
    public int getCode() {
        return code;
    }

    public String getDomaine() {
        return domaine;
    }

    public int getCapacite() {
        return capacite;
    }

    public Livre[] getLivres() {
        return livres;
    }

    // --- Setters ---
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
        return "Etagere {" +
                "code=" + code +
                ", domaine='" + domaine + '\'' +
                ", capacite=" + capacite +
                '}';
    }
    
    public void ajouterLivre(Livre livre) {
        for (int i = 0; i < livres.length; i++) {
            if (livres[i] == null) {
                livres[i] = livre;
                System.out.println("Livre ajoute : " + livre.getTitre());
                return;
            }
        }
        System.out.println("Impossible d'ajouter le livre : etagere pleine !");
    }
    
        public void supprimerLivre(int code) {
        for (int i = 0; i < livres.length; i++) {
            if (livres[i] != null && livres[i].getCode() == code) {
                System.out.println("Livre supprime : " + livres[i].getTitre());
                livres[i] = null; 
                return;           
            }
        }
        System.out.println("Aucun livre trouve avec le code : " + code);
    }

    public int sommePages() {
        int sum = 0;
        for (Livre l : livres) {
            if (l != null) sum += l.getNbPages();
        }
        return sum;
    }

 
    public String chercherLivreParTitre(String titre) {
        for (Livre l : livres) {
            if (l != null && l.getTitre().equalsIgnoreCase(titre)) {
                return "Code du livre \"" + titre + "\" : " + l.getCode();
            }
        }
        return "Livre \"" + titre + "\" non trouve";
    }

    public void chercherPetitsLivres(int seuil) {
        System.out.println("Livres avec moins de " + seuil + " pages :");
        for (Livre l : livres) {
            if (l != null && l.getNbPages() < seuil) {
                System.out.println(l);
            }
        }
    }

    public void afficherNouveauxLivres(int anneeActuelle) {
        System.out.println("Livres edites en " + anneeActuelle + " sur l'etagere " +  domaine  + " : ");
        for (Livre l : livres) {
            if (l != null && l.getAnneeEdition() == anneeActuelle) {
                System.out.println("Titre : " + l.getTitre() + ", Code : " + l.getCode());
            }
        }
    }

    public void changerNbPages(int code, int nbPages) {
        for (Livre l : livres) {
            if (l != null && l.getCode() == code) {
                l.setNbPages(nbPages);
                System.out.println("Nombre de pages modifie pour : " + l.getTitre());
                return;
            }
        }
        System.out.println("Livre avec code " + code + " non trouve");
    }

    public void afficherLivres() {
        System.out.println("Etagere " + domaine  + " :");
        for (Livre l : livres) {
            if (l != null) System.out.println(l);
        }
    }

  
    public void trierLivresParPages() {
        ArrayList<Livre> list = new ArrayList<>();
        for (Livre l : livres) {
            if (l != null) list.add(l);
        }
        list.sort((a, b) -> a.getNbPages() - b.getNbPages());
        for (int i = 0; i < livres.length; i++) {
            livres[i] = (i < list.size()) ? list.get(i) : null;
        }
    }

    public String[] chercherTitresParAuteur(String auteur) {
        ArrayList<String> titres = new ArrayList<>();
        for (Livre l : livres) {
            if (l != null && l.getAuteur().equalsIgnoreCase(auteur)) {
                titres.add(l.getTitre());
            }
        }
        return titres.toArray(new String[0]);
    }
}
