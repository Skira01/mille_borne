package cartes;
import java.util.Objects;

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
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Attaque attaque = (Attaque) obj;
        return Objects.equals(t, attaque.t);
    }

}
