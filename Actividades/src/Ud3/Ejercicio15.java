package Ud3;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Creamos las variables
		int numero;
		boolean primo;
		//preguntamos por un numero
		System.out.println("escribe un numero");
		numero = sc.nextInt();
		//creamos un bucle en el cual decimos que el numero mas pequeño por el cual vamos a empezar y que se valla sumando hasta que llegue al mismo numero que el que escribimos
		for(int peque = 2; peque <= numero;peque++) {
			//dentro del bucle decimos que primo es true
			primo = true;
			//dentro del bucle hacemos otro bucle en el cual creamos otra variable y esta variable tiene que ser mayor o igual a la raiz cuadrada de peque y alfinal a la variable se le suma 1
			for(int div = 2; div <= Math.sqrt(peque);div++) {
				//si el resto de peque y div es 0 entonces no es primo
				if (peque % div == 0) {
					primo = false;
				}
			}
			if (primo) {
				System.out.println(peque + " --> primo");
			}else {
				System.out.println(peque + " --> no primo");
			}
		}
		
	}
}
