package Ud3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double secreto;
		int secretoint, numero;
		secreto = Math.random() * 100;
		secretoint = (int) secreto;
		if (secretoint < 1) {
			secretoint = 1;
		}

		System.out.println("dime un numero entre 1 y 100");
		numero = sc.nextInt();
		if (numero != -1) {
			while (numero != secretoint) {
				if (numero > secretoint) {
					System.out.println("El numero secreto es menor");
				} else {
					System.out.println("El numero secreto es mayor");
				}
				System.out.println("dime un numero entre 1 y 100");
				numero = sc.nextInt();
			}
			if (numero == secretoint)
				System.out.println("Has acertado");
		} else {
			System.out.println("Te rendiste");
		}

	}

}
