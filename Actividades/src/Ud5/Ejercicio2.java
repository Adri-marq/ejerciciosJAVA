package Ud5;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("cual es el tamaño de la tabla");
		int tab = sc.nextInt();
		//creo una tabla
		int[] tabla_num;
		//digo que el tamaño de la tabla es 5
		tabla_num= new int[tab];
		//creo un bucle donde empieza desde 0 hasta llegar a la longitud de la tabla y cuando se repite el bucle se le suma uno a i
		for(int i = 0; i<tabla_num.length;i++) {
			System.out.println("escribe un numero");
			int num = sc.nextInt();
			//digo que en la posicion de la tabla i esta el numero num
			tabla_num[i]=num;
			
		}
		//creo un bucle diciendo que la variable i es el numero de la tabla - 1 para que se muestre en orden inverso
		for( int i = tabla_num.length-1; i>=0;i--) {
			System.out.println(tabla_num[i]);
		}
}
}