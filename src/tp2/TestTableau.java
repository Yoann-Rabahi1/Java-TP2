/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;
import java.util.Arrays;
/**
 *
 * @author rabah
 */
public class TestTableau {
    
    public static void main(String[] args){
        
        int tab[] = {120, 350, 200, 500, 175, 90, 300};
        
        for( int lig=0; lig<tab.length; lig++)
            System.out.println("Ligne " + lig + " : " + tab[lig]);
        
        int somme = 0;
        
        for (int lig=0; lig<tab.length; lig++){
            somme += tab[lig];
        }
        System.out.println("Somme totale des pages : " + somme);
        
        int min = tab[0];
        
        for (int lig=0; lig<tab.length; lig++){
            if( tab[lig] < min ){
                min = tab[lig];
            }
        }
        System.out.println("Nombre minimum : " + min);
        
        System.out.println("Moyenne : " + somme/tab.length);
        
      int tab_sorted[] =  tab.clone();
      
      Arrays.sort(tab_sorted);
      
      System.out.println(Arrays.toString(tab_sorted));
      
      
    }
        
    
}
