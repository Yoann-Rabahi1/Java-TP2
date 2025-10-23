/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author rabah
 */
public class Etudiant {
    private int numEtudiant;
    private String nom;
    private String prenom;
    private int age;
    private String specialite;
    private double moyenne;
    
    public Etudiant(){
        this.numEtudiant = 0;
        this.nom = "NomEtudiant";
        this.prenom = "PrenomEtudiant";
        this.age = 20;
        this.specialite = "inconnue";
        this.moyenne = 0.0;
    }
    
    public Etudiant(int numEtudiant, String nom, String prenom, int age, String specialite, double moyenne){
        this.numEtudiant = numEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.specialite = specialite;
        this.moyenne = moyenne;
    }
    
    
    public String toString(int numEtudiant, String nom, String prenom, int age, String specialite, double moyenne){
        return ("[" +  numEtudiant + ", " + nom + ", " + prenom + ", " + age + ", " + specialite + ", " + moyenne);
    }
    
    public int getNumEtudiant(){
        return this.numEtudiant;
    }
    
    public String getNomEtudiant(){
        return this.nom;
    }
    
    public String getPrenomEtudiant(){
        return this.prenom;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getSpecialite(){
        return this.specialite;
    }
    
    public double getMoyenne(){
        return this.moyenne;
    }
    
    public void SetNumEtudiant(int numEtudiant){
        this.numEtudiant = numEtudiant;
    }
    
    public void setNomEtudiant(String nom){
        this.nom = nom;
    }
    
    public void setPrenomEtudiant(String prenom){
        this.prenom = prenom;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setSpecialite(String specialite){
        this.specialite = specialite;
    }
    
    public void setMoyenne(double moyenne){
        this.moyenne = moyenne;
    }
}
