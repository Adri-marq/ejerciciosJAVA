package Ud6;

import java.util.Scanner;

public class Ejercicio15 {
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
			//creo un int para los aciertos
			int aciertos=0;
			System.out.println("adivina el anagrama");
			respuesta=sc.nextLine();
			//hago un bucle donde si la letra de la respuesta este en la misma posicion de la letra de la palabra entonces aciertos se le suma 1
				for(int i=0;i<palabra.length();i++) {
					if(palabra.charAt(i)==respuesta.charAt(i)) {
						aciertos++;
					}
				}
				//si no tienen la misma longitud entonces se vuelve a repetir
				if(respuesta.length()!=sb.length()) {
				System.out.println("no son igual de largas");
			}
			System.out.println("hay "+aciertos+" aciertos");
		}while(!respuesta.equalsIgnoreCase(palabra));
	System.out.println("GANASTE!!!!");
	}
}
