/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_off_blanc_buatois;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class cellule_graphique extends JButton{
    Cellules_Lumineuses celluleassocié;
    
    public cellule_graphique(Cellules_Lumineuses unecellule){
        celluleassocié=unecellule;
    }
    
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        if(celluleassocié.presenceLumiere()){
            setBackground(Color.YELLOW);
        }else{
            setBackground(Color.gray);
        }
    }
    
}
