/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_off_blanc_buatois;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Partie {
    
    
    Joueur JoueurCourant;
    GrilleDeJeu Grille;
  
    public void initialisation_partie(){
        Grille = new GrilleDeJeu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer votre nom :");
        JoueurCourant.nom = sc.next();
        
        
    }
}
