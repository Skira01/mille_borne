package testsFonctionels;
import cartes.*;

public class TestEquals {


    public void main() {
        Attaque carte1 = new Attaque(1, Attaque.Type.FEU);
        Attaque carte2 = new Attaque(2, Attaque.Type.FEU);
        Attaque carte3 = new Attaque(1, Attaque.Type.ESSENCE);
        Borne carte4 = new Borne(1, 100);
        Botte carte5 = new Botte(1, Botte.Type.FEU);

        assert (carte1.equals(carte1));  
        assert (carte1.equals(carte2)); 
        assert (carte1.equals(carte3)); 
        assert (carte1.equals(carte4)); 
        assert (carte1.equals(carte5)); 

    }
}