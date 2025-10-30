package Ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//creo una tabla y le doy unos valores
		int[] favoritos= {1,7,13,16,54,33,96};
		//digo que celda de la tabla quiero eliminar
		System.out.println("que celda quieres eliminar");
		int pos = sc.nextInt();
		//decimos que mientras que la tabla tenga elementos y que allas puesto un numero en pos funcione
		if(pos>=0 && favoritos.length>0) {
			//si pones un numero mas alto que la longitud de la tabla no funcione
		if(pos>= favoritos.length) {
			System.out.println("error");
		}else {
		BorrarElemento(favoritos,pos);
		}
		}
	}
	//creo otro funcion para borrar el elemento el cual forma una tabla
	public static int[] BorrarElemento(int[] favoritos,int pos) {
		//creo un bucle para que cuando pos y la celda sean iguales el numero cambie
		for(int i = 0; i<favoritos.length;i++) {
			if(pos==i) {
				//decimis que el numero que esta en la celda i se pase a la siguente celda
				favoritos[i]=favoritos[i+1];
			}
			
			//muestro la tabla
			System.out.println(favoritos[i]);
		}
		//devuelve la tabla pero ahora con una logitud menor
		return Arrays.copyOf(favoritos, favoritos.length-1);
	}

}
