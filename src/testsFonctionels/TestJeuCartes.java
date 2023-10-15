package testsFonctionels;

import cartes.Carte;
import cartes.JeuCartes;
import jeu.Sabot;

public class TestJeuCartes {
	
	 public static void main(String[] args) {
		 
		 JeuCartes jeuDeCartes = new JeuCartes();

	        Carte[] typesDeCartes = jeuDeCartes.getTypesDeCartes();

	        System.out.println("Cartes du jeu Mille Bornes :\n");
	        
	        
	        Sabot sabot = new Sabot(96);
	        
	        for (Carte carte : typesDeCartes) {
	            for(int i=0; i < carte.getNombre(); i++) {
	            	sabot.ajouterFamilleCarte(carte);
	            }
	        }
	        
	        while(!sabot.estVide()) {
	        	System.out.println(sabot.piocher().toString()+"\n");
	        }
	        
	        
	    }
		 
}


