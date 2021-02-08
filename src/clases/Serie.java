package clases;

public class Serie {
	
	String nombre;
	int temp;
	float rating;
	boolean fin;
	
	@SuppressWarnings("unused")
	public Serie() {
		nombre ="";
		temp = 0;
		rating = 0;
		fin = false;
		
	}

	public Serie(String nombre, int temp, float rating, boolean fin) {
		this.nombre = nombre;
		this.temp = temp;
		this.rating = rating;
		this.fin = fin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public boolean isFin() {
		return fin;
	}

	public void setFin(boolean fin) {
		this.fin = fin;
	}
	
	
	
	
	

}
