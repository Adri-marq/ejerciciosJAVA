package Ud1;
import java.util.Scanner;
public class actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe aqui un numero");
		double numero = sc.nextDouble();
		double numeroabs = Math.abs(numero);
		System.out.println("El numero absoluto de " + numero + " es " + numeroabs);

	}

}
