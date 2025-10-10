package Ud3;

import java.util.Scanner;

public class Ejercico8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//añado las variables
		int numero,factorial,resultado,acumulador;
		// pregunto por el numero que quiero factorizar
		System.out.println("dime un numero y te calculo su factorial:");
		numero = sc.nextInt();
		// añado valores a la variable
		factorial = numero;
		resultado = 0;
		acumulador = 1;
		// creo un bucle hasta que el factorial sea 1
		while(factorial > 1) {
			// cada bucle el factorial se le resta 1
			factorial--;
			//acumulo los factoriales por los que se multiplica el numero
			acumulador = factorial * acumulador;
			// multiplico el numero por el acumulador
			resultado = numero * acumulador;
			
		}
		System.out.println(resultado);
	}

}
