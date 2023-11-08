package jeu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cartes.Botte;
import cartes.Carte;

public class MainAsListe implements Main {
    private List<Carte> main;
    private int limiteVitesseEnCours;

    public MainAsListe() {
        main = new ArrayList<>();
        limiteVitesseEnCours = 200;
    }
    
    public int getLimite() {
    	return limiteVitesseEnCours;
    }

    @Override
    public void prendre(Carte carte) {
        main.add(carte);
    }

    @Override
    public void jouer(Carte carte) {
        assert main.contains(carte) : "La carte n'existe pas dans la main.";
        main.remove(carte);
    }

    @Override
    public Iterator<Carte> iterator() {
        return main.iterator();
    }

} 
