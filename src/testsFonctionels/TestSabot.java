package testsFonctionels;

import cartes.*;
import cartes.Probleme.Type;
import jeu.*;

public class TestSabot {
    public static void main(String[] args) {
    	
        Sabot sabot = new Sabot(110);
        
        Carte accident = new Attaque(1,Type.ACCIDENT);
        Carte reparation = new Parade(1,Type.ACCIDENT);
        Carte asDuVolant = new Botte(1,Type.ACCIDENT);
        
        sabot.ajouterFamilleCarte(accident, accident, accident);
        sabot.ajouterFamilleCarte(reparation, reparation, reparation);
        sabot.ajouterFamilleCarte(asDuVolant);
        
        while(!sabot.estVide()) {
        	System.out.println("Je pioche "+sabot.piocher().toString());
        }
    }
}
