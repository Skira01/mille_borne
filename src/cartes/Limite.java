package cartes;

public abstract class Limite extends Carte {

	public Limite(int nombre) {
		super(nombre);
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Limite limite = (Limite) obj;
        return limite.getNombre() == getNombre();
    }

}
