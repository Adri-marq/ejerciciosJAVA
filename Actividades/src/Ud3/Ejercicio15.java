package Ud3;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero;
		boolean primo;
		System.out.println("escribe un numero");
		numero = sc.nextInt();
		for(int peque = 2; peque <= numero;peque++) {
			primo = true;
			for(int div = 2; div <= Math.sqrt(peque);div++) {
				
				if (peque % div == 0) {
					primo = false;
				}
			}
			if (primo) {
				System.out.println(peque + " --> primo");
			}else {
				System.out.println(peque + " --> no primo");
			}
		}
		
	}
}
