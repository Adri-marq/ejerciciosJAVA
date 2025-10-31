package Ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	int [] puntos = new int[5];
	int contador,punt,mas;
	contador=1;
	for(int i=0;i<puntos.length;i++) {
		System.out.println("Cual es la puntuacion del "+contador+" progamador");
		punt = sc.nextInt();
		puntos[i]=punt;
		contador++;
	}
	Arrays.sort(puntos);
	for(int i=0;i<puntos.length;i++) {
		System.out.print(puntos[i]+" / ");
	}
	for(int i =0;i<3;i++) {
	System.out.println("quieres añadir mas programadores?");
	System.out.println("pulse otro numero para seguir| pulse -1 para parar");
	mas = sc.nextInt();
	if(puntos.length<=7) {
	if(mas!=-1) {
		puntos = Arrays.copyOf(puntos, puntos.length+1);
		puntos[puntos.length-1]=mas;
		Arrays.sort(puntos);
		for(int j=0;j<puntos.length;j++) {
			System.out.print(puntos[j]+" / ");
			
		}
		}else {
			for(int j=0;j<puntos.length;j++) {
				System.out.print(puntos[j]+" / ");
				
			}
		}
	}
}

}
}
