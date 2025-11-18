package Ud6;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int contador=0;
		//escribo una frase
		System.out.println("Escribeme una frase:");
		String frase=sc.nextLine();
		//si tiene espacios un caracter de la frase entonces el contador sube
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==' ') {
				contador++;
			}
		}
		//se muestra el contador
	System.out.println("Tiene "+ contador+" espacios en la frase");
	}

}
