package Ud5;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int[] tabla_num = new int[5];
	
	for(int i = 0; 1>tabla_num.length;i++) {
		System.out.println("escribe un numero");
		int num = sc.nextInt();
		tabla_num[i]=num;
	}
	for(int i = 0; 1>tabla_num.length;i++) {
		System.out.println(tabla_num[i]);
	}
	
}
}
