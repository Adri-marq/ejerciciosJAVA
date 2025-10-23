package Ud4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//se preguntan los valores y se crean las variables
		int a,b,op;
		System.out.println("Escribeme el primer entero");
		a = sc.nextInt();
		System.out.println("Escribeme el segundo entero");
		b = sc.nextInt();
		System.out.println("1)suma 2)resta 3)multiplicación 4)división");
		op = sc.nextInt();
		System.out.println(calculadora(a,b,op));
		
	}
	//se crea una funcion para calcular el resultado
public static int calculadora(int a,int b, int op) {
	int c=0;
	//si a puesto u nnumero del 1 al 4 entonces hara distintas cosas dependiendo del numero
	if (op ==1) {
		//suma
		c = a + b;
	} else if(op ==2) {
		//resta
		c = a - b;
	}else if(op==3) {
		//multiplicacion
		c = a * b;
	}else if(op==4) {
		//division
		c = a / b;
	}
	return c;
}
}
