/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_off_blanc_buatois;

/**
 *
 * @author User
 */
public class Cellules_Lumineuses {
    String lumiereCourant;
    int X;
    int Y;

    public Cellules_Lumineuses(int x, int y) {
        this.lumiereCourant = "allumé";
        X = x;
        Y = y;
    }
    
    
   public boolean presenceLumiere(){
        if ("allumé".equals(lumiereCourant)){
            return true;
    }else{
            return false;
        }
   }
    public void allumerLumiere(){
        if (this.presenceLumiere()==false){
            lumiereCourant = "allumé";
        }
    }
    
    public void eteindreLumiere(){
        if (this.presenceLumiere()==true){
            lumiereCourant = "éteint";
        }
    }               



}
