/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_buatois;

/**
 *
 * @author User
 */
public class Personnage {
   private int vie;
        String nom; 
        
    public Personnage(String n, int i){
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
        if (vie>0) {
            vie = vie;   
        }
        else{
            vie = 1;
        }
        if (vie>100) {
            vie = 100;
        }
        this.vie = vie;
    }

    @Override
    public String toString() {
        return "le personnage s'appelle "+nom+" et a un niveau de vie de "+vie;
    }
    
        
}



