package cartes;

public class Parade extends Bataille {

	public Parade(int nombre, Type t) {
		super(nombre, t);
	}
	
	@Override
	public String toString() {
		switch (t) {
		case FEU: 
			return("FeuxVert");
		case ESSENCE:
			return("Essence");
		case CREVAISON: 
			return("RoueDeSecours");
		case ACCIDENT:
			return("Reparation");
		
		default:
			break;
		}
		return null;
	}

}
