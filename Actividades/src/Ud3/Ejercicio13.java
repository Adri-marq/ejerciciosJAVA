package Ud3;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nota,cali,suspensos,aprobados,condicionados;
		//le doy valor a las variables
		cali = 0;
		suspensos = 0;
		aprobados = 0;
		condicionados = 0;
		//hago un bucle
		do {
		//pregunto la nota de 6 alumnos
			System.out.println("dime la nota de 6 alumnos");
			nota = sc.nextInt();
			// si nota no esta entre los valores descritos entonces se repite
			if (nota <0 || nota >10) {
				System.out.println("no puedes tener esa nota repitela");
			}else {
			//si esta entre los valores entonces cali se le suma 1
			cali++;
			// si nota es menor a 4 entonces suspensos se le añade 1 si es igual a 4 entonces condicionado se le suma 1 y  si es mayor a 4 entonces aprobado se le suma 1 
			if (nota <4) {
				suspensos++;
			}else if(nota ==4) {
				condicionados++;
			}else {
				aprobados++;
			}
			}
		//cuando cali llegue a 6 se termina el bucle	
		}while(cali!=6);
		//si suspensos,condicionados o aprobados a subido de valor entonces muestras el resultado
		if(suspensos >0) {
		System.out.println("han suspendido " + suspensos);
		} 
		if(condicionados >0) {
			System.out.println("han condicionado " + condicionados);
			}
		if(aprobados >0) {
			System.out.println("han aprobado " + aprobados);
			}
	
	}

}
