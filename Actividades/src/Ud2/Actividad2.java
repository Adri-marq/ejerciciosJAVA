package Ud2;
import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe aqui el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Escribe aqui el segundo numero");
		int numero2 = sc.nextInt();
		if (numero1 == numero2) {
			System.out.println("Los numeros son iguales");
		} else {
			System.out.println("Los numeros no son iguales");
		}
	}

}
