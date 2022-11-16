/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Bâton;
import Personnages.Personnage;

/**
 *
 * @author User
 */
public class Magicien extends Personnage { //création d'une sous-classe de Personnage
    private boolean confirme;

    public Magicien(boolean confirme, int vie, String nom) { //constructeur de la classe 
        super(vie, nom);
        String a = "";
        if (confirme=true){ //on définit le niveau du magicien
            a = "novice";
        }   
        else {
            a = "débutant";
        }
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) { //méthode set
        this.confirme = confirme;
    }
    
    public void ArmePréférée() { //méthode déterminant le nombre d'armes préféres du magicien dans son inventaire
        int var_int=0;
        for (int i=0;i<tabArmes.size();i ++) {
            if (tabArmes.get(i) instanceof Bâton) {
                System.out.println(tabArmes.get(i)+"est une arme préférée du magicien");
                var_int+=1;
            }
        }
        System.out.println("Le magicien possède" + var_int + "armes préférées dans son inventaire");
    }
    
    @Override
    public String toString() {
        return "Le magicien s'appelle :" +nom+ "et quel est son niveau? : ";
    }

    
}
