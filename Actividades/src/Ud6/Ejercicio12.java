package Ud6;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String palabra1,palabra2;
		//preguntamos los valores de las variables
		System.out.println("dime dos palabas para comprobar si son anagramas");
		System.out.println("palabra1:");
		palabra1=sc.nextLine();
		palabra1=palabra1.toLowerCase();
		System.out.println("palabra2:");
		palabra2=sc.nextLine();
		palabra2=palabra2.toLowerCase();
		//usamos la funcion contador
		contador(palabra1,palabra2);
	}
	//cuento las letras que hay en la palabra1 y cuento las letras de la palabra2 con las letras de la palabra1  si son iguales y si los contadores dan igual entonces son anagramas
	public static void contador(String p1,String p2) {
		int contador1=0,contador2=0;
		if(p1.length()==p2.length()) {
			for(int i=0;i<p1.length();i++) {
				for(int j=0;j<p1.length();j++) {
					if(p1.charAt(i)==p1.charAt(j)) {
						contador1++;
					}
				}
			}
			for(int i=0;i<p1.length();i++) {
				for(int j=0;j<p2.length();j++) {
					if(p1.charAt(i)==p2.charAt(j)) {
						contador2++;
					}
				}
			}
			if(contador1==contador2) {
				System.out.println("son anagramas");
			}else {
				System.out.println("no son anagramas");
			}
			}else {
			System.out.println("no pueden ser anagamas");
		}
		
	}
	


}
