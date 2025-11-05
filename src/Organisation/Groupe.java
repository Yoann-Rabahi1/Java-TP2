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
import java.util.List;

public class Groupe {
    private ArrayList<Etudiant> etudiants;

    public Groupe() {
        this.etudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
        System.out.println("Etudiant ajoute : " + e.getPrenom() + " " + e.getNom());
    }

    public void afficherEtudiants() {
        System.out.println("Liste des etudiants :");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    public void trierParAge() {
        Collections.sort(etudiants, Comparator.comparingInt(Etudiant::getAge));
        System.out.println("Etudiants tries par age croissant.");
    }

    public String rechercherSpecialite(int numEtudiant) {
        for (Etudiant e : etudiants) {
            if (e.getNumEtudiant() == numEtudiant) {
                return "Specialite de " + e.getPrenom() + " " + e.getNom() + " : " + e.getSpecialite();
            }
        }
        return "Aucun etudiant trouve avec le numéro " + numEtudiant;
    }

    public List<String> afficherPrenomsParAge(int age) {
        List<String> prenoms = new ArrayList<>();
        for (Etudiant e : etudiants) {
            if (e.getAge() == age) {
                prenoms.add(e.getPrenom());
            }
        }

        if (prenoms.isEmpty()) {
            System.out.println("Il y a pas d'etudiant age de " + age + " ans.");
        } else {
            System.out.println("Les etudiants eges de " + age + " ans : " + prenoms);
        }

        return prenoms;
    }
}

