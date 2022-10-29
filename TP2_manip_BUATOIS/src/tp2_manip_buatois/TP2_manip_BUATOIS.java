/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_buatois;

/**
 *
 * @author User
 */
public class TP2_manip_BUATOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Tartiflette assiette1 = new Tartiflette(500); //création de nouvelles tartiflettes
        Tartiflette assiette2 = new Tartiflette(700);
        
        //Les assiettes 2 et 3 sont les mêmes (prouvé par le même nombre de calories) donc il y a seulement 2 objets de créés

        Tartiflette assiette3 = assiette2; //inversion d'assiette 1 et assiette 2
        assiette2 = assiette1;
        assiette1 = assiette3;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories); //affichage
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
         //  ; c// les lignes "Moussaka assiette667 = new Tartiflette() ;" et "Moussaka assiette666 = assiette1 ;" sont fausses car elles référencent un type d'objet autre que ce qu'elles annoncent référencer
        
        Moussaka [] Tab = new Moussaka[10]; //on met dans une liste de type moussaka 10 nouvelles moussaka différentes
        for (int i=0; i<10; i++) {
            Tab[i] = new Moussaka(200+i);
           
        }

    }
}
