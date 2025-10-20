package Ud4;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String [] args) {
	//HACEMOS LAS VARIABLES Y PEIDMOS SUS VALORES
	Scanner sc = new Scanner(System.in);
	int num1,num2;
	System.out.println("dime el primer numero");
	num1 = sc.nextInt();
	System.out.println("dime el segundo numero");
	num2 = sc.nextInt();
	max(num1,num2);
}
public static void max(int numero1, int numero2) {
	//PREGUNTAMOS CAUL ES EL MAYOR
	if (numero1 > numero2) {
		System.out.println(numero1);
	}else {
		System.out.println(numero2);
	}
}
}
