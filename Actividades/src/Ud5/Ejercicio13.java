package Ud5;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] tabla;
		int num;
		System.out.println("como de larga quieres que sea tu tabla");
		num=sc.nextInt();
		tabla= new int[num];
	for(int i=0;i<tabla.length;i++) {
		System.out.println("dime un numero para la tabla");
		tabla[i]=sc.nextInt();
		}
	System.out.println(maximo(tabla));
	}
public static int maximo(int[] t) {
	int maximo;
	maximo=0;
	for(int i=0;i<t.length;i++) {
		if(t[i]> maximo) {
			maximo=t[i];
		}
	}
	return maximo;
}
}
