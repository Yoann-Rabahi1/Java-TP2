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
public class Groupe {
    
    private List<Etudiant> etudiants = new ArrayList<>();
    
    public void AfficherEtudiant(){
        for (Etudiant et : etudiants)
            System.out.println("Etudiant  : " + et.toString());
    }
    
    public void TrierAge(){
        Collections.sort(etudiants, Comparator.comparing(Etudiant :: getAge));    
    }
    
    public String ChercherSpecialite(int numEtudiant){
        for (Etudiant et : etudiants){
            if(et.getNumEtudiant() == numEtudiant)
                return et.getSpecialite();
        }
        return "Etudiant non trouvé";
    }
    
    public List<String> AffichePrenomParAge(int age){
        List<String> prenoms = new ArrayList<>();
        for (Etudiant et : etudiants){
            if(et.getAge() == age)
                prenoms.add(et.getPrenomEtudiant());
        }
        return prenoms;
    } 
}
