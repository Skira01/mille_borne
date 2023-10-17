package testsFonctionels;

import cartes.JeuCartes;
import jeu.Sabot;

public class TestJeuCartes {
	
	 public static void main(String[] args) {
		 
		 JeuCartes jeuDeCartes = new JeuCartes();


	        System.out.println("Cartes du jeu Mille Bornes :\n");
	        
	        
	        Sabot sabot = new Sabot(96);
	        
	        for(int i = 0; i < jeuDeCartes.getListeCartes().size(); i++) {
	        	sabot.ajouterFamilleCarte(jeuDeCartes.getListeCartes().get(i));
	        }
	        
	        while(!sabot.estVide()) {
	        	System.out.println(sabot.piocher().toString()+"\n");
	        }
	        
	        jeuDeCartes.checkCount();
	        
	    }
		 
}


