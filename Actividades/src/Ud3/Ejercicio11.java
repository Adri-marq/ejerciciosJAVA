package Ud3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero, coef, resultado;
		numero = 1;
		for (numero = 1; numero <= 10; numero++) {
			System.out.println("la tabla del " + numero);
			for (coef = 1; coef <= 10; coef++) {
				resultado = numero * coef;
				System.out.println(numero + "*" + coef + "=" + resultado);

			}
		}
	}

}
