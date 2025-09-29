package Ud1;
import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Escribe el segundo numero: ");
		int numero2 = sc.nextInt();
		double resultado = (numero1 + numero2)/2.0 ;
		System.out.println("la media de " + numero1 + " y " + numero2 + " es igual a " + resultado);
	}
}
