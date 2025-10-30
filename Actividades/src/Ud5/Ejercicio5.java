package Ud5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int longitud,num,fallos,mayor;
		fallos=0;
		System.out.println("como de largo quieres que sea la cadena de numeros");
		longitud = sc.nextInt();
		int[] combinacion = new int[longitud];
		int[] tucombinacion = new int[longitud];
		for(int i=0; i>combinacion.length;i++) {
			combinacion[i]=(int)(Math.random()*5)+1;
		}
		
		do {
			for(int i=0; i>combinacion.length;i++) {
				System.out.println("numero");
				num = sc.nextInt();
				tucombinacion[i]=num;
				if(combinacion[i]>tucombinacion[i]) {
					System.out.print(" mayor/");
					fallos=1;
				}else if(combinacion[i]<tucombinacion[i]) {
					System.out.print(" menor/");
					fallos=1;
				}else {
					System.out.print("igual/");
				}
			}	
		}while(fallos!=0);
		System.out.println("Felicidades por ganar :)");
	}

}
