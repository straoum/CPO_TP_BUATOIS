/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_buatois;

/**
 *
 * @author User
 */
public class Guerrier extends Personnage{
    private boolean cheval;
    String b = "";

    public Guerrier(boolean cheval, int vie, String nom) {
        super(vie, nom);
        if (cheval = true) {
            b = "oui";
        }
        else {
            b = "non";
        }
        this.cheval = cheval;
    }

    @Override
    public String toString() {
        return "Le guerrier s'appelle "+ nom + " ,a un niveau de vie de "+ vie+ "et a un niveau de " + b ;
    }
    
    
}
