package cartes;

import java.util.Objects;

public abstract class Bataille extends Probleme {

	public Bataille(int nombre, Type t) {
		super(nombre, t);
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Bataille bataille = (Bataille) obj;
        return Objects.equals(t, bataille.t);
    }

}
	