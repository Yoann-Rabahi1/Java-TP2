/*
 * TP2 Exo 3
 * Teddy Rakotoarivelo
 * 03/11/2025
 * I1-APP-BDML2
 */

package Tests;

import Organisation.Etagere;
import Organisation.Livre;
import Organisation.EtagereV2;

/**
 *
 * @author Teddy.R
 */

public class BibliothequeTest {
    public static void main(String[] args) {
        // =======================
        // TEST ETAGERE (version tableau) CHEFFFF
        // =======================
        Etagere etagereChimie = new Etagere(1, "Chimie", 10);
        Etagere etagereInfo = new Etagere(2, "Informatique", 10);

        etagereChimie.ajouterLivre(new Livre("La chimie organique", 201, "John McMurry", 1200, 2019));
        etagereChimie.ajouterLivre(new Livre("Introduction a la chimie analytique", 202, "Daniel C. Harris", 800, 2021));
        etagereChimie.ajouterLivre(new Livre("Chimie generale", 203, "Raymond Chang", 1000, 2018));

        etagereInfo.ajouterLivre(new Livre("Introduction aux algorithmes", 301, "Thomas H. Cormen", 1300, 2020));
        etagereInfo.ajouterLivre(new Livre("Design Patterns", 302, "Erich Gamma", 400, 1994));
        etagereInfo.ajouterLivre(new Livre("Java pour les debutants", 303, "Herbert Schildt", 700, 2019));
        
        System.out.println("--------");
        etagereChimie.afficherLivres();

        System.out.println("\nSomme totale des pages de l'etagere Chimie : " + etagereChimie.sommePages());

        System.out.println("\nRecherche du livre nomme \"Chimie generale\" ");
        System.out.println(etagereChimie.chercherLivreParTitre("Chimie generale"));

        System.out.println("");
        etagereChimie.chercherPetitsLivres(1000);

        System.out.println("");
        etagereChimie.afficherNouveauxLivres(2021);

        System.out.println("\nModification du nombre de pages du livre code 202 :");
        etagereChimie.changerNbPages(202, 850);
        
        System.out.println("--------");
        etagereChimie.afficherLivres();
        System.out.println("\nSuppression du livre code 201 :");
        etagereChimie.supprimerLivre(201);
        etagereChimie.afficherLivres();

        System.out.println("--------");
        etagereInfo.afficherLivres();

        System.out.println("\nTri des livres par nombre de pages de l'etagere Informatique :");
        etagereInfo.trierLivresParPages();
        etagereInfo.afficherLivres();

        System.out.println("\nRecherche des titres par auteur \"Herbert Schildt\" de l'etagere Informatique :");
        String[] titres = etagereInfo.chercherTitresParAuteur("Herbert Schildt");
        for (String nom : titres) {
            System.out.println(nom);
        }
        
        
        // =======================
        // TEST ETAGERE V2 (version ArrayList) CHEFFFFF
        // =======================
        System.out.println("\n\n========== TEST ETAGERE V2 (ArrayList) ==========\n");

        EtagereV2 etagereV2Info = new EtagereV2(10, "Informatique", 5);
        EtagereV2 etagereV2Chimie = new EtagereV2(11, "Chimie", 5);

        etagereV2Info.ajouterLivre(new Livre("Introduction aux algorithmes", 301, "Thomas H. Cormen", 1300, 2020));
        etagereV2Info.ajouterLivre(new Livre("Design Patterns", 302, "Erich Gamma", 400, 1994));
        etagereV2Info.ajouterLivre(new Livre("Java pour les debutants", 303, "Herbert Schildt", 700, 2019));

        etagereV2Chimie.ajouterLivre(new Livre("La chimie organique", 201, "John McMurry", 1200, 2019));
        etagereV2Chimie.ajouterLivre(new Livre("Introduction a la chimie analytique", 202, "Daniel C. Harris", 800, 2021));

        System.out.println("\n---- Affichage EtagereV2 Chimie ----");
        etagereV2Chimie.afficherLivres();

        System.out.println("\nSomme des pages : " + etagereV2Chimie.sommePages());

        System.out.println("\nRecherche de \"La chimie organique\" :");
        System.out.println(etagereV2Chimie.chercherLivreParTitre("La chimie organique"));

        etagereV2Chimie.chercherPetitsLivres(1000);

        etagereV2Chimie.afficherNouveauxLivres(2021);

        System.out.println("\nTri des livres par nombre de pages de l'etagere Informatique :");
        etagereV2Info.trierLivresParPages();
        etagereV2Info.afficherLivres();

        System.out.println("\nSuppression du livre code 302 :");
        etagereV2Info.supprimerLivre(302);
        etagereV2Info.afficherLivres();

        System.out.println("\nRecherche des titres par auteur \"Herbert Schildt\" de l'etagere Informatique :");
        String[] titresV2 = etagereV2Info.chercherTitresParAuteur("Herbert Schildt");
        for (String nom : titresV2) {
            System.out.println(nom);
        }

        System.out.println("\n========== FIN TEST ETAGERE V2 ==========\n");
    }
}
