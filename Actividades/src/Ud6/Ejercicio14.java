package Ud6;

import java.util.Scanner;

public class Ejercicio14 {

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
			System.out.println("adivina el anagrama");
			respuesta=sc.nextLine();
		}while(!respuesta.equalsIgnoreCase(palabra));
	System.out.println("GANASTE!!!!");
	}

}
