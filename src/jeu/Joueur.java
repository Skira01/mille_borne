package jeu;
import java.util.List;
import cartes.*;

public class Joueur {
    private String nom;
    private MainAsListe main;
    private int kmParcourus;
    private List<Carte> limitesDeVitesse;
    private List<Carte> bataille;
    private List<Carte> bornes;
    private List<Carte> bottes;
    

    public Joueur(String nom, MainAsListe main, List<Carte> limitesDeVitesse, List<Carte> bataille, List<Carte> bornes, List<Carte> bottes) {
        this.nom = nom;
        this.main = main;
        this.kmParcourus = 0;
        this.limitesDeVitesse = limitesDeVitesse;
        this.bataille = bataille;
        this.bornes = bornes;
        this.bottes = bottes;
    }

    public String getNom() {
        return nom;
    }

    public Main getMain() {
        return main;
    }
    
    public int getKM() {
    	System.out.println(bornes.size());
    	for(int i=0; i < bornes.size(); i++) {
    		kmParcourus+=bornes.get(i).getKm();
    	}
        return kmParcourus;
    }

    public List<Carte> getLimitesDeVitesse() {
        return limitesDeVitesse;
    }

    public List<Carte> getBataille() {
        return bataille;
    }

    public List<Carte> getBornes() {
        return bornes;
    }

    public List<Carte> getBottes() {
        return bottes;
    }

    public void donner(Carte carte) {
        main.prendre(carte); 
    }
    
    public Carte prendreCarte(List<Carte> sabot) {
        if (!sabot.isEmpty()) {
            Carte cartePiochee = sabot.remove(0);
            main.prendre(cartePiochee); 
            return cartePiochee;
        } else {
            return null;
        }
    }
    
    public int getLimite(List<Carte> limitesDeVitesse) {
        if (limitesDeVitesse.isEmpty() || estFinDeLimite(limitesDeVitesse) || possedeBotte(bottes, Botte.Type.FEU)) {
            return 200;
        } else {
            return 50;
        }
    }

    private boolean estFinDeLimite(List<Carte> limitesDeVitesse) {
        for (int i = limitesDeVitesse.size() - 1; i >= 0; i--) {
            if (limitesDeVitesse.get(i) instanceof Borne && ((Borne) limitesDeVitesse.get(i)).getKm() == -1) {
                return true;
            }
        }
        return false;
    }


    private boolean possedeBotte(List<Carte> bottes, Botte.Type type) {
        for (Carte carte : bottes) {
            if (carte instanceof Botte) {
                Botte botte = (Botte) carte;
                if (botte.getT() == type) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean estBloque() {
        if (bataille.isEmpty() && possedeBotte(bottes, Botte.Type.FEU)) {
            return false;
        }

        if (!bataille.isEmpty()) {
            Carte sommet = bataille.get(bataille.size() - 1);

            if (sommet instanceof Bataille) {
                Bataille attaque = (Bataille) sommet;
                if (attaque.getT() == Botte.Type.FEU && possedeBotte(bottes, Botte.Type.FEU)) {
                    return false;
                }
            }

            if (sommet instanceof Bataille && possedeBotte(bottes, sommet.getT())) {
                return false;
            }
        }

        return true;
    }
    
    public void prendreCarte(Carte carte) {
    	main.prendre(carte);
    	if(carte instanceof Bataille) {
    		bataille.add(carte);
    	}
    	else if(carte instanceof Borne) {
    		bornes.add(carte);
    	}
    	else if(carte instanceof Botte) {
    		bottes.add(carte);
    	}
    	else if(carte instanceof Limite) {
    		limitesDeVitesse.add(carte);
    	}
    }
    
    
}
