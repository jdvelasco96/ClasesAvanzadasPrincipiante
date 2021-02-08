package clases;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner esc = new Scanner(System.in);
		
		Serie prueba = new Serie();
		
		Serie prueba2 = Rellenar();

//		Rellenar(prueba);
		
		System.out.println(prueba2.getNombre());
	
		
		
	}

		static void Rellenar( Serie serie) {
			int eleccion = 0;
			boolean finalizada = false;
			Scanner esc = new Scanner(System.in);
			System.out.println("escriba el nombre de la serie");
			serie.setNombre(esc.next());
			
			do {
				System.out.println("seleccione 1. para verdadero 2. para falso ");
				eleccion = esc.nextInt();
			if (eleccion == 1) {
				finalizada = true;
			}else if(eleccion == 0) {
				finalizada = false;
			}
			else {
				System.out.println("ponga una eleccion valida valido");
			}
			}while (!(eleccion == 1 || eleccion == 2));
			
			serie.setFin(finalizada);
			
			System.out.println("escriba la clasificacion");
			serie.setRating(esc.nextFloat());
			
			System.out.println("escriba el numero de temporadas");
			serie.setTemp(esc.nextInt());
			
		}
		
		static Serie Rellenar() {
			Scanner esc = new Scanner(System.in);
			System.out.println("escriba el nombre de la serie");
			String nombre = esc.next();
			System.out.println("escriba numero de temporadas");
			int temporadas = esc.nextInt();
			System.out.println("escriba el rating (float)");
			float rating = esc.nextFloat();
			
			boolean finalizada = false;
			int eleccion = 0;
			do {
				System.out.println("seleccione 1. para finalizada 2. para no finalizada ");
				eleccion = esc.nextInt();
			if (eleccion == 1) {
				finalizada = true;
			}else if(eleccion == 0) {
				finalizada = false;
			}
			else {
				System.out.println("ponga una eleccion valida valido");
			}
			}while (!(eleccion == 1 || eleccion == 2));
			System.out.println(finalizada);
			
			Serie idObj = new Serie(nombre,temporadas,rating,finalizada);
			
			return idObj;
			
		}
		
}
