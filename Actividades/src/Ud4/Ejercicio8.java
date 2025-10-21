package Ud4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Escribimos las variables y preguntamos su valor
		int num;
		System.out.println("escribeme un numero");
		num = sc.nextInt();
		// decimos que muestre la funcion prim
		prim(num);
	}

//hacemos la funcion prim
	public static void prim(int numero) {
		// creamos la variable contador y le añadimos un valor
		int contador;
		contador = 0;
		// hacemos un bucle para que empiece a contar desde 2 y termine cuando llegue al
		// numero
		for (int ini = 2; ini <= numero; ini++) {
			// decimos que primo es true
			boolean primo = true;
			// Si el resto de el numero por ini es 0 entonces se hace el bucle para saber si
			// es primo o no
			if (numero % ini == 0) {
				for (int div = 2; div <= Math.sqrt(ini); div++) {

					if (ini % div == 0) {
						primo = false;
					}

				}
				// si es primo entonces el contador sube
				if (primo) {
					contador++;
				}
			}

		}
		System.out.println("Hay " + contador + " divisores del numero " + numero + " que son primos");
	}
}
