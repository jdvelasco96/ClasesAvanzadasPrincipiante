package clases;

public class Vehiculo {
	
	private String marca;
	private String combustible;
	private int numAsientos;
	private float precio;
	
	public Vehiculo() {
		marca = "";
		combustible = "";
		numAsientos = 0;
		precio = 0.00f;
		
	}
	
	public Vehiculo(String marca, String combustible, int numAsientos, float precio) {
		this.marca = marca;
		this.combustible = combustible;
		this.numAsientos = numAsientos;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	

}
