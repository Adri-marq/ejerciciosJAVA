package Ud3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int numeromin,numeromax,numero;
		System.out.println("dime el numero minimo");
		numeromin =sc.nextInt();
		System.out.println("dime el numero maximo");
		numeromax =sc.nextInt();
	do {
		System.out.println("escribeme un numero");
		numero = sc.nextInt();
	}while(numero > numeromax || numero < numeromin);
	}

}
