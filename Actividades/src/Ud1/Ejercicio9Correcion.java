package Ud1;

import java.util.Scanner;

public class Ejercicio9Correcion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe aqui el numero:");
		int numero = sc.nextInt();
		boolean par = numero%2 == 0;
		System.out.println("es par? " + par);
	}

}
