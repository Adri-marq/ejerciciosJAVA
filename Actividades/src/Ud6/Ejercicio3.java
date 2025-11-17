package Ud6;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String palabra, frase="";
		do {
		System.out.println("escribe una palabra para la frase");
		palabra = sc.nextLine();
		if(palabra.equalsIgnoreCase("fin")) {
		}else {
			frase= frase +" "+ palabra;
		}
		}while(!palabra.equalsIgnoreCase("fin"));
		System.out.println(frase.trim());
		}

}
