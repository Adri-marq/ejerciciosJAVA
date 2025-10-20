package Ud4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//HACEMOS UNA VARIABLE Y PEDIMOS SU VALOR
		int numero;
		System.out.println("dime un numero");
		numero = sc.nextInt();
		//HACEMOS UN IF DICIENDO QUE DEPENDE DE PRIMO ES PRIMO O NO
		if (primo(numero) == true) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}
	}
//HACEMOS UNA FUNCION
	public static boolean primo(int numero) {
		//EL BOOLEANO PRIMO ES TRUE
		boolean primo = true;
		//HACEMOS UN BUCLE PARA VER SI EL NUMERO NO ES PRIMO
		for (int div = 2; div <= Math.sqrt(numero); div++) {
			if (numero % div == 0) {
				primo = false;
			}

		}
		return primo;
	}
}