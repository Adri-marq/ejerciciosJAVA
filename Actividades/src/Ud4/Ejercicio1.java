package Ud4;

import java.util.Scanner;

public class Ejercicio1 {
	//creo la funcion main
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	//creo la variable
	int n;
	//pregunto el valor de la variable
	System.out.println("dime un numero");
	n = sc.nextInt();
	//ejecuto la funcion echo
	echo(n);
}
//creo la funcion echo
public static void echo(int numero) {
	//hago un bucle que repita unas palabras el numero de veces que has escrito
	for(int ini=0;numero!=ini;ini++) {
		System.out.println("echo...");
	}
}
}