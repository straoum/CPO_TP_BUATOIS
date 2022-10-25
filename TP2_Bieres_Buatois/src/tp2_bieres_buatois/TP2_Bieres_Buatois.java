/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_buatois;

/**
 *
 * @author User
 */
public class TP2_Bieres_Buatois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,
                 "Abbaye de Leffe");
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
                7.0, "Dubuisson");
        BouteilleBiere autre1Biere = new BouteilleBiere("Chouffe", 8.0, "Achouffe");
        BouteilleBiere autre2Biere = new BouteilleBiere("Pelforth", 5.8, "Heineken");
        BouteilleBiere autre3Biere = new BouteilleBiere("Bellion", 5.5, "Bellion Boisson");

        autre1Biere.lireEtiquette();
        uneBiere.lireEtiquette();
        autreBiere.lireEtiquette();
        autre2Biere.lireEtiquette();
        autre3Biere.lireEtiquette();

        autre1Biere.Décapsuler();
        autre2Biere.Décapsuler();
        System.out.println(uneBiere) ;
        System.out.println(autre1Biere) ;
        System.out.println(autre2Biere) ;

    }

}
