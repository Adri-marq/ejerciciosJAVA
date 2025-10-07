package Ud3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero,coef,resultado;
		System.out.println("Escribe un numero");
		numero = sc.nextInt();
		//	como empieza|la condicion|lo que hace cuando termina
		for (coef = 1; coef <=10; coef++) {
			resultado = numero * coef;
			System.out.println(numero+"*"+coef+"="+resultado);
		}
				
		
	}

}
