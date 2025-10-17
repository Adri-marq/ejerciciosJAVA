package Ud4;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("dime el primer numero");
		num1 = sc.nextInt();
		System.out.println("dime el segundo numero");
		num2 = sc.nextInt();
		System.out.println("dime el tercer numero");
		num3 = sc.nextInt();
		max(num1,num2,num3);
	}
	public static void max(int numero1, int numero2, int numero3) {
		if (numero1 > numero2 && numero1 >numero3) {
			System.out.println(numero1);
		}else if (numero2 > numero1 && numero2 >numero3) {
			System.out.println(numero2);
		} else if (numero3 > numero2 && numero3 >numero1){
			System.out.println(numero3);
		}
	}
}
