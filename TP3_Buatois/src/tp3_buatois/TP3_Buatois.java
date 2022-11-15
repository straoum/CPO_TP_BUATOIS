/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_buatois;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import Armes.Epée;
import Armes.Bâton;
import Armes.Arme;
import java.util.ArrayList;


/**
 *
 * @author User
 */
public class TP3_Buatois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arme m = new Arme("Arme Standard",40);
        Bâton baton1 = new Bâton(4,"Chêne",5); //création de 2 bâtons et 2 épées
        Epée epee1 = new Epée(7, "Excalibur",5);
        Bâton baton2 = new Bâton(5,"Charme",6);
        Epée epee2 = new Epée(4,"Durandal",7);
        
        ArrayList<Arme> tabArme = new ArrayList<>(); // création d'un tableau dynamique stockant les armes
        
        tabArme.add(baton1);
        tabArme.add(baton2);
        tabArme.add(epee1);
        tabArme.add(epee2);
        
        int a = tabArme.size();
        for (int i=0;i<a;i++){
            System.out.println("voici les caractéristiques de l'arme :"+tabArme.get(i)); //affichage des caractéristiques des armes
        }
        
    Magicien magicien1 = new Magicien(true,65,"Gandalf"); //création de 2 guerriers et de 2 magiciens
    Guerrier guerrier1 = new Guerrier(false,78,"Conan");
    Magicien magicien2 = new Magicien(false,44,"Garcimore");
    Guerrier guerrier2 = new Guerrier(true,45,"Lannister");
        
    ArrayList<Personnage> tabpersonnage = new ArrayList<>(); // création d'un tableau dynamique stockant les personnages
        
    tabpersonnage.add(magicien1);
    tabpersonnage.add(magicien2);
    tabpersonnage.add(guerrier1);
    tabpersonnage.add(guerrier2);
    
    int z = tabArme.size(); //affichage des informations sur les personnages
        for (int i=0;i<z;i++){
            System.out.println("voici les informations sur le personnage :"+tabpersonnage.get(i));
        }
    
    }
   

}
