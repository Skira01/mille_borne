package cartes;

import cartes.Probleme.Type;

public class FinLimite extends Limite {

	public FinLimite(int nombre) {
		super(nombre);
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        FinLimite finLimite = (FinLimite) obj;
        return finLimite.getNombre() == getNombre();
    }

	@Override
	public Type getT() {
		// TODO Auto-generated method stub
		return null;
	}

}
