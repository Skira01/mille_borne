package cartes;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type t) {
		super(nombre, t);
	}
	
	@Override
	public String toString() {
		switch (t) {
		case FEU: 
			return("FeuxRouge");
		case ESSENCE:
			return("PanneEssence");
		case CREVAISON: 
			return("PneuCreve");
		case ACCIDENT:
			return("Accident");
		
		default:
			break;
		}
		return null;
	}

}
