package clases;

import java.util.Scanner;

public class Notas {
	
	String notas[][];
	Scanner esc = new Scanner(System.in);

	public Notas(int numEvaluaciones , int numAsignaturas) {
		notas = new String [numEvaluaciones + 1][numAsignaturas + 1];
		notas[0][0] = "notas/asisgnaturas";
		for (int i = 1; i < notas.length; i++) {
			notas[i][0] = "evaluacion " + (i);
		}
		
	}

	public void rellenarAsignaturas() {
		
		for (int i = 1; i < notas[0].length; i++) {
			System.out.println("Añada el nombre de la asigntura");
			notas[0][i] = esc.next();
		}
		
	}
	
	public void rellenarNotas() {
		for (int i = 1; i < notas.length; i++) {
			for (int j = 1; j < notas[i].length; j++) {
				System.out.println("coloque la nota de " + notas[i][0] + " de la asignatura " + notas[0][j]);
				// cambiar por el metodo que permita float.
				notas[i][j] = esc.next();
				
			}
		}
	}

	public String getNotas() {
		String tabla="";
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if(i== 0 && j ==0) {
					tabla += notas[i][j] + "\t";
				}else {
					tabla += notas[i][j] + "\t\t";
				}
				
			}
			tabla += "\n";
		}
		return tabla;
	}

	
	public void setNotas(int numEval, String asignatura) {
		int auxAs = 0;
		
		for (int i = 1; i < notas[0].length; i++) {
			if(notas[0][i].equalsIgnoreCase(asignatura)) {
				auxAs=i;
				break;
			}else {
				System.out.println("no se encontro la asignatura");
			}
		}
		
		System.out.println("la nota a cambiar es " + notas[numEval][auxAs]);
		System.out.println("escriba la nota nueva");
		
		// cambiar por el metodo que confirme si es un float
		notas[numEval][auxAs] = esc.next();
				
	}
	

}
