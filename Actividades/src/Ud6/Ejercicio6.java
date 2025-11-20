package Ud6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String frase;
		//escribo un nombre
		System.out.println("Escribeme una frase y te la invierto:");
		frase=sc.nextLine();
		//primera opcion con Stringbuilder
		sb.append(frase);
		sb.reverse();
		System.out.println(sb.toString());
		//segunda opcion sin Stringbuilder
		for(int i=frase.length()-1;i>-1;i--) {
			System.out.print(frase.charAt(i));
		}
	}

}
