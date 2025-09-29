package Ud1;
import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe aqui el año actual:");
		int año = sc.nextInt();
		System.out.println("Escribe aqui tu fecha de nacimiento:");
		int año_nacimiento = sc.nextInt();
		System.out.println("Tienes " + (año - año_nacimiento) + " años.");
	}
}