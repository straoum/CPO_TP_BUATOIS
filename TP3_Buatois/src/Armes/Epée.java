/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author User
 */
public class Epée extends Arme{ //création de la sous-classe Epée de Arme
    private int indice;

    public Epée(int indice, String n, int i) { //constructeur de la classe
        super(n, i);
        this.indice = indice;
    }

    public int getIndice() { // méthode get
        return indice;
    }

    public void setIndice(int indice) { //méthode set
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "Indice de finesse :" + indice + " nom :"+nom+" niveau d'attaque :"+ this.getAttaque();
    }
    
}
