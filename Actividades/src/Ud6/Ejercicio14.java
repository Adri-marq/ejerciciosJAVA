package Ud6;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String palabra,respuesta;
		//escribo los valores y les doy un valor
		System.out.println("Juego del anagrama:");
		System.out.println("Escribe una palabra para adivinar");
		palabra=sc.nextLine();
		// creo un stringbuilder para la palabra que se va a desordenar
		StringBuilder sb= new StringBuilder(palabra);
		System.out.println("anagrama:");
		//el bucle no va a terminar hasta que la longuitud del stringbuilder sea cero
		while (sb.length() > 0) {
			// creo un int con un numero aleatorio
	        int pos = (int)(Math.random() * sb.length());
	        //enseño el caracter donde este la posicion
	        System.out.print(sb.charAt(pos));
	        //elimino del stringbuilder la letra que se ha mostrado para que no se vuelva a repetir
	        sb.deleteCharAt(pos);
	    }
		System.out.println("\r");
		//creo otro bucle q no termine hasta que la palabra que escribas sea igual a la palabra que tengas que adivinar
		do {
			System.out.println("adivina el anagrama");
			respuesta=sc.nextLine();
		}while(!respuesta.equalsIgnoreCase(palabra));
	System.out.println("GANASTE!!!!");
	}

}
