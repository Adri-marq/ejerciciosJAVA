package Ud2;
import java.util.Scanner;
public class Actividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe aqui el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Escribe aqui el segundo numero distinto al primero");
		int numero2 = sc.nextInt();
		if (numero1 > numero2) {
			System.out.println("Este es el numero mas grande: " + numero1);
		} else {
			System.out.println("Este es el numero mas grande: " + numero2);
		}
	}

}
