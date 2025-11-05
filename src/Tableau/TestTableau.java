/*
 * TP2 Exo 1
 * Teddy Rakotoarivelo
 * 17/10/2025
 * I1-APP-BDML2
 */


package Tableau;

/**
 *
 * @author Teddy.R
 */
public class TestTableau {
        public static void main(String[] args) {
            int [] tab = {120, 350, 200, 500, 175, 90, 300};
            int sum=0;
            int min= tab[0];
            System.out.println("Affichage des nombres de pages");
            for (int i = 0; i<tab.length;i+=1){
                System.out.println("Livre " + (i+1) + ": " + tab[i] + " pages");
                sum+=tab[i];
                if (tab[i]<min)
                        min=tab[i];
            }
            int mean=sum / tab.length;
            System.out.println("Somme totale des pages: " + sum);
            System.out.println("Nombre minimum : " + min);
            System.out.println("Moyenne : " + mean);
            
            java.util.Arrays.sort(tab);
            for (int element: tab)
                System.out.println(element);
            
            
            
        }
}
