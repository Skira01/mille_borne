package testsFonctionels;

import jeu.Joueur;
import jeu.MainAsListe;
import cartes.*;

import java.util.ArrayList;

public class TestEstBloque {
    public static void main(String[] args) {
        // Créer un joueur avec une main vide
        MainAsListe main = new MainAsListe();
        Joueur joueur = new Joueur("Joueur1", main, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        System.out.println("Test initial : estBloque = " + joueur.estBloque());

        // Ajout d'un Feu Rouge (Attaque)
        joueur.getBataille().add(new Attaque(1, Attaque.Type.FEU));
        System.out.println("Après ajout d'un Feu Rouge : estBloque = " + joueur.estBloque());

        // Ajout d'un Véhicule Prioritaire (Botte)
        joueur.getBottes().add(new Botte(1, Botte.Type.FEU));
        System.out.println("Après ajout d'un Véhicule Prioritaire : estBloque = " + joueur.estBloque());

        // Ajout d'un Accident (Attaque)
        joueur.getBataille().add(new Attaque(2, Attaque.Type.ACCIDENT));
        System.out.println("Après ajout d'un Accident : estBloque = " + joueur.estBloque());

        // Ajout d'un As du Volant (Botte)
        joueur.getBottes().add(new Botte(2, Botte.Type.ACCIDENT));
        System.out.println("Après ajout d'un As du Volant : estBloque = " + joueur.estBloque());

        // Ajout d'une Panne d'Essence (Attaque)
        joueur.getBataille().add(new Attaque(3, Attaque.Type.ESSENCE));
        System.out.println("Après ajout d'une Panne d'Essence : estBloque = " + joueur.estBloque());

        // Ajout d'Essence (Borne)
        joueur.getBataille().add(new Borne(1, 50));
        System.out.println("Après ajout d'Essence : estBloque = " + joueur.estBloque());

        // Suppression de toutes les bottes
        joueur.getBottes().clear();
        System.out.println("Après suppression de toutes les bottes : estBloque = " + joueur.estBloque());

        // Ajout d'un Feu Vert (Borne)
        joueur.getBataille().add(new Borne(2, 200));
        System.out.println("Après ajout d'un Feu Vert : estBloque = " + joueur.estBloque());
    }
}
