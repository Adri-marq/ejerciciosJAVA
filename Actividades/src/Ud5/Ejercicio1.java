package Ud5;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	//creo una tabla
	float[] tabla_num;
	//digo que el tamaño de la tabla es 5
	tabla_num= new float[5];
	//creo un bucle donde empieza desde 0 hasta llegar a la longitud de la tabla y cuando se repite el bucle se le suma uno a i
	for(int i = 0; i<tabla_num.length;i++) {
		System.out.println("escribe un numero");
		float num = sc.nextInt();
		//digo que en la posicion de la tabla i esta el numero num
		tabla_num[i]=num;
	}
	//creo otro bucle para para mostrar la tabla
	for(int i = 0; i<tabla_num.length;i++) {
		System.out.println(tabla_num[i]);
	}

}
}
