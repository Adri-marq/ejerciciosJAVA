package Ud6;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//escribimos las variables y le damos un valor
		String conjunto1,conjunto2, palabra;
		char codificar;
		
		conjunto1=" e i k m p q r s t u v";
		conjunto2=" p v i u m t e r k q s";
		
		System.out.println("dime una palabra");
		palabra=sc.nextLine();
		palabra=palabra.toLowerCase();
		//usamos la funcion de la actividad anterior pero cambiamos la posicion de los conjuntos
		for(int i =0;i<palabra.length();i++) {
				System.out.print(Ejercicio10.codificar(conjunto2,conjunto1,palabra.charAt(i)));
			}
	}

}
