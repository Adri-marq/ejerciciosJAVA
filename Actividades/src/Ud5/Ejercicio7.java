package Ud5;

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
			tabla1[1]=tab1;
		}
		System.out.println("dime los numeros de la segunda tabla");
		for(int i=0;i<tabla2.length;i++) {
			tab2=sc.nextInt();
			tabla2[1]=tab2;
		}
		
	}

}
