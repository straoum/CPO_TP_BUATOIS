/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_buatois;

/**
 *
 * @author User
 */
public class Arme {
        private int attaque;
        String nom;
    public Arme(String n, int i){
        nom = n;
          
}

    public Arme(int attaque, String nom) {
        this.attaque = attaque;
        this.nom = nom;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        if (attaque>0) {
            attaque = attaque;   
        }
        else{
            attaque = 1;
        }
        if (attaque>100) {
            attaque = 100;
        }
        this.attaque = attaque;
    }

    @Override
    public String toString() {
        return "Arme{" + "attaque=" + attaque + ", nom=" + nom + '}';
    }

    
}
