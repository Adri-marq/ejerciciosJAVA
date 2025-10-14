package Ud3;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//creo las variables
		int nota,cali,suspensos;
		//le doy valor a las variables
		cali = 0;
		suspensos = 0;
		//hago un bucle
		do {
		//pregunto la nota de 5 alumnos
			System.out.println("dime la nota de 5 alumnos");
			nota = sc.nextInt();
			// si nota no esta entre los valores descritos entonces se repite
			if (nota <0 || nota >10) {
				System.out.println("no puedes tener esa nota repitela");
			}else {
			//si esta entre los valores entonces cali se le suma 1
			cali++;
			// si nota es menor a 5 entonces suspensos se le añade 1
			if (nota <5) {
				suspensos++;
			}
			}
		//cuando cali llegue a 5 se termina el bucle	
		}while(cali!=5);
		//si suspensos a subido de valor entonces añades cuantos han suspendido
		if(suspensos >0) {
		System.out.println("han suspendido " + suspensos);
		}else {
			System.out.println("no hay suspensos");
		}
	}

}
