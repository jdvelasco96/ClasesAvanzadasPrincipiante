package clases;

public class Alumno {

	String nombre;
	String dni;
	String ciclo;
	int tel;
	Notas notas;
	
	public Alumno(int numEval, int numAsignaturas) {
		this.nombre = "";
		this.dni = "";
		this.ciclo = "";
		this.tel = 0;
		notas = new Notas(numEval,numAsignaturas);
	}

	public Alumno(String nombre, String dni, String ciclo, int tel,int numEval, int numAsignaturas) {
		this.nombre = nombre;
		this.dni = dni;
		this.ciclo = ciclo;
		this.tel = tel;
		notas = new Notas( numEval, numAsignaturas);
	}
	
	
	
	
	

}
