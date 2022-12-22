/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_off_blanc_buatois;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author User
 */
public class cellule_graphique extends JButton{
    Cellules_Lumineuses celluleassocié;
    ImageIcon img_allume = new javax.swing.ImageIcon(getClass().getResource("/image/allumé.png"));
    ImageIcon img_eteint = new javax.swing.ImageIcon(getClass().getResource("/image/eteint.png"));
    
    public cellule_graphique(Cellules_Lumineuses unecellule){
        celluleassocié=unecellule;
    }

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (celluleassocié.presenceLumiere() == true) {
            setIcon(img_eteint);
        } else {
            setIcon(img_allume);
        } 
    }
}
