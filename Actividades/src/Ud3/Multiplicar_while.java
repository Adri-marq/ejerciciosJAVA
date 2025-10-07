package Ud3;

import java.util.Scanner;

public class Multiplicar_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero,coef,resultado;
		System.out.println("Escribe un numero");
		numero = sc.nextInt();
	
		coef =1;
		while(coef<=10){
			resultado = numero * coef;
			System.out.println(numero+"*"+coef+"="+resultado);
			coef++;
		}
		
	}

}
