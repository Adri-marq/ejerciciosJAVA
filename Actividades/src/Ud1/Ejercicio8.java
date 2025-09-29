package Ud1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe aqui tu edad:");
		int edad = sc.nextInt();
		boolean menor;
		if (edad < 18) {
			menor = true;
		}else {
		menor = false;
		}
		System.out.println("es menor? " + menor);
	}

}
