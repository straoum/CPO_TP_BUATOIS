/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_buatois;

/**
 *
 * @author User
 */
public class Bâton extends Arme{
    private int age;

    public Bâton(int age, String n, int i) {
        super(n, i);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bâton attaque=" + this.getAttaque() + ", nom=" + nom + "age=" +age;
    }

    
}

    
    
    

