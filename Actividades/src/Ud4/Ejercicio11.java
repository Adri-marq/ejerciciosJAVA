package Ud4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Escibo las variables y sus valores
		int num,elev;
		System.out.println("dime un numero");
		num = sc.nextInt();
		System.out.println("a cuantos lo quieres elevar");
		elev = sc.nextInt();
		System.out.println("iterativa: "+ iterativa(num,elev));
		System.out.println("recursiva: "+ recursiva(num,elev));
	}
	//crao una funcion en la cual se hace un bucle para hacer el elevado
public static int iterativa(int numero,int elevado) {
int solucion=numero;
	for(int i=1; i<elevado;i++) {
		
		solucion = solucion * numero;
		
	}

	return solucion;
}
//se crea otra funcion ne la cual si el elevado no es 0 se devuelve a si mismo
public static int recursiva(int numero,int elevado) {
	if(elevado == 0) {
		return 1;
	}else {
		// numero se multiplcia por la funcion y al elevado se el resta 1
		return numero * recursiva(numero, elevado-1);
	
	}
	}
}
