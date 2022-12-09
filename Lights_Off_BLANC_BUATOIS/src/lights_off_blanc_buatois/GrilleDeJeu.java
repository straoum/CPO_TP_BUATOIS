package lights_off_blanc_buatois;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class GrilleDeJeu {
    
    Cellules_Lumineuses[][] grille = new Cellules_Lumineuses[5][5];
    
    public GrilleDeJeu(){
        for (int l=0;l<5;l++){
            for (int c=0;c<5;c++){
                grille[l][c]=new Cellules_Lumineuses();
            }
        }
    }
    
    public boolean presenceLumiere(int l, int c){
       if (grille[l][c].presenceLumiere()==true){
           return true;
       }else{
           return false;
       }
    }
    
}
