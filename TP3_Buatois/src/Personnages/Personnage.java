/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Personnage {

    protected int vie;
    String nom;
    ArrayList<Arme> tabArmes = new ArrayList<Arme>(5);
    Arme arme_en_mains=null;
    
    public Arme getArme_en_mains(){
        return arme_en_mains;
    }
    
    public void Ajout_arme(Arme arme) {
        if(tabArmes.size()<5){
            tabArmes.add(arme);
        }
    }
    
    public void Methode_arme(Arme arme) {
        for (int i=0;i<5;i++) {
            if (tabArmes.get(i) == arme){
                System.out.println("l'arme a été trouvée et est maintenant dans votre main");
                arme_en_mains = tabArmes.get(i);
                break;
            }
            else{
                System.out.println("l'arme n'a pas été trouvée");
            }
        }
    }

    public Personnage(String n, int i) {
        nom = n;

    }

    public Personnage(int vie, String nom) {
        this.vie = vie;
        this.nom = nom;
    }

    public int getAttaque() {
        return vie;
    }

    public void setAttaque(int vie) {
        if (vie > 0) {
            vie = vie;
        } else {
            vie = 1;
        }
        if (vie > 100) {
            vie = 100;
        }
        this.vie = vie;
    }

    @Override
    public String toString() {
        return "le personnage s'appelle " + nom + " et a un niveau de vie de " + vie+"le personnage a entre les mains "+ arme_en_mains;
    }
    

}
