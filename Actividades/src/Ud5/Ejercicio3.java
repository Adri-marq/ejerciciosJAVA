package Ud5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tab,i;
		int[] tabla_num;
		System.out.println("cuantos numeros quieres tener");
		tab = sc.nextInt();
		tabla_num= new int[tab];
		for(i=0;i<tabla_num.length;i++) {
		System.out.println("dime los numeros");
		int num = sc.nextInt();
		tabla_num[i]=num;
		}
		System.out.println("la media de los positivos es " +mediaPositivos(tabla_num));
		System.out.println("la media de los negativos es " +mediaNegativos(tabla_num));
		System.out.println("has puesto " +cuentaCeros(tabla_num)+" ceros");
	}
public static double mediaPositivos(int[] tabla) {
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
public static double mediaNegativos(int[] tabla) {
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
public static int cuentaCeros(int[] tabla) {
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
