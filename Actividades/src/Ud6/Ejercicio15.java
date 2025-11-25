package Ud6;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String palabra,respuesta;
		
		System.out.println("Juego del anagrama:");
		System.out.println("Escribe una palabra para adivinar");
		palabra=sc.nextLine();
		StringBuilder sb= new StringBuilder(palabra);
		System.out.println("anagrama:");
		while (sb.length() > 0) {
	        int pos = (int)(Math.random() * sb.length()); 
	        System.out.print(sb.charAt(pos));
	        sb.deleteCharAt(pos);
	    }
		System.out.println("\r");
		do {
			int aciertos=0;
			System.out.println("adivina el anagrama");
			respuesta=sc.nextLine();
			
				for(int i=0;i<palabra.length();i++) {
					if(palabra.charAt(i)==respuesta.charAt(i)) {
						aciertos++;
					}
				}
				if(respuesta.length()!=sb.length()) {
				System.out.println("no son igual de largas");
			}
			System.out.println("hay "+aciertos+" aciertos");
		}while(!respuesta.equalsIgnoreCase(palabra));
	System.out.println("GANASTE!!!!");
	}
}
