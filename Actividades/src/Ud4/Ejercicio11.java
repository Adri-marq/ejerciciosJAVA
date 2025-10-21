package Ud4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,elev;
		System.out.println("dime un numero");
		num = sc.nextInt();
		System.out.println("ha cuantos lo quieres elevar");
		elev = sc.nextInt();
		System.out.println("iterativa: "+ iterativa(num,elev));
		System.out.println("recursiva: "+ recursiva(num,elev));
	}

}
