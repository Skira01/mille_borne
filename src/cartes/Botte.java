package cartes;

import java.util.Objects;

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
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Botte botte = (Botte) obj;
	        return Objects.equals(t, botte.t);
	    }

}
