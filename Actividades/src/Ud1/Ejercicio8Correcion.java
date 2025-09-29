package Ud1;
import java.util.Scanner;
public class Ejercicio8Correcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe aqui tu edad:");
		int edad = sc.nextInt();
		boolean mayor = edad >= 18;
		System.out.println("es menor? " + mayor);

	}

}
