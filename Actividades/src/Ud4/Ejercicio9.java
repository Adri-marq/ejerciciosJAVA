package Ud4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("escribeme un numero");
		num = sc.nextInt();
		Ejercicio8.prim(num);
		divisoresPrimos(num);
	}

	public static void divisoresPrimos(int numero) {
		for (int ini = 2; ini <= numero; ini++) {
		
			boolean primo = true;
			if (numero%ini==0) {
			for (int div = 2; div <= Math.sqrt(ini); div++) {

				if (ini % div == 0) {
					primo = false;
				}
				
			}
			if (primo) {
				System.out.println(ini);
			}
			}
			
		}
		
	}
}
