package cartes;

public class Botte extends Probleme {

	public Botte(int nombre, Type t) {
		super(nombre, t);
	}
	
	@Override
	public String toString() {
		switch (t) {
		case FEU: 
			return("VehiculePrioritaire");
		case ESSENCE:
			return("CiterneDessence");
		case CREVAISON: 
			return("Increvable");
		case ACCIDENT:
			return("AsDuVolant");
		
		default:
			break;
		}
		return null;
	}

}
