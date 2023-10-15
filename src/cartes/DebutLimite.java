package cartes;

public class DebutLimite extends Limite {

	public DebutLimite(int nombre) {
		super(nombre);
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        DebutLimite debutLimite = (DebutLimite) obj;
        return debutLimite.getNombre() == getNombre();
    }

}
