/*
 * TP2 Exo 3
 * Teddy Rakotoarivelo
 * 03/11/2025
 * I1-APP-BDML2
 */
package Organisation;

/**
 *
 * @author Teddy.R
 */

public class Etudiant {
    private int numEtudiant;
    private String nom;
    private String prenom;
    private int age;
    private String specialite;
    private double moyenne;

    public Etudiant() {
        this.numEtudiant = 0;
        this.nom = "SonNom";
        this.prenom = "SonPrenom";
        this.age = 20;
        this.specialite = "Inco";
        this.moyenne = 10.0;
    }

    public Etudiant(int numEtudiant, String nom, String prenom, int age, String specialite, double moyenne) {
        this.numEtudiant = numEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.specialite = specialite;
        this.moyenne = moyenne;
    }

    public int getNumEtudiant() {
        return numEtudiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialite() {
        return specialite;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "numEtudiant = " + numEtudiant +
                ", nom = '" + nom + '\'' +
                ", prenom = '" + prenom + '\'' +
                ", age = " + age +
                ", specialite = '" + specialite + '\'' +
                ", moyenne = " + moyenne ;
    }
}
