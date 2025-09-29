package Ud2;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Pedimos los numeros
		System.out.println("Escribe aqui el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Escribe aqui el segundo numero distinto al primero");
		int numero2 = sc.nextInt();
		// hacemos que se muestren ordenados decrecientemente
		if (numero1 > numero2) {
			System.out.println(numero1 + " " + numero2);
		} else {
			System.out.println(numero2 + " " + numero1);
		}
	}

}
