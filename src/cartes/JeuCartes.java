package cartes;

import java.util.ArrayList;
import utils.Utils;

public class JeuCartes {

    private Carte[] typesDeCartes = new Carte[]{
            new Attaque(5, Attaque.Type.FEU),
            new Attaque(3, Attaque.Type.ESSENCE),
            new Attaque(3, Attaque.Type.CREVAISON),
            new Attaque(3, Attaque.Type.ACCIDENT),
            new Parade(14, Parade.Type.FEU),
            new Parade(6, Parade.Type.ESSENCE),
            new Parade(6, Parade.Type.CREVAISON),
            new Parade(6, Parade.Type.ACCIDENT),
            new Borne(10, 25),
            new Borne(10, 50),
            new Borne(10, 75),
            new Borne(12, 100),
            new Borne(4, 200),
            new Botte(1, Botte.Type.FEU),
            new Botte(1, Botte.Type.ESSENCE),
            new Botte(1, Botte.Type.CREVAISON),
            new Botte(1, Botte.Type.ACCIDENT),
    };
    
    private ArrayList<Carte> listeCartes;
    
    

    public JeuCartes() {

        listeCartes = new ArrayList<>();
        for (Carte carte : typesDeCartes) {
            int nombreExemplaires = carte.getNombre();
            for (int i = 0; i < nombreExemplaires; i++) {
                listeCartes.add(carte);
            }
        }
        
        Utils.mélanger(listeCartes);
        
    }

    public ArrayList<Carte> getListeCartes() {
        return listeCartes;
    }
    
    public void checkCount() {
        System.out.println("Vérification du nombre d'exemplaires pour chaque type de carte :\n");

        for (Carte carte : typesDeCartes) {
            int nombreExemplairesAttendu = carte.getNombre();
            int nombreExemplairesTrouve = 0;

            for (Carte carteListe : listeCartes) {
                if (carteListe.equals(carte)) {
                    nombreExemplairesTrouve++;
                }
            }

            if (nombreExemplairesAttendu == nombreExemplairesTrouve) {
                System.out.println(carte.toString() + " : OK");
            } else {
                System.out.println(carte.toString() + " : ERREUR - Attendu : " + nombreExemplairesAttendu + ", Trouvé : " + nombreExemplairesTrouve);
            }
        }
    }

}