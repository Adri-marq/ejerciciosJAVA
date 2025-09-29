package Ud1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe aqui el numero:");
		int numero = sc.nextInt();
		boolean par;
		if (numero %2 == 0) {
			par = true;
			System.out.println("Es un numero par");
		}
		else {
			par= false;
			System.out.println("Es un numero impar");
		}
		
	}

}
