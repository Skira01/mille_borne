package testsFonctionels;

import cartes.*;
import jeu.*;

public class TestSabot {
    public static void main(String[] args) {
        Sabot sabot = new Sabot(110);
        
        Attaque accident = new Attaque(1,Attaque.t.ACCIDENT);
        Carte reparation = new Carte("Réparation");
        Carte asDuVolant = new Carte("As du volant");
        
        sabot.ajouterFamilleCarte(accident, 3);
        sabot.ajouterFamilleCarte(reparation, 3);
        sabot.ajouterFamilleCarte(asDuVolant, 1);
        
        // Utilisation de l'itérateur pour piocher et afficher les cartes jusqu'à ce que le sabot soit vide.
        for (Carte carte : sabot) {
            System.out.println("Je pioche " + carte.getNom());
        }
    }
}
