package clases;

public class Prueba2 {

	public static void main(String[] args) {
		
		Alumno jd = new Alumno(3,5);
		jd.notas.rellenarAsignaturas();
	
		jd.notas.rellenarNotas();
		System.out.println(jd.notas.getNotas());
		jd.notas.setNotas(2, "pro");
		System.out.println(jd.notas.getNotas());

	}

}
