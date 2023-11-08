package cartes;

import java.util.Objects;

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

	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Parade parade = (Parade) obj;
        return Objects.equals(t, parade.t);
    }

	@Override
	public int getKm() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
