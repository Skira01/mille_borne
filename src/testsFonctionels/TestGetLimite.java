package testsFonctionels;

import jeu.Joueur;
import jeu.MainAsListe;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import java.util.ArrayList;
import java.util.List;

public class TestGetLimite {
    public static void main(String[] args) {
        // Créer un joueur avec une main vide
        MainAsListe main = new MainAsListe();
        Joueur joueur = new Joueur("Joueur1", main, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        // Configuration 1: Pile de limites vide, sans botte
        System.out.println("Configuration 1: Pile de limites vide, sans botte");
        int limite1 = joueur.getLimite(new ArrayList<>());
        System.out.println("Limite de vitesse : " + limite1);

        // Configuration 2: Pile de limites avec une borne standard, sans botte
        System.out.println("Configuration 2: Pile de limites avec une borne standard, sans botte");
        List<Carte> limites2 = new ArrayList<>();
        limites2.add(new Borne(1, 50));
        int limite2 = joueur.getLimite(limites2);
        System.out.println("Limite de vitesse : " + limite2);

        // Configuration 3: Pile de limites avec une borne spéciale (-1), sans botte
        System.out.println("Configuration 3: Pile de limites avec une borne spéciale (-1), sans botte");
        List<Carte> limites3 = new ArrayList<>();
        limites3.add(new Borne(1, -1));
        int limite3 = joueur.getLimite(limites3);
        System.out.println("Limite de vitesse : " + limite3);

        // Configuration 4: Pile de limites vide, avec botte de type FEU
        System.out.println("Configuration 4: Pile de limites vide, avec botte de type FEU");
        List<Carte> bottes4 = new ArrayList<>();
        bottes4.add(new Botte(1, Botte.Type.FEU));
        int limite4 = joueur.getLimite(bottes4);
        System.out.println("Limite de vitesse : " + limite4);
    }
}
