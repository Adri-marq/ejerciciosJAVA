package Ud4;

import java.util.Scanner;

public class Ejercicio2 {
	//hago la funcion main
public static void main(String [] args) {
Scanner sc = new Scanner(System.in);
//creo las variables
int numero1,numero2;
//pregunto los valores de las variables
System.out.println("escribeme dos numeros");
numero1 = sc.nextInt();
numero2 = sc.nextInt();
//ejecuto la funcion mostrar
mostrar(numero1,numero2);
}
//hago la fucion mostrar
public static void mostrar(int a , int b) {
	//creo un bucle para decir los valores comprendidos entre los numeros descritos
	for(int numero = a;numero <b+1;numero++) {
		System.out.println(numero);
	}
}
}
