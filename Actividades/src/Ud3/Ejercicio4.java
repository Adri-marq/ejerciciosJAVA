package Ud3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero,numerocuenta;
		numerocuenta =1;
		System.out.println("Escribe un numero");
		numero = sc.nextInt();
		while(numerocuenta != numero) {
			System.out.println(numerocuenta);
			numerocuenta++;
		}
	}

}
