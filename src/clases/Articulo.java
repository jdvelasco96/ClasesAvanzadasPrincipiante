package clases;

public class Articulo {
	
	public String nombre;
	public int cant;
	public float precio;
	
	/**
	 * @param nombre
	 * @param cant
	 * @param precio
	 */
	public Articulo(String nombre, int cant, float precio) {
		this.nombre = nombre;
		this.cant = cant;
		this.precio = precio;
	}

	public Articulo() {
		nombre = "";
		cant = 0;
		precio = 0;		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	

}
