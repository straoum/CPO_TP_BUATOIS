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

        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(700);

        Tartiflette assiette3 = assiette2;
        assiette2 = assiette1;
        assiette1 = assiette3;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
         //   Moussaka assiette666 = assiette1 ;
         //  Moussaka assiette667 = new Tartiflette() ; c'est incorrect car il est impossible de mélanger les classes Tartiflettes et Moussaka
        
        Moussaka [] Tab = new Moussaka[10];
        for (int i=0; i<10; i++) {
            Tab[i] = new Moussaka(200+i);
           
        }

    }
}
