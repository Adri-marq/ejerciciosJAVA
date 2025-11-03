package Ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] tabla1,tabla2,tablacom;
		tabla1 = new int[6];
		tabla2 = new int[6];
		tablacom = new int[12];
		int tab1,tab2;
		System.out.println("dime los numeros de la primera tabla");
		for(int i=0;i<tabla1.length;i++) {
			tab1=sc.nextInt();
			tabla1[i]=tab1;
			}
		Arrays.sort(tabla1);
	
				System.out.println("\ndime los numeros de la segunda tabla");
		for(int i=0;i<tabla2.length;i++) {
			tab2=sc.nextInt();
			tabla2[i]=tab2;
			}
		Arrays.sort(tabla2);
		System.out.println("tablas:");
		System.out.println("tabla1 ->"+Arrays.toString(tabla1));
		System.out.println("tabla2 ->"+Arrays.toString(tabla2));
		
	for(int i=0;i<tablacom.length;i++) {
		for(int j=0;j<tabla2.length;j++) {
			if(tabla1[i]>tabla2[j]) {
				tablacom[i]=tabla2[j];
			}else {
				tablacom[i]=tabla2[j];
			}
		}
	}
	System.out.println("tablacompuesta ->"+Arrays.toString(tablacom));
	}

}
