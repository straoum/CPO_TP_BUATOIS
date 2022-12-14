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
    String lumiereCourant;
    
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
    
    public void allumerLumiere(int l, int c){
        if (this.presenceLumiere(l, c)==false){
            lumiereCourant = "allumé";
        }
    }
    
    public void eteindreLumiere(int l, int c){
        if (this.presenceLumiere(l, c)==true){
            lumiereCourant = "éteint";
        }
    }
    
    public void clicutilisateur(int l,int c){
        if (presenceLumiere(l, c)==true){ //allume ou eteint la case cliqué
            allumerLumiere(l, c);
        }else{
            eteindreLumiere(l, c);   
        }
        if (l==0 || l==4){
            if (c==0 || c==4){
                if (l==0 && (c==0 || c==4)){ // ligne du bas
                    if (presenceLumiere(l+1, c)==true){
                        allumerLumiere(l+1, c);
                    }else{
                        eteindreLumiere(l+1, c);   
                    }
                    if (c==4){ // coins bas droit
                        if (presenceLumiere(l, c-1)==true){
                            allumerLumiere(l, c-1);
                        }else{
                            eteindreLumiere(l, c-1);   
                        }
                    }else{ // coins bas gauche
                        if (presenceLumiere(l, c+1)==true){
                            allumerLumiere(l, c+1);
                        }else{
                            eteindreLumiere(l, c+1);   
                        }
                    }
                }else if (l==4 && (c==0 || c==4)){ // ligne du haut
                    if (presenceLumiere(l-1, c)==true){
                        allumerLumiere(l-1, c);
                    }else{
                        eteindreLumiere(l-1, c);   
                    }
                    if (c==4){ // coins haut droit
                        if (presenceLumiere(l, c-1)==true){
                            allumerLumiere(l, c-1);
                        }else{
                            eteindreLumiere(l, c-1);   
                        }
                    }else{ // coins haut gauche
                        if (presenceLumiere(l, c+1)==true){
                            allumerLumiere(l, c+1);
                        }else{
                            eteindreLumiere(l, c+1);   
                        }
                    }
                } 
            }else{
                if (presenceLumiere(l, c+1)==true){
                    allumerLumiere(l, c+1);
                }else{
                    eteindreLumiere(l, c+1);   
                }             
                if (presenceLumiere(l, c-1)==true){
                    allumerLumiere(l, c-1);
                }else{
                    eteindreLumiere(l, c-1);   
                }                
                if (l==0){ // juste ligne du bas sans coins
                    if (presenceLumiere(l+1, c)==true){
                        allumerLumiere(l+1, c);
                    }else{
                        eteindreLumiere(l+1, c);   
                    }
                }
                if (l==4){ // juste ligne du haut sans coins
                    if (presenceLumiere(l-1, c)==true){
                        allumerLumiere(l-1, c);
                    }else{
                        eteindreLumiere(l-1, c);   
                    }
                }
            }
        }else{ 
            if (presenceLumiere(l+1, c)==true){
                allumerLumiere(l+1, c);
            }else{
                eteindreLumiere(l+1, c);   
            }
            if (presenceLumiere(l-1, c)==true){
                allumerLumiere(l-1, c);
            }else{
                eteindreLumiere(l-1, c);   
            }
            if (c==0){ // pour les colones de droite 
                if (presenceLumiere(l, c+1)==true){
                    allumerLumiere(l, c+1);
                }else{
                    eteindreLumiere(l, c+1);   
                }
            }else if(c==4){// pour les colones de gauche
                if (presenceLumiere(l, c-1)==true){
                    allumerLumiere(l, c-1);
                }else{
                    eteindreLumiere(l, c-1);   
                }
            }else { // pour toutes les cases du centre
                if (presenceLumiere(l, c+1)==true){
                    allumerLumiere(l, c+1);
                }else{
                    eteindreLumiere(l, c+1);   
                }
                if (presenceLumiere(l, c-1)==true){
                    allumerLumiere(l, c-1);
                }else{
                    eteindreLumiere(l, c-1);   
                }
            }
        }
    }
}
