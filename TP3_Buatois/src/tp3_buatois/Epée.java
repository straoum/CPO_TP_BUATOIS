/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_buatois;

/**
 *
 * @author User
 */
public class Epée extends Arme{
    private int indice;

    public Epée(int indice, String n, int i) {
        super(n, i);
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "Indice de finesse :" + indice + "nom :"+nom+"niveau d'attaque :"+ this.getAttaque();
    }
    
}
