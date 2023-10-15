package cartes;

public class JeuCartes {
	
	private Carte[] typesDeCartes;

    public JeuCartes() {

    	typesDeCartes = new Carte[] {
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
    }

    public Carte[] getTypesDeCartes() {
        return typesDeCartes;
    }

}
