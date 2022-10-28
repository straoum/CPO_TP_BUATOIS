/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_buatois;

import java.util.Scanner;

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
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Quelles conversion voulez-vous faire: 1: Celsius-->Kelvin \n 2: Kelvin-->Celsius \n 3: Farenheit-->Celsius \n 4: Celsius-->Farenheit \n 5: Kelvin-->Farenheit \n 6: Farenheit-->Kelvin");
        int a = sc.nextInt(); 
        double temp=1.0;
        
        
        if (a==1) {
   
           Convertisseur conversionchoisie = new Convertisseur();
           conversionchoisie.CelciusVersKelvin(temp);
           System.out.println(conversionchoisie);
    
        }
        if (a==2) {
   
           Convertisseur conversionchoisie = new Convertisseur();
           conversionchoisie.CelciusVersKelvin(temp);
           System.out.println(conversionchoisie);
    
        }
        if (a==3) {
   
           Convertisseur conversionchoisie = new Convertisseur();
           conversionchoisie.KelvinVersCelcius(temp);
           System.out.println(conversionchoisie);
        }
    
        if (a==4) {
   
           Convertisseur conversionchoisie = new Convertisseur();
           conversionchoisie.FarenheitVersCelcius(temp);
           System.out.println(conversionchoisie);
    
        }   
        if (a==5) {
   
           Convertisseur conversionchoisie = new Convertisseur();
           conversionchoisie.CelciusVersFarenheit(temp);
           System.out.println(conversionchoisie);
    
        }
        
      
        if (a==6) {
   
           Convertisseur conversionchoisie = new Convertisseur();
           conversionchoisie.KelvinVersFarenheit(temp);
           System.out.println(conversionchoisie);
    
        } 
        
        if (a==6) {
   
           Convertisseur conversionchoisie = new Convertisseur();
           conversionchoisie.FarenheitVersKelvin(temp);
           System.out.println(conversionchoisie);
    
        } 
        
    }
    
   
    
}
