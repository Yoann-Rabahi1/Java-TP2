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
public class Livre {
    private String titre;
    private int code;
    private String auteur;
    private int nbPages;
    private int anneeEdition;
    
    
    public Livre(String titre, int code, String auteur, int nbPages, int anneeEdition){
        this.titre = titre;
        this.code = code;
        this.auteur = auteur;
        this.nbPages=nbPages;
        this.anneeEdition=anneeEdition;
    }

    public String getTitre() {
        return titre;
    }

    public int getCode() {
        return code;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public int getAnneeEdition() {
        return anneeEdition;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public void setAnneeEdition(int anneeEdition) {
        this.anneeEdition = anneeEdition;
    }
    
    @Override
    public String toString() {
        return  titre +
                ", code : " + code +
                ", auteur : '" + auteur + 
                ", " +nbPages + " pages" +
                ", edition : " + anneeEdition;
    }
}
