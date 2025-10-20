package Ud4;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//escribimos las variables 
		double rad, alt;
		int elec;
		////preguntamos los valores de las variables
		System.out.println("calcula el area o el volumen de un cilindro");
		System.out.println("dime el radio");
		rad = sc.nextDouble();
		System.out.println("dime la altura");
		alt = sc.nextDouble();
		System.out.println("que quieres calcular:");
		System.out.println("1)area     2)volumen");
		elec = sc.nextInt();
		if (elec == 1) {
			area(rad, alt);
		} else {
			volumen(rad, alt);
		}

	}
//hacemos una funcion para calcular
	public static void area(double radio, double altura) {
		double result;
		//hacemos la operacion
		result = 2*Math.PI*radio*(altura+radio);
		System.out.println("el area del cilindoro es "+result+"cm");
	}

	public static void volumen(double radio, double altura) {
		double result;
		//hacemos la operacion
		result = Math.PI*(radio*radio)*altura;
		System.out.println("el volumen del cilindro es " + result+"cm");
	}
}