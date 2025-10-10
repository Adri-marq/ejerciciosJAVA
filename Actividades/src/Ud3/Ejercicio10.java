package Ud3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero,coef,resultado;
		System.out.println("Escribe un numero");
		numero = sc.nextInt();
		//decimos que el coef es 1 y multiplica hasta que coef llegue a 10
		if(numero >=1&&numero<=10) {
		for (coef = 1; coef <=10; coef++) {
			resultado = numero * coef;
			System.out.println(numero+"*"+coef+"="+resultado);
			}
		}else {
			System.out.println("Solo del 1 al 10 prueba de nuevo");
		}	
	}

}
