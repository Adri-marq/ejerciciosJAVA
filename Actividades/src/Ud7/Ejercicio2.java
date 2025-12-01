package Ud7;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//he creado unas variables y les he dado unos valores
		String dni;
		int limitedesc,saldoinicial;
		System.out.println("DNI del titular de la cuenta:");
		dni=sc.nextLine();
		System.out.println("cual es tu saldo inicial:");
		saldoinicial = sc.nextInt();
		System.out.println("cual es tu limite de descubierto:");
		limitedesc=sc.nextInt();
		//luego he añadido la clase cuenta corriente
		CuentaCorriente cuenta2 = new CuentaCorriente(saldoinicial);
		CuentaCorriente cuenta3 = new CuentaCorriente(dni,saldoinicial,limitedesc);
		
		System.out.println("cuenta2:");
		cuenta2.mostrarinfo();
		System.out.println("cuenta3:");
		cuenta3.mostrarinfo();
	}

}
