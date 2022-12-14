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
        //Grille.affichergrilledansconsole();
    }
    
    public void partie(){
        Scanner rep = new Scanner(System.in);
        System.out.println("1)Niveau 1 avec coup illimité  2)Niveau 2 coup restraint à 100");
        int niveau=rep.nextInt();
        int cpt=100;
        Grille.affichergrilledansconsole();
        if (niveau==1){
            while (Grille.gagner()==false){
                int l=100;
                int c=100;
                Scanner repl = new Scanner(System.in);
                Scanner repc = new Scanner(System.in);
                while (l<0 || l>6 ){
                    System.out.println(" taper un nombre entre 1 et 5 compris pour la ligne");
                    l = repl.nextInt();
                }
                while( c<0 || c>6 ){
                    System.out.println(" taper un nombre entre 1 et 5 compris pour la colonne");
                    c = repc.nextInt();
                }
                Grille.clicutilisateur(l-1,c-1);
                Grille.affichergrilledansconsole();
            }
            System.out.println(" vous avez gagné");
        }else{
            while (Grille.gagner()==false || cpt==0 ){
                int l=100;
                int c=100;
                Scanner repl = new Scanner(System.in);
                Scanner repc = new Scanner(System.in);
                while (l<0 || l>6 ){
                    System.out.println(" taper un nombre entre 1 et 5 compris pour la ligne");
                    l = repl.nextInt();
                }
                while( c<0 || c>6 ){
                    System.out.println(" taper un nombre entre 1 et 5 compris pour la colonne");
                    c = repc.nextInt();
                }
                Grille.clicutilisateur(l-1,c-1);
                Grille.affichergrilledansconsole();
                cpt=cpt-1;
                System.out.println("il vous reste "+cpt+" coup.");
            }
            if (cpt==0){
                System.out.println(" vous avez perdu");
            }else{
                System.out.println("vous avez gagné");
            }
        }
    }
}
