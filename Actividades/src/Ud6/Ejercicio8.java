package Ud6;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase;
		System.out.println("dime una frase palíndroma");
		frase=sc.nextLine();
		String[] fpartida=frase.split(" ");
		for(int i=fpartida.length;i>0;i--) {
			System.out.println(fpartida);
		}
	
	}

}

