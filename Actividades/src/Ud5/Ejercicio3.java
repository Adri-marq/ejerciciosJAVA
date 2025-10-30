package Ud5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//creamos las variables y le damos un valor
		int tab,i;
		int[] tabla_num;
		System.out.println("cuantos numeros quieres tener");
		tab = sc.nextInt();
		//creo la tabla y le digo su longitud
		tabla_num= new int[tab];
		//digo le valor que esta dentro de la celda
		for(i=0;i<tabla_num.length;i++) {
		System.out.println("dime los numeros");
		int num = sc.nextInt();
		tabla_num[i]=num;
		}
		//muestro el resultado
		System.out.println("la media de los positivos es " +mediaPositivos(tabla_num));
		System.out.println("la media de los negativos es " +mediaNegativos(tabla_num));
		System.out.println("has puesto " +cuentaCeros(tabla_num)+" ceros");
	}
	//creo una funcion para la media de los positivos
public static double mediaPositivos(int[] tabla) {
	//hago el calculo
	double suma,result;
	int acum;
	suma =0;
	acum =0;
	for(int i=0;i<tabla.length;i++) {
		if(tabla[i]>0) {
			suma= suma + tabla[i];
			acum++;
		}
	 
	}
	result =suma/acum;
	return result;
}
//hago una funcion para la media de los negativos
public static double mediaNegativos(int[] tabla) {
	//hago el calculo
	int acum;
	double resta,result;
	resta =0;
	acum =0;
	for(int i=0;i<tabla.length;i++) {
		if(tabla[i]<0) {
			resta= resta + tabla[i];
			acum++;
		}
	 
	}
	result =resta/acum;
	return result;
}
//hago una funcion para saber los ceros
public static int cuentaCeros(int[] tabla) {
	//hago un acumulador para que cuente cuantos ceros hay
	int acum;
	acum=0;
	for(int i=0;i<tabla.length;i++) {
		if(tabla[i]==0) {
			acum++;
		}
	 
	}
	return acum;
}
}
