package Ud2;

import java.util.Scanner;

public class Actividad7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Pedimos los numeros
		System.out.println("Escribe aqui el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Escribe aqui el segundo numero");
		int numero2 = sc.nextInt();
		System.out.println("Escribe aqui el tercer numero");
		int numero3 = sc.nextInt();
		// hacemos que se muestre de mayor a menor
		if (numero1 > numero2 && numero2 > numero3) {
			System.out.println(numero1 + " " + numero2 + " " + numero3);
		}
		else if (numero1 > numero3 && numero3 > numero2) {
			System.out.println(numero1 + " " + numero3 + " " + numero2); 
		}
		else if (numero2 > numero1 && numero1 > numero3) {
			System.out.println(numero2 + " " + numero1 + " " + numero3);
		}
		else if (numero2 > numero3 && numero3 > numero1) {
			System.out.println(numero2 + " " + numero3 + " " + numero1);
		}
		else if (numero3 > numero1 && numero1 > numero2) {
			System.out.println(numero3 + " " + numero1 + " " + numero2);
		}
		else if (numero3 > numero2 && numero2 > numero1) {
			System.out.println(numero3 + " " + numero2 + " " + numero1);
		}
}
}