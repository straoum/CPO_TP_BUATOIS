package tp2_bieres_buatois;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class BouteilleBiere { //création de la classe BouteilleBiere 

    String nom;       //Attribution des variables, de leur noms et de leurs types
    double degreAlcool;
    String brasserie;
    boolean ouverte;  //paramètres sur l'étiquette

    public void lireEtiquette() { // méthode lisant les informations sur l'étiquette de chque bière
        System.out.println("Bouteille de " + nom + " (" + degreAlcool
                + " degres) \nBrasserie : " + brasserie);
    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { //Méthode prenant les informations sur l'étiquette, avec le nom, le degré d'alcool et le nom de la brasserie en entrée
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false; //toutes les bières sont fermées par défautau départ
    }

    public void Décapsuler() { //Méthode qui décapsule les bière et affiche un programe d'erreur si celles-ci le sont déjà
        if (ouverte == false) { //cas de la bière fermée
            ouverte = true;
        } else {
            System.out.println("Erreur : La bière est déjà décapsulée"); //cas de la bière déjà décapsulée
            ouverte = false;
        }

    }
    public String toString() { //méthode qui permet de déterminer si la bière est décapsulsée ou non et retourne en conséquent une chaîne "oui" ou "non"
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ?";
if (ouverte == true ) chaine_a_retourner += " Oui" ;
else chaine_a_retourner += " Non" ;
return chaine_a_retourner ;
}
}
