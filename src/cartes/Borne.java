package cartes;

public class Borne extends Carte {
	private int km;
	
	public Borne(int nombre, int km) {
		super(nombre);
		this.setKm(km);
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}
	
	@Override
	public String toString() {
		switch (km) {
		case 25: 
			return("25km");
		case 50:
			return("50km");
		case 75: 
			return("75km");
		case 100:
			return("100km");
		case 200:
			return("200km");
		
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
	        Borne borne = (Borne) obj;
	        return km == borne.km;
	    }

}
