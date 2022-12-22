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

    /**Constructeur de la class Cellule lumineuse qui affecte par défaut "allumé" à lumierecourant
     *
     */
    public Cellules_Lumineuses() {
        this.lumiereCourant = "allumé";
    }
    
    /**Méthode déterminant si une cellule est allumée ou éteinte
     *
     * @return
     */
    public boolean presenceLumiere(){
        if ("allumé".equals(lumiereCourant)){
            return true;
    }else{
            return false;
        }
   }

    /**Méthode permettant d'allumer la lumière sur une cellule
     *
     */
    public void allumerLumiere(){
        if (this.presenceLumiere()==false){
            lumiereCourant = "allumé";
        }
    }
    
    /**Méthode permettant d'allumer la lumière sur une cellule
     *
     */
    public void eteindreLumiere(){
        if (this.presenceLumiere()==true){
            lumiereCourant = "éteint";
        }
    }
        

        
}
