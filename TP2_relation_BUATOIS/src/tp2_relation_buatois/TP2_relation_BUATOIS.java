/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_buatois;

/**
 *
 * @author User
 */
public class TP2_relation_BUATOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //création des nouvelles voitures et personnes
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        bob.liste_voitures[0] = uneClio; //attribution d'une clio à Bob comme première voiture
        bob.nbVoitures = 1;
        uneClio.proprietaire = bob;

        bob.liste_voitures[1] = une2008;//atribution d'une 2008 à Bob comme deuxième voiture
        bob.nbVoitures = 1;
        une2008.proprietaire = bob;

        reno.liste_voitures[0] = uneAutreClio;
        reno.nbVoitures = 1;
        uneAutreClio.proprietaire = reno;

        reno.liste_voitures[1] = uneMicra;
        reno.nbVoitures = 1;
        uneMicra.proprietaire = reno;

        System.out.println("liste des voitures disponibles :\n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra); //affichage des voitures dispos
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0]); //affichage des voitures de Bob
        System.out.println("la deuxième voiture de Bob est " + bob.liste_voitures[1]);

        System.out.println("la premiere voiture de Reno est " + reno.liste_voitures[0]); // affchage des voitures de Reno
        System.out.println("la deuxième voiture de Reno est " + reno.liste_voitures[1]);

    

    System.out.println (bob.toString() + reno.toString());
        
        Voiture voit1 = new Voiture("mod1", "mar1", 10);

    reno.ajouter_voiture (voit1);

    System.out.println (reno.toString() + voit1.toString());
    }
}
