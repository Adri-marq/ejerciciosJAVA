package Ud6;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String palabra, frase="";
		do {
			//escribo una palabra
		System.out.println("escribe una palabra para la frase");
		palabra = sc.nextLine();
		//si es la palabra fin no la escribe
		if(palabra.equalsIgnoreCase("fin")) {
		}else {
			//junto las palabras que escribo
			frase= frase +" "+ palabra;
		}
		//se termina cuando escribo fin
		}while(!palabra.equalsIgnoreCase("fin"));
		System.out.println(frase.trim());
		}

}
