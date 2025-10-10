package Ud3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// añadimos las variables y le damos un valor
		double altura, arbol;
		int etiqueta, etiqueta_alto;
		etiqueta = 0;
		arbol = 0;
		etiqueta_alto = 0;
		// hacemos un bucle donde repita la pregunta hasta que le añadamos -1
		do {
			System.out.println("Escribeme la altura del arbol(centímetros)");
			altura = sc.nextDouble();
			etiqueta++;
			// hacemos que se guarde la altura y la etiqueta del arbol mas grade
			if (altura > arbol) {
				arbol = altura;
				etiqueta_alto = etiqueta;
			}

		} while (altura != -1);
		System.out.println(
				"árbol " + etiqueta_alto + " es el arbol mas grande con una altura de " + arbol + " centimetros");
	}
}


