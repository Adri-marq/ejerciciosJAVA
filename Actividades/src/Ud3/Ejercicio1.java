package Ud3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero, cuadrado;
		do {
			System.out.println("Introduce un numero:");
			numero = sc.nextInt();
			cuadrado = numero * numero;
			if (numero % 2 == 0) {
				System.out.println("Es un numero par");
			} else {
				System.out.println("Es un numero impar");
			}
			if (numero < 0) {
				System.out.println("El numero es negativo");
			} else {
				System.out.println("El numero es positivo");
			}
			System.out.println("el cuadrado del numero es " + cuadrado);

		} while (numero != 0);

	}
}
