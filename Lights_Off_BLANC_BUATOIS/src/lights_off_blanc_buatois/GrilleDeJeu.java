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
    
    /**Constructeur de la class GrilleDeJeu qui crée les 25 cellules de la grille et appel la méthode 
     * randomlumiere pour déterminer si,au départ, une cellule sera allumée ou éteinte
     *
     */
    public GrilleDeJeu(){
        for (int l=0;l<5;l++){
            for (int c=0;c<5;c++){
                grille[l][c]=new Cellules_Lumineuses();
                if (randomlumière()==true){
                    eteindreLumiere(l,c);
                }
            }
        }
    }
    
    /**Méthode qui permet de retourner aléatoirement (1 chance sur 2) un booléen à vrai ou faux
     *
     * @return
     */
    public boolean randomlumière(){
        if (Math.random()>0.5){
            return true;
        }else{
            return false;
        }
    }
    
    /**Méthode déterminant si une cellule est allumée ou éteinte
     *
     * @param l
     * @param c
     * @return
     */
    public boolean presenceLumiere(int l, int c){
       if (grille[l][c].presenceLumiere()==true){
           return true;
       }else{
           return false;
       }
    }
    
    /**Méthode permettant d'allumer la lumière sur une cellule
     *
     * @param l
     * @param c
     */
    public void allumerLumiere(int l, int c){
        if (this.presenceLumiere(l, c)==false){
            grille[l][c].allumerLumiere();
        }
    }
    
    /**Méthode permettant d'allumer la lumière sur une cellule
     *
     * @param l
     * @param c
     */
    public void eteindreLumiere(int l, int c){
        if (this.presenceLumiere(l, c)==true){
            grille[l][c].eteindreLumiere();
        }
    }
    
    /**Méthode permettant de modifier l'état de chaque cellule de la grille en fonction des clics 
     * de l'utilisateur
     *
     * @param l
     * @param c
     */
    public void clicutilisateur(int l,int c){
        if (presenceLumiere(l, c)==false){ //allume ou eteint la case cliqué
            allumerLumiere(l, c);
        }else{
            eteindreLumiere(l, c);   
        }
        if (l==0 || l==4){
            if (c==0 || c==4){
                if (l==0 && (c==0 || c==4)){ // ligne du bas
                    if (presenceLumiere(l+1, c)==false){
                        allumerLumiere(l+1, c);
                    }else{
                        eteindreLumiere(l+1, c);   
                    }
                    if (c==4){ // coins bas droit
                        if (presenceLumiere(l, c-1)==false){
                            allumerLumiere(l, c-1);
                        }else{
                            eteindreLumiere(l, c-1);   
                        }
                    }else{ // coins bas gauche
                        if (presenceLumiere(l, c+1)==false){
                            allumerLumiere(l, c+1);
                        }else{
                            eteindreLumiere(l, c+1);   
                        }
                    }
                }else if (l==4 && (c==0 || c==4)){ // ligne du haut
                    if (presenceLumiere(l-1, c)==false){
                        allumerLumiere(l-1, c);
                    }else{
                        eteindreLumiere(l-1, c);   
                    }
                    if (c==4){ // coins haut droit
                        if (presenceLumiere(l, c-1)==false){
                            allumerLumiere(l, c-1);
                        }else{
                            eteindreLumiere(l, c-1);   
                        }
                    }else{ // coins haut gauche
                        if (presenceLumiere(l, c+1)==false){
                            allumerLumiere(l, c+1);
                        }else{
                            eteindreLumiere(l, c+1);   
                        }
                    }
                } 
            }else{
                if (presenceLumiere(l, c+1)==false){
                    allumerLumiere(l, c+1);
                }else{
                    eteindreLumiere(l, c+1);   
                }             
                if (presenceLumiere(l, c-1)==false){
                    allumerLumiere(l, c-1);
                }else{
                    eteindreLumiere(l, c-1);   
                }                
                if (l==0){ // juste ligne du bas sans coins
                    if (presenceLumiere(l+1, c)==false){
                        allumerLumiere(l+1, c);
                    }else{
                        eteindreLumiere(l+1, c);   
                    }
                }
                if (l==4){ // juste ligne du haut sans coins
                    if (presenceLumiere(l-1, c)==false){
                        allumerLumiere(l-1, c);
                    }else{
                        eteindreLumiere(l-1, c);   
                    }
                }
            }
        }else{ 
            if (presenceLumiere(l+1, c)==false){
                allumerLumiere(l+1, c);
            }else{
                eteindreLumiere(l+1, c);   
            }
            if (presenceLumiere(l-1, c)==false){
                allumerLumiere(l-1, c);
            }else{
                eteindreLumiere(l-1, c);   
            }
            if (c==0){ // pour les colones de droite 
                if (presenceLumiere(l, c+1)==false){
                    allumerLumiere(l, c+1);
                }else{
                    eteindreLumiere(l, c+1);   
                }
            }else if(c==4){// pour les colones de gauche
                if (presenceLumiere(l, c-1)==false){
                    allumerLumiere(l, c-1);
                }else{
                    eteindreLumiere(l, c-1);   
                }
            }else { // pour toutes les cases du centre
                if (presenceLumiere(l, c+1)==false){
                    allumerLumiere(l, c+1);
                }else{
                    eteindreLumiere(l, c+1);   
                }
                if (presenceLumiere(l, c-1)==false){
                    allumerLumiere(l, c-1);
                }else{
                    eteindreLumiere(l, c-1);   
                }
            }
        }
    }
    
    public boolean gagner(){
        int a=0;
        for (int l=0; l<5;l++){
            for (int c=0;c<5;c++){
                if (presenceLumiere(l, c)==false){
                    a=a+1;
                }
            }
        }
        if (a==25){
            return true;
        }else{
            return false;
        }
    }
    
    /**Méthode affichant la grille de jeu dans la console
     *
     */
    public void affichergrilledansconsole(){
        for (int l=4;l>-1;l--){
            for (int c=0;c<5;c++){
                System.out.print("["+grille[l][c].lumiereCourant+"]");
                if ( c== 4){
                    System.out.print("\n");
                }
            }
        }
    }

}
