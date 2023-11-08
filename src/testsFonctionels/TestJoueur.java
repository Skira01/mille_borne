package testsFonctionels;

import java.util.ArrayList;

import cartes.Borne;
import cartes.Carte;
import jeu.Joueur;
import jeu.MainAsListe;

public class TestJoueur {

	public static void main(String[] args) {
        // Créer un joueur avec une main vide
        MainAsListe main = new MainAsListe();
        Joueur joueur = new Joueur("Joueur1", main, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        // Ajouter des bornes au joueur
        Borne borne25 = new Borne(1, 25);
        Borne borne50 = new Borne(1, 50);
        Borne borne100 = new Borne(1, 100);

        joueur.prendreCarte(borne25);
        joueur.prendreCarte(borne50);
        joueur.prendreCarte(borne100);

        // Calculer le kilométrage total
        int totalKilometrage = joueur.getKM();

        // Afficher le résultat
        System.out.println(joueur.getNom() + " a parcouru " + totalKilometrage + " km.");
    }
}
