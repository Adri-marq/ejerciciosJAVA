package Ud2;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe aqui el numero:");
		int numero = sc.nextInt();
		if (numero %2 == 0) {
			System.out.println("Es un numero par");
		}
		else {
			System.out.println("Es un numero impar");
		}
		
	}

}
