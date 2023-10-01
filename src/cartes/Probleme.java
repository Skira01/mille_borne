package cartes;

public abstract class Probleme extends Carte {

	enum Type {FEU, ESSENCE, CREVAISON, ACCIDENT};
	public Type t;
	
	protected Probleme(int nombre, Type t) {
		super(nombre);
		this.t = t;
	}

	public Type getT() {
		return t;
	}

	public void setT(Type t) {
		this.t = t;
	}
	
	public abstract String toString();
	

}
