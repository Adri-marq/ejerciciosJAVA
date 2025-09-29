package Ud2;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Pedimos los numeros
		System.out.println("Escribe aqui el primer numero");
		int numero1 = sc.nextInt();
		// creamos la condicional 
		System.out.println("Escribe aqui el segundo numero distinto al primero");
		int numero2 = sc.nextInt();
		if (numero1 > numero2) {
			System.out.println("Este es el numero mas grande: " + numero1);
			}
		else if (numero1 == numero2) {
			System.out.println("Los numeros son iguales");
		}
		else {
			System.out.println("Este es el numero mas grande: " + numero2);
		}
	}
}
