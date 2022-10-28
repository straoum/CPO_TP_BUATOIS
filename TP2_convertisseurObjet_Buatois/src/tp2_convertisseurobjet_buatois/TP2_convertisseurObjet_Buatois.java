/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_buatois;

/**
 *
 * @author User
 */
public class TP2_convertisseurObjet_Buatois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Convertisseur convert1 = new Convertisseur(); //création d'un premier objet de type convertisseur
        Convertisseur convert2 = new Convertisseur(); //création d'un deuxième objet de type convertisseur
        
        convert1.CelciusVersFarenheit(12); //exécution du convertisseur de degrés Celcius en Farenheit
        convert1.FarenheitVersCelcius(172); //exécution du convertisseur de degrés Farenheit en Celcius
        System.out.println(convert1);
    }
    
}
