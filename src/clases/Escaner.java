package clases;

import java.util.Iterator;
import java.util.Scanner;

public class Escaner {
	Scanner esc;
	
	public Escaner() {
		esc = new Scanner(System.in);
	}


	String nextFrase() {
		String frase = "";
		
		return frase;
	}
	
	int nextInt() {
		boolean noContinuar = true;
		boolean pasa = false;
		String frase = "";
		int ent=0;
		do {
			pasa = false;
			System.out.println("introduzca un numero");
			frase = esc.next();

			for(int i = 0;i<frase.length();i++) {
				if(Character.isLetter(frase.charAt(i))) {
					System.out.println("introduzca un numero valido");
					break;
				}
				else if(i==frase.length()) {
					pasa = true;
					break;
				}
			}
				if(pasa) {
					ent = Integer.parseInt(frase);
					break;
				}
		
		}while(noContinuar);
		return ent;
	}
	
	
	


}
