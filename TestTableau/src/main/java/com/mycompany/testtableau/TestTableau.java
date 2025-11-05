
/*
 * TP: 2
 * Class : TestTableau
 * Name: Stéphane SINGERY
 * Group: INGE-1-APP-BDML2
 * Date: 2025-11-01
 */

// Import packages
package com.mycompany.testtableau;

import java.util.Arrays;

// Declare class
public class TestTableau {

    public static void main(String[] args) {
        
        // Declare variables
        int[][] booksTable= new int[7][2];
        int pagesCountSum = 0;
        int minPagesCount;
        int avgPagesCount;
                       
        booksTable= new int[][] {
            {1 ,120}, 
            {2 ,350}, 
            {3 ,200}, 
            {4 ,500}, 
            {5 ,175},
            {6 ,90},
            {7 ,300}
        };
                            
        minPagesCount= booksTable[0][0];
        
        System.out.println("Affichage du nombre de pages :");  
                
        // Iterate over each count of pages of the table, then doing operations:
        for (int[] book: booksTable) {

            int bookNumber = book[0];
            int pagesCount = book[1];
                
            // Print the count of pages for each of the books.
            System.out.printf(
                """
                Livres %s : %s pages
                """,                       
                bookNumber,
                pagesCount
            );

            // Compute the total count of pages
            pagesCountSum += pagesCount;
            
            // Compute the min count of pages.
            if (pagesCount < minPagesCount) {
                minPagesCount = pagesCount;
            }                       
        }
        
        // Compute the average count of pages per book.
        avgPagesCount = pagesCountSum/booksTable.length;               

        // Print Books Stats
        System.out.printf(
            """
            Somme totale des pages : %s
            """,
            pagesCountSum
    
        );
        System.out.printf(
            """
            Nombre minimum : %s
            """,
            minPagesCount
    
        );
        System.out.printf(
            """
            Moyenne : %s\n
            """,
            avgPagesCount  
        );
        
        // Sort the table by the count of pages (book[1])
        Arrays.sort(booksTable, (a, b) -> Integer.compare(a[1], b[1]));
        
        System.out.println("Affichage des livres triés par ordre croissant de nombre de pages :");
        
        // Print the sorted version of the table.
        for (int[] book: booksTable) {            
                
            int bookNumber = book[0];
            int pagesCount = book[1];
                
            // Print the count of pages for each of the books.
            System.out.printf(
                """
                Livres %s : %s pages
                """,                       
                bookNumber,
                pagesCount
            );
                      
        }                
        
    }       
}

