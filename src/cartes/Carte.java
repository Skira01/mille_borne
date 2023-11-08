package cartes;

import cartes.Probleme.Type;

public abstract class Carte {
	
	private int nombre;
	
	public Carte(int nombre) {
		this.nombre = nombre;
	}
	
	public int getNombre() {
		return nombre;
	}
	
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public abstract Type getT();

	public abstract int getKm();
}
