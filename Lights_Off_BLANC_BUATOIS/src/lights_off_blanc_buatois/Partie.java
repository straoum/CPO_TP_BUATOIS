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
        //JoueurCourant.nom = sc.nextLine();        
        JoueurCourant = new Joueur(sc.nextLine());
        Grille.affichergrilledansconsole();
    }
    
    public void partie(){
        
        while (Grille.gagner()==false){
            System.out.println(" taper un nombre entre 1 et 5 compris pour la ligne");
            Scanner repl = new Scanner(System.in);
            int l = repl.nextInt();
            System.out.println(" taper un nombre entre 1 et 5 compris pour la colonne");
            Scanner repc = new Scanner(System.in);
            int c = repc.nextInt();
            
        }
    }
}
